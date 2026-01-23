package com.robinhood.android.common.investflow.allocationprovider;

import kotlin.Metadata;

/* compiled from: IllegalAllocationException.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/investflow/allocationprovider/IllegalAllocationException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "feature-lib-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class IllegalAllocationException extends IllegalStateException {
    public IllegalAllocationException() {
        super("asset ids must match instruments");
    }
}
