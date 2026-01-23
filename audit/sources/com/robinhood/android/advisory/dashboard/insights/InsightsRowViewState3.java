package com.robinhood.android.advisory.dashboard.insights;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InsightsRowViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "", "Background", "Remote", "Local", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Local;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Remote;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowIcon, reason: use source file name */
/* loaded from: classes7.dex */
public interface InsightsRowViewState3 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Background;", "", "<init>", "(Ljava/lang/String;I)V", "GRADIENT", "BG2", "IMAGE", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowIcon$Background */
    public static final class Background {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Background[] $VALUES;
        public static final Background GRADIENT = new Background("GRADIENT", 0);
        public static final Background BG2 = new Background("BG2", 1);
        public static final Background IMAGE = new Background("IMAGE", 2);

        private static final /* synthetic */ Background[] $values() {
            return new Background[]{GRADIENT, BG2, IMAGE};
        }

        public static EnumEntries<Background> getEntries() {
            return $ENTRIES;
        }

        private Background(String str, int i) {
        }

        static {
            Background[] backgroundArr$values = $values();
            $VALUES = backgroundArr$values;
            $ENTRIES = EnumEntries2.enumEntries(backgroundArr$values);
        }

        public static Background valueOf(String str) {
            return (Background) Enum.valueOf(Background.class, str);
        }

        public static Background[] values() {
            return (Background[]) $VALUES.clone();
        }
    }

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Remote;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "lightUrl", "", "darkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLightUrl", "()Ljava/lang/String;", "getDarkUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowIcon$Remote, reason: from toString */
    public static final /* data */ class Remote implements InsightsRowViewState3 {
        public static final int $stable = 0;
        private final String darkUrl;
        private final String lightUrl;

        public static /* synthetic */ Remote copy$default(Remote remote, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remote.lightUrl;
            }
            if ((i & 2) != 0) {
                str2 = remote.darkUrl;
            }
            return remote.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLightUrl() {
            return this.lightUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDarkUrl() {
            return this.darkUrl;
        }

        public final Remote copy(String lightUrl, String darkUrl) {
            Intrinsics.checkNotNullParameter(lightUrl, "lightUrl");
            Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
            return new Remote(lightUrl, darkUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return Intrinsics.areEqual(this.lightUrl, remote.lightUrl) && Intrinsics.areEqual(this.darkUrl, remote.darkUrl);
        }

        public int hashCode() {
            return (this.lightUrl.hashCode() * 31) + this.darkUrl.hashCode();
        }

        public String toString() {
            return "Remote(lightUrl=" + this.lightUrl + ", darkUrl=" + this.darkUrl + ")";
        }

        public Remote(String lightUrl, String darkUrl) {
            Intrinsics.checkNotNullParameter(lightUrl, "lightUrl");
            Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
            this.lightUrl = lightUrl;
            this.darkUrl = darkUrl;
        }

        public final String getLightUrl() {
            return this.lightUrl;
        }

        public final String getDarkUrl() {
            return this.darkUrl;
        }
    }

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Local;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "background", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Background;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Background;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBackground", "()Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon$Background;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowIcon$Local, reason: from toString */
    public static final /* data */ class Local implements InsightsRowViewState3 {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper2 asset;
        private final Background background;

        public static /* synthetic */ Local copy$default(Local local, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Background background, int i, Object obj) {
            if ((i & 1) != 0) {
                serverToBentoAssetMapper2 = local.asset;
            }
            if ((i & 2) != 0) {
                background = local.background;
            }
            return local.copy(serverToBentoAssetMapper2, background);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerToBentoAssetMapper2 getAsset() {
            return this.asset;
        }

        /* renamed from: component2, reason: from getter */
        public final Background getBackground() {
            return this.background;
        }

        public final Local copy(ServerToBentoAssetMapper2 asset, Background background) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(background, "background");
            return new Local(asset, background);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Local)) {
                return false;
            }
            Local local = (Local) other;
            return this.asset == local.asset && this.background == local.background;
        }

        public int hashCode() {
            return (this.asset.hashCode() * 31) + this.background.hashCode();
        }

        public String toString() {
            return "Local(asset=" + this.asset + ", background=" + this.background + ")";
        }

        public Local(ServerToBentoAssetMapper2 asset, Background background) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(background, "background");
            this.asset = asset;
            this.background = background;
        }

        public final ServerToBentoAssetMapper2 getAsset() {
            return this.asset;
        }

        public final Background getBackground() {
            return this.background;
        }
    }
}
