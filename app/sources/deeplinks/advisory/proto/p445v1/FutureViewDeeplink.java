package deeplinks.advisory.proto.p445v1;

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

/* compiled from: FutureViewDeeplink.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Ldeeplinks/advisory/proto/v1/FutureViewDeeplink;", "Lcom/squareup/wire/Message;", "", "deposit_frequency", "Ldeeplinks/advisory/proto/v1/FutureViewDepositFrequency;", "account_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ldeeplinks/advisory/proto/v1/FutureViewDepositFrequency;Ljava/lang/String;Lokio/ByteString;)V", "getDeposit_frequency", "()Ldeeplinks/advisory/proto/v1/FutureViewDepositFrequency;", "getAccount_number", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "deeplinks.advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FutureViewDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<FutureViewDeeplink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "deeplinks.advisory.proto.v1.FutureViewDepositFrequency#ADAPTER", jsonName = "depositFrequency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FutureViewDepositFrequency deposit_frequency;

    public FutureViewDeeplink() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27930newBuilder();
    }

    public final FutureViewDepositFrequency getDeposit_frequency() {
        return this.deposit_frequency;
    }

    public /* synthetic */ FutureViewDeeplink(FutureViewDepositFrequency futureViewDepositFrequency, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FutureViewDepositFrequency.FUTURE_VIEW_DEPOSIT_FREQUENCY_UNSPECIFIED : futureViewDepositFrequency, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureViewDeeplink(FutureViewDepositFrequency deposit_frequency, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.deposit_frequency = deposit_frequency;
        this.account_number = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27930newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FutureViewDeeplink)) {
            return false;
        }
        FutureViewDeeplink futureViewDeeplink = (FutureViewDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), futureViewDeeplink.unknownFields()) && this.deposit_frequency == futureViewDeeplink.deposit_frequency && Intrinsics.areEqual(this.account_number, futureViewDeeplink.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.deposit_frequency.hashCode()) * 37;
        String str = this.account_number;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("deposit_frequency=" + this.deposit_frequency);
        String str = this.account_number;
        if (str != null) {
            arrayList.add("account_number=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FutureViewDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FutureViewDeeplink copy$default(FutureViewDeeplink futureViewDeeplink, FutureViewDepositFrequency futureViewDepositFrequency, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            futureViewDepositFrequency = futureViewDeeplink.deposit_frequency;
        }
        if ((i & 2) != 0) {
            str = futureViewDeeplink.account_number;
        }
        if ((i & 4) != 0) {
            byteString = futureViewDeeplink.unknownFields();
        }
        return futureViewDeeplink.copy(futureViewDepositFrequency, str, byteString);
    }

    public final FutureViewDeeplink copy(FutureViewDepositFrequency deposit_frequency, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FutureViewDeeplink(deposit_frequency, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FutureViewDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FutureViewDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.advisory.proto.v1.FutureViewDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FutureViewDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDeposit_frequency() != FutureViewDepositFrequency.FUTURE_VIEW_DEPOSIT_FREQUENCY_UNSPECIFIED) {
                    size += FutureViewDepositFrequency.ADAPTER.encodedSizeWithTag(1, value.getDeposit_frequency());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FutureViewDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDeposit_frequency() != FutureViewDepositFrequency.FUTURE_VIEW_DEPOSIT_FREQUENCY_UNSPECIFIED) {
                    FutureViewDepositFrequency.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeposit_frequency());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FutureViewDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                if (value.getDeposit_frequency() != FutureViewDepositFrequency.FUTURE_VIEW_DEPOSIT_FREQUENCY_UNSPECIFIED) {
                    FutureViewDepositFrequency.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeposit_frequency());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FutureViewDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FutureViewDepositFrequency futureViewDepositFrequencyDecode = FutureViewDepositFrequency.FUTURE_VIEW_DEPOSIT_FREQUENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FutureViewDeeplink(futureViewDepositFrequencyDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            futureViewDepositFrequencyDecode = FutureViewDepositFrequency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FutureViewDeeplink redact(FutureViewDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FutureViewDeeplink.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
