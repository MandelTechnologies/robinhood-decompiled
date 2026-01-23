package advisory.proto.p008v1;

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

/* compiled from: DepositPromoCardConfiguration.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardConfiguration;", "Lcom/squareup/wire/Message;", "", "card", "Ladvisory/proto/v1/DepositPromoCard;", "details_screen", "Ladvisory/proto/v1/PromoDetailsScreen;", "promo_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/DepositPromoCard;Ladvisory/proto/v1/PromoDetailsScreen;Ljava/lang/String;Lokio/ByteString;)V", "getCard", "()Ladvisory/proto/v1/DepositPromoCard;", "getDetails_screen", "()Ladvisory/proto/v1/PromoDetailsScreen;", "getPromo_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DepositPromoCardConfiguration extends Message {

    @JvmField
    public static final ProtoAdapter<DepositPromoCardConfiguration> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.DepositPromoCard#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DepositPromoCard card;

    @WireField(adapter = "advisory.proto.v1.PromoDetailsScreen#ADAPTER", jsonName = "detailsScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PromoDetailsScreen details_screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoId", schemaIndex = 2, tag = 3)
    private final String promo_id;

    public DepositPromoCardConfiguration() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4418newBuilder();
    }

    public final DepositPromoCard getCard() {
        return this.card;
    }

    public final PromoDetailsScreen getDetails_screen() {
        return this.details_screen;
    }

    public final String getPromo_id() {
        return this.promo_id;
    }

    public /* synthetic */ DepositPromoCardConfiguration(DepositPromoCard depositPromoCard, PromoDetailsScreen promoDetailsScreen, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : depositPromoCard, (i & 2) != 0 ? null : promoDetailsScreen, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositPromoCardConfiguration(DepositPromoCard depositPromoCard, PromoDetailsScreen promoDetailsScreen, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.card = depositPromoCard;
        this.details_screen = promoDetailsScreen;
        this.promo_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4418newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DepositPromoCardConfiguration)) {
            return false;
        }
        DepositPromoCardConfiguration depositPromoCardConfiguration = (DepositPromoCardConfiguration) other;
        return Intrinsics.areEqual(unknownFields(), depositPromoCardConfiguration.unknownFields()) && Intrinsics.areEqual(this.card, depositPromoCardConfiguration.card) && Intrinsics.areEqual(this.details_screen, depositPromoCardConfiguration.details_screen) && Intrinsics.areEqual(this.promo_id, depositPromoCardConfiguration.promo_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DepositPromoCard depositPromoCard = this.card;
        int iHashCode2 = (iHashCode + (depositPromoCard != null ? depositPromoCard.hashCode() : 0)) * 37;
        PromoDetailsScreen promoDetailsScreen = this.details_screen;
        int iHashCode3 = (iHashCode2 + (promoDetailsScreen != null ? promoDetailsScreen.hashCode() : 0)) * 37;
        String str = this.promo_id;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DepositPromoCard depositPromoCard = this.card;
        if (depositPromoCard != null) {
            arrayList.add("card=" + depositPromoCard);
        }
        PromoDetailsScreen promoDetailsScreen = this.details_screen;
        if (promoDetailsScreen != null) {
            arrayList.add("details_screen=" + promoDetailsScreen);
        }
        String str = this.promo_id;
        if (str != null) {
            arrayList.add("promo_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositPromoCardConfiguration{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositPromoCardConfiguration copy$default(DepositPromoCardConfiguration depositPromoCardConfiguration, DepositPromoCard depositPromoCard, PromoDetailsScreen promoDetailsScreen, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            depositPromoCard = depositPromoCardConfiguration.card;
        }
        if ((i & 2) != 0) {
            promoDetailsScreen = depositPromoCardConfiguration.details_screen;
        }
        if ((i & 4) != 0) {
            str = depositPromoCardConfiguration.promo_id;
        }
        if ((i & 8) != 0) {
            byteString = depositPromoCardConfiguration.unknownFields();
        }
        return depositPromoCardConfiguration.copy(depositPromoCard, promoDetailsScreen, str, byteString);
    }

    public final DepositPromoCardConfiguration copy(DepositPromoCard card, PromoDetailsScreen details_screen, String promo_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositPromoCardConfiguration(card, details_screen, promo_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositPromoCardConfiguration.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositPromoCardConfiguration>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.DepositPromoCardConfiguration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DepositPromoCardConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCard() != null) {
                    size += DepositPromoCard.ADAPTER.encodedSizeWithTag(1, value.getCard());
                }
                if (value.getDetails_screen() != null) {
                    size += PromoDetailsScreen.ADAPTER.encodedSizeWithTag(2, value.getDetails_screen());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPromo_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DepositPromoCardConfiguration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCard() != null) {
                    DepositPromoCard.ADAPTER.encodeWithTag(writer, 1, (int) value.getCard());
                }
                if (value.getDetails_screen() != null) {
                    PromoDetailsScreen.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetails_screen());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPromo_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositPromoCardConfiguration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPromo_id());
                if (value.getDetails_screen() != null) {
                    PromoDetailsScreen.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetails_screen());
                }
                if (value.getCard() != null) {
                    DepositPromoCard.ADAPTER.encodeWithTag(writer, 1, (int) value.getCard());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositPromoCardConfiguration redact(DepositPromoCardConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DepositPromoCard card = value.getCard();
                DepositPromoCard depositPromoCardRedact = card != null ? DepositPromoCard.ADAPTER.redact(card) : null;
                PromoDetailsScreen details_screen = value.getDetails_screen();
                return DepositPromoCardConfiguration.copy$default(value, depositPromoCardRedact, details_screen != null ? PromoDetailsScreen.ADAPTER.redact(details_screen) : null, null, ByteString.EMPTY, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DepositPromoCardConfiguration decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DepositPromoCard depositPromoCardDecode = null;
                PromoDetailsScreen promoDetailsScreenDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DepositPromoCardConfiguration(depositPromoCardDecode, promoDetailsScreenDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        depositPromoCardDecode = DepositPromoCard.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        promoDetailsScreenDecode = PromoDetailsScreen.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
