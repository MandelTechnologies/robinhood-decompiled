package deeplinks.options.p454v1;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
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

/* compiled from: OptionPortfolioRiskAnalyzerDeeplink.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplink;", "Lcom/squareup/wire/Message;", "", "account_number", "", "initial_underlying_id", InstantCashConstants.ACCOUNT_TYPE_KEY, "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountType;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getInitial_underlying_id", "getAccount_type", "()Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OptionPortfolioRiskAnalyzerDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<OptionPortfolioRiskAnalyzerDeeplink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "deeplinks.options.v1.OptionPortfolioRiskAnalyzerAccountType#ADAPTER", schemaIndex = 2, tag = 3)
    private final OptionPortfolioRiskAnalyzerAccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String initial_underlying_id;

    public OptionPortfolioRiskAnalyzerDeeplink() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27960newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getInitial_underlying_id() {
        return this.initial_underlying_id;
    }

    public final OptionPortfolioRiskAnalyzerAccountType getAccount_type() {
        return this.account_type;
    }

    public /* synthetic */ OptionPortfolioRiskAnalyzerDeeplink(String str, String str2, OptionPortfolioRiskAnalyzerAccountType optionPortfolioRiskAnalyzerAccountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : optionPortfolioRiskAnalyzerAccountType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionPortfolioRiskAnalyzerDeeplink(String str, String str2, OptionPortfolioRiskAnalyzerAccountType optionPortfolioRiskAnalyzerAccountType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = str;
        this.initial_underlying_id = str2;
        this.account_type = optionPortfolioRiskAnalyzerAccountType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27960newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionPortfolioRiskAnalyzerDeeplink)) {
            return false;
        }
        OptionPortfolioRiskAnalyzerDeeplink optionPortfolioRiskAnalyzerDeeplink = (OptionPortfolioRiskAnalyzerDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), optionPortfolioRiskAnalyzerDeeplink.unknownFields()) && Intrinsics.areEqual(this.account_number, optionPortfolioRiskAnalyzerDeeplink.account_number) && Intrinsics.areEqual(this.initial_underlying_id, optionPortfolioRiskAnalyzerDeeplink.initial_underlying_id) && this.account_type == optionPortfolioRiskAnalyzerDeeplink.account_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.account_number;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.initial_underlying_id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        OptionPortfolioRiskAnalyzerAccountType optionPortfolioRiskAnalyzerAccountType = this.account_type;
        int iHashCode4 = iHashCode3 + (optionPortfolioRiskAnalyzerAccountType != null ? optionPortfolioRiskAnalyzerAccountType.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.account_number;
        if (str != null) {
            arrayList.add("account_number=" + Internal.sanitize(str));
        }
        String str2 = this.initial_underlying_id;
        if (str2 != null) {
            arrayList.add("initial_underlying_id=" + Internal.sanitize(str2));
        }
        OptionPortfolioRiskAnalyzerAccountType optionPortfolioRiskAnalyzerAccountType = this.account_type;
        if (optionPortfolioRiskAnalyzerAccountType != null) {
            arrayList.add("account_type=" + optionPortfolioRiskAnalyzerAccountType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionPortfolioRiskAnalyzerDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionPortfolioRiskAnalyzerDeeplink copy$default(OptionPortfolioRiskAnalyzerDeeplink optionPortfolioRiskAnalyzerDeeplink, String str, String str2, OptionPortfolioRiskAnalyzerAccountType optionPortfolioRiskAnalyzerAccountType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionPortfolioRiskAnalyzerDeeplink.account_number;
        }
        if ((i & 2) != 0) {
            str2 = optionPortfolioRiskAnalyzerDeeplink.initial_underlying_id;
        }
        if ((i & 4) != 0) {
            optionPortfolioRiskAnalyzerAccountType = optionPortfolioRiskAnalyzerDeeplink.account_type;
        }
        if ((i & 8) != 0) {
            byteString = optionPortfolioRiskAnalyzerDeeplink.unknownFields();
        }
        return optionPortfolioRiskAnalyzerDeeplink.copy(str, str2, optionPortfolioRiskAnalyzerAccountType, byteString);
    }

    public final OptionPortfolioRiskAnalyzerDeeplink copy(String account_number, String initial_underlying_id, OptionPortfolioRiskAnalyzerAccountType account_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionPortfolioRiskAnalyzerDeeplink(account_number, initial_underlying_id, account_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionPortfolioRiskAnalyzerDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionPortfolioRiskAnalyzerDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.options.v1.OptionPortfolioRiskAnalyzerDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionPortfolioRiskAnalyzerDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getAccount_number()) + protoAdapter.encodedSizeWithTag(2, value.getInitial_underlying_id()) + OptionPortfolioRiskAnalyzerAccountType.ADAPTER.encodedSizeWithTag(3, value.getAccount_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionPortfolioRiskAnalyzerDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getInitial_underlying_id());
                OptionPortfolioRiskAnalyzerAccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccount_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionPortfolioRiskAnalyzerDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OptionPortfolioRiskAnalyzerAccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccount_type());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getInitial_underlying_id());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionPortfolioRiskAnalyzerDeeplink redact(OptionPortfolioRiskAnalyzerDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionPortfolioRiskAnalyzerDeeplink.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionPortfolioRiskAnalyzerDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                OptionPortfolioRiskAnalyzerAccountType optionPortfolioRiskAnalyzerAccountTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionPortfolioRiskAnalyzerDeeplink(strDecode, strDecode2, optionPortfolioRiskAnalyzerAccountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            optionPortfolioRiskAnalyzerAccountTypeDecode = OptionPortfolioRiskAnalyzerAccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
