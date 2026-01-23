package equity_order_summary.proto.p459v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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
import p479j$.time.Instant;

/* compiled from: MarketHours.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Bc\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJi\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u0004\u0010\u001eR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\"\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010!R\"\u0010\n\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006&"}, m3636d2 = {"Lequity_order_summary/proto/v1/MarketHours;", "Lcom/squareup/wire/Message;", "", "", "is_open", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "extended_hours_opens_at", "extended_hours_closes_at", "regular_hours_closes_at", "regular_hours_opens_at", "Lokio/ByteString;", "unknownFields", "<init>", "(ZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(ZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lequity_order_summary/proto/v1/MarketHours;", "Z", "()Z", "Lj$/time/Instant;", "getExtended_hours_opens_at", "()Lj$/time/Instant;", "getExtended_hours_closes_at", "getRegular_hours_closes_at", "getRegular_hours_opens_at", "Companion", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MarketHours extends Message {

    @JvmField
    public static final ProtoAdapter<MarketHours> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "extendedHoursClosesAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant extended_hours_closes_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "extendedHoursOpensAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant extended_hours_opens_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOpen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_open;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "regularHoursClosesAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant regular_hours_closes_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "regularHoursOpensAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant regular_hours_opens_at;

    public MarketHours() {
        this(false, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28020newBuilder();
    }

    /* renamed from: is_open, reason: from getter */
    public final boolean getIs_open() {
        return this.is_open;
    }

    public final Instant getExtended_hours_opens_at() {
        return this.extended_hours_opens_at;
    }

    public final Instant getExtended_hours_closes_at() {
        return this.extended_hours_closes_at;
    }

    public final Instant getRegular_hours_closes_at() {
        return this.regular_hours_closes_at;
    }

    public final Instant getRegular_hours_opens_at() {
        return this.regular_hours_opens_at;
    }

    public /* synthetic */ MarketHours(boolean z, Instant instant, Instant instant2, Instant instant3, Instant instant4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? null : instant3, (i & 16) != 0 ? null : instant4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHours(boolean z, Instant instant, Instant instant2, Instant instant3, Instant instant4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_open = z;
        this.extended_hours_opens_at = instant;
        this.extended_hours_closes_at = instant2;
        this.regular_hours_closes_at = instant3;
        this.regular_hours_opens_at = instant4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28020newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarketHours)) {
            return false;
        }
        MarketHours marketHours = (MarketHours) other;
        return Intrinsics.areEqual(unknownFields(), marketHours.unknownFields()) && this.is_open == marketHours.is_open && Intrinsics.areEqual(this.extended_hours_opens_at, marketHours.extended_hours_opens_at) && Intrinsics.areEqual(this.extended_hours_closes_at, marketHours.extended_hours_closes_at) && Intrinsics.areEqual(this.regular_hours_closes_at, marketHours.regular_hours_closes_at) && Intrinsics.areEqual(this.regular_hours_opens_at, marketHours.regular_hours_opens_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_open)) * 37;
        Instant instant = this.extended_hours_opens_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.extended_hours_closes_at;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.regular_hours_closes_at;
        int iHashCode4 = (iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Instant instant4 = this.regular_hours_opens_at;
        int iHashCode5 = iHashCode4 + (instant4 != null ? instant4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_open=" + this.is_open);
        Instant instant = this.extended_hours_opens_at;
        if (instant != null) {
            arrayList.add("extended_hours_opens_at=" + instant);
        }
        Instant instant2 = this.extended_hours_closes_at;
        if (instant2 != null) {
            arrayList.add("extended_hours_closes_at=" + instant2);
        }
        Instant instant3 = this.regular_hours_closes_at;
        if (instant3 != null) {
            arrayList.add("regular_hours_closes_at=" + instant3);
        }
        Instant instant4 = this.regular_hours_opens_at;
        if (instant4 != null) {
            arrayList.add("regular_hours_opens_at=" + instant4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketHours{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarketHours copy$default(MarketHours marketHours, boolean z, Instant instant, Instant instant2, Instant instant3, Instant instant4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = marketHours.is_open;
        }
        if ((i & 2) != 0) {
            instant = marketHours.extended_hours_opens_at;
        }
        if ((i & 4) != 0) {
            instant2 = marketHours.extended_hours_closes_at;
        }
        if ((i & 8) != 0) {
            instant3 = marketHours.regular_hours_closes_at;
        }
        if ((i & 16) != 0) {
            instant4 = marketHours.regular_hours_opens_at;
        }
        if ((i & 32) != 0) {
            byteString = marketHours.unknownFields();
        }
        Instant instant5 = instant4;
        ByteString byteString2 = byteString;
        return marketHours.copy(z, instant, instant2, instant3, instant5, byteString2);
    }

    public final MarketHours copy(boolean is_open, Instant extended_hours_opens_at, Instant extended_hours_closes_at, Instant regular_hours_closes_at, Instant regular_hours_opens_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarketHours(is_open, extended_hours_opens_at, extended_hours_closes_at, regular_hours_closes_at, regular_hours_opens_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarketHours.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarketHours>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_order_summary.proto.v1.MarketHours$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarketHours value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_open()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_open()));
                }
                if (value.getExtended_hours_opens_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getExtended_hours_opens_at());
                }
                if (value.getExtended_hours_closes_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getExtended_hours_closes_at());
                }
                if (value.getRegular_hours_closes_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getRegular_hours_closes_at());
                }
                return value.getRegular_hours_opens_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getRegular_hours_opens_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarketHours value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_open()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_open()));
                }
                if (value.getExtended_hours_opens_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getExtended_hours_opens_at());
                }
                if (value.getExtended_hours_closes_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getExtended_hours_closes_at());
                }
                if (value.getRegular_hours_closes_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getRegular_hours_closes_at());
                }
                if (value.getRegular_hours_opens_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getRegular_hours_opens_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarketHours value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRegular_hours_opens_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getRegular_hours_opens_at());
                }
                if (value.getRegular_hours_closes_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getRegular_hours_closes_at());
                }
                if (value.getExtended_hours_closes_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getExtended_hours_closes_at());
                }
                if (value.getExtended_hours_opens_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getExtended_hours_opens_at());
                }
                if (value.getIs_open()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_open()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarketHours redact(MarketHours value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant extended_hours_opens_at = value.getExtended_hours_opens_at();
                Instant instantRedact = extended_hours_opens_at != null ? ProtoAdapter.INSTANT.redact(extended_hours_opens_at) : null;
                Instant extended_hours_closes_at = value.getExtended_hours_closes_at();
                Instant instantRedact2 = extended_hours_closes_at != null ? ProtoAdapter.INSTANT.redact(extended_hours_closes_at) : null;
                Instant regular_hours_closes_at = value.getRegular_hours_closes_at();
                Instant instantRedact3 = regular_hours_closes_at != null ? ProtoAdapter.INSTANT.redact(regular_hours_closes_at) : null;
                Instant regular_hours_opens_at = value.getRegular_hours_opens_at();
                return MarketHours.copy$default(value, false, instantRedact, instantRedact2, instantRedact3, regular_hours_opens_at != null ? ProtoAdapter.INSTANT.redact(regular_hours_opens_at) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarketHours decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                Instant instantDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarketHours(zBooleanValue, instantDecode, instantDecode2, instantDecode3, instantDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 5) {
                        instantDecode4 = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
