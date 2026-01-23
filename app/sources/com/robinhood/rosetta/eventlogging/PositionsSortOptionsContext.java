package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
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

/* compiled from: PositionsSortOptionsContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext;", "Lcom/squareup/wire/Message;", "", "sort_query", "", "sort_direction", "Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;Lokio/ByteString;)V", "getSort_query", "()Ljava/lang/String;", "getSort_direction", "()Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "SortDirection", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PositionsSortOptionsContext extends Message {

    @JvmField
    public static final ProtoAdapter<PositionsSortOptionsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext$SortDirection#ADAPTER", jsonName = "sortDirection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SortDirection sort_direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortQuery", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String sort_query;

    public PositionsSortOptionsContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24507newBuilder();
    }

    public final String getSort_query() {
        return this.sort_query;
    }

    public /* synthetic */ PositionsSortOptionsContext(String str, SortDirection sortDirection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SortDirection.UNSPECIFIED : sortDirection, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final SortDirection getSort_direction() {
        return this.sort_direction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsSortOptionsContext(String sort_query, SortDirection sort_direction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sort_query, "sort_query");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.sort_query = sort_query;
        this.sort_direction = sort_direction;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24507newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PositionsSortOptionsContext)) {
            return false;
        }
        PositionsSortOptionsContext positionsSortOptionsContext = (PositionsSortOptionsContext) other;
        return Intrinsics.areEqual(unknownFields(), positionsSortOptionsContext.unknownFields()) && Intrinsics.areEqual(this.sort_query, positionsSortOptionsContext.sort_query) && this.sort_direction == positionsSortOptionsContext.sort_direction;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sort_query.hashCode()) * 37) + this.sort_direction.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sort_query=" + Internal.sanitize(this.sort_query));
        arrayList.add("sort_direction=" + this.sort_direction);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PositionsSortOptionsContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PositionsSortOptionsContext copy$default(PositionsSortOptionsContext positionsSortOptionsContext, String str, SortDirection sortDirection, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionsSortOptionsContext.sort_query;
        }
        if ((i & 2) != 0) {
            sortDirection = positionsSortOptionsContext.sort_direction;
        }
        if ((i & 4) != 0) {
            byteString = positionsSortOptionsContext.unknownFields();
        }
        return positionsSortOptionsContext.copy(str, sortDirection, byteString);
    }

    public final PositionsSortOptionsContext copy(String sort_query, SortDirection sort_direction, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sort_query, "sort_query");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PositionsSortOptionsContext(sort_query, sort_direction, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionsSortOptionsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PositionsSortOptionsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PositionsSortOptionsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSort_query(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSort_query());
                }
                return value.getSort_direction() != PositionsSortOptionsContext.SortDirection.UNSPECIFIED ? size + PositionsSortOptionsContext.SortDirection.ADAPTER.encodedSizeWithTag(2, value.getSort_direction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PositionsSortOptionsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSort_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSort_query());
                }
                if (value.getSort_direction() != PositionsSortOptionsContext.SortDirection.UNSPECIFIED) {
                    PositionsSortOptionsContext.SortDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PositionsSortOptionsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSort_direction() != PositionsSortOptionsContext.SortDirection.UNSPECIFIED) {
                    PositionsSortOptionsContext.SortDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                if (Intrinsics.areEqual(value.getSort_query(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSort_query());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PositionsSortOptionsContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PositionsSortOptionsContext.SortDirection sortDirectionDecode = PositionsSortOptionsContext.SortDirection.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PositionsSortOptionsContext(strDecode, sortDirectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            sortDirectionDecode = PositionsSortOptionsContext.SortDirection.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PositionsSortOptionsContext redact(PositionsSortOptionsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PositionsSortOptionsContext.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PositionsSortOptionsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "ASC", "DSC", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SortDirection implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SortDirection[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SortDirection> ADAPTER;
        public static final SortDirection ASC;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SortDirection DSC;
        public static final SortDirection UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ SortDirection[] $values() {
            return new SortDirection[]{UNSPECIFIED, ASC, DSC};
        }

        @JvmStatic
        public static final SortDirection fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SortDirection> getEntries() {
            return $ENTRIES;
        }

        private SortDirection(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SortDirection sortDirection = new SortDirection(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = sortDirection;
            ASC = new SortDirection("ASC", 1, 1);
            DSC = new SortDirection("DSC", 2, 2);
            SortDirection[] sortDirectionArr$values = $values();
            $VALUES = sortDirectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sortDirectionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SortDirection.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SortDirection>(orCreateKotlinClass, syntax, sortDirection) { // from class: com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext$SortDirection$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PositionsSortOptionsContext.SortDirection fromValue(int value) {
                    return PositionsSortOptionsContext.SortDirection.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PositionsSortOptionsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SortDirection fromValue(int value) {
                if (value == 0) {
                    return SortDirection.UNSPECIFIED;
                }
                if (value == 1) {
                    return SortDirection.ASC;
                }
                if (value != 2) {
                    return null;
                }
                return SortDirection.DSC;
            }
        }

        public static SortDirection valueOf(String str) {
            return (SortDirection) Enum.valueOf(SortDirection.class, str);
        }

        public static SortDirection[] values() {
            return (SortDirection[]) $VALUES.clone();
        }
    }
}
