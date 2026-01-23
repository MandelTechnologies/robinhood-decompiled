package equity_trading_tax_lots.proto.p460v1;

import com.plaid.internal.EnumC7081g;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: SelectionStrategySummary.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\rH\u0016JV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "Lcom/squareup/wire/Message;", "", "selected", "", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "failure_reason", "Lequity_trading_tax_lots/proto/v1/FailureReason;", "warnings", "", "Lequity_trading_tax_lots/proto/v1/Warnings;", "maximum_quantity", "", "estimated_gain_loss", "Lcom/robinhood/rosetta/common/Money;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLequity_trading_tax_lots/proto/v1/SelectionStrategy;Lequity_trading_tax_lots/proto/v1/FailureReason;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getSelected", "()Z", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getFailure_reason", "()Lequity_trading_tax_lots/proto/v1/FailureReason;", "getMaximum_quantity", "()Ljava/lang/String;", "getEstimated_gain_loss", "()Lcom/robinhood/rosetta/common/Money;", "getWarnings", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SelectionStrategySummary extends Message {

    @JvmField
    public static final ProtoAdapter<SelectionStrategySummary> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "estimatedGainLoss", schemaIndex = 5, tag = 6)
    private final Money estimated_gain_loss;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.FailureReason#ADAPTER", jsonName = "failureReason", schemaIndex = 2, tag = 3)
    private final FailureReason failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maximumQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String maximum_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean selected;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.SelectionStrategy#ADAPTER", jsonName = "selectionStrategy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SelectionStrategy selection_strategy;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.Warnings#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Warnings> warnings;

    public SelectionStrategySummary() {
        this(false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28048newBuilder();
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final SelectionStrategy getSelection_strategy() {
        return this.selection_strategy;
    }

    public /* synthetic */ SelectionStrategySummary(boolean z, SelectionStrategy selectionStrategy, FailureReason failureReason, List list, String str, Money money, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED : selectionStrategy, (i & 4) != 0 ? null : failureReason, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : money, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final FailureReason getFailure_reason() {
        return this.failure_reason;
    }

    public final String getMaximum_quantity() {
        return this.maximum_quantity;
    }

    public final Money getEstimated_gain_loss() {
        return this.estimated_gain_loss;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionStrategySummary(boolean z, SelectionStrategy selection_strategy, FailureReason failureReason, List<? extends Warnings> warnings, String maximum_quantity, Money money, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(maximum_quantity, "maximum_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.selected = z;
        this.selection_strategy = selection_strategy;
        this.failure_reason = failureReason;
        this.maximum_quantity = maximum_quantity;
        this.estimated_gain_loss = money;
        this.warnings = Internal.immutableCopyOf("warnings", warnings);
    }

    public final List<Warnings> getWarnings() {
        return this.warnings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28048newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SelectionStrategySummary)) {
            return false;
        }
        SelectionStrategySummary selectionStrategySummary = (SelectionStrategySummary) other;
        return Intrinsics.areEqual(unknownFields(), selectionStrategySummary.unknownFields()) && this.selected == selectionStrategySummary.selected && this.selection_strategy == selectionStrategySummary.selection_strategy && this.failure_reason == selectionStrategySummary.failure_reason && Intrinsics.areEqual(this.warnings, selectionStrategySummary.warnings) && Intrinsics.areEqual(this.maximum_quantity, selectionStrategySummary.maximum_quantity) && Intrinsics.areEqual(this.estimated_gain_loss, selectionStrategySummary.estimated_gain_loss);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.selected)) * 37) + this.selection_strategy.hashCode()) * 37;
        FailureReason failureReason = this.failure_reason;
        int iHashCode2 = (((((iHashCode + (failureReason != null ? failureReason.hashCode() : 0)) * 37) + this.warnings.hashCode()) * 37) + this.maximum_quantity.hashCode()) * 37;
        Money money = this.estimated_gain_loss;
        int iHashCode3 = iHashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("selected=" + this.selected);
        arrayList.add("selection_strategy=" + this.selection_strategy);
        FailureReason failureReason = this.failure_reason;
        if (failureReason != null) {
            arrayList.add("failure_reason=" + failureReason);
        }
        if (!this.warnings.isEmpty()) {
            arrayList.add("warnings=" + this.warnings);
        }
        arrayList.add("maximum_quantity=" + Internal.sanitize(this.maximum_quantity));
        Money money = this.estimated_gain_loss;
        if (money != null) {
            arrayList.add("estimated_gain_loss=" + money);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectionStrategySummary{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SelectionStrategySummary copy$default(SelectionStrategySummary selectionStrategySummary, boolean z, SelectionStrategy selectionStrategy, FailureReason failureReason, List list, String str, Money money, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = selectionStrategySummary.selected;
        }
        if ((i & 2) != 0) {
            selectionStrategy = selectionStrategySummary.selection_strategy;
        }
        if ((i & 4) != 0) {
            failureReason = selectionStrategySummary.failure_reason;
        }
        if ((i & 8) != 0) {
            list = selectionStrategySummary.warnings;
        }
        if ((i & 16) != 0) {
            str = selectionStrategySummary.maximum_quantity;
        }
        if ((i & 32) != 0) {
            money = selectionStrategySummary.estimated_gain_loss;
        }
        if ((i & 64) != 0) {
            byteString = selectionStrategySummary.unknownFields();
        }
        Money money2 = money;
        ByteString byteString2 = byteString;
        String str2 = str;
        FailureReason failureReason2 = failureReason;
        return selectionStrategySummary.copy(z, selectionStrategy, failureReason2, list, str2, money2, byteString2);
    }

    public final SelectionStrategySummary copy(boolean selected, SelectionStrategy selection_strategy, FailureReason failure_reason, List<? extends Warnings> warnings, String maximum_quantity, Money estimated_gain_loss, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(maximum_quantity, "maximum_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SelectionStrategySummary(selected, selection_strategy, failure_reason, warnings, maximum_quantity, estimated_gain_loss, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelectionStrategySummary.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SelectionStrategySummary>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategySummary$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectionStrategySummary value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSelected()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getSelected()));
                }
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    size += SelectionStrategy.ADAPTER.encodedSizeWithTag(2, value.getSelection_strategy());
                }
                int iEncodedSizeWithTag = size + FailureReason.ADAPTER.encodedSizeWithTag(3, value.getFailure_reason()) + Warnings.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getWarnings());
                if (!Intrinsics.areEqual(value.getMaximum_quantity(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMaximum_quantity());
                }
                return iEncodedSizeWithTag + Money.ADAPTER.encodedSizeWithTag(6, value.getEstimated_gain_loss());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectionStrategySummary value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSelected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getSelected()));
                }
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelection_strategy());
                }
                FailureReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getFailure_reason());
                Warnings.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getWarnings());
                if (!Intrinsics.areEqual(value.getMaximum_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMaximum_quantity());
                }
                Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getEstimated_gain_loss());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectionStrategySummary value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getEstimated_gain_loss());
                if (!Intrinsics.areEqual(value.getMaximum_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMaximum_quantity());
                }
                Warnings.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getWarnings());
                FailureReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getFailure_reason());
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelection_strategy());
                }
                if (value.getSelected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getSelected()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SelectionStrategySummary decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SelectionStrategy selectionStrategyDecode = SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                FailureReason failureReasonDecode = null;
                String strDecode = "";
                boolean zBooleanValue = false;
                Money moneyDecode = null;
                while (true) {
                    SelectionStrategy selectionStrategy = selectionStrategyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 2:
                                    try {
                                        selectionStrategyDecode = SelectionStrategy.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        failureReasonDecode = FailureReason.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        Warnings.ADAPTER.tryDecode(reader, arrayList);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    moneyDecode = Money.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new SelectionStrategySummary(zBooleanValue, selectionStrategy, failureReasonDecode, arrayList, strDecode, moneyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectionStrategySummary redact(SelectionStrategySummary value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money estimated_gain_loss = value.getEstimated_gain_loss();
                return SelectionStrategySummary.copy$default(value, false, null, null, null, null, estimated_gain_loss != null ? Money.ADAPTER.redact(estimated_gain_loss) : null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
