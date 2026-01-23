package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsHeader;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPromotionalBanner;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatExperienceV2;
import com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MenuOfOptionsState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0004!\"#$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "", "showBannerHeader", "", "getShowBannerHeader", "()Z", "showHeroHeader", "getShowHeroHeader", "showPathHeader", "getShowPathHeader", "showSubtitle", "getShowSubtitle", "heroTitle", "Lcom/robinhood/utils/resource/StringResource;", "getHeroTitle", "()Lcom/robinhood/utils/resource/StringResource;", "title", "getTitle", "subtitleMarkdown", "getSubtitleMarkdown", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "promotionalBanner", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPromotionalBanner;", "getPromotionalBanner", "()Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPromotionalBanner;", "Loading", "Invested", "Error", "MenuOfOptions", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$Error;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$Invested;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$Loading;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$MenuOfOptions;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface MenuOfOptionsState {
    StringResource getHeroTitle();

    MenuOfOptionsPromotionalBanner getPromotionalBanner();

    ImmutableList<UiMenuOfOptionsItem> getRows();

    boolean getShowBannerHeader();

    boolean getShowHeroHeader();

    boolean getShowPathHeader();

    boolean getShowSubtitle();

    StringResource getSubtitleMarkdown();

    StringResource getTitle();

    /* compiled from: MenuOfOptionsState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$Loading;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements MenuOfOptionsState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1953658798;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getHeroTitle() {
            return DefaultImpls.getHeroTitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public MenuOfOptionsPromotionalBanner getPromotionalBanner() {
            return DefaultImpls.getPromotionalBanner(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public ImmutableList<UiMenuOfOptionsItem> getRows() {
            return DefaultImpls.getRows(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowBannerHeader() {
            return DefaultImpls.getShowBannerHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowHeroHeader() {
            return DefaultImpls.getShowHeroHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowPathHeader() {
            return DefaultImpls.getShowPathHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowSubtitle() {
            return DefaultImpls.getShowSubtitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getSubtitleMarkdown() {
            return DefaultImpls.getSubtitleMarkdown(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getTitle() {
            return DefaultImpls.getTitle(this);
        }
    }

    /* compiled from: MenuOfOptionsState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$Invested;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Invested implements MenuOfOptionsState {
        public static final int $stable = 0;
        public static final Invested INSTANCE = new Invested();

        public boolean equals(Object other) {
            return this == other || (other instanceof Invested);
        }

        public int hashCode() {
            return -1652408578;
        }

        public String toString() {
            return "Invested";
        }

        private Invested() {
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getHeroTitle() {
            return DefaultImpls.getHeroTitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public MenuOfOptionsPromotionalBanner getPromotionalBanner() {
            return DefaultImpls.getPromotionalBanner(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public ImmutableList<UiMenuOfOptionsItem> getRows() {
            return DefaultImpls.getRows(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowBannerHeader() {
            return DefaultImpls.getShowBannerHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowHeroHeader() {
            return DefaultImpls.getShowHeroHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowPathHeader() {
            return DefaultImpls.getShowPathHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowSubtitle() {
            return DefaultImpls.getShowSubtitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getSubtitleMarkdown() {
            return DefaultImpls.getSubtitleMarkdown(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getTitle() {
            return DefaultImpls.getTitle(this);
        }
    }

    /* compiled from: MenuOfOptionsState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$Error;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "<init>", "()V", "menuOfOptionsItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", "getMenuOfOptionsItems", "()Lkotlinx/collections/immutable/ImmutableList;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements MenuOfOptionsState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1095517854;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getHeroTitle() {
            return DefaultImpls.getHeroTitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public MenuOfOptionsPromotionalBanner getPromotionalBanner() {
            return DefaultImpls.getPromotionalBanner(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public ImmutableList<UiMenuOfOptionsItem> getRows() {
            return DefaultImpls.getRows(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowBannerHeader() {
            return DefaultImpls.getShowBannerHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowHeroHeader() {
            return DefaultImpls.getShowHeroHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowPathHeader() {
            return DefaultImpls.getShowPathHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowSubtitle() {
            return DefaultImpls.getShowSubtitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getSubtitleMarkdown() {
            return DefaultImpls.getSubtitleMarkdown(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getTitle() {
            return DefaultImpls.getTitle(this);
        }

        public final ImmutableList<UiMenuOfOptionsItem> getMenuOfOptionsItems() {
            return extensions2.persistentListOf(UiMenuOfOptionsItem.Support.Retry.INSTANCE, UiMenuOfOptionsItem.Support.HelpCenter.INSTANCE);
        }
    }

    /* compiled from: MenuOfOptionsState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState$MenuOfOptions;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "experience", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatExperienceV2$MenuOfOptions;", "<init>", "(Lcom/robinhood/models/db/identi/sortinghat/SortingHatExperienceV2$MenuOfOptions;)V", "getExperience", "()Lcom/robinhood/models/db/identi/sortinghat/SortingHatExperienceV2$MenuOfOptions;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MenuOfOptions implements MenuOfOptionsState {
        public static final int $stable = 8;
        private final SortingHatExperienceV2.MenuOfOptions experience;

        public static /* synthetic */ MenuOfOptions copy$default(MenuOfOptions menuOfOptions, SortingHatExperienceV2.MenuOfOptions menuOfOptions2, int i, Object obj) {
            if ((i & 1) != 0) {
                menuOfOptions2 = menuOfOptions.experience;
            }
            return menuOfOptions.copy(menuOfOptions2);
        }

        /* renamed from: component1, reason: from getter */
        public final SortingHatExperienceV2.MenuOfOptions getExperience() {
            return this.experience;
        }

        public final MenuOfOptions copy(SortingHatExperienceV2.MenuOfOptions experience) {
            Intrinsics.checkNotNullParameter(experience, "experience");
            return new MenuOfOptions(experience);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MenuOfOptions) && Intrinsics.areEqual(this.experience, ((MenuOfOptions) other).experience);
        }

        public int hashCode() {
            return this.experience.hashCode();
        }

        public String toString() {
            return "MenuOfOptions(experience=" + this.experience + ")";
        }

        public MenuOfOptions(SortingHatExperienceV2.MenuOfOptions experience) {
            Intrinsics.checkNotNullParameter(experience, "experience");
            this.experience = experience;
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getHeroTitle() {
            return DefaultImpls.getHeroTitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public MenuOfOptionsPromotionalBanner getPromotionalBanner() {
            return DefaultImpls.getPromotionalBanner(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public ImmutableList<UiMenuOfOptionsItem> getRows() {
            return DefaultImpls.getRows(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowBannerHeader() {
            return DefaultImpls.getShowBannerHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowHeroHeader() {
            return DefaultImpls.getShowHeroHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowPathHeader() {
            return DefaultImpls.getShowPathHeader(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public boolean getShowSubtitle() {
            return DefaultImpls.getShowSubtitle(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getSubtitleMarkdown() {
            return DefaultImpls.getSubtitleMarkdown(this);
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState
        public StringResource getTitle() {
            return DefaultImpls.getTitle(this);
        }

        public final SortingHatExperienceV2.MenuOfOptions getExperience() {
            return this.experience;
        }
    }

    /* compiled from: MenuOfOptionsState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static boolean getShowBannerHeader(MenuOfOptionsState menuOfOptionsState) {
            SortingHatExperienceV2.MenuOfOptions experience;
            MenuOfOptionsHeader header = null;
            MenuOfOptions menuOfOptions = menuOfOptionsState instanceof MenuOfOptions ? (MenuOfOptions) menuOfOptionsState : null;
            if (menuOfOptions != null && (experience = menuOfOptions.getExperience()) != null) {
                header = experience.getHeader();
            }
            return header instanceof MenuOfOptionsHeader.Banner;
        }

        public static boolean getShowHeroHeader(MenuOfOptionsState menuOfOptionsState) {
            if (Intrinsics.areEqual(menuOfOptionsState, Error.INSTANCE)) {
                return true;
            }
            if (menuOfOptionsState instanceof MenuOfOptions) {
                return ((MenuOfOptions) menuOfOptionsState).getExperience().getHeader() instanceof MenuOfOptionsHeader.Hero;
            }
            return false;
        }

        public static boolean getShowPathHeader(MenuOfOptionsState menuOfOptionsState) {
            if (menuOfOptionsState instanceof MenuOfOptions) {
                return ((MenuOfOptions) menuOfOptionsState).getExperience().getHeader() instanceof MenuOfOptionsHeader.Path;
            }
            return false;
        }

        public static boolean getShowSubtitle(MenuOfOptionsState menuOfOptionsState) {
            return menuOfOptionsState instanceof MenuOfOptions;
        }

        public static StringResource getHeroTitle(MenuOfOptionsState menuOfOptionsState) {
            if (Intrinsics.areEqual(menuOfOptionsState, Error.INSTANCE)) {
                return StringResource.INSTANCE.invoke(C39252R.string.menu_of_options_error_title, new Object[0]);
            }
            if (Intrinsics.areEqual(menuOfOptionsState, Invested.INSTANCE) || Intrinsics.areEqual(menuOfOptionsState, Loading.INSTANCE)) {
                return null;
            }
            if (!(menuOfOptionsState instanceof MenuOfOptions)) {
                throw new NoWhenBranchMatchedException();
            }
            String heroTitle = ((MenuOfOptions) menuOfOptionsState).getExperience().getHeroTitle();
            if (heroTitle != null) {
                return StringResource.INSTANCE.invoke(heroTitle);
            }
            return null;
        }

        public static StringResource getTitle(MenuOfOptionsState menuOfOptionsState) {
            if (Intrinsics.areEqual(menuOfOptionsState, Error.INSTANCE)) {
                return StringResource.INSTANCE.invoke(C39252R.string.menu_of_options_error_title, new Object[0]);
            }
            if (Intrinsics.areEqual(menuOfOptionsState, Invested.INSTANCE) || Intrinsics.areEqual(menuOfOptionsState, Loading.INSTANCE)) {
                return null;
            }
            if (menuOfOptionsState instanceof MenuOfOptions) {
                return StringResource.INSTANCE.invoke(((MenuOfOptions) menuOfOptionsState).getExperience().getTitle());
            }
            throw new NoWhenBranchMatchedException();
        }

        public static StringResource getSubtitleMarkdown(MenuOfOptionsState menuOfOptionsState) {
            if (Intrinsics.areEqual(menuOfOptionsState, Error.INSTANCE)) {
                return StringResource.INSTANCE.invoke(C39252R.string.menu_of_options_error_description, new Object[0]);
            }
            if (Intrinsics.areEqual(menuOfOptionsState, Invested.INSTANCE) || Intrinsics.areEqual(menuOfOptionsState, Loading.INSTANCE)) {
                return null;
            }
            if (!(menuOfOptionsState instanceof MenuOfOptions)) {
                throw new NoWhenBranchMatchedException();
            }
            String subtitleMarkdown = ((MenuOfOptions) menuOfOptionsState).getExperience().getSubtitleMarkdown();
            if (subtitleMarkdown != null) {
                return StringResource.INSTANCE.invoke(subtitleMarkdown);
            }
            return null;
        }

        public static ImmutableList<UiMenuOfOptionsItem> getRows(MenuOfOptionsState menuOfOptionsState) {
            Error error = Error.INSTANCE;
            if (Intrinsics.areEqual(menuOfOptionsState, error)) {
                return error.getMenuOfOptionsItems();
            }
            if (Intrinsics.areEqual(menuOfOptionsState, Invested.INSTANCE) || Intrinsics.areEqual(menuOfOptionsState, Loading.INSTANCE)) {
                return extensions2.persistentListOf();
            }
            if (menuOfOptionsState instanceof MenuOfOptions) {
                return UiMenuOfOptionsItem2.toUiMenuOfOptionsList(((MenuOfOptions) menuOfOptionsState).getExperience().getItems());
            }
            throw new NoWhenBranchMatchedException();
        }

        public static MenuOfOptionsPromotionalBanner getPromotionalBanner(MenuOfOptionsState menuOfOptionsState) {
            if (Intrinsics.areEqual(menuOfOptionsState, Error.INSTANCE) || Intrinsics.areEqual(menuOfOptionsState, Invested.INSTANCE) || Intrinsics.areEqual(menuOfOptionsState, Loading.INSTANCE)) {
                return null;
            }
            if (menuOfOptionsState instanceof MenuOfOptions) {
                return ((MenuOfOptions) menuOfOptionsState).getExperience().getPromotionalBanner();
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
