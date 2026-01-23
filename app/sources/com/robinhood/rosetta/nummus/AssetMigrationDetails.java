package com.robinhood.rosetta.nummus;

import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
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

/* compiled from: AssetMigrationDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/AssetMigrationDetails;", "Lcom/squareup/wire/Message;", "", "trigger_id", "", "brokerage_accounting_details", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lokio/ByteString;)V", "getTrigger_id", "()Ljava/lang/String;", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AssetMigrationDetails extends Message {

    @JvmField
    public static final ProtoAdapter<AssetMigrationDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.BrokerageAccountingDetails#ADAPTER", jsonName = "brokerageAccountingDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BrokerageAccountingDetails brokerage_accounting_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "triggerId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String trigger_id;

    public AssetMigrationDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24726newBuilder();
    }

    public final String getTrigger_id() {
        return this.trigger_id;
    }

    public /* synthetic */ AssetMigrationDetails(String str, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : brokerageAccountingDetails, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final BrokerageAccountingDetails getBrokerage_accounting_details() {
        return this.brokerage_accounting_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetMigrationDetails(String trigger_id, BrokerageAccountingDetails brokerageAccountingDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trigger_id = trigger_id;
        this.brokerage_accounting_details = brokerageAccountingDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24726newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssetMigrationDetails)) {
            return false;
        }
        AssetMigrationDetails assetMigrationDetails = (AssetMigrationDetails) other;
        return Intrinsics.areEqual(unknownFields(), assetMigrationDetails.unknownFields()) && Intrinsics.areEqual(this.trigger_id, assetMigrationDetails.trigger_id) && Intrinsics.areEqual(this.brokerage_accounting_details, assetMigrationDetails.brokerage_accounting_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.trigger_id.hashCode()) * 37;
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        int iHashCode2 = iHashCode + (brokerageAccountingDetails != null ? brokerageAccountingDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trigger_id=" + Internal.sanitize(this.trigger_id));
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        if (brokerageAccountingDetails != null) {
            arrayList.add("brokerage_accounting_details=" + brokerageAccountingDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssetMigrationDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AssetMigrationDetails copy$default(AssetMigrationDetails assetMigrationDetails, String str, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetMigrationDetails.trigger_id;
        }
        if ((i & 2) != 0) {
            brokerageAccountingDetails = assetMigrationDetails.brokerage_accounting_details;
        }
        if ((i & 4) != 0) {
            byteString = assetMigrationDetails.unknownFields();
        }
        return assetMigrationDetails.copy(str, brokerageAccountingDetails, byteString);
    }

    public final AssetMigrationDetails copy(String trigger_id, BrokerageAccountingDetails brokerage_accounting_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssetMigrationDetails(trigger_id, brokerage_accounting_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetMigrationDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssetMigrationDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.AssetMigrationDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssetMigrationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTrigger_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTrigger_id());
                }
                return value.getBrokerage_accounting_details() != null ? size + BrokerageAccountingDetails.ADAPTER.encodedSizeWithTag(2, value.getBrokerage_accounting_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssetMigrationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTrigger_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTrigger_id());
                }
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_accounting_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssetMigrationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_accounting_details());
                }
                if (Intrinsics.areEqual(value.getTrigger_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTrigger_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetMigrationDetails redact(AssetMigrationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BrokerageAccountingDetails brokerage_accounting_details = value.getBrokerage_accounting_details();
                return AssetMigrationDetails.copy$default(value, null, brokerage_accounting_details != null ? BrokerageAccountingDetails.ADAPTER.redact(brokerage_accounting_details) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AssetMigrationDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                BrokerageAccountingDetails brokerageAccountingDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AssetMigrationDetails(strDecode, brokerageAccountingDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        brokerageAccountingDetailsDecode = BrokerageAccountingDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
