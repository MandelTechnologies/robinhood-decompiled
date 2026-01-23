package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: TradabilityInfo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfo;", "Lcom/squareup/wire/Message;", "", "base_tradability", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradability;", "affiliate_tradability", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradability;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradability;Lokio/ByteString;)V", "getBase_tradability", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradability;", "getAffiliate_tradability", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class TradabilityInfo extends Message {

    @JvmField
    public static final ProtoAdapter<TradabilityInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FuturesTradability#ADAPTER", jsonName = "affiliateTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FuturesTradability affiliate_tradability;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FuturesTradability#ADAPTER", jsonName = "baseTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesTradability base_tradability;

    public TradabilityInfo() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20212newBuilder();
    }

    public final FuturesTradability getBase_tradability() {
        return this.base_tradability;
    }

    public /* synthetic */ TradabilityInfo(FuturesTradability futuresTradability, FuturesTradability futuresTradability2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED : futuresTradability, (i & 2) != 0 ? FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED : futuresTradability2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final FuturesTradability getAffiliate_tradability() {
        return this.affiliate_tradability;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradabilityInfo(FuturesTradability base_tradability, FuturesTradability affiliate_tradability, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(base_tradability, "base_tradability");
        Intrinsics.checkNotNullParameter(affiliate_tradability, "affiliate_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.base_tradability = base_tradability;
        this.affiliate_tradability = affiliate_tradability;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20212newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TradabilityInfo)) {
            return false;
        }
        TradabilityInfo tradabilityInfo = (TradabilityInfo) other;
        return Intrinsics.areEqual(unknownFields(), tradabilityInfo.unknownFields()) && this.base_tradability == tradabilityInfo.base_tradability && this.affiliate_tradability == tradabilityInfo.affiliate_tradability;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.base_tradability.hashCode()) * 37) + this.affiliate_tradability.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("base_tradability=" + this.base_tradability);
        arrayList.add("affiliate_tradability=" + this.affiliate_tradability);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TradabilityInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TradabilityInfo copy$default(TradabilityInfo tradabilityInfo, FuturesTradability futuresTradability, FuturesTradability futuresTradability2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresTradability = tradabilityInfo.base_tradability;
        }
        if ((i & 2) != 0) {
            futuresTradability2 = tradabilityInfo.affiliate_tradability;
        }
        if ((i & 4) != 0) {
            byteString = tradabilityInfo.unknownFields();
        }
        return tradabilityInfo.copy(futuresTradability, futuresTradability2, byteString);
    }

    public final TradabilityInfo copy(FuturesTradability base_tradability, FuturesTradability affiliate_tradability, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(base_tradability, "base_tradability");
        Intrinsics.checkNotNullParameter(affiliate_tradability, "affiliate_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TradabilityInfo(base_tradability, affiliate_tradability, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradabilityInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TradabilityInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.TradabilityInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TradabilityInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                FuturesTradability base_tradability = value.getBase_tradability();
                FuturesTradability futuresTradability = FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED;
                if (base_tradability != futuresTradability) {
                    size += FuturesTradability.ADAPTER.encodedSizeWithTag(1, value.getBase_tradability());
                }
                return value.getAffiliate_tradability() != futuresTradability ? size + FuturesTradability.ADAPTER.encodedSizeWithTag(2, value.getAffiliate_tradability()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TradabilityInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesTradability base_tradability = value.getBase_tradability();
                FuturesTradability futuresTradability = FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED;
                if (base_tradability != futuresTradability) {
                    FuturesTradability.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_tradability());
                }
                if (value.getAffiliate_tradability() != futuresTradability) {
                    FuturesTradability.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate_tradability());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TradabilityInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FuturesTradability affiliate_tradability = value.getAffiliate_tradability();
                FuturesTradability futuresTradability = FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED;
                if (affiliate_tradability != futuresTradability) {
                    FuturesTradability.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate_tradability());
                }
                if (value.getBase_tradability() != futuresTradability) {
                    FuturesTradability.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_tradability());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TradabilityInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesTradability futuresTradabilityDecode = FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FuturesTradability futuresTradabilityDecode2 = futuresTradabilityDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TradabilityInfo(futuresTradabilityDecode, futuresTradabilityDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            futuresTradabilityDecode = FuturesTradability.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            futuresTradabilityDecode2 = FuturesTradability.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TradabilityInfo redact(TradabilityInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TradabilityInfo.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
