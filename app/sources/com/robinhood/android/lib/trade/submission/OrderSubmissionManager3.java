package com.robinhood.android.lib.trade.submission;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/submission/DuplicateUuidException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "detailMessage", "", "<init>", "(Ljava/lang/String;)V", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.submission.DuplicateUuidException, reason: use source file name */
/* loaded from: classes8.dex */
public final class OrderSubmissionManager3 extends RuntimeException {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSubmissionManager3(String detailMessage) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }
}
