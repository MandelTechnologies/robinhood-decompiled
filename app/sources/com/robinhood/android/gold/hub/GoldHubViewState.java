package com.robinhood.android.gold.hub;

import com.robinhood.android.gold.contracts.GoldHubSettingsComponentTargetType;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubCard;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubCardSection;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubFeature;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubFeatureSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Companion", "Lcom/robinhood/android/gold/hub/GoldHubViewState$Error;", "Lcom/robinhood/android/gold/hub/GoldHubViewState$Loaded;", "Lcom/robinhood/android/gold/hub/GoldHubViewState$Loading;", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldHubViewState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ApiGoldHubCard cardToShow;
    private static final Loaded loadingMock;

    public /* synthetic */ GoldHubViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldHubViewState() {
    }

    /* compiled from: GoldHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubViewState$Loading;", "Lcom/robinhood/android/gold/hub/GoldHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1364540904;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: GoldHubViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubViewState$Loaded;", "Lcom/robinhood/android/gold/hub/GoldHubViewState;", "goldHub", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "cardToShow", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "scrollTarget", "Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "isGoldEventActive", "", "<init>", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;Z)V", "getGoldHub", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "getCardToShow", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "getScrollTarget", "()Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldHubViewState {
        public static final int $stable = 8;
        private final ApiGoldHubCard cardToShow;
        private final ApiGoldHub goldHub;
        private final boolean isGoldEventActive;
        private final GoldHubSettingsComponentTargetType scrollTarget;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiGoldHub apiGoldHub, ApiGoldHubCard apiGoldHubCard, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldHub = loaded.goldHub;
            }
            if ((i & 2) != 0) {
                apiGoldHubCard = loaded.cardToShow;
            }
            if ((i & 4) != 0) {
                goldHubSettingsComponentTargetType = loaded.scrollTarget;
            }
            if ((i & 8) != 0) {
                z = loaded.isGoldEventActive;
            }
            return loaded.copy(apiGoldHub, apiGoldHubCard, goldHubSettingsComponentTargetType, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldHub getGoldHub() {
            return this.goldHub;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiGoldHubCard getCardToShow() {
            return this.cardToShow;
        }

        /* renamed from: component3, reason: from getter */
        public final GoldHubSettingsComponentTargetType getScrollTarget() {
            return this.scrollTarget;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsGoldEventActive() {
            return this.isGoldEventActive;
        }

        public final Loaded copy(ApiGoldHub goldHub, ApiGoldHubCard cardToShow, GoldHubSettingsComponentTargetType scrollTarget, boolean isGoldEventActive) {
            Intrinsics.checkNotNullParameter(goldHub, "goldHub");
            return new Loaded(goldHub, cardToShow, scrollTarget, isGoldEventActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.goldHub, loaded.goldHub) && Intrinsics.areEqual(this.cardToShow, loaded.cardToShow) && this.scrollTarget == loaded.scrollTarget && this.isGoldEventActive == loaded.isGoldEventActive;
        }

        public int hashCode() {
            int iHashCode = this.goldHub.hashCode() * 31;
            ApiGoldHubCard apiGoldHubCard = this.cardToShow;
            int iHashCode2 = (iHashCode + (apiGoldHubCard == null ? 0 : apiGoldHubCard.hashCode())) * 31;
            GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType = this.scrollTarget;
            return ((iHashCode2 + (goldHubSettingsComponentTargetType != null ? goldHubSettingsComponentTargetType.hashCode() : 0)) * 31) + Boolean.hashCode(this.isGoldEventActive);
        }

        public String toString() {
            return "Loaded(goldHub=" + this.goldHub + ", cardToShow=" + this.cardToShow + ", scrollTarget=" + this.scrollTarget + ", isGoldEventActive=" + this.isGoldEventActive + ")";
        }

        public /* synthetic */ Loaded(ApiGoldHub apiGoldHub, ApiGoldHubCard apiGoldHubCard, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiGoldHub, apiGoldHubCard, (i & 4) != 0 ? null : goldHubSettingsComponentTargetType, (i & 8) != 0 ? false : z);
        }

        public final ApiGoldHub getGoldHub() {
            return this.goldHub;
        }

        public final ApiGoldHubCard getCardToShow() {
            return this.cardToShow;
        }

        public final GoldHubSettingsComponentTargetType getScrollTarget() {
            return this.scrollTarget;
        }

        public final boolean isGoldEventActive() {
            return this.isGoldEventActive;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiGoldHub goldHub, ApiGoldHubCard apiGoldHubCard, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(goldHub, "goldHub");
            this.goldHub = goldHub;
            this.cardToShow = apiGoldHubCard;
            this.scrollTarget = goldHubSettingsComponentTargetType;
            this.isGoldEventActive = z;
        }
    }

    /* compiled from: GoldHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubViewState$Error;", "Lcom/robinhood/android/gold/hub/GoldHubViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends GoldHubViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: GoldHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubViewState$Companion;", "", "<init>", "()V", "cardToShow", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "loadingMock", "Lcom/robinhood/android/gold/hub/GoldHubViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/gold/hub/GoldHubViewState$Loaded;", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Loaded getLoadingMock() {
            return GoldHubViewState.loadingMock;
        }
    }

    static {
        ApiGoldHubCard apiGoldHubCard = new ApiGoldHubCard("", null, "", null, null, null, 32, null);
        cardToShow = apiGoldHubCard;
        ApiGoldHubCardSection apiGoldHubCardSection = new ApiGoldHubCardSection("---- ---------", CollectionsKt.listOf(apiGoldHubCard), 0, 0);
        List listEmptyList = CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(new ApiGoldHubFeature("", "", "--- -- --- -----", "---- -- -- ------- ---- ---- --- -- ----- - ----- ----", null, "", null));
        }
        loadingMock = new Loaded(new ApiGoldHub(null, null, null, apiGoldHubCardSection, new ApiGoldHubFeatureSection("--- ---- -----", null, listEmptyList, arrayList), null, null, null, null, null, null, null, null, null), cardToShow, null, false, 4, null);
    }
}
