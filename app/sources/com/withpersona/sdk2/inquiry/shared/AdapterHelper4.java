package com.withpersona.sdk2.inquiry.shared;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: AdapterHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ViewTypeGenerator;", "", "baseType", "", "<init>", "(I)V", "nextViewType", "Ljava/util/concurrent/atomic/AtomicInteger;", "generateType", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ViewTypeGenerator, reason: use source file name */
/* loaded from: classes18.dex */
public final class AdapterHelper4 {
    private final int baseType;
    private AtomicInteger nextViewType = new AtomicInteger(0);

    public AdapterHelper4(int i) {
        this.baseType = i;
    }

    public final int generateType() {
        return this.baseType + this.nextViewType.getAndIncrement();
    }
}
