package com.robinhood.android.portfolio.pnl;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.OffsetDateTime;
import p479j$.time.ZoneId;

/* compiled from: HaltTimeKtx.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"haltTimeCheck", "", "lib-profit-and-loss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.HaltTimeKtxKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class HaltTimeKtx {
    public static final boolean haltTimeCheck() {
        int hour = OffsetDateTime.now(ZoneId.m3449of("EST", ZoneId.SHORT_IDS)).getHour();
        return hour < 4 || hour >= 20;
    }
}
