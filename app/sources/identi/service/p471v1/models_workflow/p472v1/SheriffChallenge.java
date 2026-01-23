package identi.service.p471v1.models_workflow.p472v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeDuxo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.SheriffChallenge;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: SheriffChallenge.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003./0BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b*\u0010\u001bR\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "Lcom/squareup/wire/Message;", "", "", "id", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "type", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "status", "", "remaining_retries", ErrorResponse.REMAINING_ATTEMPTS, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "expires_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;IILj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;IILj$/time/Instant;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "Ljava/lang/String;", "getId", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "getType", "()Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "getStatus", "()Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "I", "getRemaining_retries", "getRemaining_attempts", "Lj$/time/Instant;", "getExpires_at", "()Lj$/time/Instant;", "Companion", "Type", "Status", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SheriffChallenge extends Message {

    @JvmField
    public static final ProtoAdapter<SheriffChallenge> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expiresAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant expires_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = DeviceApprovalChallengeDuxo.REMAINING_ATTEMPTS, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int remaining_attempts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "remainingRetries", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int remaining_retries;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SheriffChallenge$Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Status status;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SheriffChallenge$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Type type;

    public SheriffChallenge() {
        this(null, null, null, 0, 0, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28388newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ SheriffChallenge(String str, Type type2, Status status, int i, int i2, Instant instant, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i3 & 4) != 0 ? Status.STATUS_UNSPECIFIED : status, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : instant, (i3 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Type getType() {
        return this.type;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getRemaining_retries() {
        return this.remaining_retries;
    }

    public final int getRemaining_attempts() {
        return this.remaining_attempts;
    }

    public final Instant getExpires_at() {
        return this.expires_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheriffChallenge(String id, Type type2, Status status, int i, int i2, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.type = type2;
        this.status = status;
        this.remaining_retries = i;
        this.remaining_attempts = i2;
        this.expires_at = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28388newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SheriffChallenge)) {
            return false;
        }
        SheriffChallenge sheriffChallenge = (SheriffChallenge) other;
        return Intrinsics.areEqual(unknownFields(), sheriffChallenge.unknownFields()) && Intrinsics.areEqual(this.id, sheriffChallenge.id) && this.type == sheriffChallenge.type && this.status == sheriffChallenge.status && this.remaining_retries == sheriffChallenge.remaining_retries && this.remaining_attempts == sheriffChallenge.remaining_attempts && Intrinsics.areEqual(this.expires_at, sheriffChallenge.expires_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.type.hashCode()) * 37) + this.status.hashCode()) * 37) + Integer.hashCode(this.remaining_retries)) * 37) + Integer.hashCode(this.remaining_attempts)) * 37;
        Instant instant = this.expires_at;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("type=" + this.type);
        arrayList.add("status=" + this.status);
        arrayList.add("remaining_retries=" + this.remaining_retries);
        arrayList.add("remaining_attempts=" + this.remaining_attempts);
        Instant instant = this.expires_at;
        if (instant != null) {
            arrayList.add("expires_at=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SheriffChallenge{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SheriffChallenge copy$default(SheriffChallenge sheriffChallenge, String str, Type type2, Status status, int i, int i2, Instant instant, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sheriffChallenge.id;
        }
        if ((i3 & 2) != 0) {
            type2 = sheriffChallenge.type;
        }
        if ((i3 & 4) != 0) {
            status = sheriffChallenge.status;
        }
        if ((i3 & 8) != 0) {
            i = sheriffChallenge.remaining_retries;
        }
        if ((i3 & 16) != 0) {
            i2 = sheriffChallenge.remaining_attempts;
        }
        if ((i3 & 32) != 0) {
            instant = sheriffChallenge.expires_at;
        }
        if ((i3 & 64) != 0) {
            byteString = sheriffChallenge.unknownFields();
        }
        Instant instant2 = instant;
        ByteString byteString2 = byteString;
        int i4 = i2;
        Status status2 = status;
        return sheriffChallenge.copy(str, type2, status2, i, i4, instant2, byteString2);
    }

    public final SheriffChallenge copy(String id, Type type2, Status status, int remaining_retries, int remaining_attempts, Instant expires_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SheriffChallenge(id, type2, status, remaining_retries, remaining_attempts, expires_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SheriffChallenge.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SheriffChallenge>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SheriffChallenge$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SheriffChallenge value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getType() != SheriffChallenge.Type.TYPE_UNSPECIFIED) {
                    size += SheriffChallenge.Type.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                if (value.getStatus() != SheriffChallenge.Status.STATUS_UNSPECIFIED) {
                    size += SheriffChallenge.Status.ADAPTER.encodedSizeWithTag(3, value.getStatus());
                }
                if (value.getRemaining_retries() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getRemaining_retries()));
                }
                if (value.getRemaining_attempts() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getRemaining_attempts()));
                }
                return value.getExpires_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getExpires_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SheriffChallenge value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getType() != SheriffChallenge.Type.TYPE_UNSPECIFIED) {
                    SheriffChallenge.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (value.getStatus() != SheriffChallenge.Status.STATUS_UNSPECIFIED) {
                    SheriffChallenge.Status.ADAPTER.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                if (value.getRemaining_retries() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getRemaining_retries()));
                }
                if (value.getRemaining_attempts() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRemaining_attempts()));
                }
                if (value.getExpires_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getExpires_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SheriffChallenge value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getExpires_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getExpires_at());
                }
                if (value.getRemaining_attempts() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRemaining_attempts()));
                }
                if (value.getRemaining_retries() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getRemaining_retries()));
                }
                if (value.getStatus() != SheriffChallenge.Status.STATUS_UNSPECIFIED) {
                    SheriffChallenge.Status.ADAPTER.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                if (value.getType() != SheriffChallenge.Type.TYPE_UNSPECIFIED) {
                    SheriffChallenge.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SheriffChallenge decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SheriffChallenge.Type typeDecode = SheriffChallenge.Type.TYPE_UNSPECIFIED;
                SheriffChallenge.Status status = SheriffChallenge.Status.STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode = "";
                SheriffChallenge.Status statusDecode = status;
                while (true) {
                    SheriffChallenge.Type type2 = typeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        typeDecode = SheriffChallenge.Type.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        statusDecode = SheriffChallenge.Status.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 5:
                                    iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 6:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new SheriffChallenge(strDecode, type2, statusDecode, iIntValue, iIntValue2, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SheriffChallenge redact(SheriffChallenge value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant expires_at = value.getExpires_at();
                return SheriffChallenge.copy$default(value, null, null, null, 0, 0, expires_at != null ? ProtoAdapter.INSTANT.redact(expires_at) : null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SheriffChallenge.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "EMAIL", "SMS", "APP", "PROMPT", "WEBAUTHN", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;
        public static final Type APP;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type EMAIL;
        public static final Type PROMPT;
        public static final Type SMS;
        public static final Type TYPE_UNSPECIFIED;
        public static final Type WEBAUTHN;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_UNSPECIFIED, EMAIL, SMS, APP, PROMPT, WEBAUTHN};
        }

        @JvmStatic
        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
            TYPE_UNSPECIFIED = type2;
            EMAIL = new Type("EMAIL", 1, 1);
            SMS = new Type("SMS", 2, 2);
            APP = new Type("APP", 3, 3);
            PROMPT = new Type("PROMPT", 4, 4);
            WEBAUTHN = new Type("WEBAUTHN", 5, 5);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: identi.service.v1.models_workflow.v1.SheriffChallenge$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SheriffChallenge.Type fromValue(int value) {
                    return SheriffChallenge.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SheriffChallenge.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                if (value == 0) {
                    return Type.TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Type.EMAIL;
                }
                if (value == 2) {
                    return Type.SMS;
                }
                if (value == 3) {
                    return Type.APP;
                }
                if (value == 4) {
                    return Type.PROMPT;
                }
                if (value != 5) {
                    return null;
                }
                return Type.WEBAUTHN;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SheriffChallenge.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "ISSUED", "VALIDATED", "REDEEMED", "EXPIRED", "FAILED", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Status implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Status> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Status EXPIRED;
        public static final Status FAILED;
        public static final Status ISSUED;
        public static final Status REDEEMED;
        public static final Status STATUS_UNSPECIFIED;
        public static final Status VALIDATED;
        private final int value;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{STATUS_UNSPECIFIED, ISSUED, VALIDATED, REDEEMED, EXPIRED, FAILED};
        }

        @JvmStatic
        public static final Status fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Status status = new Status("STATUS_UNSPECIFIED", 0, 0);
            STATUS_UNSPECIFIED = status;
            ISSUED = new Status("ISSUED", 1, 1);
            VALIDATED = new Status("VALIDATED", 2, 2);
            REDEEMED = new Status("REDEEMED", 3, 3);
            EXPIRED = new Status("EXPIRED", 4, 4);
            FAILED = new Status("FAILED", 5, 5);
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Status.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Status>(orCreateKotlinClass, syntax, status) { // from class: identi.service.v1.models_workflow.v1.SheriffChallenge$Status$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SheriffChallenge.Status fromValue(int value) {
                    return SheriffChallenge.Status.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SheriffChallenge.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Status fromValue(int value) {
                if (value == 0) {
                    return Status.STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return Status.ISSUED;
                }
                if (value == 2) {
                    return Status.VALIDATED;
                }
                if (value == 3) {
                    return Status.REDEEMED;
                }
                if (value == 4) {
                    return Status.EXPIRED;
                }
                if (value != 5) {
                    return null;
                }
                return Status.FAILED;
            }
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
