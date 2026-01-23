package com.robinhood.android.rhy.referral.track;

import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingViewState;
import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.models.rhy.referral.p345db.RhyReferralUser;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RhyReferralsStatusTrackingViewState_LoadedMock.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState_LoadedMock;", "", "<init>", "()V", "generate", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState$Loaded;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralsStatusTrackingViewState_LoadedMock {
    public static final int $stable = 0;
    public static final RhyReferralsStatusTrackingViewState_LoadedMock INSTANCE = new RhyReferralsStatusTrackingViewState_LoadedMock();

    private RhyReferralsStatusTrackingViewState_LoadedMock() {
    }

    public final RhyReferralsStatusTrackingViewState.Loaded generate() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        List listListOf = CollectionsKt.listOf(new RhyReferralAttribution(uuidRandomUUID, Instant.now(), Instant.now(), Instant.now(), false, false, false, new RhyReferralUser("-------- --------------- ----------- -------------------- ---------", "-------- --------------- ----------- -------------------- ---------"), new RhyReferralUser("-------- --------------- ----------- -------------------- ---------", "-------- --------------- ----------- -------------------- ---------")));
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        return new RhyReferralsStatusTrackingViewState.Loaded(listListOf, CollectionsKt.listOf(new RhyReferralAttribution(uuidRandomUUID2, Instant.now(), Instant.now(), Instant.now(), false, false, false, new RhyReferralUser("-------- --------------- ----------- -------------------- ---------", "-------- --------------- ----------- -------------------- ---------"), new RhyReferralUser("-------- --------------- ----------- -------------------- ---------", "-------- --------------- ----------- -------------------- ---------"))), false);
    }
}
