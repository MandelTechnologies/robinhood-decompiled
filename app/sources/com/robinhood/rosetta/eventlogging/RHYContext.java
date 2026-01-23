package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: RHYContext.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContext;", "Lcom/squareup/wire/Message;", "", "product_area", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "product_tag", "", "entry_point", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "has_direct_deposit", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getProduct_area", "()Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "getProduct_tag", "()Ljava/lang/String;", "getEntry_point", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "getHas_direct_deposit", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ProductArea", "AccountType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RHYContext extends Message {

    @JvmField
    public static final ProtoAdapter<RHYContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RHYContext$AccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String entry_point;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasDirectDeposit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Boolean has_direct_deposit;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RHYContext$ProductArea#ADAPTER", jsonName = "productArea", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ProductArea product_area;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productTag", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String product_tag;

    public RHYContext() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24520newBuilder();
    }

    public final ProductArea getProduct_area() {
        return this.product_area;
    }

    public /* synthetic */ RHYContext(ProductArea productArea, String str, String str2, AccountType accountType, Boolean r6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProductArea.PRODUCT_AREA_UNSPECIFIED : productArea, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 16) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r6, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getProduct_tag() {
        return this.product_tag;
    }

    public final String getEntry_point() {
        return this.entry_point;
    }

    public final AccountType getAccount_type() {
        return this.account_type;
    }

    public final Boolean getHas_direct_deposit() {
        return this.has_direct_deposit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RHYContext(ProductArea product_area, String product_tag, String entry_point, AccountType account_type, Boolean has_direct_deposit, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(product_area, "product_area");
        Intrinsics.checkNotNullParameter(product_tag, "product_tag");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(has_direct_deposit, "has_direct_deposit");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.product_area = product_area;
        this.product_tag = product_tag;
        this.entry_point = entry_point;
        this.account_type = account_type;
        this.has_direct_deposit = has_direct_deposit;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24520newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RHYContext)) {
            return false;
        }
        RHYContext rHYContext = (RHYContext) other;
        return Intrinsics.areEqual(unknownFields(), rHYContext.unknownFields()) && this.product_area == rHYContext.product_area && Intrinsics.areEqual(this.product_tag, rHYContext.product_tag) && Intrinsics.areEqual(this.entry_point, rHYContext.entry_point) && this.account_type == rHYContext.account_type && this.has_direct_deposit == rHYContext.has_direct_deposit;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.product_area.hashCode()) * 37) + this.product_tag.hashCode()) * 37) + this.entry_point.hashCode()) * 37) + this.account_type.hashCode()) * 37) + this.has_direct_deposit.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("product_area=" + this.product_area);
        arrayList.add("product_tag=" + Internal.sanitize(this.product_tag));
        arrayList.add("entry_point=" + Internal.sanitize(this.entry_point));
        arrayList.add("account_type=" + this.account_type);
        arrayList.add("has_direct_deposit=" + this.has_direct_deposit);
        return CollectionsKt.joinToString$default(arrayList, ", ", "RHYContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RHYContext copy$default(RHYContext rHYContext, ProductArea productArea, String str, String str2, AccountType accountType, Boolean r5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            productArea = rHYContext.product_area;
        }
        if ((i & 2) != 0) {
            str = rHYContext.product_tag;
        }
        if ((i & 4) != 0) {
            str2 = rHYContext.entry_point;
        }
        if ((i & 8) != 0) {
            accountType = rHYContext.account_type;
        }
        if ((i & 16) != 0) {
            r5 = rHYContext.has_direct_deposit;
        }
        if ((i & 32) != 0) {
            byteString = rHYContext.unknownFields();
        }
        Boolean r7 = r5;
        ByteString byteString2 = byteString;
        return rHYContext.copy(productArea, str, str2, accountType, r7, byteString2);
    }

    public final RHYContext copy(ProductArea product_area, String product_tag, String entry_point, AccountType account_type, Boolean has_direct_deposit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(product_area, "product_area");
        Intrinsics.checkNotNullParameter(product_tag, "product_tag");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(has_direct_deposit, "has_direct_deposit");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RHYContext(product_area, product_tag, entry_point, account_type, has_direct_deposit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RHYContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RHYContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RHYContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RHYContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getProduct_area() != RHYContext.ProductArea.PRODUCT_AREA_UNSPECIFIED) {
                    size += RHYContext.ProductArea.ADAPTER.encodedSizeWithTag(1, value.getProduct_area());
                }
                if (!Intrinsics.areEqual(value.getProduct_tag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getProduct_tag());
                }
                if (!Intrinsics.areEqual(value.getEntry_point(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEntry_point());
                }
                if (value.getAccount_type() != RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += RHYContext.AccountType.ADAPTER.encodedSizeWithTag(4, value.getAccount_type());
                }
                return value.getHas_direct_deposit() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(5, value.getHas_direct_deposit()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RHYContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getProduct_area() != RHYContext.ProductArea.PRODUCT_AREA_UNSPECIFIED) {
                    RHYContext.ProductArea.ADAPTER.encodeWithTag(writer, 1, (int) value.getProduct_area());
                }
                if (!Intrinsics.areEqual(value.getProduct_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getProduct_tag());
                }
                if (!Intrinsics.areEqual(value.getEntry_point(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEntry_point());
                }
                if (value.getAccount_type() != RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    RHYContext.AccountType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAccount_type());
                }
                if (value.getHas_direct_deposit() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getHas_direct_deposit());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RHYContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_direct_deposit() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getHas_direct_deposit());
                }
                if (value.getAccount_type() != RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    RHYContext.AccountType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getEntry_point(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getProduct_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getProduct_tag());
                }
                if (value.getProduct_area() != RHYContext.ProductArea.PRODUCT_AREA_UNSPECIFIED) {
                    RHYContext.ProductArea.ADAPTER.encodeWithTag(writer, 1, (int) value.getProduct_area());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RHYContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RHYContext.ProductArea productAreaDecode = RHYContext.ProductArea.PRODUCT_AREA_UNSPECIFIED;
                RHYContext.AccountType accountType = RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                Boolean r3 = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Boolean booleanDecode = r3;
                RHYContext.AccountType accountTypeDecode = accountType;
                while (true) {
                    RHYContext.ProductArea productArea = productAreaDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RHYContext(productArea, strDecode, strDecode2, accountTypeDecode, booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                productAreaDecode = RHYContext.ProductArea.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                accountTypeDecode = RHYContext.AccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 5) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RHYContext redact(RHYContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RHYContext.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RHYContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PRODUCT_AREA_UNSPECIFIED", "SPENDING", "REWARDS", "BALANCE", "TRANSFER", "RHY_ONBOARDING", "CASH_ACCOUNTS", "REFERRALS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProductArea implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProductArea[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ProductArea> ADAPTER;
        public static final ProductArea BALANCE;
        public static final ProductArea CASH_ACCOUNTS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ProductArea PRODUCT_AREA_UNSPECIFIED;
        public static final ProductArea REFERRALS;
        public static final ProductArea REWARDS;
        public static final ProductArea RHY_ONBOARDING;
        public static final ProductArea SPENDING;
        public static final ProductArea TRANSFER;
        private final int value;

        private static final /* synthetic */ ProductArea[] $values() {
            return new ProductArea[]{PRODUCT_AREA_UNSPECIFIED, SPENDING, REWARDS, BALANCE, TRANSFER, RHY_ONBOARDING, CASH_ACCOUNTS, REFERRALS};
        }

        @JvmStatic
        public static final ProductArea fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ProductArea> getEntries() {
            return $ENTRIES;
        }

        private ProductArea(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ProductArea productArea = new ProductArea("PRODUCT_AREA_UNSPECIFIED", 0, 0);
            PRODUCT_AREA_UNSPECIFIED = productArea;
            SPENDING = new ProductArea("SPENDING", 1, 1);
            REWARDS = new ProductArea("REWARDS", 2, 2);
            BALANCE = new ProductArea("BALANCE", 3, 3);
            TRANSFER = new ProductArea("TRANSFER", 4, 4);
            RHY_ONBOARDING = new ProductArea("RHY_ONBOARDING", 5, 5);
            CASH_ACCOUNTS = new ProductArea("CASH_ACCOUNTS", 6, 6);
            REFERRALS = new ProductArea("REFERRALS", 7, 7);
            ProductArea[] productAreaArr$values = $values();
            $VALUES = productAreaArr$values;
            $ENTRIES = EnumEntries2.enumEntries(productAreaArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProductArea.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ProductArea>(orCreateKotlinClass, syntax, productArea) { // from class: com.robinhood.rosetta.eventlogging.RHYContext$ProductArea$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RHYContext.ProductArea fromValue(int value) {
                    return RHYContext.ProductArea.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RHYContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ProductArea fromValue(int value) {
                switch (value) {
                    case 0:
                        return ProductArea.PRODUCT_AREA_UNSPECIFIED;
                    case 1:
                        return ProductArea.SPENDING;
                    case 2:
                        return ProductArea.REWARDS;
                    case 3:
                        return ProductArea.BALANCE;
                    case 4:
                        return ProductArea.TRANSFER;
                    case 5:
                        return ProductArea.RHY_ONBOARDING;
                    case 6:
                        return ProductArea.CASH_ACCOUNTS;
                    case 7:
                        return ProductArea.REFERRALS;
                    default:
                        return null;
                }
            }
        }

        public static ProductArea valueOf(String str) {
            return (ProductArea) Enum.valueOf(ProductArea.class, str);
        }

        public static ProductArea[] values() {
            return (ProductArea[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RHYContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "RHS_ONLY", "RHY_ONLY", "RHS_RHY", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountType[] $VALUES;
        public static final AccountType ACCOUNT_TYPE_UNSPECIFIED;

        @JvmField
        public static final ProtoAdapter<AccountType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccountType RHS_ONLY;
        public static final AccountType RHS_RHY;
        public static final AccountType RHY_ONLY;
        private final int value;

        private static final /* synthetic */ AccountType[] $values() {
            return new AccountType[]{ACCOUNT_TYPE_UNSPECIFIED, RHS_ONLY, RHY_ONLY, RHS_RHY};
        }

        @JvmStatic
        public static final AccountType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AccountType> getEntries() {
            return $ENTRIES;
        }

        private AccountType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AccountType accountType = new AccountType("ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
            ACCOUNT_TYPE_UNSPECIFIED = accountType;
            RHS_ONLY = new AccountType("RHS_ONLY", 1, 1);
            RHY_ONLY = new AccountType("RHY_ONLY", 2, 2);
            RHS_RHY = new AccountType("RHS_RHY", 3, 3);
            AccountType[] accountTypeArr$values = $values();
            $VALUES = accountTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountType>(orCreateKotlinClass, syntax, accountType) { // from class: com.robinhood.rosetta.eventlogging.RHYContext$AccountType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RHYContext.AccountType fromValue(int value) {
                    return RHYContext.AccountType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RHYContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AccountType fromValue(int value) {
                if (value == 0) {
                    return AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AccountType.RHS_ONLY;
                }
                if (value == 2) {
                    return AccountType.RHY_ONLY;
                }
                if (value != 3) {
                    return null;
                }
                return AccountType.RHS_RHY;
            }
        }

        public static AccountType valueOf(String str) {
            return (AccountType) Enum.valueOf(AccountType.class, str);
        }

        public static AccountType[] values() {
            return (AccountType[]) $VALUES.clone();
        }
    }
}
