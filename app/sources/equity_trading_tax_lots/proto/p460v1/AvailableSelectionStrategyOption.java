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

/* compiled from: AvailableSelectionStrategyOption.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "Lcom/squareup/wire/Message;", "", "title", "", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AvailableSelectionStrategyOption extends Message {

    @JvmField
    public static final ProtoAdapter<AvailableSelectionStrategyOption> ADAPTER;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.SelectionStrategy#ADAPTER", jsonName = "selectionStrategy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SelectionStrategy selection_strategy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public AvailableSelectionStrategyOption() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28030newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ AvailableSelectionStrategyOption(String str, SelectionStrategy selectionStrategy, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED : selectionStrategy, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final SelectionStrategy getSelection_strategy() {
        return this.selection_strategy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableSelectionStrategyOption(String title, SelectionStrategy selection_strategy, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.selection_strategy = selection_strategy;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28030newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AvailableSelectionStrategyOption)) {
            return false;
        }
        AvailableSelectionStrategyOption availableSelectionStrategyOption = (AvailableSelectionStrategyOption) other;
        return Intrinsics.areEqual(unknownFields(), availableSelectionStrategyOption.unknownFields()) && Intrinsics.areEqual(this.title, availableSelectionStrategyOption.title) && this.selection_strategy == availableSelectionStrategyOption.selection_strategy;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.selection_strategy.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("selection_strategy=" + this.selection_strategy);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableSelectionStrategyOption{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AvailableSelectionStrategyOption copy$default(AvailableSelectionStrategyOption availableSelectionStrategyOption, String str, SelectionStrategy selectionStrategy, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableSelectionStrategyOption.title;
        }
        if ((i & 2) != 0) {
            selectionStrategy = availableSelectionStrategyOption.selection_strategy;
        }
        if ((i & 4) != 0) {
            byteString = availableSelectionStrategyOption.unknownFields();
        }
        return availableSelectionStrategyOption.copy(str, selectionStrategy, byteString);
    }

    public final AvailableSelectionStrategyOption copy(String title, SelectionStrategy selection_strategy, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AvailableSelectionStrategyOption(title, selection_strategy, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AvailableSelectionStrategyOption.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AvailableSelectionStrategyOption>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.AvailableSelectionStrategyOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AvailableSelectionStrategyOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED ? size + SelectionStrategy.ADAPTER.encodedSizeWithTag(2, value.getSelection_strategy()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AvailableSelectionStrategyOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelection_strategy());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AvailableSelectionStrategyOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelection_strategy());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AvailableSelectionStrategyOption decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SelectionStrategy selectionStrategyDecode = SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AvailableSelectionStrategyOption(strDecode, selectionStrategyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            selectionStrategyDecode = SelectionStrategy.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AvailableSelectionStrategyOption redact(AvailableSelectionStrategyOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AvailableSelectionStrategyOption.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
