package io.ktor.client.request.forms;

import io.ktor.utils.p478io.core.Input;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: formDsl.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lio/ktor/client/request/forms/InputProvider;", "", "size", "", "block", "Lkotlin/Function0;", "Lio/ktor/utils/io/core/Input;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "getBlock", "()Lkotlin/jvm/functions/Function0;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class InputProvider {
    private final Function0<Input> block;
    private final Long size;

    /* JADX WARN: Multi-variable type inference failed */
    public InputProvider(Long l, Function0<? extends Input> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.size = l;
        this.block = block;
    }

    public final Function0<Input> getBlock() {
        return this.block;
    }

    public final Long getSize() {
        return this.size;
    }
}
