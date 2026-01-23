package deeplinks.isa.p450v1;

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

/* compiled from: IsaContributionLimitsSheetDeeplink.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaContributionLimitsSheetDeeplink;", "Lcom/squareup/wire/Message;", "", "account_number", "", "tax_year", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getTax_year", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class IsaContributionLimitsSheetDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<IsaContributionLimitsSheetDeeplink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "taxYear", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int tax_year;

    public IsaContributionLimitsSheetDeeplink() {
        this(null, 0, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27942newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ IsaContributionLimitsSheetDeeplink(String str, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getTax_year() {
        return this.tax_year;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaContributionLimitsSheetDeeplink(String account_number, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.tax_year = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27942newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IsaContributionLimitsSheetDeeplink)) {
            return false;
        }
        IsaContributionLimitsSheetDeeplink isaContributionLimitsSheetDeeplink = (IsaContributionLimitsSheetDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), isaContributionLimitsSheetDeeplink.unknownFields()) && Intrinsics.areEqual(this.account_number, isaContributionLimitsSheetDeeplink.account_number) && this.tax_year == isaContributionLimitsSheetDeeplink.tax_year;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + Integer.hashCode(this.tax_year);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("tax_year=" + this.tax_year);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IsaContributionLimitsSheetDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IsaContributionLimitsSheetDeeplink copy$default(IsaContributionLimitsSheetDeeplink isaContributionLimitsSheetDeeplink, String str, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = isaContributionLimitsSheetDeeplink.account_number;
        }
        if ((i2 & 2) != 0) {
            i = isaContributionLimitsSheetDeeplink.tax_year;
        }
        if ((i2 & 4) != 0) {
            byteString = isaContributionLimitsSheetDeeplink.unknownFields();
        }
        return isaContributionLimitsSheetDeeplink.copy(str, i, byteString);
    }

    public final IsaContributionLimitsSheetDeeplink copy(String account_number, int tax_year, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IsaContributionLimitsSheetDeeplink(account_number, tax_year, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IsaContributionLimitsSheetDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IsaContributionLimitsSheetDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.isa.v1.IsaContributionLimitsSheetDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IsaContributionLimitsSheetDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                return value.getTax_year() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTax_year())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IsaContributionLimitsSheetDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getTax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTax_year()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IsaContributionLimitsSheetDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTax_year()));
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IsaContributionLimitsSheetDeeplink redact(IsaContributionLimitsSheetDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IsaContributionLimitsSheetDeeplink.copy$default(value, null, 0, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IsaContributionLimitsSheetDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IsaContributionLimitsSheetDeeplink(strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
