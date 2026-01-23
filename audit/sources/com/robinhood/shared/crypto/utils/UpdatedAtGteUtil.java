package com.robinhood.shared.crypto.utils;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: UpdatedAtGteUtil.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0004\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\u000e\u0010\u0003\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"j$/time/Instant", "Lcom/squareup/wire/Instant;", "latestUpdatedAt", "lastUpdatedAt", "getUpdatedAtGte", "(Lj$/time/Instant;Lj$/time/Instant;)Lj$/time/Instant;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.utils.UpdatedAtGteUtilKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UpdatedAtGteUtil {
    public static final Instant getUpdatedAtGte(Instant instant, Instant instant2) {
        Instant instant3 = (instant == null || instant2 == null) ? null : (Instant) CollectionsKt.minOrThrow(CollectionsKt.listOf((Object[]) new Instant[]{instant, instant2}));
        if (instant3 == null) {
            return null;
        }
        Instant instantMinus = instant3.minus((TemporalAmount) Days.m3991of(1));
        Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
        return instantMinus;
    }
}
