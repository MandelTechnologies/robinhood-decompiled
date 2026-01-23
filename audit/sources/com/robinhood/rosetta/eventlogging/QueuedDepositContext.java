package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
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

/* compiled from: QueuedDepositContext.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+,Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J`\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext;", "Lcom/squareup/wire/Message;", "", "amount", "Lcom/robinhood/rosetta/eventlogging/Money;", "locality", "", "source_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "sink_account", "currency_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "additional_data", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$AdditionalData;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Money;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$AdditionalData;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;Lokio/ByteString;)V", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/Money;", "getLocality", "()Ljava/lang/String;", "getSource_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "getSink_account", "getCurrency_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "getAdditional_data", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$AdditionalData;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EntryPoint", "AdditionalData", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class QueuedDepositContext extends Message {

    @JvmField
    public static final ProtoAdapter<QueuedDepositContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.QueuedDepositContext$AdditionalData#ADAPTER", jsonName = "additionalData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final AdditionalData additional_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$CurrencyConversionData#ADAPTER", jsonName = "currencyConversionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final MAXTransferContext.CurrencyConversionData currency_conversion_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.QueuedDepositContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String locality;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount#ADAPTER", jsonName = CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MAXTransferContext.TransferAccount sink_account;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount#ADAPTER", jsonName = CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final MAXTransferContext.TransferAccount source_account;

    public QueuedDepositContext() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24517newBuilder();
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getLocality() {
        return this.locality;
    }

    public /* synthetic */ QueuedDepositContext(Money money, String str, MAXTransferContext.TransferAccount transferAccount, MAXTransferContext.TransferAccount transferAccount2, MAXTransferContext.CurrencyConversionData currencyConversionData, AdditionalData additionalData, EntryPoint entryPoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : transferAccount, (i & 8) != 0 ? null : transferAccount2, (i & 16) != 0 ? null : currencyConversionData, (i & 32) != 0 ? null : additionalData, (i & 64) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MAXTransferContext.TransferAccount getSource_account() {
        return this.source_account;
    }

    public final MAXTransferContext.TransferAccount getSink_account() {
        return this.sink_account;
    }

    public final MAXTransferContext.CurrencyConversionData getCurrency_conversion_data() {
        return this.currency_conversion_data;
    }

    public final AdditionalData getAdditional_data() {
        return this.additional_data;
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueuedDepositContext(Money money, String locality, MAXTransferContext.TransferAccount transferAccount, MAXTransferContext.TransferAccount transferAccount2, MAXTransferContext.CurrencyConversionData currencyConversionData, AdditionalData additionalData, EntryPoint entry_point, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.amount = money;
        this.locality = locality;
        this.source_account = transferAccount;
        this.sink_account = transferAccount2;
        this.currency_conversion_data = currencyConversionData;
        this.additional_data = additionalData;
        this.entry_point = entry_point;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24517newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof QueuedDepositContext)) {
            return false;
        }
        QueuedDepositContext queuedDepositContext = (QueuedDepositContext) other;
        return Intrinsics.areEqual(unknownFields(), queuedDepositContext.unknownFields()) && Intrinsics.areEqual(this.amount, queuedDepositContext.amount) && Intrinsics.areEqual(this.locality, queuedDepositContext.locality) && Intrinsics.areEqual(this.source_account, queuedDepositContext.source_account) && Intrinsics.areEqual(this.sink_account, queuedDepositContext.sink_account) && Intrinsics.areEqual(this.currency_conversion_data, queuedDepositContext.currency_conversion_data) && Intrinsics.areEqual(this.additional_data, queuedDepositContext.additional_data) && this.entry_point == queuedDepositContext.entry_point;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.locality.hashCode()) * 37;
        MAXTransferContext.TransferAccount transferAccount = this.source_account;
        int iHashCode3 = (iHashCode2 + (transferAccount != null ? transferAccount.hashCode() : 0)) * 37;
        MAXTransferContext.TransferAccount transferAccount2 = this.sink_account;
        int iHashCode4 = (iHashCode3 + (transferAccount2 != null ? transferAccount2.hashCode() : 0)) * 37;
        MAXTransferContext.CurrencyConversionData currencyConversionData = this.currency_conversion_data;
        int iHashCode5 = (iHashCode4 + (currencyConversionData != null ? currencyConversionData.hashCode() : 0)) * 37;
        AdditionalData additionalData = this.additional_data;
        int iHashCode6 = ((iHashCode5 + (additionalData != null ? additionalData.hashCode() : 0)) * 37) + this.entry_point.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("locality=" + Internal.sanitize(this.locality));
        MAXTransferContext.TransferAccount transferAccount = this.source_account;
        if (transferAccount != null) {
            arrayList.add("source_account=" + transferAccount);
        }
        MAXTransferContext.TransferAccount transferAccount2 = this.sink_account;
        if (transferAccount2 != null) {
            arrayList.add("sink_account=" + transferAccount2);
        }
        MAXTransferContext.CurrencyConversionData currencyConversionData = this.currency_conversion_data;
        if (currencyConversionData != null) {
            arrayList.add("currency_conversion_data=" + currencyConversionData);
        }
        AdditionalData additionalData = this.additional_data;
        if (additionalData != null) {
            arrayList.add("additional_data=" + additionalData);
        }
        arrayList.add("entry_point=" + this.entry_point);
        return CollectionsKt.joinToString$default(arrayList, ", ", "QueuedDepositContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ QueuedDepositContext copy$default(QueuedDepositContext queuedDepositContext, Money money, String str, MAXTransferContext.TransferAccount transferAccount, MAXTransferContext.TransferAccount transferAccount2, MAXTransferContext.CurrencyConversionData currencyConversionData, AdditionalData additionalData, EntryPoint entryPoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = queuedDepositContext.amount;
        }
        if ((i & 2) != 0) {
            str = queuedDepositContext.locality;
        }
        if ((i & 4) != 0) {
            transferAccount = queuedDepositContext.source_account;
        }
        if ((i & 8) != 0) {
            transferAccount2 = queuedDepositContext.sink_account;
        }
        if ((i & 16) != 0) {
            currencyConversionData = queuedDepositContext.currency_conversion_data;
        }
        if ((i & 32) != 0) {
            additionalData = queuedDepositContext.additional_data;
        }
        if ((i & 64) != 0) {
            entryPoint = queuedDepositContext.entry_point;
        }
        if ((i & 128) != 0) {
            byteString = queuedDepositContext.unknownFields();
        }
        EntryPoint entryPoint2 = entryPoint;
        ByteString byteString2 = byteString;
        MAXTransferContext.CurrencyConversionData currencyConversionData2 = currencyConversionData;
        AdditionalData additionalData2 = additionalData;
        return queuedDepositContext.copy(money, str, transferAccount, transferAccount2, currencyConversionData2, additionalData2, entryPoint2, byteString2);
    }

    public final QueuedDepositContext copy(Money amount, String locality, MAXTransferContext.TransferAccount source_account, MAXTransferContext.TransferAccount sink_account, MAXTransferContext.CurrencyConversionData currency_conversion_data, AdditionalData additional_data, EntryPoint entry_point, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new QueuedDepositContext(amount, locality, source_account, sink_account, currency_conversion_data, additional_data, entry_point, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(QueuedDepositContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<QueuedDepositContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.QueuedDepositContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(QueuedDepositContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLocality());
                }
                if (value.getSource_account() != null) {
                    size += MAXTransferContext.TransferAccount.ADAPTER.encodedSizeWithTag(3, value.getSource_account());
                }
                if (value.getSink_account() != null) {
                    size += MAXTransferContext.TransferAccount.ADAPTER.encodedSizeWithTag(4, value.getSink_account());
                }
                if (value.getCurrency_conversion_data() != null) {
                    size += MAXTransferContext.CurrencyConversionData.ADAPTER.encodedSizeWithTag(5, value.getCurrency_conversion_data());
                }
                if (value.getAdditional_data() != null) {
                    size += QueuedDepositContext.AdditionalData.ADAPTER.encodedSizeWithTag(7, value.getAdditional_data());
                }
                return value.getEntry_point() != QueuedDepositContext.EntryPoint.ENTRY_POINT_UNSPECIFIED ? size + QueuedDepositContext.EntryPoint.ADAPTER.encodedSizeWithTag(6, value.getEntry_point()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, QueuedDepositContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLocality());
                }
                if (value.getSource_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource_account());
                }
                if (value.getSink_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 4, (int) value.getSink_account());
                }
                if (value.getCurrency_conversion_data() != null) {
                    MAXTransferContext.CurrencyConversionData.ADAPTER.encodeWithTag(writer, 5, (int) value.getCurrency_conversion_data());
                }
                if (value.getAdditional_data() != null) {
                    QueuedDepositContext.AdditionalData.ADAPTER.encodeWithTag(writer, 7, (int) value.getAdditional_data());
                }
                if (value.getEntry_point() != QueuedDepositContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    QueuedDepositContext.EntryPoint.ADAPTER.encodeWithTag(writer, 6, (int) value.getEntry_point());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, QueuedDepositContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEntry_point() != QueuedDepositContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    QueuedDepositContext.EntryPoint.ADAPTER.encodeWithTag(writer, 6, (int) value.getEntry_point());
                }
                if (value.getAdditional_data() != null) {
                    QueuedDepositContext.AdditionalData.ADAPTER.encodeWithTag(writer, 7, (int) value.getAdditional_data());
                }
                if (value.getCurrency_conversion_data() != null) {
                    MAXTransferContext.CurrencyConversionData.ADAPTER.encodeWithTag(writer, 5, (int) value.getCurrency_conversion_data());
                }
                if (value.getSink_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 4, (int) value.getSink_account());
                }
                if (value.getSource_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource_account());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLocality());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAmount());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public QueuedDepositContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                QueuedDepositContext.EntryPoint entryPoint = QueuedDepositContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                MAXTransferContext.TransferAccount transferAccountDecode = null;
                MAXTransferContext.TransferAccount transferAccountDecode2 = null;
                MAXTransferContext.CurrencyConversionData currencyConversionDataDecode = null;
                QueuedDepositContext.AdditionalData additionalDataDecode = null;
                String strDecode = "";
                QueuedDepositContext.EntryPoint entryPointDecode = entryPoint;
                Money moneyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                transferAccountDecode = MAXTransferContext.TransferAccount.ADAPTER.decode(reader);
                                break;
                            case 4:
                                transferAccountDecode2 = MAXTransferContext.TransferAccount.ADAPTER.decode(reader);
                                break;
                            case 5:
                                currencyConversionDataDecode = MAXTransferContext.CurrencyConversionData.ADAPTER.decode(reader);
                                break;
                            case 6:
                                try {
                                    entryPointDecode = QueuedDepositContext.EntryPoint.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                additionalDataDecode = QueuedDepositContext.AdditionalData.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new QueuedDepositContext(moneyDecode, strDecode, transferAccountDecode, transferAccountDecode2, currencyConversionDataDecode, additionalDataDecode, entryPointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QueuedDepositContext redact(QueuedDepositContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                MAXTransferContext.TransferAccount source_account = value.getSource_account();
                MAXTransferContext.TransferAccount transferAccountRedact = source_account != null ? MAXTransferContext.TransferAccount.ADAPTER.redact(source_account) : null;
                MAXTransferContext.TransferAccount sink_account = value.getSink_account();
                MAXTransferContext.TransferAccount transferAccountRedact2 = sink_account != null ? MAXTransferContext.TransferAccount.ADAPTER.redact(sink_account) : null;
                MAXTransferContext.CurrencyConversionData currency_conversion_data = value.getCurrency_conversion_data();
                MAXTransferContext.CurrencyConversionData currencyConversionDataRedact = currency_conversion_data != null ? MAXTransferContext.CurrencyConversionData.ADAPTER.redact(currency_conversion_data) : null;
                QueuedDepositContext.AdditionalData additional_data = value.getAdditional_data();
                return QueuedDepositContext.copy$default(value, moneyRedact, null, transferAccountRedact, transferAccountRedact2, currencyConversionDataRedact, additional_data != null ? QueuedDepositContext.AdditionalData.ADAPTER.redact(additional_data) : null, null, ByteString.EMPTY, 66, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QueuedDepositContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "POST_ONBOARDING", "TRANSFER_FUND_DEEPLINK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint POST_ONBOARDING;
        public static final EntryPoint TRANSFER_FUND_DEEPLINK;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, POST_ONBOARDING, TRANSFER_FUND_DEEPLINK};
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
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_UNSPECIFIED", 0, 0);
            ENTRY_POINT_UNSPECIFIED = entryPoint;
            POST_ONBOARDING = new EntryPoint("POST_ONBOARDING", 1, 1);
            TRANSFER_FUND_DEEPLINK = new EntryPoint("TRANSFER_FUND_DEEPLINK", 2, 2);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.QueuedDepositContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public QueuedDepositContext.EntryPoint fromValue(int value) {
                    return QueuedDepositContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: QueuedDepositContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                if (value == 0) {
                    return EntryPoint.ENTRY_POINT_UNSPECIFIED;
                }
                if (value == 1) {
                    return EntryPoint.POST_ONBOARDING;
                }
                if (value != 2) {
                    return null;
                }
                return EntryPoint.TRANSFER_FUND_DEEPLINK;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* compiled from: QueuedDepositContext.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$AdditionalData;", "Lcom/squareup/wire/Message;", "", "mandate_status", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getMandate_status", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdditionalData extends Message {

        @JvmField
        public static final ProtoAdapter<AdditionalData> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mandateStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String mandate_status;

        /* JADX WARN: Multi-variable type inference failed */
        public AdditionalData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24518newBuilder();
        }

        public final String getMandate_status() {
            return this.mandate_status;
        }

        public /* synthetic */ AdditionalData(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalData(String mandate_status, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(mandate_status, "mandate_status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.mandate_status = mandate_status;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24518newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AdditionalData)) {
                return false;
            }
            AdditionalData additionalData = (AdditionalData) other;
            return Intrinsics.areEqual(unknownFields(), additionalData.unknownFields()) && Intrinsics.areEqual(this.mandate_status, additionalData.mandate_status);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.mandate_status.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("mandate_status=" + Internal.sanitize(this.mandate_status));
            return CollectionsKt.joinToString$default(arrayList, ", ", "AdditionalData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ AdditionalData copy$default(AdditionalData additionalData, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = additionalData.mandate_status;
            }
            if ((i & 2) != 0) {
                byteString = additionalData.unknownFields();
            }
            return additionalData.copy(str, byteString);
        }

        public final AdditionalData copy(String mandate_status, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(mandate_status, "mandate_status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AdditionalData(mandate_status, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdditionalData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AdditionalData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.QueuedDepositContext$AdditionalData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(QueuedDepositContext.AdditionalData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getMandate_status(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMandate_status()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, QueuedDepositContext.AdditionalData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getMandate_status(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMandate_status());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, QueuedDepositContext.AdditionalData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getMandate_status(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMandate_status());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public QueuedDepositContext.AdditionalData redact(QueuedDepositContext.AdditionalData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return QueuedDepositContext.AdditionalData.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public QueuedDepositContext.AdditionalData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new QueuedDepositContext.AdditionalData(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
