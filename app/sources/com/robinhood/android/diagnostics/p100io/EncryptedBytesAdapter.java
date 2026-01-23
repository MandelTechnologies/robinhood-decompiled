package com.robinhood.android.diagnostics.p100io;

import com.robinhood.vault.Vault;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: EncryptedBytesAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/io/EncryptedBytesAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "vault", "Lcom/robinhood/vault/Vault;", "<init>", "(Lcom/robinhood/vault/Vault;)V", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class EncryptedBytesAdapter extends ProtoAdapter<ByteString> {
    private final Vault vault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedBytesAdapter(Vault vault) {
        super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) Reflection.getOrCreateKotlinClass(ByteString.class), (String) null, Syntax.PROTO_2, ByteString.EMPTY);
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.vault = vault;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ByteString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.vault.encrypt(value).size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ByteString value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(this.vault.encrypt(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ByteString decode(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return this.vault.decrypt(reader.readBytes());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Void redact(ByteString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException();
    }
}
