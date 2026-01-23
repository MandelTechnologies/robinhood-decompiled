package com.google.android.libraries.places.internal;

import com.robinhood.utils.http.ContentEncoding;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public final class zzayz implements zzazb {
    @Override // com.google.android.libraries.places.internal.zzazo
    public final InputStream zza(InputStream inputStream) throws IOException {
        return new GZIPInputStream(inputStream);
    }

    @Override // com.google.android.libraries.places.internal.zzazc, com.google.android.libraries.places.internal.zzazo
    public final String zzb() {
        return ContentEncoding.GZIP;
    }
}
