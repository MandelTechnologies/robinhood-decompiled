package io.bitdrift.capture.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: IBackgroundThreadHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lio/bitdrift/capture/common/IBackgroundThreadHandler;", "", "runAsync", "", "task", "Lkotlin/Function0;", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IBackgroundThreadHandler {
    void runAsync(Function0<Unit> task);
}
