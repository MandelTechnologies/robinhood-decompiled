package com.robinhood.android.futures.trade.extensions;

import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FutureOrders.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel;", "", "offscreenLabel", "Lcom/robinhood/utils/resource/StringResource;", "onScreenLabel", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getOffscreenLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getOnScreenLabel", "signedQuantity", "", "getSignedQuantity", "()Ljava/lang/String;", "Stop", "Limit", "LimitOrStop", "Na", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$Limit;", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$LimitOrStop;", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$Na;", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$Stop;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.extensions.OrderGroupLabel, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class FutureOrders2 {
    public static final int $stable = StringResource.$stable;
    private final StringResource offscreenLabel;
    private final StringResource onScreenLabel;

    public /* synthetic */ FutureOrders2(StringResource stringResource, StringResource stringResource2, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2);
    }

    public abstract String getSignedQuantity();

    private FutureOrders2(StringResource stringResource, StringResource stringResource2) {
        this.offscreenLabel = stringResource;
        this.onScreenLabel = stringResource2;
    }

    public final StringResource getOffscreenLabel() {
        return this.offscreenLabel;
    }

    public final StringResource getOnScreenLabel() {
        return this.onScreenLabel;
    }

    /* compiled from: FutureOrders.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$Stop;", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel;", "signedQuantity", "", "<init>", "(Ljava/lang/String;)V", "getSignedQuantity", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.extensions.OrderGroupLabel$Stop, reason: from toString */
    public static final /* data */ class Stop extends FutureOrders2 {
        public static final int $stable = StringResource.$stable;
        private final String signedQuantity;

        public static /* synthetic */ Stop copy$default(Stop stop, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stop.signedQuantity;
            }
            return stop.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSignedQuantity() {
            return this.signedQuantity;
        }

        public final Stop copy(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            return new Stop(signedQuantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stop) && Intrinsics.areEqual(this.signedQuantity, ((Stop) other).signedQuantity);
        }

        public int hashCode() {
            return this.signedQuantity.hashCode();
        }

        public String toString() {
            return "Stop(signedQuantity=" + this.signedQuantity + ")";
        }

        @Override // com.robinhood.android.futures.trade.extensions.FutureOrders2
        public String getSignedQuantity() {
            return this.signedQuantity;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Stop(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            StringResource.Companion companion = StringResource.INSTANCE;
            super(companion.invoke(C17286R.string.futures_ladder_stop_pending_order_offscreen_label, new Object[0]), companion.invoke(C17286R.string.futures_ladder_stop_pending_order, signedQuantity), null);
            this.signedQuantity = signedQuantity;
        }
    }

    /* compiled from: FutureOrders.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$Limit;", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel;", "signedQuantity", "", "<init>", "(Ljava/lang/String;)V", "getSignedQuantity", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.extensions.OrderGroupLabel$Limit, reason: from toString */
    public static final /* data */ class Limit extends FutureOrders2 {
        public static final int $stable = StringResource.$stable;
        private final String signedQuantity;

        public static /* synthetic */ Limit copy$default(Limit limit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limit.signedQuantity;
            }
            return limit.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSignedQuantity() {
            return this.signedQuantity;
        }

        public final Limit copy(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            return new Limit(signedQuantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Limit) && Intrinsics.areEqual(this.signedQuantity, ((Limit) other).signedQuantity);
        }

        public int hashCode() {
            return this.signedQuantity.hashCode();
        }

        public String toString() {
            return "Limit(signedQuantity=" + this.signedQuantity + ")";
        }

        @Override // com.robinhood.android.futures.trade.extensions.FutureOrders2
        public String getSignedQuantity() {
            return this.signedQuantity;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Limit(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            StringResource.Companion companion = StringResource.INSTANCE;
            super(companion.invoke(C17286R.string.futures_ladder_limit_pending_order_offscreen_label, new Object[0]), companion.invoke(C17286R.string.futures_ladder_limit_pending_order, signedQuantity), null);
            this.signedQuantity = signedQuantity;
        }
    }

    /* compiled from: FutureOrders.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$LimitOrStop;", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel;", "signedQuantity", "", "<init>", "(Ljava/lang/String;)V", "getSignedQuantity", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.extensions.OrderGroupLabel$LimitOrStop, reason: from toString */
    public static final /* data */ class LimitOrStop extends FutureOrders2 {
        public static final int $stable = StringResource.$stable;
        private final String signedQuantity;

        public static /* synthetic */ LimitOrStop copy$default(LimitOrStop limitOrStop, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitOrStop.signedQuantity;
            }
            return limitOrStop.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSignedQuantity() {
            return this.signedQuantity;
        }

        public final LimitOrStop copy(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            return new LimitOrStop(signedQuantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LimitOrStop) && Intrinsics.areEqual(this.signedQuantity, ((LimitOrStop) other).signedQuantity);
        }

        public int hashCode() {
            return this.signedQuantity.hashCode();
        }

        public String toString() {
            return "LimitOrStop(signedQuantity=" + this.signedQuantity + ")";
        }

        @Override // com.robinhood.android.futures.trade.extensions.FutureOrders2
        public String getSignedQuantity() {
            return this.signedQuantity;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LimitOrStop(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            StringResource.Companion companion = StringResource.INSTANCE;
            super(companion.invoke(C17286R.string.futures_ladder_limit_or_stop_pending_order_offscreen_label, new Object[0]), companion.invoke(C17286R.string.futures_ladder_limit_or_stop_pending_order, signedQuantity), null);
            this.signedQuantity = signedQuantity;
        }
    }

    /* compiled from: FutureOrders.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel$Na;", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel;", "signedQuantity", "", "<init>", "(Ljava/lang/String;)V", "getSignedQuantity", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.extensions.OrderGroupLabel$Na, reason: from toString */
    public static final /* data */ class Na extends FutureOrders2 {
        public static final int $stable = StringResource.$stable;
        private final String signedQuantity;

        public static /* synthetic */ Na copy$default(Na na, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = na.signedQuantity;
            }
            return na.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSignedQuantity() {
            return this.signedQuantity;
        }

        public final Na copy(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            return new Na(signedQuantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Na) && Intrinsics.areEqual(this.signedQuantity, ((Na) other).signedQuantity);
        }

        public int hashCode() {
            return this.signedQuantity.hashCode();
        }

        public String toString() {
            return "Na(signedQuantity=" + this.signedQuantity + ")";
        }

        @Override // com.robinhood.android.futures.trade.extensions.FutureOrders2
        public String getSignedQuantity() {
            return this.signedQuantity;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Na(String signedQuantity) {
            Intrinsics.checkNotNullParameter(signedQuantity, "signedQuantity");
            StringResource.Companion companion = StringResource.INSTANCE;
            super(companion.invoke(""), companion.invoke(""), null);
            this.signedQuantity = signedQuantity;
        }
    }
}
