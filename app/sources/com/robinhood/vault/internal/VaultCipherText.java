package com.robinhood.vault.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: VaultCipherText.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0005J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/vault/internal/VaultCipherText;", "", "version", "", "iv", "Lokio/ByteString;", "ciphertext", "<init>", "(ILokio/ByteString;Lokio/ByteString;)V", "getVersion", "()I", "getIv", "()Lokio/ByteString;", "getCiphertext", "toEncodedBytes", "", "toEncodedByteString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class VaultCipherText {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ByteString ciphertext;
    private final ByteString iv;
    private final int version;

    public static /* synthetic */ VaultCipherText copy$default(VaultCipherText vaultCipherText, int i, ByteString byteString, ByteString byteString2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vaultCipherText.version;
        }
        if ((i2 & 2) != 0) {
            byteString = vaultCipherText.iv;
        }
        if ((i2 & 4) != 0) {
            byteString2 = vaultCipherText.ciphertext;
        }
        return vaultCipherText.copy(i, byteString, byteString2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final ByteString getIv() {
        return this.iv;
    }

    /* renamed from: component3, reason: from getter */
    public final ByteString getCiphertext() {
        return this.ciphertext;
    }

    public final VaultCipherText copy(int version, ByteString iv, ByteString ciphertext) {
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        return new VaultCipherText(version, iv, ciphertext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VaultCipherText)) {
            return false;
        }
        VaultCipherText vaultCipherText = (VaultCipherText) other;
        return this.version == vaultCipherText.version && Intrinsics.areEqual(this.iv, vaultCipherText.iv) && Intrinsics.areEqual(this.ciphertext, vaultCipherText.ciphertext);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.version) * 31) + this.iv.hashCode()) * 31) + this.ciphertext.hashCode();
    }

    public String toString() {
        return "VaultCipherText(version=" + this.version + ", iv=" + this.iv + ", ciphertext=" + this.ciphertext + ")";
    }

    public VaultCipherText(int i, ByteString iv, ByteString ciphertext) {
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        this.version = i;
        this.iv = iv;
        this.ciphertext = ciphertext;
    }

    public final int getVersion() {
        return this.version;
    }

    public final ByteString getIv() {
        return this.iv;
    }

    public final ByteString getCiphertext() {
        return this.ciphertext;
    }

    private final byte[] toEncodedBytes() {
        byte[] bArr = new byte[this.iv.size() + 2 + this.ciphertext.size()];
        bArr[0] = (byte) this.version;
        bArr[1] = (byte) this.iv.size();
        byte[] byteArray = this.iv.toByteArray();
        byte[] byteArray2 = this.ciphertext.toByteArray();
        ArraysKt.copyInto$default(byteArray, bArr, 2, 0, 0, 12, (Object) null);
        ArraysKt.copyInto$default(byteArray2, bArr, this.iv.size() + 2, 0, 0, 12, (Object) null);
        return bArr;
    }

    public final ByteString toEncodedByteString() {
        return ByteString.Companion.of$default(ByteString.INSTANCE, toEncodedBytes(), 0, 0, 3, null);
    }

    /* compiled from: VaultCipherText.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/vault/internal/VaultCipherText$Companion;", "", "<init>", "()V", "fromEncodedBytes", "Lcom/robinhood/vault/internal/VaultCipherText;", "encodedBytes", "Lokio/ByteString;", "", "fromEncodedBytes$lib_vault_externalDebug", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VaultCipherText fromEncodedBytes(ByteString encodedBytes) {
            Intrinsics.checkNotNullParameter(encodedBytes, "encodedBytes");
            return fromEncodedBytes$lib_vault_externalDebug(encodedBytes.toByteArray());
        }

        public final VaultCipherText fromEncodedBytes$lib_vault_externalDebug(byte[] encodedBytes) {
            Intrinsics.checkNotNullParameter(encodedBytes, "encodedBytes");
            byte b = encodedBytes[0];
            int i = encodedBytes[1] + 2;
            byte[] bArrCopyOfRange = ArraysKt.copyOfRange(encodedBytes, 2, i);
            byte[] bArrCopyOfRange2 = ArraysKt.copyOfRange(encodedBytes, i, encodedBytes.length);
            ByteString.Companion companion = ByteString.INSTANCE;
            return new VaultCipherText(b, ByteString.Companion.of$default(companion, bArrCopyOfRange, 0, 0, 3, null), ByteString.Companion.of$default(companion, bArrCopyOfRange2, 0, 0, 3, null));
        }
    }
}
