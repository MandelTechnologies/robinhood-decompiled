package com.robinhood.shared.crypto.staking.staking.utils;

import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StakingCrashReporter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/utils/StakingCrashReporter;", "", "<init>", "()V", "logNonFatal", "", "t", "", "flow", "", "step", "orderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "orderId", "Ljava/util/UUID;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class StakingCrashReporter {
    public static final int $stable = 0;
    public static final StakingCrashReporter INSTANCE = new StakingCrashReporter();

    private StakingCrashReporter() {
    }

    public static /* synthetic */ void logNonFatal$default(StakingCrashReporter stakingCrashReporter, Throwable th, String str, String str2, ApiCryptoStakingOrder.OrderType orderType, UUID uuid, int i, Object obj) {
        if ((i & 8) != 0) {
            orderType = null;
        }
        if ((i & 16) != 0) {
            uuid = null;
        }
        stakingCrashReporter.logNonFatal(th, str, str2, orderType, uuid);
    }

    public final void logNonFatal(Throwable t, String flow, String step, ApiCryptoStakingOrder.OrderType orderType, UUID orderId) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Throwables.isNetworkRelated(t)) {
            return;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to("flow", flow), Tuples4.m3642to("step", step));
        if (orderType != null) {
            mapMutableMapOf.put("order_type", orderType.name());
        }
        if (orderId != null) {
            mapMutableMapOf.put("order_id", orderId.toString());
        }
        CrashReporter.INSTANCE.reportNonFatal(t, false, new EventMetadata(SentryTeam.CRYPTO, MapsKt.mapOf(Tuples4.m3642to("feature", "CryptoYields")), MapsKt.toMap(mapMutableMapOf)));
    }
}
