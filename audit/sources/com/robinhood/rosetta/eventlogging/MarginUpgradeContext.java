package com.robinhood.rosetta.eventlogging;

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

/* compiled from: MarginUpgradeContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContext;", "Lcom/squareup/wire/Message;", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "", "spending_product", "is_gold", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getAccount_type", "()Ljava/lang/String;", "getSpending_product", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MarginUpgradeContext extends Message {

    @JvmField
    public static final ProtoAdapter<MarginUpgradeContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isGold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Boolean is_gold;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "spendingProduct", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String spending_product;

    public MarginUpgradeContext() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ MarginUpgradeContext(String str, String str2, Boolean r4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r4, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24380newBuilder();
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public final String getSpending_product() {
        return this.spending_product;
    }

    /* renamed from: is_gold, reason: from getter */
    public final Boolean getIs_gold() {
        return this.is_gold;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeContext(String account_type, String spending_product, Boolean is_gold, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(spending_product, "spending_product");
        Intrinsics.checkNotNullParameter(is_gold, "is_gold");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_type = account_type;
        this.spending_product = spending_product;
        this.is_gold = is_gold;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24380newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginUpgradeContext)) {
            return false;
        }
        MarginUpgradeContext marginUpgradeContext = (MarginUpgradeContext) other;
        return Intrinsics.areEqual(unknownFields(), marginUpgradeContext.unknownFields()) && Intrinsics.areEqual(this.account_type, marginUpgradeContext.account_type) && Intrinsics.areEqual(this.spending_product, marginUpgradeContext.spending_product) && this.is_gold == marginUpgradeContext.is_gold;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.account_type.hashCode()) * 37) + this.spending_product.hashCode()) * 37) + this.is_gold.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        arrayList.add("spending_product=" + Internal.sanitize(this.spending_product));
        arrayList.add("is_gold=" + this.is_gold);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginUpgradeContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginUpgradeContext copy$default(MarginUpgradeContext marginUpgradeContext, String str, String str2, Boolean r3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginUpgradeContext.account_type;
        }
        if ((i & 2) != 0) {
            str2 = marginUpgradeContext.spending_product;
        }
        if ((i & 4) != 0) {
            r3 = marginUpgradeContext.is_gold;
        }
        if ((i & 8) != 0) {
            byteString = marginUpgradeContext.unknownFields();
        }
        return marginUpgradeContext.copy(str, str2, r3, byteString);
    }

    public final MarginUpgradeContext copy(String account_type, String spending_product, Boolean is_gold, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(spending_product, "spending_product");
        Intrinsics.checkNotNullParameter(is_gold, "is_gold");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginUpgradeContext(account_type, spending_product, is_gold, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginUpgradeContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginUpgradeContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MarginUpgradeContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginUpgradeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getSpending_product(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSpending_product());
                }
                return value.getIs_gold() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(3, value.getIs_gold()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginUpgradeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getSpending_product(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSpending_product());
                }
                if (value.getIs_gold() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getIs_gold());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginUpgradeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_gold() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getIs_gold());
                }
                if (!Intrinsics.areEqual(value.getSpending_product(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSpending_product());
                }
                if (Intrinsics.areEqual(value.getAccount_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_type());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginUpgradeContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginUpgradeContext(strDecode, strDecode2, booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            booleanDecode = Boolean.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginUpgradeContext redact(MarginUpgradeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarginUpgradeContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
