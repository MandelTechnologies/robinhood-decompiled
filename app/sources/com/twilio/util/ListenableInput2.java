package com.twilio.util;

import io.ktor.utils.p478io.core.Input;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListenableInput.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0000¨\u0006\t"}, m3636d2 = {"toListenableInput", "Lio/ktor/utils/io/core/Input;", "onProgress", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "bytesRead", "", "convo-android_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.ListenableInputKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ListenableInput2 {
    public static final Input toListenableInput(Input input, Function1<? super Long, Unit> onProgress) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        return new ListenableInput(input, onProgress);
    }
}
