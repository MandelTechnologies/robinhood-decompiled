package com.robinhood.copilot.proto.p286v1;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: AnalystPriceTarget.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/AnalystPriceTarget;", "Lcom/squareup/wire/Message;", "", "analyst", "", "price_target", "Lcom/robinhood/rosetta/common/Money;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getAnalyst", "()Ljava/lang/String;", "getPrice_target", "()Lcom/robinhood/rosetta/common/Money;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class AnalystPriceTarget extends Message {

    @JvmField
    public static final ProtoAdapter<AnalystPriceTarget> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String analyst;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "priceTarget", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money price_target;

    public AnalystPriceTarget() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22065newBuilder();
    }

    public final String getAnalyst() {
        return this.analyst;
    }

    public /* synthetic */ AnalystPriceTarget(String str, Money money, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Money getPrice_target() {
        return this.price_target;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalystPriceTarget(String analyst, Money money, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(analyst, "analyst");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.analyst = analyst;
        this.price_target = money;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22065newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AnalystPriceTarget)) {
            return false;
        }
        AnalystPriceTarget analystPriceTarget = (AnalystPriceTarget) other;
        return Intrinsics.areEqual(unknownFields(), analystPriceTarget.unknownFields()) && Intrinsics.areEqual(this.analyst, analystPriceTarget.analyst) && Intrinsics.areEqual(this.price_target, analystPriceTarget.price_target);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.analyst.hashCode()) * 37;
        Money money = this.price_target;
        int iHashCode2 = iHashCode + (money != null ? money.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("analyst=" + Internal.sanitize(this.analyst));
        Money money = this.price_target;
        if (money != null) {
            arrayList.add("price_target=" + money);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnalystPriceTarget{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AnalystPriceTarget copy$default(AnalystPriceTarget analystPriceTarget, String str, Money money, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analystPriceTarget.analyst;
        }
        if ((i & 2) != 0) {
            money = analystPriceTarget.price_target;
        }
        if ((i & 4) != 0) {
            byteString = analystPriceTarget.unknownFields();
        }
        return analystPriceTarget.copy(str, money, byteString);
    }

    public final AnalystPriceTarget copy(String analyst, Money price_target, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(analyst, "analyst");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AnalystPriceTarget(analyst, price_target, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AnalystPriceTarget.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnalystPriceTarget>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.AnalystPriceTarget$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnalystPriceTarget value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAnalyst(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAnalyst());
                }
                return value.getPrice_target() != null ? size + Money.ADAPTER.encodedSizeWithTag(2, value.getPrice_target()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnalystPriceTarget value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAnalyst(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAnalyst());
                }
                if (value.getPrice_target() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrice_target());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnalystPriceTarget value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPrice_target() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrice_target());
                }
                if (Intrinsics.areEqual(value.getAnalyst(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAnalyst());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnalystPriceTarget redact(AnalystPriceTarget value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money price_target = value.getPrice_target();
                return AnalystPriceTarget.copy$default(value, null, price_target != null ? Money.ADAPTER.redact(price_target) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnalystPriceTarget decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AnalystPriceTarget(strDecode, moneyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
