package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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

/* compiled from: Kba.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"identi/service/v1/models_workflow/v1/Kba$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/Kba$ScreenParams;", "", "", "heading", "subheading", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/Kba$ScreenParams;", "Ljava/lang/String;", "getHeading", "getSubheading", "getPrimary_cta", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.Kba$ScreenParams, reason: use source file name */
/* loaded from: classes21.dex */
public final class Kba6 extends Message {

    @JvmField
    public static final ProtoAdapter<Kba6> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String heading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subheading;

    public Kba6() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ Kba6(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28353newBuilder();
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public final String getPrimary_cta() {
        return this.primary_cta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kba6(String heading, String subheading, String primary_cta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.heading = heading;
        this.subheading = subheading;
        this.primary_cta = primary_cta;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28353newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Kba6)) {
            return false;
        }
        Kba6 kba6 = (Kba6) other;
        return Intrinsics.areEqual(unknownFields(), kba6.unknownFields()) && Intrinsics.areEqual(this.heading, kba6.heading) && Intrinsics.areEqual(this.subheading, kba6.subheading) && Intrinsics.areEqual(this.primary_cta, kba6.primary_cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.heading.hashCode()) * 37) + this.subheading.hashCode()) * 37) + this.primary_cta.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("heading=" + Internal.sanitize(this.heading));
        arrayList.add("subheading=" + Internal.sanitize(this.subheading));
        arrayList.add("primary_cta=" + Internal.sanitize(this.primary_cta));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Kba6 copy$default(Kba6 kba6, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kba6.heading;
        }
        if ((i & 2) != 0) {
            str2 = kba6.subheading;
        }
        if ((i & 4) != 0) {
            str3 = kba6.primary_cta;
        }
        if ((i & 8) != 0) {
            byteString = kba6.unknownFields();
        }
        return kba6.copy(str, str2, str3, byteString);
    }

    public final Kba6 copy(String heading, String subheading, String primary_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Kba6(heading, subheading, primary_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Kba6.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Kba6>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.Kba$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Kba6 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeading());
                }
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubheading());
                }
                return !Intrinsics.areEqual(value.getPrimary_cta(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_cta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Kba6 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeading());
                }
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubheading());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Kba6 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubheading());
                }
                if (Intrinsics.areEqual(value.getHeading(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeading());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Kba6 redact(Kba6 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Kba6.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Kba6 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Kba6(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
