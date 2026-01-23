package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: TableInstrumentName.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016Jr\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentName;", "Lcom/squareup/wire/Message;", "", "name", "", "name_text_style", "Lrh_server_driven_ui/v1/TextStyle;", "name_color", "Lrh_server_driven_ui/v1/ThemedColor;", "symbol", "collapsed_symbol_text_override", "symbol_text_style", "symbol_color", "identifier", "state", "Lrh_server_driven_ui/v1/TableInstrumentNameState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyle;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyle;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Lrh_server_driven_ui/v1/TableInstrumentNameState;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getName_text_style", "()Lrh_server_driven_ui/v1/TextStyle;", "getName_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getSymbol", "getCollapsed_symbol_text_override", "getSymbol_text_style", "getSymbol_color", "getIdentifier", "getState", "()Lrh_server_driven_ui/v1/TableInstrumentNameState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TableInstrumentName extends Message {

    @JvmField
    public static final ProtoAdapter<TableInstrumentName> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "collapsedSymbolTextOverride", schemaIndex = 4, tag = 5)
    private final String collapsed_symbol_text_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "nameColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ThemedColor name_color;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", jsonName = "nameTextStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TextStyle name_text_style;

    @WireField(adapter = "rh_server_driven_ui.v1.TableInstrumentNameState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final TableInstrumentNameState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "symbolColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ThemedColor symbol_color;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", jsonName = "symbolTextStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final TextStyle symbol_text_style;

    public TableInstrumentName() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ TableInstrumentName(String str, TextStyle textStyle, ThemedColor themedColor, String str2, String str3, TextStyle textStyle2, ThemedColor themedColor2, String str4, TableInstrumentNameState tableInstrumentNameState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextStyle.TEXT_STYLE_UNSPECIFIED : textStyle, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? TextStyle.TEXT_STYLE_UNSPECIFIED : textStyle2, (i & 64) != 0 ? null : themedColor2, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : tableInstrumentNameState, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29827newBuilder();
    }

    public final String getName() {
        return this.name;
    }

    public final TextStyle getName_text_style() {
        return this.name_text_style;
    }

    public final ThemedColor getName_color() {
        return this.name_color;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getCollapsed_symbol_text_override() {
        return this.collapsed_symbol_text_override;
    }

    public final TextStyle getSymbol_text_style() {
        return this.symbol_text_style;
    }

    public final ThemedColor getSymbol_color() {
        return this.symbol_color;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final TableInstrumentNameState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableInstrumentName(String name, TextStyle name_text_style, ThemedColor themedColor, String symbol, String str, TextStyle symbol_text_style, ThemedColor themedColor2, String identifier, TableInstrumentNameState tableInstrumentNameState, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name_text_style, "name_text_style");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(symbol_text_style, "symbol_text_style");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.name_text_style = name_text_style;
        this.name_color = themedColor;
        this.symbol = symbol;
        this.collapsed_symbol_text_override = str;
        this.symbol_text_style = symbol_text_style;
        this.symbol_color = themedColor2;
        this.identifier = identifier;
        this.state = tableInstrumentNameState;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29827newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TableInstrumentName)) {
            return false;
        }
        TableInstrumentName tableInstrumentName = (TableInstrumentName) other;
        return Intrinsics.areEqual(unknownFields(), tableInstrumentName.unknownFields()) && Intrinsics.areEqual(this.name, tableInstrumentName.name) && this.name_text_style == tableInstrumentName.name_text_style && Intrinsics.areEqual(this.name_color, tableInstrumentName.name_color) && Intrinsics.areEqual(this.symbol, tableInstrumentName.symbol) && Intrinsics.areEqual(this.collapsed_symbol_text_override, tableInstrumentName.collapsed_symbol_text_override) && this.symbol_text_style == tableInstrumentName.symbol_text_style && Intrinsics.areEqual(this.symbol_color, tableInstrumentName.symbol_color) && Intrinsics.areEqual(this.identifier, tableInstrumentName.identifier) && Intrinsics.areEqual(this.state, tableInstrumentName.state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.name_text_style.hashCode()) * 37;
        ThemedColor themedColor = this.name_color;
        int iHashCode2 = (((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.symbol.hashCode()) * 37;
        String str = this.collapsed_symbol_text_override;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.symbol_text_style.hashCode()) * 37;
        ThemedColor themedColor2 = this.symbol_color;
        int iHashCode4 = (((iHashCode3 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + this.identifier.hashCode()) * 37;
        TableInstrumentNameState tableInstrumentNameState = this.state;
        int iHashCode5 = iHashCode4 + (tableInstrumentNameState != null ? tableInstrumentNameState.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("name_text_style=" + this.name_text_style);
        ThemedColor themedColor = this.name_color;
        if (themedColor != null) {
            arrayList.add("name_color=" + themedColor);
        }
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        String str = this.collapsed_symbol_text_override;
        if (str != null) {
            arrayList.add("collapsed_symbol_text_override=" + Internal.sanitize(str));
        }
        arrayList.add("symbol_text_style=" + this.symbol_text_style);
        ThemedColor themedColor2 = this.symbol_color;
        if (themedColor2 != null) {
            arrayList.add("symbol_color=" + themedColor2);
        }
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        TableInstrumentNameState tableInstrumentNameState = this.state;
        if (tableInstrumentNameState != null) {
            arrayList.add("state=" + tableInstrumentNameState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TableInstrumentName{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TableInstrumentName copy$default(TableInstrumentName tableInstrumentName, String str, TextStyle textStyle, ThemedColor themedColor, String str2, String str3, TextStyle textStyle2, ThemedColor themedColor2, String str4, TableInstrumentNameState tableInstrumentNameState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tableInstrumentName.name;
        }
        if ((i & 2) != 0) {
            textStyle = tableInstrumentName.name_text_style;
        }
        if ((i & 4) != 0) {
            themedColor = tableInstrumentName.name_color;
        }
        if ((i & 8) != 0) {
            str2 = tableInstrumentName.symbol;
        }
        if ((i & 16) != 0) {
            str3 = tableInstrumentName.collapsed_symbol_text_override;
        }
        if ((i & 32) != 0) {
            textStyle2 = tableInstrumentName.symbol_text_style;
        }
        if ((i & 64) != 0) {
            themedColor2 = tableInstrumentName.symbol_color;
        }
        if ((i & 128) != 0) {
            str4 = tableInstrumentName.identifier;
        }
        if ((i & 256) != 0) {
            tableInstrumentNameState = tableInstrumentName.state;
        }
        if ((i & 512) != 0) {
            byteString = tableInstrumentName.unknownFields();
        }
        TableInstrumentNameState tableInstrumentNameState2 = tableInstrumentNameState;
        ByteString byteString2 = byteString;
        ThemedColor themedColor3 = themedColor2;
        String str5 = str4;
        String str6 = str3;
        TextStyle textStyle3 = textStyle2;
        return tableInstrumentName.copy(str, textStyle, themedColor, str2, str6, textStyle3, themedColor3, str5, tableInstrumentNameState2, byteString2);
    }

    public final TableInstrumentName copy(String name, TextStyle name_text_style, ThemedColor name_color, String symbol, String collapsed_symbol_text_override, TextStyle symbol_text_style, ThemedColor symbol_color, String identifier, TableInstrumentNameState state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name_text_style, "name_text_style");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(symbol_text_style, "symbol_text_style");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TableInstrumentName(name, name_text_style, name_color, symbol, collapsed_symbol_text_override, symbol_text_style, symbol_color, identifier, state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TableInstrumentName.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TableInstrumentName>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TableInstrumentName$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TableInstrumentName value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                TextStyle name_text_style = value.getName_text_style();
                TextStyle textStyle = TextStyle.TEXT_STYLE_UNSPECIFIED;
                if (name_text_style != textStyle) {
                    size += TextStyle.ADAPTER.encodedSizeWithTag(2, value.getName_text_style());
                }
                if (value.getName_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(3, value.getName_color());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(5, value.getCollapsed_symbol_text_override());
                if (value.getSymbol_text_style() != textStyle) {
                    iEncodedSizeWithTag += TextStyle.ADAPTER.encodedSizeWithTag(6, value.getSymbol_text_style());
                }
                if (value.getSymbol_color() != null) {
                    iEncodedSizeWithTag += ThemedColor.ADAPTER.encodedSizeWithTag(7, value.getSymbol_color());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getIdentifier());
                }
                return value.getState() != null ? iEncodedSizeWithTag + TableInstrumentNameState.ADAPTER.encodedSizeWithTag(9, value.getState()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TableInstrumentName value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                TextStyle name_text_style = value.getName_text_style();
                TextStyle textStyle = TextStyle.TEXT_STYLE_UNSPECIFIED;
                if (name_text_style != textStyle) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getName_text_style());
                }
                if (value.getName_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getName_color());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCollapsed_symbol_text_override());
                if (value.getSymbol_text_style() != textStyle) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getSymbol_text_style());
                }
                if (value.getSymbol_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 7, (int) value.getSymbol_color());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getIdentifier());
                }
                if (value.getState() != null) {
                    TableInstrumentNameState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TableInstrumentName value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TableInstrumentNameState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getIdentifier());
                }
                if (value.getSymbol_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 7, (int) value.getSymbol_color());
                }
                TextStyle symbol_text_style = value.getSymbol_text_style();
                TextStyle textStyle = TextStyle.TEXT_STYLE_UNSPECIFIED;
                if (symbol_text_style != textStyle) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getSymbol_text_style());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCollapsed_symbol_text_override());
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (value.getName_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getName_color());
                }
                if (value.getName_text_style() != textStyle) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getName_text_style());
                }
                if (Intrinsics.areEqual(value.getName(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getName());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TableInstrumentName decode(ProtoReader reader) throws IOException {
                TextStyle textStyle;
                TextStyle textStyle2;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                TextStyle textStyle3 = TextStyle.TEXT_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                ThemedColor themedColorDecode = null;
                String strDecode4 = null;
                ThemedColor themedColorDecode2 = null;
                TableInstrumentNameState tableInstrumentNameStateDecode = null;
                TextStyle textStyleDecode = textStyle3;
                TextStyle textStyleDecode2 = textStyleDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                textStyle = textStyleDecode;
                                textStyle2 = textStyleDecode2;
                                try {
                                    textStyleDecode = TextStyle.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                textStyleDecode2 = textStyle2;
                                break;
                            case 3:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                try {
                                    textStyleDecode2 = TextStyle.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    textStyle = textStyleDecode;
                                    textStyle2 = textStyleDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                tableInstrumentNameStateDecode = TableInstrumentNameState.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                textStyle = textStyleDecode;
                                textStyle2 = textStyleDecode2;
                                str = strDecode;
                                strDecode = str;
                                textStyleDecode = textStyle;
                                textStyleDecode2 = textStyle2;
                                break;
                        }
                    } else {
                        return new TableInstrumentName(strDecode, textStyleDecode, themedColorDecode, strDecode2, strDecode4, textStyleDecode2, themedColorDecode2, strDecode3, tableInstrumentNameStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TableInstrumentName redact(TableInstrumentName value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor name_color = value.getName_color();
                ThemedColor themedColorRedact = name_color != null ? ThemedColor.ADAPTER.redact(name_color) : null;
                ThemedColor symbol_color = value.getSymbol_color();
                ThemedColor themedColorRedact2 = symbol_color != null ? ThemedColor.ADAPTER.redact(symbol_color) : null;
                TableInstrumentNameState state = value.getState();
                return TableInstrumentName.copy$default(value, null, null, themedColorRedact, null, null, null, themedColorRedact2, null, state != null ? TableInstrumentNameState.ADAPTER.redact(state) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, null);
            }
        };
    }
}
