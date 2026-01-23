package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.AesEaxKey;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.AesEaxJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes27.dex */
public final class AesEaxKeyManager extends KeyTypeManager<AesEaxKey> {
    public int getVersion() {
        return 0;
    }

    AesEaxKeyManager() {
        super(AesEaxKey.class, new KeyTypeManager.PrimitiveFactory<Aead, AesEaxKey>(Aead.class) { // from class: com.google.crypto.tink.aead.AesEaxKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public Aead getPrimitive(AesEaxKey key) throws GeneralSecurityException {
                return new AesEaxJce(key.getKeyValue().toByteArray(), key.getParams().getIvSize());
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(AesEaxKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        Validators.validateAesKeySize(key.getKeyValue().size());
        if (key.getParams().getIvSize() != 12 && key.getParams().getIvSize() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public AesEaxKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesEaxKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesEaxKeyFormat, AesEaxKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesEaxKeyFormat, AesEaxKey>(AesEaxKeyFormat.class) { // from class: com.google.crypto.tink.aead.AesEaxKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesEaxKeyFormat format2) throws GeneralSecurityException {
                Validators.validateAesKeySize(format2.getKeySize());
                if (format2.getParams().getIvSize() != 12 && format2.getParams().getIvSize() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesEaxKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return AesEaxKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesEaxKey createKey(AesEaxKeyFormat format2) throws GeneralSecurityException {
                return AesEaxKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(format2.getKeySize()))).setParams(format2.getParams()).setVersion(AesEaxKeyManager.this.getVersion()).build();
            }
        };
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesEaxKeyManager(), newKeyAllowed);
    }
}
