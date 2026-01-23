package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: FuturesContractContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesContractContext;", "Lcom/squareup/wire/Message;", "", "contract_id", "", AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT, "Lcom/robinhood/rosetta/eventlogging/Money;", "contract_tradibility", "Lcom/robinhood/rosetta/eventlogging/ContractTradability;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Money;Lcom/robinhood/rosetta/eventlogging/ContractTradability;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getMargin_requirement", "()Lcom/robinhood/rosetta/eventlogging/Money;", "getContract_tradibility", "()Lcom/robinhood/rosetta/eventlogging/ContractTradability;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class FuturesContractContext extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesContractContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ContractTradability#ADAPTER", jsonName = "contractTradibility", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ContractTradability contract_tradibility;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", jsonName = "marginRequirement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money margin_requirement;

    public FuturesContractContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24273newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ FuturesContractContext(String str, Money money, ContractTradability contractTradability, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? ContractTradability.TRADABILITY_UNSPECIFIED : contractTradability, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Money getMargin_requirement() {
        return this.margin_requirement;
    }

    public final ContractTradability getContract_tradibility() {
        return this.contract_tradibility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesContractContext(String contract_id, Money money, ContractTradability contract_tradibility, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(contract_tradibility, "contract_tradibility");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.margin_requirement = money;
        this.contract_tradibility = contract_tradibility;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24273newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesContractContext)) {
            return false;
        }
        FuturesContractContext futuresContractContext = (FuturesContractContext) other;
        return Intrinsics.areEqual(unknownFields(), futuresContractContext.unknownFields()) && Intrinsics.areEqual(this.contract_id, futuresContractContext.contract_id) && Intrinsics.areEqual(this.margin_requirement, futuresContractContext.margin_requirement) && this.contract_tradibility == futuresContractContext.contract_tradibility;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37;
        Money money = this.margin_requirement;
        int iHashCode2 = ((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.contract_tradibility.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        Money money = this.margin_requirement;
        if (money != null) {
            arrayList.add("margin_requirement=" + money);
        }
        arrayList.add("contract_tradibility=" + this.contract_tradibility);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesContractContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesContractContext copy$default(FuturesContractContext futuresContractContext, String str, Money money, ContractTradability contractTradability, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresContractContext.contract_id;
        }
        if ((i & 2) != 0) {
            money = futuresContractContext.margin_requirement;
        }
        if ((i & 4) != 0) {
            contractTradability = futuresContractContext.contract_tradibility;
        }
        if ((i & 8) != 0) {
            byteString = futuresContractContext.unknownFields();
        }
        return futuresContractContext.copy(str, money, contractTradability, byteString);
    }

    public final FuturesContractContext copy(String contract_id, Money margin_requirement, ContractTradability contract_tradibility, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(contract_tradibility, "contract_tradibility");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesContractContext(contract_id, margin_requirement, contract_tradibility, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesContractContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesContractContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesContractContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesContractContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (value.getMargin_requirement() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getMargin_requirement());
                }
                return value.getContract_tradibility() != ContractTradability.TRADABILITY_UNSPECIFIED ? size + ContractTradability.ADAPTER.encodedSizeWithTag(3, value.getContract_tradibility()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesContractContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (value.getMargin_requirement() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin_requirement());
                }
                if (value.getContract_tradibility() != ContractTradability.TRADABILITY_UNSPECIFIED) {
                    ContractTradability.ADAPTER.encodeWithTag(writer, 3, (int) value.getContract_tradibility());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesContractContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContract_tradibility() != ContractTradability.TRADABILITY_UNSPECIFIED) {
                    ContractTradability.ADAPTER.encodeWithTag(writer, 3, (int) value.getContract_tradibility());
                }
                if (value.getMargin_requirement() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin_requirement());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesContractContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ContractTradability contractTradabilityDecode = ContractTradability.TRADABILITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesContractContext(strDecode, moneyDecode, contractTradabilityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            contractTradabilityDecode = ContractTradability.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesContractContext redact(FuturesContractContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money margin_requirement = value.getMargin_requirement();
                return FuturesContractContext.copy$default(value, null, margin_requirement != null ? Money.ADAPTER.redact(margin_requirement) : null, null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
