package com.robinhood.android.pathfinder.corepages.contactchannel;

import com.robinhood.models.serverdriven.experimental.api.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ContactChannelViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003$%&B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState;", "", "showLoadingView", "", "title", "", "infoBanner", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ContactChannelBanner;", "channelItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ChannelItem;", "disclaimer", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ContactChannelBanner;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/RichText;)V", "getShowLoadingView", "()Z", "getTitle", "()Ljava/lang/String;", "getInfoBanner", "()Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ContactChannelBanner;", "getChannelItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisclaimer", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ChannelItem", "ContactChannelBanner", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ContactChannelViewState {
    public static final String CHANNEL_ID_EMAIL = "email";
    public static final String CHANNEL_ID_INBOUND_CHAT = "inbound_chat";
    public static final String CHANNEL_ID_OUTBOUND_VOICE = "outbound_voice";
    private final ImmutableList<ChannelItem> channelItems;
    private final RichText disclaimer;
    private final ContactChannelBanner infoBanner;
    private final boolean showLoadingView;
    private final String title;
    public static final int $stable = 8;

    public static /* synthetic */ ContactChannelViewState copy$default(ContactChannelViewState contactChannelViewState, boolean z, String str, ContactChannelBanner contactChannelBanner, ImmutableList immutableList, RichText richText, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contactChannelViewState.showLoadingView;
        }
        if ((i & 2) != 0) {
            str = contactChannelViewState.title;
        }
        if ((i & 4) != 0) {
            contactChannelBanner = contactChannelViewState.infoBanner;
        }
        if ((i & 8) != 0) {
            immutableList = contactChannelViewState.channelItems;
        }
        if ((i & 16) != 0) {
            richText = contactChannelViewState.disclaimer;
        }
        RichText richText2 = richText;
        ContactChannelBanner contactChannelBanner2 = contactChannelBanner;
        return contactChannelViewState.copy(z, str, contactChannelBanner2, immutableList, richText2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final ContactChannelBanner getInfoBanner() {
        return this.infoBanner;
    }

    public final ImmutableList<ChannelItem> component4() {
        return this.channelItems;
    }

    /* renamed from: component5, reason: from getter */
    public final RichText getDisclaimer() {
        return this.disclaimer;
    }

    public final ContactChannelViewState copy(boolean showLoadingView, String title, ContactChannelBanner infoBanner, ImmutableList<ChannelItem> channelItems, RichText disclaimer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(channelItems, "channelItems");
        return new ContactChannelViewState(showLoadingView, title, infoBanner, channelItems, disclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactChannelViewState)) {
            return false;
        }
        ContactChannelViewState contactChannelViewState = (ContactChannelViewState) other;
        return this.showLoadingView == contactChannelViewState.showLoadingView && Intrinsics.areEqual(this.title, contactChannelViewState.title) && Intrinsics.areEqual(this.infoBanner, contactChannelViewState.infoBanner) && Intrinsics.areEqual(this.channelItems, contactChannelViewState.channelItems) && Intrinsics.areEqual(this.disclaimer, contactChannelViewState.disclaimer);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.showLoadingView) * 31) + this.title.hashCode()) * 31;
        ContactChannelBanner contactChannelBanner = this.infoBanner;
        int iHashCode2 = (((iHashCode + (contactChannelBanner == null ? 0 : contactChannelBanner.hashCode())) * 31) + this.channelItems.hashCode()) * 31;
        RichText richText = this.disclaimer;
        return iHashCode2 + (richText != null ? richText.hashCode() : 0);
    }

    public String toString() {
        return "ContactChannelViewState(showLoadingView=" + this.showLoadingView + ", title=" + this.title + ", infoBanner=" + this.infoBanner + ", channelItems=" + this.channelItems + ", disclaimer=" + this.disclaimer + ")";
    }

    public ContactChannelViewState(boolean z, String title, ContactChannelBanner contactChannelBanner, ImmutableList<ChannelItem> channelItems, RichText richText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(channelItems, "channelItems");
        this.showLoadingView = z;
        this.title = title;
        this.infoBanner = contactChannelBanner;
        this.channelItems = channelItems;
        this.disclaimer = richText;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ContactChannelBanner getInfoBanner() {
        return this.infoBanner;
    }

    public final ImmutableList<ChannelItem> getChannelItems() {
        return this.channelItems;
    }

    public final RichText getDisclaimer() {
        return this.disclaimer;
    }

    /* compiled from: ContactChannelViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ChannelItem;", "", "id", "", "primaryText", "Lcom/robinhood/models/serverdriven/db/RichText;", "secondaryText", "icon", "", "isEnabled", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;IZ)V", "getId", "()Ljava/lang/String;", "getPrimaryText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getSecondaryText", "getIcon", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChannelItem {
        public static final int $stable = 8;
        private final int icon;
        private final String id;
        private final boolean isEnabled;
        private final com.robinhood.models.serverdriven.p347db.RichText primaryText;
        private final com.robinhood.models.serverdriven.p347db.RichText secondaryText;

        public static /* synthetic */ ChannelItem copy$default(ChannelItem channelItem, String str, com.robinhood.models.serverdriven.p347db.RichText richText, com.robinhood.models.serverdriven.p347db.RichText richText2, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = channelItem.id;
            }
            if ((i2 & 2) != 0) {
                richText = channelItem.primaryText;
            }
            if ((i2 & 4) != 0) {
                richText2 = channelItem.secondaryText;
            }
            if ((i2 & 8) != 0) {
                i = channelItem.icon;
            }
            if ((i2 & 16) != 0) {
                z = channelItem.isEnabled;
            }
            boolean z2 = z;
            com.robinhood.models.serverdriven.p347db.RichText richText3 = richText2;
            return channelItem.copy(str, richText, richText3, i, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.models.serverdriven.p347db.RichText getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final com.robinhood.models.serverdriven.p347db.RichText getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component4, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final ChannelItem copy(String id, com.robinhood.models.serverdriven.p347db.RichText primaryText, com.robinhood.models.serverdriven.p347db.RichText secondaryText, int icon, boolean isEnabled) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            return new ChannelItem(id, primaryText, secondaryText, icon, isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelItem)) {
                return false;
            }
            ChannelItem channelItem = (ChannelItem) other;
            return Intrinsics.areEqual(this.id, channelItem.id) && Intrinsics.areEqual(this.primaryText, channelItem.primaryText) && Intrinsics.areEqual(this.secondaryText, channelItem.secondaryText) && this.icon == channelItem.icon && this.isEnabled == channelItem.isEnabled;
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.primaryText.hashCode()) * 31;
            com.robinhood.models.serverdriven.p347db.RichText richText = this.secondaryText;
            return ((((iHashCode + (richText == null ? 0 : richText.hashCode())) * 31) + Integer.hashCode(this.icon)) * 31) + Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return "ChannelItem(id=" + this.id + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", icon=" + this.icon + ", isEnabled=" + this.isEnabled + ")";
        }

        public ChannelItem(String id, com.robinhood.models.serverdriven.p347db.RichText primaryText, com.robinhood.models.serverdriven.p347db.RichText richText, int i, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            this.id = id;
            this.primaryText = primaryText;
            this.secondaryText = richText;
            this.icon = i;
            this.isEnabled = z;
        }

        public final String getId() {
            return this.id;
        }

        public final com.robinhood.models.serverdriven.p347db.RichText getPrimaryText() {
            return this.primaryText;
        }

        public final com.robinhood.models.serverdriven.p347db.RichText getSecondaryText() {
            return this.secondaryText;
        }

        public final int getIcon() {
            return this.icon;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }

    /* compiled from: ContactChannelViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ContactChannelBanner;", "", "infoBannerIcon", "", "infoBannerText", "Lcom/robinhood/models/serverdriven/db/RichText;", "<init>", "(ILcom/robinhood/models/serverdriven/db/RichText;)V", "getInfoBannerIcon", "()I", "getInfoBannerText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContactChannelBanner {
        public static final int $stable = 8;
        private final int infoBannerIcon;
        private final com.robinhood.models.serverdriven.p347db.RichText infoBannerText;

        public static /* synthetic */ ContactChannelBanner copy$default(ContactChannelBanner contactChannelBanner, int i, com.robinhood.models.serverdriven.p347db.RichText richText, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = contactChannelBanner.infoBannerIcon;
            }
            if ((i2 & 2) != 0) {
                richText = contactChannelBanner.infoBannerText;
            }
            return contactChannelBanner.copy(i, richText);
        }

        /* renamed from: component1, reason: from getter */
        public final int getInfoBannerIcon() {
            return this.infoBannerIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.models.serverdriven.p347db.RichText getInfoBannerText() {
            return this.infoBannerText;
        }

        public final ContactChannelBanner copy(int infoBannerIcon, com.robinhood.models.serverdriven.p347db.RichText infoBannerText) {
            Intrinsics.checkNotNullParameter(infoBannerText, "infoBannerText");
            return new ContactChannelBanner(infoBannerIcon, infoBannerText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactChannelBanner)) {
                return false;
            }
            ContactChannelBanner contactChannelBanner = (ContactChannelBanner) other;
            return this.infoBannerIcon == contactChannelBanner.infoBannerIcon && Intrinsics.areEqual(this.infoBannerText, contactChannelBanner.infoBannerText);
        }

        public int hashCode() {
            return (Integer.hashCode(this.infoBannerIcon) * 31) + this.infoBannerText.hashCode();
        }

        public String toString() {
            return "ContactChannelBanner(infoBannerIcon=" + this.infoBannerIcon + ", infoBannerText=" + this.infoBannerText + ")";
        }

        public ContactChannelBanner(int i, com.robinhood.models.serverdriven.p347db.RichText infoBannerText) {
            Intrinsics.checkNotNullParameter(infoBannerText, "infoBannerText");
            this.infoBannerIcon = i;
            this.infoBannerText = infoBannerText;
        }

        public final int getInfoBannerIcon() {
            return this.infoBannerIcon;
        }

        public final com.robinhood.models.serverdriven.p347db.RichText getInfoBannerText() {
            return this.infoBannerText;
        }
    }
}
