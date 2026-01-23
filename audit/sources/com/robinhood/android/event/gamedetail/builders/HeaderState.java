package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.markdown.compose.MarkdownText4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildGameDetailHeaderState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/HeaderState;", "", "leftTeamState", "Lcom/robinhood/android/event/gamedetail/builders/HeaderState$DuelTeamState;", "rightTeamState", "<init>", "(Lcom/robinhood/android/event/gamedetail/builders/HeaderState$DuelTeamState;Lcom/robinhood/android/event/gamedetail/builders/HeaderState$DuelTeamState;)V", "getLeftTeamState", "()Lcom/robinhood/android/event/gamedetail/builders/HeaderState$DuelTeamState;", "getRightTeamState", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DuelTeamState", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeaderState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HeaderState loading = new HeaderState(null, null);
    private final DuelTeamState leftTeamState;
    private final DuelTeamState rightTeamState;

    public static /* synthetic */ HeaderState copy$default(HeaderState headerState, DuelTeamState duelTeamState, DuelTeamState duelTeamState2, int i, Object obj) {
        if ((i & 1) != 0) {
            duelTeamState = headerState.leftTeamState;
        }
        if ((i & 2) != 0) {
            duelTeamState2 = headerState.rightTeamState;
        }
        return headerState.copy(duelTeamState, duelTeamState2);
    }

    /* renamed from: component1, reason: from getter */
    public final DuelTeamState getLeftTeamState() {
        return this.leftTeamState;
    }

    /* renamed from: component2, reason: from getter */
    public final DuelTeamState getRightTeamState() {
        return this.rightTeamState;
    }

    public final HeaderState copy(DuelTeamState leftTeamState, DuelTeamState rightTeamState) {
        return new HeaderState(leftTeamState, rightTeamState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderState)) {
            return false;
        }
        HeaderState headerState = (HeaderState) other;
        return Intrinsics.areEqual(this.leftTeamState, headerState.leftTeamState) && Intrinsics.areEqual(this.rightTeamState, headerState.rightTeamState);
    }

    public int hashCode() {
        DuelTeamState duelTeamState = this.leftTeamState;
        int iHashCode = (duelTeamState == null ? 0 : duelTeamState.hashCode()) * 31;
        DuelTeamState duelTeamState2 = this.rightTeamState;
        return iHashCode + (duelTeamState2 != null ? duelTeamState2.hashCode() : 0);
    }

    public String toString() {
        return "HeaderState(leftTeamState=" + this.leftTeamState + ", rightTeamState=" + this.rightTeamState + ")";
    }

    public HeaderState(DuelTeamState duelTeamState, DuelTeamState duelTeamState2) {
        this.leftTeamState = duelTeamState;
        this.rightTeamState = duelTeamState2;
    }

    public final DuelTeamState getLeftTeamState() {
        return this.leftTeamState;
    }

    public final DuelTeamState getRightTeamState() {
        return this.rightTeamState;
    }

    /* compiled from: BuildGameDetailHeaderState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/HeaderState$DuelTeamState;", "", MarkdownText4.TagImageUrl, "", "mirrorImageVeritically", "", "iconUrl", "score", "contractFallbackColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "contractDisplayShortName", "winLossRecord", "isActive", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Ljava/lang/String;Ljava/lang/String;Z)V", "getImageUrl", "()Ljava/lang/String;", "getMirrorImageVeritically", "()Z", "getIconUrl", "getScore", "getContractFallbackColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getContractDisplayShortName", "getWinLossRecord", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DuelTeamState {
        public static final int $stable = 0;
        private final String contractDisplayShortName;
        private final DayNightColor contractFallbackColor;
        private final String iconUrl;
        private final String imageUrl;
        private final boolean isActive;
        private final boolean mirrorImageVeritically;
        private final String score;
        private final String winLossRecord;

        public static /* synthetic */ DuelTeamState copy$default(DuelTeamState duelTeamState, String str, boolean z, String str2, String str3, DayNightColor dayNightColor, String str4, String str5, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = duelTeamState.imageUrl;
            }
            if ((i & 2) != 0) {
                z = duelTeamState.mirrorImageVeritically;
            }
            if ((i & 4) != 0) {
                str2 = duelTeamState.iconUrl;
            }
            if ((i & 8) != 0) {
                str3 = duelTeamState.score;
            }
            if ((i & 16) != 0) {
                dayNightColor = duelTeamState.contractFallbackColor;
            }
            if ((i & 32) != 0) {
                str4 = duelTeamState.contractDisplayShortName;
            }
            if ((i & 64) != 0) {
                str5 = duelTeamState.winLossRecord;
            }
            if ((i & 128) != 0) {
                z2 = duelTeamState.isActive;
            }
            String str6 = str5;
            boolean z3 = z2;
            DayNightColor dayNightColor2 = dayNightColor;
            String str7 = str4;
            return duelTeamState.copy(str, z, str2, str3, dayNightColor2, str7, str6, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMirrorImageVeritically() {
            return this.mirrorImageVeritically;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getScore() {
            return this.score;
        }

        /* renamed from: component5, reason: from getter */
        public final DayNightColor getContractFallbackColor() {
            return this.contractFallbackColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContractDisplayShortName() {
            return this.contractDisplayShortName;
        }

        /* renamed from: component7, reason: from getter */
        public final String getWinLossRecord() {
            return this.winLossRecord;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final DuelTeamState copy(String imageUrl, boolean mirrorImageVeritically, String iconUrl, String score, DayNightColor contractFallbackColor, String contractDisplayShortName, String winLossRecord, boolean isActive) {
            Intrinsics.checkNotNullParameter(contractDisplayShortName, "contractDisplayShortName");
            return new DuelTeamState(imageUrl, mirrorImageVeritically, iconUrl, score, contractFallbackColor, contractDisplayShortName, winLossRecord, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DuelTeamState)) {
                return false;
            }
            DuelTeamState duelTeamState = (DuelTeamState) other;
            return Intrinsics.areEqual(this.imageUrl, duelTeamState.imageUrl) && this.mirrorImageVeritically == duelTeamState.mirrorImageVeritically && Intrinsics.areEqual(this.iconUrl, duelTeamState.iconUrl) && Intrinsics.areEqual(this.score, duelTeamState.score) && Intrinsics.areEqual(this.contractFallbackColor, duelTeamState.contractFallbackColor) && Intrinsics.areEqual(this.contractDisplayShortName, duelTeamState.contractDisplayShortName) && Intrinsics.areEqual(this.winLossRecord, duelTeamState.winLossRecord) && this.isActive == duelTeamState.isActive;
        }

        public int hashCode() {
            String str = this.imageUrl;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.mirrorImageVeritically)) * 31;
            String str2 = this.iconUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.score;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DayNightColor dayNightColor = this.contractFallbackColor;
            int iHashCode4 = (((iHashCode3 + (dayNightColor == null ? 0 : dayNightColor.hashCode())) * 31) + this.contractDisplayShortName.hashCode()) * 31;
            String str4 = this.winLossRecord;
            return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isActive);
        }

        public String toString() {
            return "DuelTeamState(imageUrl=" + this.imageUrl + ", mirrorImageVeritically=" + this.mirrorImageVeritically + ", iconUrl=" + this.iconUrl + ", score=" + this.score + ", contractFallbackColor=" + this.contractFallbackColor + ", contractDisplayShortName=" + this.contractDisplayShortName + ", winLossRecord=" + this.winLossRecord + ", isActive=" + this.isActive + ")";
        }

        public DuelTeamState(String str, boolean z, String str2, String str3, DayNightColor dayNightColor, String contractDisplayShortName, String str4, boolean z2) {
            Intrinsics.checkNotNullParameter(contractDisplayShortName, "contractDisplayShortName");
            this.imageUrl = str;
            this.mirrorImageVeritically = z;
            this.iconUrl = str2;
            this.score = str3;
            this.contractFallbackColor = dayNightColor;
            this.contractDisplayShortName = contractDisplayShortName;
            this.winLossRecord = str4;
            this.isActive = z2;
        }

        public /* synthetic */ DuelTeamState(String str, boolean z, String str2, String str3, DayNightColor dayNightColor, String str4, String str5, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, str3, dayNightColor, str4, str5, (i & 128) != 0 ? false : z2);
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final boolean getMirrorImageVeritically() {
            return this.mirrorImageVeritically;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getScore() {
            return this.score;
        }

        public final DayNightColor getContractFallbackColor() {
            return this.contractFallbackColor;
        }

        public final String getContractDisplayShortName() {
            return this.contractDisplayShortName;
        }

        public final String getWinLossRecord() {
            return this.winLossRecord;
        }

        public final boolean isActive() {
            return this.isActive;
        }
    }

    /* compiled from: BuildGameDetailHeaderState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/HeaderState$Companion;", "", "<init>", "()V", "loading", "Lcom/robinhood/android/event/gamedetail/builders/HeaderState;", "getLoading", "()Lcom/robinhood/android/event/gamedetail/builders/HeaderState;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HeaderState getLoading() {
            return HeaderState.loading;
        }
    }
}
