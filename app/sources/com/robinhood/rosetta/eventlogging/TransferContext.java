package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2StateProvider2;
import com.robinhood.rosetta.eventlogging.TransferContext;
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

/* compiled from: TransferContext.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-.BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u000eH\u0016JX\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext;", "Lcom/squareup/wire/Message;", "", "amount", "Lcom/robinhood/rosetta/eventlogging/Money;", "direction", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "frequency", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "payment_instrument", "Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "ref_id", "", "session_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Money;Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/Money;", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "getPayment_instrument", "()Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "getRef_id", "()Ljava/lang/String;", "getSession_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Direction", "EntryPoint", CreateTransferV2StateProvider2.FrequencyRowTag, "PaymentInstrument", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TransferContext extends Message {

    @JvmField
    public static final ProtoAdapter<TransferContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TransferContext$Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Direction direction;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TransferContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 7)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TransferContext$Frequency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final Frequency frequency;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TransferContext$PaymentInstrument#ADAPTER", jsonName = "paymentInstrument", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final PaymentInstrument payment_instrument;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final String session_id;

    public TransferContext() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24584newBuilder();
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public /* synthetic */ TransferContext(Money money, Direction direction, EntryPoint entryPoint, Frequency frequency, PaymentInstrument paymentInstrument, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? Direction.DIRECTION_TYPE_UNSPECIFIED : direction, (i & 4) != 0 ? EntryPoint.ENTRY_POINT_TYPE_UNKNOWN : entryPoint, (i & 8) != 0 ? Frequency.FREQUENCY_TYPE_UNSPECIFIED : frequency, (i & 16) != 0 ? PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED : paymentInstrument, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final Frequency getFrequency() {
        return this.frequency;
    }

    public final PaymentInstrument getPayment_instrument() {
        return this.payment_instrument;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferContext(Money money, Direction direction, EntryPoint entry_point, Frequency frequency, PaymentInstrument payment_instrument, String ref_id, String session_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(payment_instrument, "payment_instrument");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.amount = money;
        this.direction = direction;
        this.entry_point = entry_point;
        this.frequency = frequency;
        this.payment_instrument = payment_instrument;
        this.ref_id = ref_id;
        this.session_id = session_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24584newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TransferContext)) {
            return false;
        }
        TransferContext transferContext = (TransferContext) other;
        return Intrinsics.areEqual(unknownFields(), transferContext.unknownFields()) && Intrinsics.areEqual(this.amount, transferContext.amount) && this.direction == transferContext.direction && this.entry_point == transferContext.entry_point && this.frequency == transferContext.frequency && this.payment_instrument == transferContext.payment_instrument && Intrinsics.areEqual(this.ref_id, transferContext.ref_id) && Intrinsics.areEqual(this.session_id, transferContext.session_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int iHashCode2 = ((((((((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.direction.hashCode()) * 37) + this.entry_point.hashCode()) * 37) + this.frequency.hashCode()) * 37) + this.payment_instrument.hashCode()) * 37) + this.ref_id.hashCode()) * 37) + this.session_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("direction=" + this.direction);
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("frequency=" + this.frequency);
        arrayList.add("payment_instrument=" + this.payment_instrument);
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TransferContext copy$default(TransferContext transferContext, Money money, Direction direction, EntryPoint entryPoint, Frequency frequency, PaymentInstrument paymentInstrument, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = transferContext.amount;
        }
        if ((i & 2) != 0) {
            direction = transferContext.direction;
        }
        if ((i & 4) != 0) {
            entryPoint = transferContext.entry_point;
        }
        if ((i & 8) != 0) {
            frequency = transferContext.frequency;
        }
        if ((i & 16) != 0) {
            paymentInstrument = transferContext.payment_instrument;
        }
        if ((i & 32) != 0) {
            str = transferContext.ref_id;
        }
        if ((i & 64) != 0) {
            str2 = transferContext.session_id;
        }
        if ((i & 128) != 0) {
            byteString = transferContext.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        PaymentInstrument paymentInstrument2 = paymentInstrument;
        String str4 = str;
        return transferContext.copy(money, direction, entryPoint, frequency, paymentInstrument2, str4, str3, byteString2);
    }

    public final TransferContext copy(Money amount, Direction direction, EntryPoint entry_point, Frequency frequency, PaymentInstrument payment_instrument, String ref_id, String session_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(payment_instrument, "payment_instrument");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TransferContext(amount, direction, entry_point, frequency, payment_instrument, ref_id, session_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TransferContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TransferContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getAmount());
                }
                if (value.getDirection() != TransferContext.Direction.DIRECTION_TYPE_UNSPECIFIED) {
                    size += TransferContext.Direction.ADAPTER.encodedSizeWithTag(2, value.getDirection());
                }
                if (value.getEntry_point() != TransferContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN) {
                    size += TransferContext.EntryPoint.ADAPTER.encodedSizeWithTag(7, value.getEntry_point());
                }
                if (value.getFrequency() != TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED) {
                    size += TransferContext.Frequency.ADAPTER.encodedSizeWithTag(3, value.getFrequency());
                }
                if (value.getPayment_instrument() != TransferContext.PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += TransferContext.PaymentInstrument.ADAPTER.encodedSizeWithTag(4, value.getPayment_instrument());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRef_id());
                }
                return !Intrinsics.areEqual(value.getSession_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSession_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAmount());
                }
                if (value.getDirection() != TransferContext.Direction.DIRECTION_TYPE_UNSPECIFIED) {
                    TransferContext.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getEntry_point() != TransferContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN) {
                    TransferContext.EntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                if (value.getFrequency() != TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED) {
                    TransferContext.Frequency.ADAPTER.encodeWithTag(writer, 3, (int) value.getFrequency());
                }
                if (value.getPayment_instrument() != TransferContext.PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED) {
                    TransferContext.PaymentInstrument.ADAPTER.encodeWithTag(writer, 4, (int) value.getPayment_instrument());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSession_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRef_id());
                }
                if (value.getPayment_instrument() != TransferContext.PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED) {
                    TransferContext.PaymentInstrument.ADAPTER.encodeWithTag(writer, 4, (int) value.getPayment_instrument());
                }
                if (value.getFrequency() != TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED) {
                    TransferContext.Frequency.ADAPTER.encodeWithTag(writer, 3, (int) value.getFrequency());
                }
                if (value.getEntry_point() != TransferContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN) {
                    TransferContext.EntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                if (value.getDirection() != TransferContext.Direction.DIRECTION_TYPE_UNSPECIFIED) {
                    TransferContext.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAmount());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TransferContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransferContext.Direction directionDecode = TransferContext.Direction.DIRECTION_TYPE_UNSPECIFIED;
                TransferContext.EntryPoint entryPoint = TransferContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN;
                TransferContext.Frequency frequency = TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED;
                TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Money moneyDecode = null;
                TransferContext.PaymentInstrument paymentInstrumentDecode = paymentInstrument;
                TransferContext.Frequency frequencyDecode = frequency;
                TransferContext.EntryPoint entryPointDecode = entryPoint;
                while (true) {
                    TransferContext.Direction direction = directionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    moneyDecode = Money.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        directionDecode = TransferContext.Direction.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        frequencyDecode = TransferContext.Frequency.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        paymentInstrumentDecode = TransferContext.PaymentInstrument.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        entryPointDecode = TransferContext.EntryPoint.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TransferContext(moneyDecode, direction, entryPointDecode, frequencyDecode, paymentInstrumentDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TransferContext redact(TransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                return TransferContext.copy$default(value, amount != null ? Money.ADAPTER.redact(amount) : null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECTION_TYPE_UNSPECIFIED", "DEPOSIT", "WITHDRAWAL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Direction> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction DEPOSIT;
        public static final Direction DIRECTION_TYPE_UNSPECIFIED;
        public static final Direction WITHDRAWAL;
        private final int value;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{DIRECTION_TYPE_UNSPECIFIED, DEPOSIT, WITHDRAWAL};
        }

        @JvmStatic
        public static final Direction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Direction direction = new Direction("DIRECTION_TYPE_UNSPECIFIED", 0, 0);
            DIRECTION_TYPE_UNSPECIFIED = direction;
            DEPOSIT = new Direction("DEPOSIT", 1, 1);
            WITHDRAWAL = new Direction("WITHDRAWAL", 2, 2);
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Direction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Direction>(orCreateKotlinClass, syntax, direction) { // from class: com.robinhood.rosetta.eventlogging.TransferContext$Direction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TransferContext.Direction fromValue(int value) {
                    return TransferContext.Direction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Direction fromValue(int value) {
                if (value == 0) {
                    return Direction.DIRECTION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Direction.DEPOSIT;
                }
                if (value != 2) {
                    return null;
                }
                return Direction.WITHDRAWAL;
            }
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_TYPE_UNKNOWN", "FIRST_TRADE_RECOMMENDATION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_TYPE_UNKNOWN;
        public static final EntryPoint FIRST_TRADE_RECOMMENDATION;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_TYPE_UNKNOWN, FIRST_TRADE_RECOMMENDATION};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_TYPE_UNKNOWN", 0, 0);
            ENTRY_POINT_TYPE_UNKNOWN = entryPoint;
            FIRST_TRADE_RECOMMENDATION = new EntryPoint("FIRST_TRADE_RECOMMENDATION", 1, 1);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.TransferContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TransferContext.EntryPoint fromValue(int value) {
                    return TransferContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                if (value == 0) {
                    return EntryPoint.ENTRY_POINT_TYPE_UNKNOWN;
                }
                if (value != 1) {
                    return null;
                }
                return EntryPoint.FIRST_TRADE_RECOMMENDATION;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FREQUENCY_TYPE_UNSPECIFIED", "ONCE", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Frequency implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Frequency[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Frequency> ADAPTER;
        public static final Frequency BIWEEKLY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Frequency FREQUENCY_TYPE_UNSPECIFIED;
        public static final Frequency MONTHLY;
        public static final Frequency ONCE;
        public static final Frequency QUARTERLY;
        public static final Frequency WEEKLY;
        private final int value;

        private static final /* synthetic */ Frequency[] $values() {
            return new Frequency[]{FREQUENCY_TYPE_UNSPECIFIED, ONCE, WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
        }

        @JvmStatic
        public static final Frequency fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Frequency> getEntries() {
            return $ENTRIES;
        }

        private Frequency(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Frequency frequency = new Frequency("FREQUENCY_TYPE_UNSPECIFIED", 0, 0);
            FREQUENCY_TYPE_UNSPECIFIED = frequency;
            ONCE = new Frequency("ONCE", 1, 1);
            WEEKLY = new Frequency("WEEKLY", 2, 2);
            BIWEEKLY = new Frequency("BIWEEKLY", 3, 3);
            MONTHLY = new Frequency("MONTHLY", 4, 4);
            QUARTERLY = new Frequency("QUARTERLY", 5, 5);
            Frequency[] frequencyArr$values = $values();
            $VALUES = frequencyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(frequencyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Frequency.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Frequency>(orCreateKotlinClass, syntax, frequency) { // from class: com.robinhood.rosetta.eventlogging.TransferContext$Frequency$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TransferContext.Frequency fromValue(int value) {
                    return TransferContext.Frequency.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Frequency fromValue(int value) {
                if (value == 0) {
                    return Frequency.FREQUENCY_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Frequency.ONCE;
                }
                if (value == 2) {
                    return Frequency.WEEKLY;
                }
                if (value == 3) {
                    return Frequency.BIWEEKLY;
                }
                if (value == 4) {
                    return Frequency.MONTHLY;
                }
                if (value != 5) {
                    return null;
                }
                return Frequency.QUARTERLY;
            }
        }

        public static Frequency valueOf(String str) {
            return (Frequency) Enum.valueOf(Frequency.class, str);
        }

        public static Frequency[] values() {
            return (Frequency[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED", "ACH", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaymentInstrument implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentInstrument[] $VALUES;
        public static final PaymentInstrument ACH;

        @JvmField
        public static final ProtoAdapter<PaymentInstrument> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PaymentInstrument PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ PaymentInstrument[] $values() {
            return new PaymentInstrument[]{PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED, ACH};
        }

        @JvmStatic
        public static final PaymentInstrument fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<PaymentInstrument> getEntries() {
            return $ENTRIES;
        }

        private PaymentInstrument(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final PaymentInstrument paymentInstrument = new PaymentInstrument("PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED", 0, 0);
            PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED = paymentInstrument;
            ACH = new PaymentInstrument("ACH", 1, 1);
            PaymentInstrument[] paymentInstrumentArr$values = $values();
            $VALUES = paymentInstrumentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(paymentInstrumentArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PaymentInstrument.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<PaymentInstrument>(orCreateKotlinClass, syntax, paymentInstrument) { // from class: com.robinhood.rosetta.eventlogging.TransferContext$PaymentInstrument$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TransferContext.PaymentInstrument fromValue(int value) {
                    return TransferContext.PaymentInstrument.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PaymentInstrument fromValue(int value) {
                if (value == 0) {
                    return PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return PaymentInstrument.ACH;
            }
        }

        public static PaymentInstrument valueOf(String str) {
            return (PaymentInstrument) Enum.valueOf(PaymentInstrument.class, str);
        }

        public static PaymentInstrument[] values() {
            return (PaymentInstrument[]) $VALUES.clone();
        }
    }
}
