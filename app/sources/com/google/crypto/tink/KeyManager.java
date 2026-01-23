package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* loaded from: classes27.dex */
public interface KeyManager<P> {
    boolean doesSupport(String typeUrl);

    P getPrimitive(ByteString serializedKey) throws GeneralSecurityException;

    MessageLite newKey(ByteString serializedKeyFormat) throws GeneralSecurityException;

    KeyData newKeyData(ByteString serializedKeyFormat) throws GeneralSecurityException;
}
