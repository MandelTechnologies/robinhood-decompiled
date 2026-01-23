package com.google.android.libraries.places.internal;

import java.io.Closeable;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class zzbwa implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("not attached to a buffer");
    }
}
