package hippo.model.p469v1;

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

/* compiled from: BackgroundAura.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lhippo/model/v1/BackgroundAura;", "Lcom/squareup/wire/Message;", "", "variant", "Lhippo/model/v1/BackgroundAuraVariant;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/BackgroundAuraVariant;Lokio/ByteString;)V", "getVariant", "()Lhippo/model/v1/BackgroundAuraVariant;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BackgroundAura extends Message {

    @JvmField
    public static final ProtoAdapter<BackgroundAura> ADAPTER;

    @WireField(adapter = "hippo.model.v1.BackgroundAuraVariant#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BackgroundAuraVariant variant;

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundAura() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28232newBuilder();
    }

    public final BackgroundAuraVariant getVariant() {
        return this.variant;
    }

    public /* synthetic */ BackgroundAura(BackgroundAuraVariant backgroundAuraVariant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_UNSPECIFIED : backgroundAuraVariant, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundAura(BackgroundAuraVariant variant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.variant = variant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28232newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BackgroundAura)) {
            return false;
        }
        BackgroundAura backgroundAura = (BackgroundAura) other;
        return Intrinsics.areEqual(unknownFields(), backgroundAura.unknownFields()) && this.variant == backgroundAura.variant;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.variant.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("variant=" + this.variant);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BackgroundAura{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BackgroundAura copy$default(BackgroundAura backgroundAura, BackgroundAuraVariant backgroundAuraVariant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            backgroundAuraVariant = backgroundAura.variant;
        }
        if ((i & 2) != 0) {
            byteString = backgroundAura.unknownFields();
        }
        return backgroundAura.copy(backgroundAuraVariant, byteString);
    }

    public final BackgroundAura copy(BackgroundAuraVariant variant, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BackgroundAura(variant, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BackgroundAura.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BackgroundAura>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.BackgroundAura$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BackgroundAura value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getVariant() != BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_UNSPECIFIED ? size + BackgroundAuraVariant.ADAPTER.encodedSizeWithTag(1, value.getVariant()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BackgroundAura value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getVariant() != BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_UNSPECIFIED) {
                    BackgroundAuraVariant.ADAPTER.encodeWithTag(writer, 1, (int) value.getVariant());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BackgroundAura value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getVariant() != BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_UNSPECIFIED) {
                    BackgroundAuraVariant.ADAPTER.encodeWithTag(writer, 1, (int) value.getVariant());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BackgroundAura decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BackgroundAuraVariant backgroundAuraVariantDecode = BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BackgroundAura(backgroundAuraVariantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            backgroundAuraVariantDecode = BackgroundAuraVariant.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BackgroundAura redact(BackgroundAura value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BackgroundAura.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
