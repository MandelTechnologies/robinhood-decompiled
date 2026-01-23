package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingKnowledgeCheckNeededViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState;", "", "title", "", "chatNowCard", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState$SupportCardState;", "scheduleCallCard", "disclosureMarkdown", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState$SupportCardState;Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState$SupportCardState;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getChatNowCard", "()Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState$SupportCardState;", "getScheduleCallCard", "getDisclosureMarkdown", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SupportCardState", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingKnowledgeCheckNeededViewState {
    public static final int $stable = 0;
    private final SupportCardState chatNowCard;
    private final String disclosureMarkdown;
    private final SupportCardState scheduleCallCard;
    private final String title;

    public static /* synthetic */ OptionOnboardingKnowledgeCheckNeededViewState copy$default(OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState, String str, SupportCardState supportCardState, SupportCardState supportCardState2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOnboardingKnowledgeCheckNeededViewState.title;
        }
        if ((i & 2) != 0) {
            supportCardState = optionOnboardingKnowledgeCheckNeededViewState.chatNowCard;
        }
        if ((i & 4) != 0) {
            supportCardState2 = optionOnboardingKnowledgeCheckNeededViewState.scheduleCallCard;
        }
        if ((i & 8) != 0) {
            str2 = optionOnboardingKnowledgeCheckNeededViewState.disclosureMarkdown;
        }
        return optionOnboardingKnowledgeCheckNeededViewState.copy(str, supportCardState, supportCardState2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final SupportCardState getChatNowCard() {
        return this.chatNowCard;
    }

    /* renamed from: component3, reason: from getter */
    public final SupportCardState getScheduleCallCard() {
        return this.scheduleCallCard;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final OptionOnboardingKnowledgeCheckNeededViewState copy(String title, SupportCardState chatNowCard, SupportCardState scheduleCallCard, String disclosureMarkdown) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(scheduleCallCard, "scheduleCallCard");
        return new OptionOnboardingKnowledgeCheckNeededViewState(title, chatNowCard, scheduleCallCard, disclosureMarkdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingKnowledgeCheckNeededViewState)) {
            return false;
        }
        OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState = (OptionOnboardingKnowledgeCheckNeededViewState) other;
        return Intrinsics.areEqual(this.title, optionOnboardingKnowledgeCheckNeededViewState.title) && Intrinsics.areEqual(this.chatNowCard, optionOnboardingKnowledgeCheckNeededViewState.chatNowCard) && Intrinsics.areEqual(this.scheduleCallCard, optionOnboardingKnowledgeCheckNeededViewState.scheduleCallCard) && Intrinsics.areEqual(this.disclosureMarkdown, optionOnboardingKnowledgeCheckNeededViewState.disclosureMarkdown);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        SupportCardState supportCardState = this.chatNowCard;
        int iHashCode2 = (((iHashCode + (supportCardState == null ? 0 : supportCardState.hashCode())) * 31) + this.scheduleCallCard.hashCode()) * 31;
        String str = this.disclosureMarkdown;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OptionOnboardingKnowledgeCheckNeededViewState(title=" + this.title + ", chatNowCard=" + this.chatNowCard + ", scheduleCallCard=" + this.scheduleCallCard + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
    }

    public OptionOnboardingKnowledgeCheckNeededViewState(String title, SupportCardState supportCardState, SupportCardState scheduleCallCard, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(scheduleCallCard, "scheduleCallCard");
        this.title = title;
        this.chatNowCard = supportCardState;
        this.scheduleCallCard = scheduleCallCard;
        this.disclosureMarkdown = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final SupportCardState getChatNowCard() {
        return this.chatNowCard;
    }

    public final SupportCardState getScheduleCallCard() {
        return this.scheduleCallCard;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState$SupportCardState;", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "title", "", "description", "enabled", "", "isLoading", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTitle", "()Ljava/lang/String;", "getDescription", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SupportCardState {
        public static final int $stable = 0;
        private final String description;
        private final boolean enabled;
        private final ServerToBentoAssetMapper2 icon;
        private final boolean isLoading;
        private final String title;

        public static /* synthetic */ SupportCardState copy$default(SupportCardState supportCardState, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                serverToBentoAssetMapper2 = supportCardState.icon;
            }
            if ((i & 2) != 0) {
                str = supportCardState.title;
            }
            if ((i & 4) != 0) {
                str2 = supportCardState.description;
            }
            if ((i & 8) != 0) {
                z = supportCardState.enabled;
            }
            if ((i & 16) != 0) {
                z2 = supportCardState.isLoading;
            }
            boolean z3 = z2;
            String str3 = str2;
            return supportCardState.copy(serverToBentoAssetMapper2, str, str3, z, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final SupportCardState copy(ServerToBentoAssetMapper2 icon, String title, String description, boolean enabled, boolean isLoading) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new SupportCardState(icon, title, description, enabled, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportCardState)) {
                return false;
            }
            SupportCardState supportCardState = (SupportCardState) other;
            return this.icon == supportCardState.icon && Intrinsics.areEqual(this.title, supportCardState.title) && Intrinsics.areEqual(this.description, supportCardState.description) && this.enabled == supportCardState.enabled && this.isLoading == supportCardState.isLoading;
        }

        public int hashCode() {
            int iHashCode = ((this.icon.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.description;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "SupportCardState(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", enabled=" + this.enabled + ", isLoading=" + this.isLoading + ")";
        }

        public SupportCardState(ServerToBentoAssetMapper2 icon, String title, String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.description = str;
            this.enabled = z;
            this.isLoading = z2;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }
    }
}
