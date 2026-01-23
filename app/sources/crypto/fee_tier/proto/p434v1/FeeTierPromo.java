package crypto.fee_tier.proto.p434v1;

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

/* compiled from: FeeTierPromo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierPromo;", "Lcom/squareup/wire/Message;", "", "deposit_incentive", "Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;", "introductory_promo", "Lcrypto/fee_tier/proto/v1/IntroductoryPromo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;Lcrypto/fee_tier/proto/v1/IntroductoryPromo;Lokio/ByteString;)V", "getDeposit_incentive", "()Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;", "getIntroductory_promo", "()Lcrypto/fee_tier/proto/v1/IntroductoryPromo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FeeTierPromo extends Message {

    @JvmField
    public static final ProtoAdapter<FeeTierPromo> ADAPTER;

    @WireField(adapter = "crypto.fee_tier.proto.v1.DepositIncentivePromo#ADAPTER", jsonName = "depositIncentive", oneofName = "promo", schemaIndex = 0, tag = 1)
    private final DepositIncentivePromo deposit_incentive;

    @WireField(adapter = "crypto.fee_tier.proto.v1.IntroductoryPromo#ADAPTER", jsonName = "introductoryPromo", oneofName = "promo", schemaIndex = 1, tag = 2)
    private final IntroductoryPromo introductory_promo;

    public FeeTierPromo() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27781newBuilder();
    }

    public final DepositIncentivePromo getDeposit_incentive() {
        return this.deposit_incentive;
    }

    public final IntroductoryPromo getIntroductory_promo() {
        return this.introductory_promo;
    }

    public /* synthetic */ FeeTierPromo(DepositIncentivePromo depositIncentivePromo, IntroductoryPromo introductoryPromo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : depositIncentivePromo, (i & 2) != 0 ? null : introductoryPromo, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeTierPromo(DepositIncentivePromo depositIncentivePromo, IntroductoryPromo introductoryPromo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.deposit_incentive = depositIncentivePromo;
        this.introductory_promo = introductoryPromo;
        if (Internal.countNonNull(depositIncentivePromo, introductoryPromo) > 1) {
            throw new IllegalArgumentException("At most one of deposit_incentive, introductory_promo may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27781newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeTierPromo)) {
            return false;
        }
        FeeTierPromo feeTierPromo = (FeeTierPromo) other;
        return Intrinsics.areEqual(unknownFields(), feeTierPromo.unknownFields()) && Intrinsics.areEqual(this.deposit_incentive, feeTierPromo.deposit_incentive) && Intrinsics.areEqual(this.introductory_promo, feeTierPromo.introductory_promo);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DepositIncentivePromo depositIncentivePromo = this.deposit_incentive;
        int iHashCode2 = (iHashCode + (depositIncentivePromo != null ? depositIncentivePromo.hashCode() : 0)) * 37;
        IntroductoryPromo introductoryPromo = this.introductory_promo;
        int iHashCode3 = iHashCode2 + (introductoryPromo != null ? introductoryPromo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DepositIncentivePromo depositIncentivePromo = this.deposit_incentive;
        if (depositIncentivePromo != null) {
            arrayList.add("deposit_incentive=" + depositIncentivePromo);
        }
        IntroductoryPromo introductoryPromo = this.introductory_promo;
        if (introductoryPromo != null) {
            arrayList.add("introductory_promo=" + introductoryPromo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeTierPromo{", "}", 0, null, null, 56, null);
    }

    public final FeeTierPromo copy(DepositIncentivePromo deposit_incentive, IntroductoryPromo introductory_promo, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeTierPromo(deposit_incentive, introductory_promo, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTierPromo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeTierPromo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.FeeTierPromo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeTierPromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + DepositIncentivePromo.ADAPTER.encodedSizeWithTag(1, value.getDeposit_incentive()) + IntroductoryPromo.ADAPTER.encodedSizeWithTag(2, value.getIntroductory_promo());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeTierPromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DepositIncentivePromo.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeposit_incentive());
                IntroductoryPromo.ADAPTER.encodeWithTag(writer, 2, (int) value.getIntroductory_promo());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeTierPromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                IntroductoryPromo.ADAPTER.encodeWithTag(writer, 2, (int) value.getIntroductory_promo());
                DepositIncentivePromo.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeposit_incentive());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeTierPromo redact(FeeTierPromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DepositIncentivePromo deposit_incentive = value.getDeposit_incentive();
                DepositIncentivePromo depositIncentivePromoRedact = deposit_incentive != null ? DepositIncentivePromo.ADAPTER.redact(deposit_incentive) : null;
                IntroductoryPromo introductory_promo = value.getIntroductory_promo();
                return value.copy(depositIncentivePromoRedact, introductory_promo != null ? IntroductoryPromo.ADAPTER.redact(introductory_promo) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeTierPromo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DepositIncentivePromo depositIncentivePromoDecode = null;
                IntroductoryPromo introductoryPromoDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FeeTierPromo(depositIncentivePromoDecode, introductoryPromoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        depositIncentivePromoDecode = DepositIncentivePromo.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        introductoryPromoDecode = IntroductoryPromo.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
