package com.robinhood.shared.tradeladder.p398ui.ladder.ftux;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.p011ui.layout.ContentScale;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericLadderFtuxProgressState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\u0000H&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "Landroid/os/Parcelable;", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "title", "", "prevState", "prefetchLottie", "", "context", "Landroid/content/Context;", "isDay", "", "LottieAnimationSpec", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface GenericLadderFtuxProgressState extends Parcelable {
    LottieAnimationSpec getLottieAnimationSpec();

    GenericLadderFtuxProgressState nextState(String title);

    void prefetchLottie(Context context, boolean isDay);

    GenericLadderFtuxProgressState prevState();

    /* compiled from: GenericLadderFtuxProgressState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ GenericLadderFtuxProgressState nextState$default(GenericLadderFtuxProgressState genericLadderFtuxProgressState, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextState");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return genericLadderFtuxProgressState.nextState(str);
        }

        public static void prefetchLottie(GenericLadderFtuxProgressState genericLadderFtuxProgressState, Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            LottieUrl nightThemeLottieUrl = null;
            if (z) {
                LottieAnimationSpec lottieAnimationSpec = genericLadderFtuxProgressState.getLottieAnimationSpec();
                if (lottieAnimationSpec != null) {
                    nightThemeLottieUrl = lottieAnimationSpec.getDayThemeLottieUrl();
                }
            } else {
                LottieAnimationSpec lottieAnimationSpec2 = genericLadderFtuxProgressState.getLottieAnimationSpec();
                if (lottieAnimationSpec2 != null) {
                    nightThemeLottieUrl = lottieAnimationSpec2.getNightThemeLottieUrl();
                }
            }
            if (nightThemeLottieUrl != null) {
                nightThemeLottieUrl.prefetch(context);
            }
        }
    }

    /* compiled from: GenericLadderFtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "", "dayThemeLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "nightThemeLottieUrl", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "lottieIterations", "", "loopIntervalFrames", "Lkotlin/Pair;", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/shared/remote/assets/LottieUrl;Landroidx/compose/ui/layout/ContentScale;ILkotlin/Pair;)V", "getDayThemeLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getNightThemeLottieUrl", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getLottieIterations", "()I", "getLoopIntervalFrames", "()Lkotlin/Pair;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LottieAnimationSpec {
        public static final int $stable = 0;
        private final ContentScale contentScale;
        private final LottieUrl dayThemeLottieUrl;
        private final Tuples2<Integer, Integer> loopIntervalFrames;
        private final int lottieIterations;
        private final LottieUrl nightThemeLottieUrl;

        public static /* synthetic */ LottieAnimationSpec copy$default(LottieAnimationSpec lottieAnimationSpec, LottieUrl lottieUrl, LottieUrl lottieUrl2, ContentScale contentScale, int i, Tuples2 tuples2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lottieUrl = lottieAnimationSpec.dayThemeLottieUrl;
            }
            if ((i2 & 2) != 0) {
                lottieUrl2 = lottieAnimationSpec.nightThemeLottieUrl;
            }
            if ((i2 & 4) != 0) {
                contentScale = lottieAnimationSpec.contentScale;
            }
            if ((i2 & 8) != 0) {
                i = lottieAnimationSpec.lottieIterations;
            }
            if ((i2 & 16) != 0) {
                tuples2 = lottieAnimationSpec.loopIntervalFrames;
            }
            Tuples2 tuples22 = tuples2;
            ContentScale contentScale2 = contentScale;
            return lottieAnimationSpec.copy(lottieUrl, lottieUrl2, contentScale2, i, tuples22);
        }

        /* renamed from: component1, reason: from getter */
        public final LottieUrl getDayThemeLottieUrl() {
            return this.dayThemeLottieUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final LottieUrl getNightThemeLottieUrl() {
            return this.nightThemeLottieUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final ContentScale getContentScale() {
            return this.contentScale;
        }

        /* renamed from: component4, reason: from getter */
        public final int getLottieIterations() {
            return this.lottieIterations;
        }

        public final Tuples2<Integer, Integer> component5() {
            return this.loopIntervalFrames;
        }

        public final LottieAnimationSpec copy(LottieUrl dayThemeLottieUrl, LottieUrl nightThemeLottieUrl, ContentScale contentScale, int lottieIterations, Tuples2<Integer, Integer> loopIntervalFrames) {
            Intrinsics.checkNotNullParameter(dayThemeLottieUrl, "dayThemeLottieUrl");
            Intrinsics.checkNotNullParameter(nightThemeLottieUrl, "nightThemeLottieUrl");
            Intrinsics.checkNotNullParameter(contentScale, "contentScale");
            return new LottieAnimationSpec(dayThemeLottieUrl, nightThemeLottieUrl, contentScale, lottieIterations, loopIntervalFrames);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LottieAnimationSpec)) {
                return false;
            }
            LottieAnimationSpec lottieAnimationSpec = (LottieAnimationSpec) other;
            return this.dayThemeLottieUrl == lottieAnimationSpec.dayThemeLottieUrl && this.nightThemeLottieUrl == lottieAnimationSpec.nightThemeLottieUrl && Intrinsics.areEqual(this.contentScale, lottieAnimationSpec.contentScale) && this.lottieIterations == lottieAnimationSpec.lottieIterations && Intrinsics.areEqual(this.loopIntervalFrames, lottieAnimationSpec.loopIntervalFrames);
        }

        public int hashCode() {
            int iHashCode = ((((((this.dayThemeLottieUrl.hashCode() * 31) + this.nightThemeLottieUrl.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Integer.hashCode(this.lottieIterations)) * 31;
            Tuples2<Integer, Integer> tuples2 = this.loopIntervalFrames;
            return iHashCode + (tuples2 == null ? 0 : tuples2.hashCode());
        }

        public String toString() {
            return "LottieAnimationSpec(dayThemeLottieUrl=" + this.dayThemeLottieUrl + ", nightThemeLottieUrl=" + this.nightThemeLottieUrl + ", contentScale=" + this.contentScale + ", lottieIterations=" + this.lottieIterations + ", loopIntervalFrames=" + this.loopIntervalFrames + ")";
        }

        public LottieAnimationSpec(LottieUrl dayThemeLottieUrl, LottieUrl nightThemeLottieUrl, ContentScale contentScale, int i, Tuples2<Integer, Integer> tuples2) {
            Intrinsics.checkNotNullParameter(dayThemeLottieUrl, "dayThemeLottieUrl");
            Intrinsics.checkNotNullParameter(nightThemeLottieUrl, "nightThemeLottieUrl");
            Intrinsics.checkNotNullParameter(contentScale, "contentScale");
            this.dayThemeLottieUrl = dayThemeLottieUrl;
            this.nightThemeLottieUrl = nightThemeLottieUrl;
            this.contentScale = contentScale;
            this.lottieIterations = i;
            this.loopIntervalFrames = tuples2;
        }

        public final LottieUrl getDayThemeLottieUrl() {
            return this.dayThemeLottieUrl;
        }

        public final LottieUrl getNightThemeLottieUrl() {
            return this.nightThemeLottieUrl;
        }

        public /* synthetic */ LottieAnimationSpec(LottieUrl lottieUrl, LottieUrl lottieUrl2, ContentScale contentScale, int i, Tuples2 tuples2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(lottieUrl, lottieUrl2, (i2 & 4) != 0 ? ContentScale.INSTANCE.getFit() : contentScale, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? null : tuples2);
        }

        public final ContentScale getContentScale() {
            return this.contentScale;
        }

        public final int getLottieIterations() {
            return this.lottieIterations;
        }

        public final Tuples2<Integer, Integer> getLoopIntervalFrames() {
            return this.loopIntervalFrames;
        }
    }
}
