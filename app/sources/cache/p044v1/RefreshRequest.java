package cache.p044v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: RefreshRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcache/v1/RefreshRequest;", "Lcom/squareup/wire/Message;", "", "cache_type", "Lcache/v1/CacheType;", "force", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcache/v1/CacheType;Ljava/lang/Boolean;Lokio/ByteString;)V", "getCache_type", "()Lcache/v1/CacheType;", "getForce", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lcache/v1/CacheType;Ljava/lang/Boolean;Lokio/ByteString;)Lcache/v1/RefreshRequest;", "Companion", "cache.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RefreshRequest extends Message {

    @JvmField
    public static final ProtoAdapter<RefreshRequest> ADAPTER;

    @WireField(adapter = "cache.v1.CacheType#ADAPTER", jsonName = "cacheType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CacheType cache_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    private final Boolean force;

    public RefreshRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9078newBuilder();
    }

    public final CacheType getCache_type() {
        return this.cache_type;
    }

    public /* synthetic */ RefreshRequest(CacheType cacheType, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CacheType.CACHE_TYPE_UNSPECIFIED : cacheType, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Boolean getForce() {
        return this.force;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRequest(CacheType cache_type, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cache_type, "cache_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cache_type = cache_type;
        this.force = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9078newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RefreshRequest)) {
            return false;
        }
        RefreshRequest refreshRequest = (RefreshRequest) other;
        return Intrinsics.areEqual(unknownFields(), refreshRequest.unknownFields()) && this.cache_type == refreshRequest.cache_type && Intrinsics.areEqual(this.force, refreshRequest.force);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.cache_type.hashCode()) * 37;
        Boolean bool = this.force;
        int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cache_type=" + this.cache_type);
        Boolean bool = this.force;
        if (bool != null) {
            arrayList.add("force=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RefreshRequest copy$default(RefreshRequest refreshRequest, CacheType cacheType, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheType = refreshRequest.cache_type;
        }
        if ((i & 2) != 0) {
            bool = refreshRequest.force;
        }
        if ((i & 4) != 0) {
            byteString = refreshRequest.unknownFields();
        }
        return refreshRequest.copy(cacheType, bool, byteString);
    }

    public final RefreshRequest copy(CacheType cache_type, Boolean force, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cache_type, "cache_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RefreshRequest(cache_type, force, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RefreshRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RefreshRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: cache.v1.RefreshRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RefreshRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCache_type() != CacheType.CACHE_TYPE_UNSPECIFIED) {
                    size += CacheType.ADAPTER.encodedSizeWithTag(1, value.getCache_type());
                }
                return size + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.getForce());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RefreshRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCache_type() != CacheType.CACHE_TYPE_UNSPECIFIED) {
                    CacheType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCache_type());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getForce());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RefreshRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getForce());
                if (value.getCache_type() != CacheType.CACHE_TYPE_UNSPECIFIED) {
                    CacheType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCache_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RefreshRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CacheType cacheTypeDecode = CacheType.CACHE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RefreshRequest(cacheTypeDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            cacheTypeDecode = CacheType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RefreshRequest redact(RefreshRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RefreshRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
