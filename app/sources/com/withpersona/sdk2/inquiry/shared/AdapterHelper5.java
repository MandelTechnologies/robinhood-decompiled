package com.withpersona.sdk2.inquiry.shared;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: AdapterHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ViewTypeManager;", "", "<init>", "()V", "viewTypeGeneratorCount", "Ljava/util/concurrent/atomic/AtomicInteger;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/shared/ViewTypeGenerator;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ViewTypeManager, reason: use source file name */
/* loaded from: classes18.dex */
public final class AdapterHelper5 {
    public static final AdapterHelper5 INSTANCE = new AdapterHelper5();
    private static AtomicInteger viewTypeGeneratorCount = new AtomicInteger(0);

    private AdapterHelper5() {
    }

    public final AdapterHelper4 create() {
        return new AdapterHelper4((viewTypeGeneratorCount.getAndIncrement() * 4096) + 268435456);
    }
}
