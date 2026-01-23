package com.ionspin.kotlin.bignum.integer;

import kotlin.Metadata;

/* compiled from: PlatformWorkarounds.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/RuntimePlatform;", "", "()V", "currentPlatform", "Lcom/ionspin/kotlin/bignum/integer/Platform;", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.integer.RuntimePlatform, reason: use source file name */
/* loaded from: classes27.dex */
public final class PlatformWorkarounds2 {
    public static final PlatformWorkarounds2 INSTANCE = new PlatformWorkarounds2();

    private PlatformWorkarounds2() {
    }

    public final PlatformWorkarounds currentPlatform() {
        return PlatformWorkarounds.JVM;
    }
}
