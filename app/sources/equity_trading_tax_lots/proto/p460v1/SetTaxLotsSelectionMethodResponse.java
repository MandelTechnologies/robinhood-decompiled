package equity_trading_tax_lots.proto.p460v1;

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

/* compiled from: SetTaxLotsSelectionMethodResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponse;", "Lcom/squareup/wire/Message;", "", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "failure_reason", "Lequity_trading_tax_lots/proto/v1/FailureReason;", "maximum_number_of_shares", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Lequity_trading_tax_lots/proto/v1/FailureReason;Ljava/lang/String;Lokio/ByteString;)V", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getFailure_reason", "()Lequity_trading_tax_lots/proto/v1/FailureReason;", "getMaximum_number_of_shares", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SetTaxLotsSelectionMethodResponse extends Message {

    @JvmField
    public static final ProtoAdapter<SetTaxLotsSelectionMethodResponse> ADAPTER;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.FailureReason#ADAPTER", jsonName = "failureReason", schemaIndex = 1, tag = 2)
    private final FailureReason failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maximumNumberOfShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String maximum_number_of_shares;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.SelectionStrategy#ADAPTER", jsonName = "selectionStrategy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SelectionStrategy selection_strategy;

    public SetTaxLotsSelectionMethodResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28054newBuilder();
    }

    public final SelectionStrategy getSelection_strategy() {
        return this.selection_strategy;
    }

    public /* synthetic */ SetTaxLotsSelectionMethodResponse(SelectionStrategy selectionStrategy, FailureReason failureReason, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED : selectionStrategy, (i & 2) != 0 ? null : failureReason, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final FailureReason getFailure_reason() {
        return this.failure_reason;
    }

    public final String getMaximum_number_of_shares() {
        return this.maximum_number_of_shares;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTaxLotsSelectionMethodResponse(SelectionStrategy selection_strategy, FailureReason failureReason, String maximum_number_of_shares, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(maximum_number_of_shares, "maximum_number_of_shares");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.selection_strategy = selection_strategy;
        this.failure_reason = failureReason;
        this.maximum_number_of_shares = maximum_number_of_shares;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28054newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetTaxLotsSelectionMethodResponse)) {
            return false;
        }
        SetTaxLotsSelectionMethodResponse setTaxLotsSelectionMethodResponse = (SetTaxLotsSelectionMethodResponse) other;
        return Intrinsics.areEqual(unknownFields(), setTaxLotsSelectionMethodResponse.unknownFields()) && this.selection_strategy == setTaxLotsSelectionMethodResponse.selection_strategy && this.failure_reason == setTaxLotsSelectionMethodResponse.failure_reason && Intrinsics.areEqual(this.maximum_number_of_shares, setTaxLotsSelectionMethodResponse.maximum_number_of_shares);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.selection_strategy.hashCode()) * 37;
        FailureReason failureReason = this.failure_reason;
        int iHashCode2 = ((iHashCode + (failureReason != null ? failureReason.hashCode() : 0)) * 37) + this.maximum_number_of_shares.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("selection_strategy=" + this.selection_strategy);
        FailureReason failureReason = this.failure_reason;
        if (failureReason != null) {
            arrayList.add("failure_reason=" + failureReason);
        }
        arrayList.add("maximum_number_of_shares=" + Internal.sanitize(this.maximum_number_of_shares));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetTaxLotsSelectionMethodResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SetTaxLotsSelectionMethodResponse copy$default(SetTaxLotsSelectionMethodResponse setTaxLotsSelectionMethodResponse, SelectionStrategy selectionStrategy, FailureReason failureReason, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            selectionStrategy = setTaxLotsSelectionMethodResponse.selection_strategy;
        }
        if ((i & 2) != 0) {
            failureReason = setTaxLotsSelectionMethodResponse.failure_reason;
        }
        if ((i & 4) != 0) {
            str = setTaxLotsSelectionMethodResponse.maximum_number_of_shares;
        }
        if ((i & 8) != 0) {
            byteString = setTaxLotsSelectionMethodResponse.unknownFields();
        }
        return setTaxLotsSelectionMethodResponse.copy(selectionStrategy, failureReason, str, byteString);
    }

    public final SetTaxLotsSelectionMethodResponse copy(SelectionStrategy selection_strategy, FailureReason failure_reason, String maximum_number_of_shares, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(maximum_number_of_shares, "maximum_number_of_shares");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetTaxLotsSelectionMethodResponse(selection_strategy, failure_reason, maximum_number_of_shares, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetTaxLotsSelectionMethodResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetTaxLotsSelectionMethodResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.SetTaxLotsSelectionMethodResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetTaxLotsSelectionMethodResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    size += SelectionStrategy.ADAPTER.encodedSizeWithTag(1, value.getSelection_strategy());
                }
                int iEncodedSizeWithTag = size + FailureReason.ADAPTER.encodedSizeWithTag(2, value.getFailure_reason());
                return !Intrinsics.areEqual(value.getMaximum_number_of_shares(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMaximum_number_of_shares()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetTaxLotsSelectionMethodResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelection_strategy());
                }
                FailureReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getFailure_reason());
                if (!Intrinsics.areEqual(value.getMaximum_number_of_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMaximum_number_of_shares());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetTaxLotsSelectionMethodResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMaximum_number_of_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMaximum_number_of_shares());
                }
                FailureReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getFailure_reason());
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelection_strategy());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetTaxLotsSelectionMethodResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SelectionStrategy selectionStrategyDecode = SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FailureReason failureReasonDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetTaxLotsSelectionMethodResponse(selectionStrategyDecode, failureReasonDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            selectionStrategyDecode = SelectionStrategy.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            failureReasonDecode = FailureReason.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetTaxLotsSelectionMethodResponse redact(SetTaxLotsSelectionMethodResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SetTaxLotsSelectionMethodResponse.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
