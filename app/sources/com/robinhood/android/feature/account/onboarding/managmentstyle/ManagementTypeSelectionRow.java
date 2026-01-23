package com.robinhood.android.feature.account.onboarding.managmentstyle;

import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ManagementTypeSelectionRow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow;", "", "managementType", "Lcom/robinhood/models/api/ManagementType;", "promotionalTitle", "", "title", "subtitle", "enabled", "", "learnMoreText", "learnMoreSheet", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$BottomSheet;", "loggingIdentifier", "<init>", "(Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$BottomSheet;Ljava/lang/String;)V", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getPromotionalTitle", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getEnabled", "()Z", "getLearnMoreText", "getLearnMoreSheet", "()Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$BottomSheet;", "getLoggingIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "BottomSheet", "ValueProp", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ManagementTypeSelectionRow {
    public static final int $stable = 0;
    private final boolean enabled;
    private final BottomSheet learnMoreSheet;
    private final String learnMoreText;
    private final String loggingIdentifier;
    private final ManagementType managementType;
    private final String promotionalTitle;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ ManagementTypeSelectionRow copy$default(ManagementTypeSelectionRow managementTypeSelectionRow, ManagementType managementType, String str, String str2, String str3, boolean z, String str4, BottomSheet bottomSheet, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            managementType = managementTypeSelectionRow.managementType;
        }
        if ((i & 2) != 0) {
            str = managementTypeSelectionRow.promotionalTitle;
        }
        if ((i & 4) != 0) {
            str2 = managementTypeSelectionRow.title;
        }
        if ((i & 8) != 0) {
            str3 = managementTypeSelectionRow.subtitle;
        }
        if ((i & 16) != 0) {
            z = managementTypeSelectionRow.enabled;
        }
        if ((i & 32) != 0) {
            str4 = managementTypeSelectionRow.learnMoreText;
        }
        if ((i & 64) != 0) {
            bottomSheet = managementTypeSelectionRow.learnMoreSheet;
        }
        if ((i & 128) != 0) {
            str5 = managementTypeSelectionRow.loggingIdentifier;
        }
        BottomSheet bottomSheet2 = bottomSheet;
        String str6 = str5;
        boolean z2 = z;
        String str7 = str4;
        return managementTypeSelectionRow.copy(managementType, str, str2, str3, z2, str7, bottomSheet2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPromotionalTitle() {
        return this.promotionalTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    /* renamed from: component7, reason: from getter */
    public final BottomSheet getLearnMoreSheet() {
        return this.learnMoreSheet;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final ManagementTypeSelectionRow copy(ManagementType managementType, String promotionalTitle, String title, String subtitle, boolean enabled, String learnMoreText, BottomSheet learnMoreSheet, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(learnMoreText, "learnMoreText");
        Intrinsics.checkNotNullParameter(learnMoreSheet, "learnMoreSheet");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new ManagementTypeSelectionRow(managementType, promotionalTitle, title, subtitle, enabled, learnMoreText, learnMoreSheet, loggingIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagementTypeSelectionRow)) {
            return false;
        }
        ManagementTypeSelectionRow managementTypeSelectionRow = (ManagementTypeSelectionRow) other;
        return this.managementType == managementTypeSelectionRow.managementType && Intrinsics.areEqual(this.promotionalTitle, managementTypeSelectionRow.promotionalTitle) && Intrinsics.areEqual(this.title, managementTypeSelectionRow.title) && Intrinsics.areEqual(this.subtitle, managementTypeSelectionRow.subtitle) && this.enabled == managementTypeSelectionRow.enabled && Intrinsics.areEqual(this.learnMoreText, managementTypeSelectionRow.learnMoreText) && Intrinsics.areEqual(this.learnMoreSheet, managementTypeSelectionRow.learnMoreSheet) && Intrinsics.areEqual(this.loggingIdentifier, managementTypeSelectionRow.loggingIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.managementType.hashCode() * 31;
        String str = this.promotionalTitle;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.learnMoreText.hashCode()) * 31) + this.learnMoreSheet.hashCode()) * 31) + this.loggingIdentifier.hashCode();
    }

    public String toString() {
        return "ManagementTypeSelectionRow(managementType=" + this.managementType + ", promotionalTitle=" + this.promotionalTitle + ", title=" + this.title + ", subtitle=" + this.subtitle + ", enabled=" + this.enabled + ", learnMoreText=" + this.learnMoreText + ", learnMoreSheet=" + this.learnMoreSheet + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    public ManagementTypeSelectionRow(ManagementType managementType, String str, String title, String subtitle, boolean z, String learnMoreText, BottomSheet learnMoreSheet, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(learnMoreText, "learnMoreText");
        Intrinsics.checkNotNullParameter(learnMoreSheet, "learnMoreSheet");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.managementType = managementType;
        this.promotionalTitle = str;
        this.title = title;
        this.subtitle = subtitle;
        this.enabled = z;
        this.learnMoreText = learnMoreText;
        this.learnMoreSheet = learnMoreSheet;
        this.loggingIdentifier = loggingIdentifier;
    }

    public /* synthetic */ ManagementTypeSelectionRow(ManagementType managementType, String str, String str2, String str3, boolean z, String str4, BottomSheet bottomSheet, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(managementType, (i & 2) != 0 ? null : str, str2, str3, z, str4, bottomSheet, str5);
    }

    public final ManagementType getManagementType() {
        return this.managementType;
    }

    public final String getPromotionalTitle() {
        return this.promotionalTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    public final BottomSheet getLearnMoreSheet() {
        return this.learnMoreSheet;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* compiled from: ManagementTypeSelectionRow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Jk\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$BottomSheet;", "", "title", "", "subtitle", "primaryCtaText", "primaryCtaIdentifier", "secondaryCtaText", "secondaryCtaIdentifier", "loggingIdentifier", "markdownDisclosure", "valueProps", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$ValueProp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryCtaText", "getPrimaryCtaIdentifier", "getSecondaryCtaText", "getSecondaryCtaIdentifier", "getLoggingIdentifier", "getMarkdownDisclosure", "getValueProps", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BottomSheet {
        public static final int $stable = 0;
        private final String loggingIdentifier;
        private final String markdownDisclosure;
        private final String primaryCtaIdentifier;
        private final String primaryCtaText;
        private final String secondaryCtaIdentifier;
        private final String secondaryCtaText;
        private final String subtitle;
        private final String title;
        private final ImmutableList<ValueProp> valueProps;

        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bottomSheet.title;
            }
            if ((i & 2) != 0) {
                str2 = bottomSheet.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = bottomSheet.primaryCtaText;
            }
            if ((i & 8) != 0) {
                str4 = bottomSheet.primaryCtaIdentifier;
            }
            if ((i & 16) != 0) {
                str5 = bottomSheet.secondaryCtaText;
            }
            if ((i & 32) != 0) {
                str6 = bottomSheet.secondaryCtaIdentifier;
            }
            if ((i & 64) != 0) {
                str7 = bottomSheet.loggingIdentifier;
            }
            if ((i & 128) != 0) {
                str8 = bottomSheet.markdownDisclosure;
            }
            if ((i & 256) != 0) {
                immutableList = bottomSheet.valueProps;
            }
            String str9 = str8;
            ImmutableList immutableList2 = immutableList;
            String str10 = str6;
            String str11 = str7;
            String str12 = str5;
            String str13 = str3;
            return bottomSheet.copy(str, str2, str13, str4, str12, str10, str11, str9, immutableList2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrimaryCtaIdentifier() {
            return this.primaryCtaIdentifier;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSecondaryCtaIdentifier() {
            return this.secondaryCtaIdentifier;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMarkdownDisclosure() {
            return this.markdownDisclosure;
        }

        public final ImmutableList<ValueProp> component9() {
            return this.valueProps;
        }

        public final BottomSheet copy(String title, String subtitle, String primaryCtaText, String primaryCtaIdentifier, String secondaryCtaText, String secondaryCtaIdentifier, String loggingIdentifier, String markdownDisclosure, ImmutableList<ValueProp> valueProps) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(primaryCtaIdentifier, "primaryCtaIdentifier");
            Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
            Intrinsics.checkNotNullParameter(secondaryCtaIdentifier, "secondaryCtaIdentifier");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            return new BottomSheet(title, subtitle, primaryCtaText, primaryCtaIdentifier, secondaryCtaText, secondaryCtaIdentifier, loggingIdentifier, markdownDisclosure, valueProps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) other;
            return Intrinsics.areEqual(this.title, bottomSheet.title) && Intrinsics.areEqual(this.subtitle, bottomSheet.subtitle) && Intrinsics.areEqual(this.primaryCtaText, bottomSheet.primaryCtaText) && Intrinsics.areEqual(this.primaryCtaIdentifier, bottomSheet.primaryCtaIdentifier) && Intrinsics.areEqual(this.secondaryCtaText, bottomSheet.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaIdentifier, bottomSheet.secondaryCtaIdentifier) && Intrinsics.areEqual(this.loggingIdentifier, bottomSheet.loggingIdentifier) && Intrinsics.areEqual(this.markdownDisclosure, bottomSheet.markdownDisclosure) && Intrinsics.areEqual(this.valueProps, bottomSheet.valueProps);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31) + this.primaryCtaIdentifier.hashCode()) * 31) + this.secondaryCtaText.hashCode()) * 31) + this.secondaryCtaIdentifier.hashCode()) * 31) + this.loggingIdentifier.hashCode()) * 31;
            String str = this.markdownDisclosure;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.valueProps.hashCode();
        }

        public String toString() {
            return "BottomSheet(title=" + this.title + ", subtitle=" + this.subtitle + ", primaryCtaText=" + this.primaryCtaText + ", primaryCtaIdentifier=" + this.primaryCtaIdentifier + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryCtaIdentifier=" + this.secondaryCtaIdentifier + ", loggingIdentifier=" + this.loggingIdentifier + ", markdownDisclosure=" + this.markdownDisclosure + ", valueProps=" + this.valueProps + ")";
        }

        public BottomSheet(String title, String subtitle, String primaryCtaText, String primaryCtaIdentifier, String secondaryCtaText, String secondaryCtaIdentifier, String loggingIdentifier, String str, ImmutableList<ValueProp> valueProps) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(primaryCtaIdentifier, "primaryCtaIdentifier");
            Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
            Intrinsics.checkNotNullParameter(secondaryCtaIdentifier, "secondaryCtaIdentifier");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            this.title = title;
            this.subtitle = subtitle;
            this.primaryCtaText = primaryCtaText;
            this.primaryCtaIdentifier = primaryCtaIdentifier;
            this.secondaryCtaText = secondaryCtaText;
            this.secondaryCtaIdentifier = secondaryCtaIdentifier;
            this.loggingIdentifier = loggingIdentifier;
            this.markdownDisclosure = str;
            this.valueProps = valueProps;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        public final String getPrimaryCtaIdentifier() {
            return this.primaryCtaIdentifier;
        }

        public final String getSecondaryCtaText() {
            return this.secondaryCtaText;
        }

        public final String getSecondaryCtaIdentifier() {
            return this.secondaryCtaIdentifier;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final String getMarkdownDisclosure() {
            return this.markdownDisclosure;
        }

        public final ImmutableList<ValueProp> getValueProps() {
            return this.valueProps;
        }
    }

    /* compiled from: ManagementTypeSelectionRow.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$ValueProp;", "", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValueProp {
        public static final int $stable = 0;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ ValueProp copy$default(ValueProp valueProp, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valueProp.title;
            }
            if ((i & 2) != 0) {
                str2 = valueProp.subtitle;
            }
            return valueProp.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ValueProp copy(String title, String subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new ValueProp(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValueProp)) {
                return false;
            }
            ValueProp valueProp = (ValueProp) other;
            return Intrinsics.areEqual(this.title, valueProp.title) && Intrinsics.areEqual(this.subtitle, valueProp.subtitle);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.subtitle.hashCode();
        }

        public String toString() {
            return "ValueProp(title=" + this.title + ", subtitle=" + this.subtitle + ")";
        }

        public ValueProp(String title, String subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }
    }
}
