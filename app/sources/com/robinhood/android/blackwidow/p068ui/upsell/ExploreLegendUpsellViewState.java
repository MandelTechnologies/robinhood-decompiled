package com.robinhood.android.blackwidow.p068ui.upsell;

import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import okhttp3.HttpUrl;

/* compiled from: ExploreLegendUpsellViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState;", "", "<init>", "()V", "Loading", "Ready", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState$Loading;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState$Ready;", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class ExploreLegendUpsellViewState {
    public static final int $stable = 0;

    public /* synthetic */ ExploreLegendUpsellViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExploreLegendUpsellViewState() {
    }

    /* compiled from: ExploreLegendUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState$Loading;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends ExploreLegendUpsellViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1289693459;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: ExploreLegendUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState$Ready;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState;", "videoInfo", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "heroImageUrl", "Lokhttp3/HttpUrl;", "showBottomDisclosure", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableMap;Ljava/lang/String;Lokhttp3/HttpUrl;Z)V", "getVideoInfo", "()Lkotlinx/collections/immutable/ImmutableMap;", "getLoggingSource", "()Ljava/lang/String;", "getHeroImageUrl", "()Lokhttp3/HttpUrl;", "getShowBottomDisclosure", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready extends ExploreLegendUpsellViewState {
        public static final int $stable = 8;
        private final HttpUrl heroImageUrl;
        private final String loggingSource;
        private final boolean showBottomDisclosure;
        private final ImmutableMap<String, VideoInfo> videoInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, ImmutableMap immutableMap, String str, HttpUrl httpUrl, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableMap = ready.videoInfo;
            }
            if ((i & 2) != 0) {
                str = ready.loggingSource;
            }
            if ((i & 4) != 0) {
                httpUrl = ready.heroImageUrl;
            }
            if ((i & 8) != 0) {
                z = ready.showBottomDisclosure;
            }
            return ready.copy(immutableMap, str, httpUrl, z);
        }

        public final ImmutableMap<String, VideoInfo> component1() {
            return this.videoInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLoggingSource() {
            return this.loggingSource;
        }

        /* renamed from: component3, reason: from getter */
        public final HttpUrl getHeroImageUrl() {
            return this.heroImageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowBottomDisclosure() {
            return this.showBottomDisclosure;
        }

        public final Ready copy(ImmutableMap<String, VideoInfo> videoInfo, String loggingSource, HttpUrl heroImageUrl, boolean showBottomDisclosure) {
            Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
            Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
            Intrinsics.checkNotNullParameter(heroImageUrl, "heroImageUrl");
            return new Ready(videoInfo, loggingSource, heroImageUrl, showBottomDisclosure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.videoInfo, ready.videoInfo) && Intrinsics.areEqual(this.loggingSource, ready.loggingSource) && Intrinsics.areEqual(this.heroImageUrl, ready.heroImageUrl) && this.showBottomDisclosure == ready.showBottomDisclosure;
        }

        public int hashCode() {
            return (((((this.videoInfo.hashCode() * 31) + this.loggingSource.hashCode()) * 31) + this.heroImageUrl.hashCode()) * 31) + Boolean.hashCode(this.showBottomDisclosure);
        }

        public String toString() {
            return "Ready(videoInfo=" + this.videoInfo + ", loggingSource=" + this.loggingSource + ", heroImageUrl=" + this.heroImageUrl + ", showBottomDisclosure=" + this.showBottomDisclosure + ")";
        }

        public final ImmutableMap<String, VideoInfo> getVideoInfo() {
            return this.videoInfo;
        }

        public /* synthetic */ Ready(ImmutableMap immutableMap, String str, HttpUrl httpUrl, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(immutableMap, (i & 2) != 0 ? "" : str, httpUrl, z);
        }

        public final String getLoggingSource() {
            return this.loggingSource;
        }

        public final HttpUrl getHeroImageUrl() {
            return this.heroImageUrl;
        }

        public final boolean getShowBottomDisclosure() {
            return this.showBottomDisclosure;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(ImmutableMap<String, VideoInfo> videoInfo, String loggingSource, HttpUrl heroImageUrl, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
            Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
            Intrinsics.checkNotNullParameter(heroImageUrl, "heroImageUrl");
            this.videoInfo = videoInfo;
            this.loggingSource = loggingSource;
            this.heroImageUrl = heroImageUrl;
            this.showBottomDisclosure = z;
        }
    }
}
