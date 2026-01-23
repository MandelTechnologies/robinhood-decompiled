package deeplinks.money_movement.p453v1;

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
import deeplinks.money_movement.p453v1.SetUpExtraCashDeeplink;
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

/* compiled from: SetUpExtraCashDeeplink.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Ldeeplinks/money_movement/v1/SetUpExtraCashDeeplink;", "Lcom/squareup/wire/Message;", "", "entry_point", "Ldeeplinks/money_movement/v1/SetUpExtraCashDeeplink$EntryPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ldeeplinks/money_movement/v1/SetUpExtraCashDeeplink$EntryPoint;Lokio/ByteString;)V", "getEntry_point", "()Ldeeplinks/money_movement/v1/SetUpExtraCashDeeplink$EntryPoint;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EntryPoint", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SetUpExtraCashDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<SetUpExtraCashDeeplink> ADAPTER;

    @WireField(adapter = "deeplinks.money_movement.v1.SetUpExtraCashDeeplink$EntryPoint#ADAPTER", schemaIndex = 0, tag = 1)
    private final EntryPoint entry_point;

    /* JADX WARN: Multi-variable type inference failed */
    public SetUpExtraCashDeeplink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27955newBuilder();
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public /* synthetic */ SetUpExtraCashDeeplink(EntryPoint entryPoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : entryPoint, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUpExtraCashDeeplink(EntryPoint entryPoint, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point = entryPoint;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27955newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetUpExtraCashDeeplink)) {
            return false;
        }
        SetUpExtraCashDeeplink setUpExtraCashDeeplink = (SetUpExtraCashDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), setUpExtraCashDeeplink.unknownFields()) && this.entry_point == setUpExtraCashDeeplink.entry_point;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EntryPoint entryPoint = this.entry_point;
        int iHashCode2 = iHashCode + (entryPoint != null ? entryPoint.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetUpExtraCashDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SetUpExtraCashDeeplink copy$default(SetUpExtraCashDeeplink setUpExtraCashDeeplink, EntryPoint entryPoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = setUpExtraCashDeeplink.entry_point;
        }
        if ((i & 2) != 0) {
            byteString = setUpExtraCashDeeplink.unknownFields();
        }
        return setUpExtraCashDeeplink.copy(entryPoint, byteString);
    }

    public final SetUpExtraCashDeeplink copy(EntryPoint entry_point, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetUpExtraCashDeeplink(entry_point, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetUpExtraCashDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetUpExtraCashDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.money_movement.v1.SetUpExtraCashDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetUpExtraCashDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SetUpExtraCashDeeplink.EntryPoint.ADAPTER.encodedSizeWithTag(1, value.getEntry_point());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetUpExtraCashDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SetUpExtraCashDeeplink.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetUpExtraCashDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SetUpExtraCashDeeplink.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetUpExtraCashDeeplink redact(SetUpExtraCashDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SetUpExtraCashDeeplink.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetUpExtraCashDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SetUpExtraCashDeeplink.EntryPoint entryPointDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetUpExtraCashDeeplink(entryPointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            entryPointDecode = SetUpExtraCashDeeplink.EntryPoint.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetUpExtraCashDeeplink.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Ldeeplinks/money_movement/v1/SetUpExtraCashDeeplink$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "PROMO_CARD", "FEATURE_DISCOVERY", "Companion", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint FEATURE_DISCOVERY;
        public static final EntryPoint PROMO_CARD;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, PROMO_CARD, FEATURE_DISCOVERY};
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
            PROMO_CARD = new EntryPoint("PROMO_CARD", 1, 1);
            FEATURE_DISCOVERY = new EntryPoint("FEATURE_DISCOVERY", 2, 2);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: deeplinks.money_movement.v1.SetUpExtraCashDeeplink$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SetUpExtraCashDeeplink.EntryPoint fromValue(int value) {
                    return SetUpExtraCashDeeplink.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SetUpExtraCashDeeplink.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Ldeeplinks/money_movement/v1/SetUpExtraCashDeeplink$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Ldeeplinks/money_movement/v1/SetUpExtraCashDeeplink$EntryPoint;", "fromValue", "value", "", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return EntryPoint.PROMO_CARD;
                }
                if (value != 2) {
                    return null;
                }
                return EntryPoint.FEATURE_DISCOVERY;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
