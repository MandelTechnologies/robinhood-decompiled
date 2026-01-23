package com.robinhood.rosetta.cashier;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: PlaidSignalAttributes.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalAttributes;", "Lcom/squareup/wire/Message;", "", "bank_initiated_return_risk_score", "", "bank_initiated_return_risk_tier", "customer_initiated_return_risk_score", "customer_initiated_return_risk_tier", "core_attributes", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(IIIILjava/util/Map;Lokio/ByteString;)V", "getBank_initiated_return_risk_score", "()I", "getBank_initiated_return_risk_tier", "getCustomer_initiated_return_risk_score", "getCustomer_initiated_return_risk_tier", "getCore_attributes", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PlaidSignalAttributes extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "bankInitiatedReturnRiskScore", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int bank_initiated_return_risk_score;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "bankInitiatedReturnRiskTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int bank_initiated_return_risk_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "coreAttributes", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final Map<String, String> core_attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "customerInitiatedReturnRiskScore", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int customer_initiated_return_risk_score;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "customerInitiatedReturnRiskTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int customer_initiated_return_risk_tier;

    @JvmField
    public static final ProtoAdapter<PlaidSignalAttributes> ADAPTER = new PlaidSignalAttributes2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(PlaidSignalAttributes.class), Syntax.PROTO_3);

    public PlaidSignalAttributes() {
        this(0, 0, 0, 0, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23974newBuilder();
    }

    public final int getBank_initiated_return_risk_score() {
        return this.bank_initiated_return_risk_score;
    }

    public final int getBank_initiated_return_risk_tier() {
        return this.bank_initiated_return_risk_tier;
    }

    public final int getCustomer_initiated_return_risk_score() {
        return this.customer_initiated_return_risk_score;
    }

    public final int getCustomer_initiated_return_risk_tier() {
        return this.customer_initiated_return_risk_tier;
    }

    public /* synthetic */ PlaidSignalAttributes(int i, int i2, int i3, int i4, Map map, ByteString byteString, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? MapsKt.emptyMap() : map, (i5 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidSignalAttributes(int i, int i2, int i3, int i4, Map<String, String> core_attributes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(core_attributes, "core_attributes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bank_initiated_return_risk_score = i;
        this.bank_initiated_return_risk_tier = i2;
        this.customer_initiated_return_risk_score = i3;
        this.customer_initiated_return_risk_tier = i4;
        this.core_attributes = Internal.immutableCopyOf("core_attributes", core_attributes);
    }

    public final Map<String, String> getCore_attributes() {
        return this.core_attributes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23974newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidSignalAttributes)) {
            return false;
        }
        PlaidSignalAttributes plaidSignalAttributes = (PlaidSignalAttributes) other;
        return Intrinsics.areEqual(unknownFields(), plaidSignalAttributes.unknownFields()) && this.bank_initiated_return_risk_score == plaidSignalAttributes.bank_initiated_return_risk_score && this.bank_initiated_return_risk_tier == plaidSignalAttributes.bank_initiated_return_risk_tier && this.customer_initiated_return_risk_score == plaidSignalAttributes.customer_initiated_return_risk_score && this.customer_initiated_return_risk_tier == plaidSignalAttributes.customer_initiated_return_risk_tier && Intrinsics.areEqual(this.core_attributes, plaidSignalAttributes.core_attributes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.bank_initiated_return_risk_score)) * 37) + Integer.hashCode(this.bank_initiated_return_risk_tier)) * 37) + Integer.hashCode(this.customer_initiated_return_risk_score)) * 37) + Integer.hashCode(this.customer_initiated_return_risk_tier)) * 37) + this.core_attributes.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bank_initiated_return_risk_score=" + this.bank_initiated_return_risk_score);
        arrayList.add("bank_initiated_return_risk_tier=" + this.bank_initiated_return_risk_tier);
        arrayList.add("customer_initiated_return_risk_score=" + this.customer_initiated_return_risk_score);
        arrayList.add("customer_initiated_return_risk_tier=" + this.customer_initiated_return_risk_tier);
        if (!this.core_attributes.isEmpty()) {
            arrayList.add("core_attributes=" + this.core_attributes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidSignalAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidSignalAttributes copy$default(PlaidSignalAttributes plaidSignalAttributes, int i, int i2, int i3, int i4, Map map, ByteString byteString, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = plaidSignalAttributes.bank_initiated_return_risk_score;
        }
        if ((i5 & 2) != 0) {
            i2 = plaidSignalAttributes.bank_initiated_return_risk_tier;
        }
        if ((i5 & 4) != 0) {
            i3 = plaidSignalAttributes.customer_initiated_return_risk_score;
        }
        if ((i5 & 8) != 0) {
            i4 = plaidSignalAttributes.customer_initiated_return_risk_tier;
        }
        if ((i5 & 16) != 0) {
            map = plaidSignalAttributes.core_attributes;
        }
        if ((i5 & 32) != 0) {
            byteString = plaidSignalAttributes.unknownFields();
        }
        Map map2 = map;
        ByteString byteString2 = byteString;
        return plaidSignalAttributes.copy(i, i2, i3, i4, map2, byteString2);
    }

    public final PlaidSignalAttributes copy(int bank_initiated_return_risk_score, int bank_initiated_return_risk_tier, int customer_initiated_return_risk_score, int customer_initiated_return_risk_tier, Map<String, String> core_attributes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(core_attributes, "core_attributes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidSignalAttributes(bank_initiated_return_risk_score, bank_initiated_return_risk_tier, customer_initiated_return_risk_score, customer_initiated_return_risk_tier, core_attributes, unknownFields);
    }
}
