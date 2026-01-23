package com.robinhood.tooltips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipChannel;", "", "id", "", "priority", "", "<init>", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getPriority", "()I", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class TooltipChannel {
    public static final int $stable = 0;
    private final String id;
    private final int priority;

    public TooltipChannel(String id, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.priority = i;
    }

    public final String getId() {
        return this.id;
    }

    public final int getPriority() {
        return this.priority;
    }
}
