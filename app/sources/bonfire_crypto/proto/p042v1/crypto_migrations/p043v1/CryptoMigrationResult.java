package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: CryptoMigrationResult.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B]\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJc\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b(\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b)\u0010\u001c¨\u0006+"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResult;", "Lcom/squareup/wire/Message;", "", "", "id", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationState;", "state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "started_at", "completed_at", "partner", "failure_reason", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationState;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationState;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResult;", "Ljava/lang/String;", "getId", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationState;", "getState", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationState;", "Lj$/time/Instant;", "getStarted_at", "()Lj$/time/Instant;", "getCompleted_at", "getPartner", "getFailure_reason", "Companion", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CryptoMigrationResult extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoMigrationResult> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "completedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant completed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "failureReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String partner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "startedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant started_at;

    @WireField(adapter = "bonfire_crypto.proto.v1.crypto_migrations.v1.MigrationState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MigrationState state;

    public CryptoMigrationResult() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CryptoMigrationResult(String str, MigrationState migrationState, Instant instant, Instant instant2, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MigrationState.MIGRATION_STATE_UNSPECIFIED : migrationState, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9066newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final MigrationState getState() {
        return this.state;
    }

    public final Instant getStarted_at() {
        return this.started_at;
    }

    public final Instant getCompleted_at() {
        return this.completed_at;
    }

    public final String getPartner() {
        return this.partner;
    }

    public final String getFailure_reason() {
        return this.failure_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoMigrationResult(String id, MigrationState state, Instant instant, Instant instant2, String partner, String failure_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.state = state;
        this.started_at = instant;
        this.completed_at = instant2;
        this.partner = partner;
        this.failure_reason = failure_reason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9066newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoMigrationResult)) {
            return false;
        }
        CryptoMigrationResult cryptoMigrationResult = (CryptoMigrationResult) other;
        return Intrinsics.areEqual(unknownFields(), cryptoMigrationResult.unknownFields()) && Intrinsics.areEqual(this.id, cryptoMigrationResult.id) && this.state == cryptoMigrationResult.state && Intrinsics.areEqual(this.started_at, cryptoMigrationResult.started_at) && Intrinsics.areEqual(this.completed_at, cryptoMigrationResult.completed_at) && Intrinsics.areEqual(this.partner, cryptoMigrationResult.partner) && Intrinsics.areEqual(this.failure_reason, cryptoMigrationResult.failure_reason);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.state.hashCode()) * 37;
        Instant instant = this.started_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.completed_at;
        int iHashCode3 = ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.partner.hashCode()) * 37) + this.failure_reason.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("state=" + this.state);
        Instant instant = this.started_at;
        if (instant != null) {
            arrayList.add("started_at=" + instant);
        }
        Instant instant2 = this.completed_at;
        if (instant2 != null) {
            arrayList.add("completed_at=" + instant2);
        }
        arrayList.add("partner=" + Internal.sanitize(this.partner));
        arrayList.add("failure_reason=" + Internal.sanitize(this.failure_reason));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoMigrationResult{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoMigrationResult copy$default(CryptoMigrationResult cryptoMigrationResult, String str, MigrationState migrationState, Instant instant, Instant instant2, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoMigrationResult.id;
        }
        if ((i & 2) != 0) {
            migrationState = cryptoMigrationResult.state;
        }
        if ((i & 4) != 0) {
            instant = cryptoMigrationResult.started_at;
        }
        if ((i & 8) != 0) {
            instant2 = cryptoMigrationResult.completed_at;
        }
        if ((i & 16) != 0) {
            str2 = cryptoMigrationResult.partner;
        }
        if ((i & 32) != 0) {
            str3 = cryptoMigrationResult.failure_reason;
        }
        if ((i & 64) != 0) {
            byteString = cryptoMigrationResult.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        String str5 = str2;
        Instant instant3 = instant;
        return cryptoMigrationResult.copy(str, migrationState, instant3, instant2, str5, str4, byteString2);
    }

    public final CryptoMigrationResult copy(String id, MigrationState state, Instant started_at, Instant completed_at, String partner, String failure_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoMigrationResult(id, state, started_at, completed_at, partner, failure_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoMigrationResult.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoMigrationResult>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationResult$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoMigrationResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getState() != MigrationState.MIGRATION_STATE_UNSPECIFIED) {
                    size += MigrationState.ADAPTER.encodedSizeWithTag(2, value.getState());
                }
                if (value.getStarted_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getStarted_at());
                }
                if (value.getCompleted_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCompleted_at());
                }
                if (!Intrinsics.areEqual(value.getPartner(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPartner());
                }
                return !Intrinsics.areEqual(value.getFailure_reason(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFailure_reason()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoMigrationResult value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getState() != MigrationState.MIGRATION_STATE_UNSPECIFIED) {
                    MigrationState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                if (value.getStarted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getStarted_at());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCompleted_at());
                }
                if (!Intrinsics.areEqual(value.getPartner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPartner());
                }
                if (!Intrinsics.areEqual(value.getFailure_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFailure_reason());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoMigrationResult value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFailure_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFailure_reason());
                }
                if (!Intrinsics.areEqual(value.getPartner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPartner());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCompleted_at());
                }
                if (value.getStarted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getStarted_at());
                }
                if (value.getState() != MigrationState.MIGRATION_STATE_UNSPECIFIED) {
                    MigrationState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationResult decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MigrationState migrationState = MigrationState.MIGRATION_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                MigrationState migrationStateDecode = migrationState;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    migrationStateDecode = MigrationState.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CryptoMigrationResult(strDecode3, migrationStateDecode, instantDecode, instantDecode2, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationResult redact(CryptoMigrationResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant started_at = value.getStarted_at();
                Instant instantRedact = started_at != null ? ProtoAdapter.INSTANT.redact(started_at) : null;
                Instant completed_at = value.getCompleted_at();
                return CryptoMigrationResult.copy$default(value, null, null, instantRedact, completed_at != null ? ProtoAdapter.INSTANT.redact(completed_at) : null, null, null, ByteString.EMPTY, 51, null);
            }
        };
    }
}
