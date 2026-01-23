package com.robinhood.android.asset;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

/* compiled from: ReadOnly.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"throwReadOnly", "", "", "lib-assets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.asset.ReadOnlyKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReadOnly3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Void throwReadOnly(Object obj) throws IOException {
        throw new IOException(Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + " is read-only");
    }
}
