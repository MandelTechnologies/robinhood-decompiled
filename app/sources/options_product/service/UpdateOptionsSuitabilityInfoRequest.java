package options_product.service;

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

/* compiled from: UpdateOptionsSuitabilityInfoRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Loptions_product/service/UpdateOptionsSuitabilityInfoRequest;", "Lcom/squareup/wire/Message;", "", "option_trading_experience", "", "understand_option_spreads", "", "professional_trader", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "getOption_trading_experience", "()Ljava/lang/String;", "getUnderstand_option_spreads", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProfessional_trader", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Loptions_product/service/UpdateOptionsSuitabilityInfoRequest;", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class UpdateOptionsSuitabilityInfoRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateOptionsSuitabilityInfoRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionTradingExperience", schemaIndex = 0, tag = 1)
    private final String option_trading_experience;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "professionalTrader", schemaIndex = 2, tag = 3)
    private final Boolean professional_trader;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "understandOptionSpreads", schemaIndex = 1, tag = 2)
    private final Boolean understand_option_spreads;

    public UpdateOptionsSuitabilityInfoRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29608newBuilder();
    }

    public final String getOption_trading_experience() {
        return this.option_trading_experience;
    }

    public final Boolean getUnderstand_option_spreads() {
        return this.understand_option_spreads;
    }

    public final Boolean getProfessional_trader() {
        return this.professional_trader;
    }

    public /* synthetic */ UpdateOptionsSuitabilityInfoRequest(String str, Boolean bool, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateOptionsSuitabilityInfoRequest(String str, Boolean bool, Boolean bool2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.option_trading_experience = str;
        this.understand_option_spreads = bool;
        this.professional_trader = bool2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29608newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateOptionsSuitabilityInfoRequest)) {
            return false;
        }
        UpdateOptionsSuitabilityInfoRequest updateOptionsSuitabilityInfoRequest = (UpdateOptionsSuitabilityInfoRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateOptionsSuitabilityInfoRequest.unknownFields()) && Intrinsics.areEqual(this.option_trading_experience, updateOptionsSuitabilityInfoRequest.option_trading_experience) && Intrinsics.areEqual(this.understand_option_spreads, updateOptionsSuitabilityInfoRequest.understand_option_spreads) && Intrinsics.areEqual(this.professional_trader, updateOptionsSuitabilityInfoRequest.professional_trader);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.option_trading_experience;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.understand_option_spreads;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.professional_trader;
        int iHashCode4 = iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.option_trading_experience;
        if (str != null) {
            arrayList.add("option_trading_experience=" + Internal.sanitize(str));
        }
        Boolean bool = this.understand_option_spreads;
        if (bool != null) {
            arrayList.add("understand_option_spreads=" + bool);
        }
        Boolean bool2 = this.professional_trader;
        if (bool2 != null) {
            arrayList.add("professional_trader=" + bool2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateOptionsSuitabilityInfoRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateOptionsSuitabilityInfoRequest copy$default(UpdateOptionsSuitabilityInfoRequest updateOptionsSuitabilityInfoRequest, String str, Boolean bool, Boolean bool2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateOptionsSuitabilityInfoRequest.option_trading_experience;
        }
        if ((i & 2) != 0) {
            bool = updateOptionsSuitabilityInfoRequest.understand_option_spreads;
        }
        if ((i & 4) != 0) {
            bool2 = updateOptionsSuitabilityInfoRequest.professional_trader;
        }
        if ((i & 8) != 0) {
            byteString = updateOptionsSuitabilityInfoRequest.unknownFields();
        }
        return updateOptionsSuitabilityInfoRequest.copy(str, bool, bool2, byteString);
    }

    public final UpdateOptionsSuitabilityInfoRequest copy(String option_trading_experience, Boolean understand_option_spreads, Boolean professional_trader, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateOptionsSuitabilityInfoRequest(option_trading_experience, understand_option_spreads, professional_trader, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateOptionsSuitabilityInfoRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateOptionsSuitabilityInfoRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.UpdateOptionsSuitabilityInfoRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateOptionsSuitabilityInfoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOption_trading_experience());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                return size + protoAdapter.encodedSizeWithTag(2, value.getUnderstand_option_spreads()) + protoAdapter.encodedSizeWithTag(3, value.getProfessional_trader());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateOptionsSuitabilityInfoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption_trading_experience());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getUnderstand_option_spreads());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getProfessional_trader());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateOptionsSuitabilityInfoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getProfessional_trader());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getUnderstand_option_spreads());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption_trading_experience());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateOptionsSuitabilityInfoRequest redact(UpdateOptionsSuitabilityInfoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateOptionsSuitabilityInfoRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateOptionsSuitabilityInfoRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateOptionsSuitabilityInfoRequest(strDecode, boolDecode, boolDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else if (iNextTag == 3) {
                        boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
