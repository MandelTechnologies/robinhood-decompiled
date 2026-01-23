package rosetta.midas.p538v1;

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

/* compiled from: UserProduct.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lrosetta/midas/v1/UserProduct;", "Lcom/squareup/wire/Message;", "", "gold_card_product", "Lrosetta/midas/v1/GoldCardProduct;", "private_banking_product", "Lrosetta/midas/v1/PrivateBankingProduct;", "sage_mortgage_product", "Lrosetta/midas/v1/SageMortgageProduct;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/midas/v1/GoldCardProduct;Lrosetta/midas/v1/PrivateBankingProduct;Lrosetta/midas/v1/SageMortgageProduct;Lokio/ByteString;)V", "getGold_card_product", "()Lrosetta/midas/v1/GoldCardProduct;", "getPrivate_banking_product", "()Lrosetta/midas/v1/PrivateBankingProduct;", "getSage_mortgage_product", "()Lrosetta/midas/v1/SageMortgageProduct;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class UserProduct extends Message {

    @JvmField
    public static final ProtoAdapter<UserProduct> ADAPTER;

    @WireField(adapter = "rosetta.midas.v1.GoldCardProduct#ADAPTER", jsonName = "goldCardProduct", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GoldCardProduct gold_card_product;

    @WireField(adapter = "rosetta.midas.v1.PrivateBankingProduct#ADAPTER", jsonName = "privateBankingProduct", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PrivateBankingProduct private_banking_product;

    @WireField(adapter = "rosetta.midas.v1.SageMortgageProduct#ADAPTER", jsonName = "sageMortgageProduct", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final SageMortgageProduct sage_mortgage_product;

    public UserProduct() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29909newBuilder();
    }

    public final GoldCardProduct getGold_card_product() {
        return this.gold_card_product;
    }

    public /* synthetic */ UserProduct(GoldCardProduct goldCardProduct, PrivateBankingProduct privateBankingProduct, SageMortgageProduct sageMortgageProduct, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GoldCardProduct.GOLD_CARD_PRODUCT_DISABLED : goldCardProduct, (i & 2) != 0 ? PrivateBankingProduct.PRIVATE_BANKING_PRODUCT_DISABLED : privateBankingProduct, (i & 4) != 0 ? SageMortgageProduct.SAGE_MORTGAGE_UNUSED : sageMortgageProduct, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PrivateBankingProduct getPrivate_banking_product() {
        return this.private_banking_product;
    }

    public final SageMortgageProduct getSage_mortgage_product() {
        return this.sage_mortgage_product;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProduct(GoldCardProduct gold_card_product, PrivateBankingProduct private_banking_product, SageMortgageProduct sage_mortgage_product, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(gold_card_product, "gold_card_product");
        Intrinsics.checkNotNullParameter(private_banking_product, "private_banking_product");
        Intrinsics.checkNotNullParameter(sage_mortgage_product, "sage_mortgage_product");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.gold_card_product = gold_card_product;
        this.private_banking_product = private_banking_product;
        this.sage_mortgage_product = sage_mortgage_product;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29909newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserProduct)) {
            return false;
        }
        UserProduct userProduct = (UserProduct) other;
        return Intrinsics.areEqual(unknownFields(), userProduct.unknownFields()) && this.gold_card_product == userProduct.gold_card_product && this.private_banking_product == userProduct.private_banking_product && this.sage_mortgage_product == userProduct.sage_mortgage_product;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.gold_card_product.hashCode()) * 37) + this.private_banking_product.hashCode()) * 37) + this.sage_mortgage_product.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("gold_card_product=" + this.gold_card_product);
        arrayList.add("private_banking_product=" + this.private_banking_product);
        arrayList.add("sage_mortgage_product=" + this.sage_mortgage_product);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserProduct{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UserProduct copy$default(UserProduct userProduct, GoldCardProduct goldCardProduct, PrivateBankingProduct privateBankingProduct, SageMortgageProduct sageMortgageProduct, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            goldCardProduct = userProduct.gold_card_product;
        }
        if ((i & 2) != 0) {
            privateBankingProduct = userProduct.private_banking_product;
        }
        if ((i & 4) != 0) {
            sageMortgageProduct = userProduct.sage_mortgage_product;
        }
        if ((i & 8) != 0) {
            byteString = userProduct.unknownFields();
        }
        return userProduct.copy(goldCardProduct, privateBankingProduct, sageMortgageProduct, byteString);
    }

    public final UserProduct copy(GoldCardProduct gold_card_product, PrivateBankingProduct private_banking_product, SageMortgageProduct sage_mortgage_product, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(gold_card_product, "gold_card_product");
        Intrinsics.checkNotNullParameter(private_banking_product, "private_banking_product");
        Intrinsics.checkNotNullParameter(sage_mortgage_product, "sage_mortgage_product");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UserProduct(gold_card_product, private_banking_product, sage_mortgage_product, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserProduct.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserProduct>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.midas.v1.UserProduct$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserProduct value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getGold_card_product() != GoldCardProduct.GOLD_CARD_PRODUCT_DISABLED) {
                    size += GoldCardProduct.ADAPTER.encodedSizeWithTag(1, value.getGold_card_product());
                }
                if (value.getPrivate_banking_product() != PrivateBankingProduct.PRIVATE_BANKING_PRODUCT_DISABLED) {
                    size += PrivateBankingProduct.ADAPTER.encodedSizeWithTag(2, value.getPrivate_banking_product());
                }
                return value.getSage_mortgage_product() != SageMortgageProduct.SAGE_MORTGAGE_UNUSED ? size + SageMortgageProduct.ADAPTER.encodedSizeWithTag(3, value.getSage_mortgage_product()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserProduct value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getGold_card_product() != GoldCardProduct.GOLD_CARD_PRODUCT_DISABLED) {
                    GoldCardProduct.ADAPTER.encodeWithTag(writer, 1, (int) value.getGold_card_product());
                }
                if (value.getPrivate_banking_product() != PrivateBankingProduct.PRIVATE_BANKING_PRODUCT_DISABLED) {
                    PrivateBankingProduct.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrivate_banking_product());
                }
                if (value.getSage_mortgage_product() != SageMortgageProduct.SAGE_MORTGAGE_UNUSED) {
                    SageMortgageProduct.ADAPTER.encodeWithTag(writer, 3, (int) value.getSage_mortgage_product());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserProduct value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSage_mortgage_product() != SageMortgageProduct.SAGE_MORTGAGE_UNUSED) {
                    SageMortgageProduct.ADAPTER.encodeWithTag(writer, 3, (int) value.getSage_mortgage_product());
                }
                if (value.getPrivate_banking_product() != PrivateBankingProduct.PRIVATE_BANKING_PRODUCT_DISABLED) {
                    PrivateBankingProduct.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrivate_banking_product());
                }
                if (value.getGold_card_product() != GoldCardProduct.GOLD_CARD_PRODUCT_DISABLED) {
                    GoldCardProduct.ADAPTER.encodeWithTag(writer, 1, (int) value.getGold_card_product());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserProduct decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GoldCardProduct goldCardProductDecode = GoldCardProduct.GOLD_CARD_PRODUCT_DISABLED;
                PrivateBankingProduct privateBankingProductDecode = PrivateBankingProduct.PRIVATE_BANKING_PRODUCT_DISABLED;
                SageMortgageProduct sageMortgageProductDecode = SageMortgageProduct.SAGE_MORTGAGE_UNUSED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UserProduct(goldCardProductDecode, privateBankingProductDecode, sageMortgageProductDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            goldCardProductDecode = GoldCardProduct.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            privateBankingProductDecode = PrivateBankingProduct.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            sageMortgageProductDecode = SageMortgageProduct.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserProduct redact(UserProduct value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UserProduct.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
