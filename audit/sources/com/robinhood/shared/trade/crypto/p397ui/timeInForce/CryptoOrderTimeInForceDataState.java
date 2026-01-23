package com.robinhood.shared.trade.crypto.p397ui.timeInForce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: CryptoOrderTimeInForceDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDataState;", "", "Lcom/robinhood/models/db/OrderTimeInForce;", "selectedTimeInForce", "j$/time/Instant", "currentTime", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lj$/time/Instant;)V", "timeInForce", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "(Lcom/robinhood/models/db/OrderTimeInForce;)Lcom/robinhood/utils/resource/StringResource;", "getText", "component1", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component2", "()Lj$/time/Instant;", "copy", "(Lcom/robinhood/models/db/OrderTimeInForce;Lj$/time/Instant;)Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/OrderTimeInForce;", "getSelectedTimeInForce", "Lj$/time/Instant;", "getCurrentTime", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDisplayRowState;", "getTimeInForceDisplayRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "timeInForceDisplayRowStates", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderTimeInForceDataState {
    public static final int $stable = 8;
    private final Instant currentTime;
    private final OrderTimeInForce selectedTimeInForce;

    /* compiled from: CryptoOrderTimeInForceDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTimeInForce.values().length];
            try {
                iArr[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTimeInForce.GFW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderTimeInForce.GFM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderTimeInForce.GTC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CryptoOrderTimeInForceDataState copy$default(CryptoOrderTimeInForceDataState cryptoOrderTimeInForceDataState, OrderTimeInForce orderTimeInForce, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTimeInForce = cryptoOrderTimeInForceDataState.selectedTimeInForce;
        }
        if ((i & 2) != 0) {
            instant = cryptoOrderTimeInForceDataState.currentTime;
        }
        return cryptoOrderTimeInForceDataState.copy(orderTimeInForce, instant);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getCurrentTime() {
        return this.currentTime;
    }

    public final CryptoOrderTimeInForceDataState copy(OrderTimeInForce selectedTimeInForce, Instant currentTime) {
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return new CryptoOrderTimeInForceDataState(selectedTimeInForce, currentTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderTimeInForceDataState)) {
            return false;
        }
        CryptoOrderTimeInForceDataState cryptoOrderTimeInForceDataState = (CryptoOrderTimeInForceDataState) other;
        return this.selectedTimeInForce == cryptoOrderTimeInForceDataState.selectedTimeInForce && Intrinsics.areEqual(this.currentTime, cryptoOrderTimeInForceDataState.currentTime);
    }

    public int hashCode() {
        return (this.selectedTimeInForce.hashCode() * 31) + this.currentTime.hashCode();
    }

    public String toString() {
        return "CryptoOrderTimeInForceDataState(selectedTimeInForce=" + this.selectedTimeInForce + ", currentTime=" + this.currentTime + ")";
    }

    public CryptoOrderTimeInForceDataState(OrderTimeInForce selectedTimeInForce, Instant currentTime) {
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        this.selectedTimeInForce = selectedTimeInForce;
        this.currentTime = currentTime;
    }

    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final Instant getCurrentTime() {
        return this.currentTime;
    }

    public final ImmutableList<CryptoOrderTimeInForceDisplayRowState> getTimeInForceDisplayRowStates() {
        OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
        CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceViewState2 = new CryptoOrderTimeInForceDisplayRowState(orderTimeInForce, getTitle(orderTimeInForce), getText(orderTimeInForce), this.selectedTimeInForce == orderTimeInForce);
        OrderTimeInForce orderTimeInForce2 = OrderTimeInForce.GFW;
        CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceViewState22 = new CryptoOrderTimeInForceDisplayRowState(orderTimeInForce2, getTitle(orderTimeInForce2), getText(orderTimeInForce2), this.selectedTimeInForce == orderTimeInForce2);
        OrderTimeInForce orderTimeInForce3 = OrderTimeInForce.GFM;
        CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceViewState23 = new CryptoOrderTimeInForceDisplayRowState(orderTimeInForce3, getTitle(orderTimeInForce3), getText(orderTimeInForce3), this.selectedTimeInForce == orderTimeInForce3);
        OrderTimeInForce orderTimeInForce4 = OrderTimeInForce.GTC;
        return extensions2.persistentListOf(cryptoOrderTimeInForceViewState2, cryptoOrderTimeInForceViewState22, cryptoOrderTimeInForceViewState23, new CryptoOrderTimeInForceDisplayRowState(orderTimeInForce4, getTitle(orderTimeInForce4), getText(orderTimeInForce4), this.selectedTimeInForce == orderTimeInForce4));
    }

    private final StringResource getTitle(OrderTimeInForce timeInForce) {
        int i = WhenMappings.$EnumSwitchMapping$0[timeInForce.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_trade_create_time_in_force_gfd_summary_tomorrow, InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) this.currentTime));
        }
        if (i == 2) {
            StringResource.Companion companion = StringResource.INSTANCE;
            Instant instantPlus = this.currentTime.plus((TemporalAmount) Days.m3991of(7));
            Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
            return companion.invoke(InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) instantPlus));
        }
        if (i == 3) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            Instant instantPlus2 = this.currentTime.plus((TemporalAmount) Days.m3991of(30));
            Intrinsics.checkNotNullExpressionValue(instantPlus2, "plus(...)");
            return companion2.invoke(InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) instantPlus2));
        }
        if (i == 4) {
            StringResource.Companion companion3 = StringResource.INSTANCE;
            Instant instantPlus3 = this.currentTime.plus((TemporalAmount) Days.m3991of(90));
            Intrinsics.checkNotNullExpressionValue(instantPlus3, "plus(...)");
            return companion3.invoke(InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) instantPlus3));
        }
        throw new IllegalStateException(("Time in force " + OrderTimeInForce.INSTANCE.toServerValue(timeInForce) + " not supported").toString());
    }

    private final StringResource getText(OrderTimeInForce timeInForce) {
        int i = WhenMappings.$EnumSwitchMapping$0[timeInForce.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_trade_create_time_in_force_gfd_description, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_trade_create_time_in_force_gfw_description, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_trade_create_time_in_force_gfm_description, new Object[0]);
        }
        if (i == 4) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_trade_create_time_in_force_gtc_description, new Object[0]);
        }
        throw new IllegalStateException(("Time in force " + OrderTimeInForce.INSTANCE.toServerValue(timeInForce) + " not supported").toString());
    }
}
