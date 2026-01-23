package com.robinhood.utils.extensions;

import io.reactivex.Emitter;
import io.reactivex.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Observers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"asEmitter", "Lio/reactivex/Emitter;", "T", "", "Lio/reactivex/Observer;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ObserversKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Observers2 {
    public static final <T> Emitter<? super T> asEmitter(Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "<this>");
        return new Observers(observer);
    }
}
