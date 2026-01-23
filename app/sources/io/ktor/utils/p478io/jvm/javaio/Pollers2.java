package io.ktor.utils.p478io.jvm.javaio;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;

/* compiled from: Pollers.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lio/ktor/utils/io/jvm/javaio/Parking;", "", "T", "", "timeNanos", "", PlaceTypes.PARK, "(J)V", "token", "unpark", "(Ljava/lang/Object;)V", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.jvm.javaio.Parking, reason: use source file name */
/* loaded from: classes14.dex */
public interface Pollers2<T> {
    void park(long timeNanos);

    void unpark(T token);
}
