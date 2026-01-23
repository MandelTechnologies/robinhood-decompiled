package com.squareup.wire;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: Instant.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006*\n\u0010\u0007\"\u00020\u00032\u00020\u0003¨\u0006\b"}, m3636d2 = {"", "epochSecond", "nano", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "ofEpochSecond", "(JJ)Lj$/time/Instant;", "Instant", "wire-runtime"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.InstantKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Instant2 {
    public static final Instant ofEpochSecond(long j, long j2) {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j, j2);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }
}
