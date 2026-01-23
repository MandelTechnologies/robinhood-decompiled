package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.TableInstrumentNameStateDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: TableInstrumentNameDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bk\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019¨\u00060"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TableInstrumentName;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate;)V", "", "name", "Lrh_server_driven_ui/v1/TextStyleDto;", "name_text_style", "Lrh_server_driven_ui/v1/ThemedColorDto;", "name_color", "symbol", "collapsed_symbol_text_override", "symbol_text_style", "symbol_color", "identifier", "Lrh_server_driven_ui/v1/TableInstrumentNameStateDto;", "state", "(Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Lrh_server_driven_ui/v1/TableInstrumentNameStateDto;)V", "toProto", "()Lrh_server_driven_ui/v1/TableInstrumentName;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate;", "getName", "getSymbol", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class TableInstrumentNameDto implements Dto3<TableInstrumentName>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TableInstrumentNameDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TableInstrumentNameDto, TableInstrumentName>> binaryBase64Serializer$delegate;
    private static final TableInstrumentNameDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TableInstrumentNameDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TableInstrumentNameDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public /* synthetic */ TableInstrumentNameDto(String str, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, String str2, String str3, TextStyleDto textStyleDto2, ThemedColorDto themedColorDto2, String str4, TableInstrumentNameStateDto tableInstrumentNameStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto2, (i & 64) != 0 ? null : themedColorDto2, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : tableInstrumentNameStateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableInstrumentNameDto(String name, TextStyleDto name_text_style, ThemedColorDto themedColorDto, String symbol, String str, TextStyleDto symbol_text_style, ThemedColorDto themedColorDto2, String identifier, TableInstrumentNameStateDto tableInstrumentNameStateDto) {
        this(new Surrogate(name, name_text_style, themedColorDto, symbol, str, symbol_text_style, themedColorDto2, identifier, tableInstrumentNameStateDto));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name_text_style, "name_text_style");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(symbol_text_style, "symbol_text_style");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TableInstrumentName toProto() {
        String name = this.surrogate.getName();
        TextStyle textStyle = (TextStyle) this.surrogate.getName_text_style().toProto();
        ThemedColorDto name_color = this.surrogate.getName_color();
        ThemedColor proto = name_color != null ? name_color.toProto() : null;
        String symbol = this.surrogate.getSymbol();
        String collapsed_symbol_text_override = this.surrogate.getCollapsed_symbol_text_override();
        TextStyle textStyle2 = (TextStyle) this.surrogate.getSymbol_text_style().toProto();
        ThemedColorDto symbol_color = this.surrogate.getSymbol_color();
        ThemedColor proto2 = symbol_color != null ? symbol_color.toProto() : null;
        String identifier = this.surrogate.getIdentifier();
        TableInstrumentNameStateDto state = this.surrogate.getState();
        return new TableInstrumentName(name, textStyle, proto, symbol, collapsed_symbol_text_override, textStyle2, proto2, identifier, state != null ? state.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[TableInstrumentNameDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TableInstrumentNameDto) && Intrinsics.areEqual(((TableInstrumentNameDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TableInstrumentNameDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BABi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bu\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b4\u0010*\u001a\u0004\b3\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010 R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010-R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b:\u0010*\u001a\u0004\b9\u00101R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010'\u0012\u0004\b<\u0010*\u001a\u0004\b;\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u0010*\u001a\u0004\b>\u0010?¨\u0006C"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate;", "", "", "name", "Lrh_server_driven_ui/v1/TextStyleDto;", "name_text_style", "Lrh_server_driven_ui/v1/ThemedColorDto;", "name_color", "symbol", "collapsed_symbol_text_override", "symbol_text_style", "symbol_color", "identifier", "Lrh_server_driven_ui/v1/TableInstrumentNameStateDto;", "state", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Lrh_server_driven_ui/v1/TableInstrumentNameStateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Lrh_server_driven_ui/v1/TableInstrumentNameStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "Lrh_server_driven_ui/v1/TextStyleDto;", "getName_text_style", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getName_text_style$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getName_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getName_color$annotations", "getSymbol", "getSymbol$annotations", "getCollapsed_symbol_text_override", "getCollapsed_symbol_text_override$annotations", "getSymbol_text_style", "getSymbol_text_style$annotations", "getSymbol_color", "getSymbol_color$annotations", "getIdentifier", "getIdentifier$annotations", "Lrh_server_driven_ui/v1/TableInstrumentNameStateDto;", "getState", "()Lrh_server_driven_ui/v1/TableInstrumentNameStateDto;", "getState$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String collapsed_symbol_text_override;
        private final String identifier;
        private final String name;
        private final ThemedColorDto name_color;
        private final TextStyleDto name_text_style;
        private final TableInstrumentNameStateDto state;
        private final String symbol;
        private final ThemedColorDto symbol_color;
        private final TextStyleDto symbol_text_style;

        public Surrogate() {
            this((String) null, (TextStyleDto) null, (ThemedColorDto) null, (String) null, (String) null, (TextStyleDto) null, (ThemedColorDto) null, (String) null, (TableInstrumentNameStateDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.name, surrogate.name) && this.name_text_style == surrogate.name_text_style && Intrinsics.areEqual(this.name_color, surrogate.name_color) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.collapsed_symbol_text_override, surrogate.collapsed_symbol_text_override) && this.symbol_text_style == surrogate.symbol_text_style && Intrinsics.areEqual(this.symbol_color, surrogate.symbol_color) && Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.state, surrogate.state);
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.name_text_style.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.name_color;
            int iHashCode2 = (((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + this.symbol.hashCode()) * 31;
            String str = this.collapsed_symbol_text_override;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.symbol_text_style.hashCode()) * 31;
            ThemedColorDto themedColorDto2 = this.symbol_color;
            int iHashCode4 = (((iHashCode3 + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31) + this.identifier.hashCode()) * 31;
            TableInstrumentNameStateDto tableInstrumentNameStateDto = this.state;
            return iHashCode4 + (tableInstrumentNameStateDto != null ? tableInstrumentNameStateDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(name=" + this.name + ", name_text_style=" + this.name_text_style + ", name_color=" + this.name_color + ", symbol=" + this.symbol + ", collapsed_symbol_text_override=" + this.collapsed_symbol_text_override + ", symbol_text_style=" + this.symbol_text_style + ", symbol_color=" + this.symbol_color + ", identifier=" + this.identifier + ", state=" + this.state + ")";
        }

        /* compiled from: TableInstrumentNameDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TableInstrumentNameDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, String str2, String str3, TextStyleDto textStyleDto2, ThemedColorDto themedColorDto2, String str4, TableInstrumentNameStateDto tableInstrumentNameStateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.name = "";
            } else {
                this.name = str;
            }
            if ((i & 2) == 0) {
                this.name_text_style = TextStyleDto.INSTANCE.getZeroValue();
            } else {
                this.name_text_style = textStyleDto;
            }
            if ((i & 4) == 0) {
                this.name_color = null;
            } else {
                this.name_color = themedColorDto;
            }
            if ((i & 8) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 16) == 0) {
                this.collapsed_symbol_text_override = null;
            } else {
                this.collapsed_symbol_text_override = str3;
            }
            if ((i & 32) == 0) {
                this.symbol_text_style = TextStyleDto.INSTANCE.getZeroValue();
            } else {
                this.symbol_text_style = textStyleDto2;
            }
            if ((i & 64) == 0) {
                this.symbol_color = null;
            } else {
                this.symbol_color = themedColorDto2;
            }
            if ((i & 128) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str4;
            }
            if ((i & 256) == 0) {
                this.state = null;
            } else {
                this.state = tableInstrumentNameStateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 0, self.name);
            }
            TextStyleDto textStyleDto = self.name_text_style;
            TextStyleDto.Companion companion = TextStyleDto.INSTANCE;
            if (textStyleDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TextStyleDto.Serializer.INSTANCE, self.name_text_style);
            }
            ThemedColorDto themedColorDto = self.name_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 3, self.symbol);
            }
            String str = self.collapsed_symbol_text_override;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            if (self.symbol_text_style != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TextStyleDto.Serializer.INSTANCE, self.symbol_text_style);
            }
            ThemedColorDto themedColorDto2 = self.symbol_color;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 7, self.identifier);
            }
            TableInstrumentNameStateDto tableInstrumentNameStateDto = self.state;
            if (tableInstrumentNameStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, TableInstrumentNameStateDto.Serializer.INSTANCE, tableInstrumentNameStateDto);
            }
        }

        public Surrogate(String name, TextStyleDto name_text_style, ThemedColorDto themedColorDto, String symbol, String str, TextStyleDto symbol_text_style, ThemedColorDto themedColorDto2, String identifier, TableInstrumentNameStateDto tableInstrumentNameStateDto) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(name_text_style, "name_text_style");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(symbol_text_style, "symbol_text_style");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.name = name;
            this.name_text_style = name_text_style;
            this.name_color = themedColorDto;
            this.symbol = symbol;
            this.collapsed_symbol_text_override = str;
            this.symbol_text_style = symbol_text_style;
            this.symbol_color = themedColorDto2;
            this.identifier = identifier;
            this.state = tableInstrumentNameStateDto;
        }

        public /* synthetic */ Surrogate(String str, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, String str2, String str3, TextStyleDto textStyleDto2, ThemedColorDto themedColorDto2, String str4, TableInstrumentNameStateDto tableInstrumentNameStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto2, (i & 64) != 0 ? null : themedColorDto2, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : tableInstrumentNameStateDto);
        }

        public final String getName() {
            return this.name;
        }

        public final TextStyleDto getName_text_style() {
            return this.name_text_style;
        }

        public final ThemedColorDto getName_color() {
            return this.name_color;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getCollapsed_symbol_text_override() {
            return this.collapsed_symbol_text_override;
        }

        public final TextStyleDto getSymbol_text_style() {
            return this.symbol_text_style;
        }

        public final ThemedColorDto getSymbol_color() {
            return this.symbol_color;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final TableInstrumentNameStateDto getState() {
            return this.state;
        }
    }

    /* compiled from: TableInstrumentNameDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentNameDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "Lrh_server_driven_ui/v1/TableInstrumentName;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TableInstrumentNameDto, TableInstrumentName> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TableInstrumentNameDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TableInstrumentNameDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TableInstrumentNameDto> getBinaryBase64Serializer() {
            return (KSerializer) TableInstrumentNameDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TableInstrumentName> getProtoAdapter() {
            return TableInstrumentName.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TableInstrumentNameDto getZeroValue() {
            return TableInstrumentNameDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TableInstrumentNameDto fromProto(TableInstrumentName proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String name = proto.getName();
            TextStyleDto.Companion companion = TextStyleDto.INSTANCE;
            TextStyleDto textStyleDtoFromProto = companion.fromProto(proto.getName_text_style());
            ThemedColor name_color = proto.getName_color();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = name_color != null ? ThemedColorDto.INSTANCE.fromProto(name_color) : null;
            String symbol = proto.getSymbol();
            String collapsed_symbol_text_override = proto.getCollapsed_symbol_text_override();
            TextStyleDto textStyleDtoFromProto2 = companion.fromProto(proto.getSymbol_text_style());
            ThemedColor symbol_color = proto.getSymbol_color();
            ThemedColorDto themedColorDtoFromProto2 = symbol_color != null ? ThemedColorDto.INSTANCE.fromProto(symbol_color) : null;
            String identifier = proto.getIdentifier();
            TableInstrumentNameState state = proto.getState();
            return new TableInstrumentNameDto(new Surrogate(name, textStyleDtoFromProto, themedColorDtoFromProto, symbol, collapsed_symbol_text_override, textStyleDtoFromProto2, themedColorDtoFromProto2, identifier, state != null ? TableInstrumentNameStateDto.INSTANCE.fromProto(state) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TableInstrumentNameDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TableInstrumentNameDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TableInstrumentNameDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TableInstrumentNameDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentNameDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TableInstrumentNameDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TableInstrumentNameDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TableInstrumentName", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TableInstrumentNameDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TableInstrumentNameDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TableInstrumentNameDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TableInstrumentNameDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableInstrumentNameDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TableInstrumentNameDto";
        }
    }
}
