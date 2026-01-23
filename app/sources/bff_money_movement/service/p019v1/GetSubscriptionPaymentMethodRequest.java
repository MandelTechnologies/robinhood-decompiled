package bff_money_movement.service.p019v1;

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

/* compiled from: GetSubscriptionPaymentMethodRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lbff_money_movement/service/v1/GetSubscriptionPaymentMethodRequest;", "Lcom/squareup/wire/Message;", "", "payment_preference_type", "Lbff_money_movement/service/v1/SubscriptionType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/SubscriptionType;Lokio/ByteString;)V", "getPayment_preference_type", "()Lbff_money_movement/service/v1/SubscriptionType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetSubscriptionPaymentMethodRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetSubscriptionPaymentMethodRequest> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.SubscriptionType#ADAPTER", jsonName = "paymentPreferenceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SubscriptionType payment_preference_type;

    /* JADX WARN: Multi-variable type inference failed */
    public GetSubscriptionPaymentMethodRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8432newBuilder();
    }

    public final SubscriptionType getPayment_preference_type() {
        return this.payment_preference_type;
    }

    public /* synthetic */ GetSubscriptionPaymentMethodRequest(SubscriptionType subscriptionType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SubscriptionType.SUBSCRIPTION_TYPE_UNSPECIFIED : subscriptionType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSubscriptionPaymentMethodRequest(SubscriptionType payment_preference_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(payment_preference_type, "payment_preference_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.payment_preference_type = payment_preference_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8432newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSubscriptionPaymentMethodRequest)) {
            return false;
        }
        GetSubscriptionPaymentMethodRequest getSubscriptionPaymentMethodRequest = (GetSubscriptionPaymentMethodRequest) other;
        return Intrinsics.areEqual(unknownFields(), getSubscriptionPaymentMethodRequest.unknownFields()) && this.payment_preference_type == getSubscriptionPaymentMethodRequest.payment_preference_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.payment_preference_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("payment_preference_type=" + this.payment_preference_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSubscriptionPaymentMethodRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetSubscriptionPaymentMethodRequest copy$default(GetSubscriptionPaymentMethodRequest getSubscriptionPaymentMethodRequest, SubscriptionType subscriptionType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionType = getSubscriptionPaymentMethodRequest.payment_preference_type;
        }
        if ((i & 2) != 0) {
            byteString = getSubscriptionPaymentMethodRequest.unknownFields();
        }
        return getSubscriptionPaymentMethodRequest.copy(subscriptionType, byteString);
    }

    public final GetSubscriptionPaymentMethodRequest copy(SubscriptionType payment_preference_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(payment_preference_type, "payment_preference_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSubscriptionPaymentMethodRequest(payment_preference_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetSubscriptionPaymentMethodRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetSubscriptionPaymentMethodRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetSubscriptionPaymentMethodRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetSubscriptionPaymentMethodRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getPayment_preference_type() != SubscriptionType.SUBSCRIPTION_TYPE_UNSPECIFIED ? size + SubscriptionType.ADAPTER.encodedSizeWithTag(1, value.getPayment_preference_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetSubscriptionPaymentMethodRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPayment_preference_type() != SubscriptionType.SUBSCRIPTION_TYPE_UNSPECIFIED) {
                    SubscriptionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getPayment_preference_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetSubscriptionPaymentMethodRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPayment_preference_type() != SubscriptionType.SUBSCRIPTION_TYPE_UNSPECIFIED) {
                    SubscriptionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getPayment_preference_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetSubscriptionPaymentMethodRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SubscriptionType subscriptionTypeDecode = SubscriptionType.SUBSCRIPTION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetSubscriptionPaymentMethodRequest(subscriptionTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            subscriptionTypeDecode = SubscriptionType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSubscriptionPaymentMethodRequest redact(GetSubscriptionPaymentMethodRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetSubscriptionPaymentMethodRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
