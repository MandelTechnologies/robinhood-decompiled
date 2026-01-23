package com.google.crypto.tink;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes27.dex */
public final class CleartextKeysetHandle {
    public static KeysetHandle read(KeysetReader reader) throws GeneralSecurityException, IOException {
        return KeysetHandle.fromKeyset(reader.read());
    }

    public static void write(KeysetHandle handle, KeysetWriter keysetWriter) throws IOException {
        keysetWriter.write(handle.getKeyset());
    }
}
