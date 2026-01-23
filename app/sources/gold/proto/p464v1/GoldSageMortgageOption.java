package gold.proto.p464v1;

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

/* compiled from: GoldSageMortgageOption.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lgold/proto/v1/GoldSageMortgageOption;", "Lcom/squareup/wire/Message;", "", "title", "", "mortgage_type", "Lgold/proto/v1/GoldSageMortgageType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lgold/proto/v1/GoldSageMortgageType;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getMortgage_type", "()Lgold/proto/v1/GoldSageMortgageType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldSageMortgageOption extends Message {

    @JvmField
    public static final ProtoAdapter<GoldSageMortgageOption> ADAPTER;

    @WireField(adapter = "gold.proto.v1.GoldSageMortgageType#ADAPTER", jsonName = "mortgageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final GoldSageMortgageType mortgage_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public GoldSageMortgageOption() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28133newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ GoldSageMortgageOption(String str, GoldSageMortgageType goldSageMortgageType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED : goldSageMortgageType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final GoldSageMortgageType getMortgage_type() {
        return this.mortgage_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageMortgageOption(String title, GoldSageMortgageType mortgage_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mortgage_type, "mortgage_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.mortgage_type = mortgage_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28133newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldSageMortgageOption)) {
            return false;
        }
        GoldSageMortgageOption goldSageMortgageOption = (GoldSageMortgageOption) other;
        return Intrinsics.areEqual(unknownFields(), goldSageMortgageOption.unknownFields()) && Intrinsics.areEqual(this.title, goldSageMortgageOption.title) && this.mortgage_type == goldSageMortgageOption.mortgage_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.mortgage_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("mortgage_type=" + this.mortgage_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldSageMortgageOption{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldSageMortgageOption copy$default(GoldSageMortgageOption goldSageMortgageOption, String str, GoldSageMortgageType goldSageMortgageType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldSageMortgageOption.title;
        }
        if ((i & 2) != 0) {
            goldSageMortgageType = goldSageMortgageOption.mortgage_type;
        }
        if ((i & 4) != 0) {
            byteString = goldSageMortgageOption.unknownFields();
        }
        return goldSageMortgageOption.copy(str, goldSageMortgageType, byteString);
    }

    public final GoldSageMortgageOption copy(String title, GoldSageMortgageType mortgage_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mortgage_type, "mortgage_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldSageMortgageOption(title, mortgage_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldSageMortgageOption.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldSageMortgageOption>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.GoldSageMortgageOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldSageMortgageOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return value.getMortgage_type() != GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED ? size + GoldSageMortgageType.ADAPTER.encodedSizeWithTag(2, value.getMortgage_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldSageMortgageOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (value.getMortgage_type() != GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED) {
                    GoldSageMortgageType.ADAPTER.encodeWithTag(writer, 2, (int) value.getMortgage_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldSageMortgageOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMortgage_type() != GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED) {
                    GoldSageMortgageType.ADAPTER.encodeWithTag(writer, 2, (int) value.getMortgage_type());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageMortgageOption decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GoldSageMortgageType goldSageMortgageTypeDecode = GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GoldSageMortgageOption(strDecode, goldSageMortgageTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            goldSageMortgageTypeDecode = GoldSageMortgageType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageMortgageOption redact(GoldSageMortgageOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldSageMortgageOption.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
