package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData;
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

/* compiled from: PathfinderFallbackToWebViewEventData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;", "Lcom/squareup/wire/Message;", "", "page", "", "reason", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "inquiry_id", "sequence", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;Ljava/lang/String;ILokio/ByteString;)V", "getPage", "()Ljava/lang/String;", "getReason", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "getInquiry_id", "getSequence", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "Reason", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PathfinderFallbackToWebViewEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PathfinderFallbackToWebViewEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "inquiryId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String inquiry_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String page;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData$Reason#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Reason reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int sequence;

    public PathfinderFallbackToWebViewEventData() {
        this(null, null, null, 0, null, 31, null);
    }

    public /* synthetic */ PathfinderFallbackToWebViewEventData(String str, Reason reason, String str2, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? Reason.REASON_UNSPECIFIED : reason, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24460newBuilder();
    }

    public final String getPage() {
        return this.page;
    }

    public final Reason getReason() {
        return this.reason;
    }

    public final String getInquiry_id() {
        return this.inquiry_id;
    }

    public final int getSequence() {
        return this.sequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathfinderFallbackToWebViewEventData(String page, Reason reason, String inquiry_id, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.page = page;
        this.reason = reason;
        this.inquiry_id = inquiry_id;
        this.sequence = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24460newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PathfinderFallbackToWebViewEventData)) {
            return false;
        }
        PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData = (PathfinderFallbackToWebViewEventData) other;
        return Intrinsics.areEqual(unknownFields(), pathfinderFallbackToWebViewEventData.unknownFields()) && Intrinsics.areEqual(this.page, pathfinderFallbackToWebViewEventData.page) && this.reason == pathfinderFallbackToWebViewEventData.reason && Intrinsics.areEqual(this.inquiry_id, pathfinderFallbackToWebViewEventData.inquiry_id) && this.sequence == pathfinderFallbackToWebViewEventData.sequence;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.page.hashCode()) * 37) + this.reason.hashCode()) * 37) + this.inquiry_id.hashCode()) * 37) + Integer.hashCode(this.sequence);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("page=" + Internal.sanitize(this.page));
        arrayList.add("reason=" + this.reason);
        arrayList.add("inquiry_id=" + Internal.sanitize(this.inquiry_id));
        arrayList.add("sequence=" + this.sequence);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PathfinderFallbackToWebViewEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PathfinderFallbackToWebViewEventData copy$default(PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData, String str, Reason reason, String str2, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pathfinderFallbackToWebViewEventData.page;
        }
        if ((i2 & 2) != 0) {
            reason = pathfinderFallbackToWebViewEventData.reason;
        }
        if ((i2 & 4) != 0) {
            str2 = pathfinderFallbackToWebViewEventData.inquiry_id;
        }
        if ((i2 & 8) != 0) {
            i = pathfinderFallbackToWebViewEventData.sequence;
        }
        if ((i2 & 16) != 0) {
            byteString = pathfinderFallbackToWebViewEventData.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return pathfinderFallbackToWebViewEventData.copy(str, reason, str3, i, byteString2);
    }

    public final PathfinderFallbackToWebViewEventData copy(String page, Reason reason, String inquiry_id, int sequence, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PathfinderFallbackToWebViewEventData(page, reason, inquiry_id, sequence, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PathfinderFallbackToWebViewEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PathfinderFallbackToWebViewEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PathfinderFallbackToWebViewEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPage());
                }
                if (value.getReason() != PathfinderFallbackToWebViewEventData.Reason.REASON_UNSPECIFIED) {
                    size += PathfinderFallbackToWebViewEventData.Reason.ADAPTER.encodedSizeWithTag(2, value.getReason());
                }
                if (!Intrinsics.areEqual(value.getInquiry_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInquiry_id());
                }
                return value.getSequence() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getSequence())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PathfinderFallbackToWebViewEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPage());
                }
                if (value.getReason() != PathfinderFallbackToWebViewEventData.Reason.REASON_UNSPECIFIED) {
                    PathfinderFallbackToWebViewEventData.Reason.ADAPTER.encodeWithTag(writer, 2, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getInquiry_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInquiry_id());
                }
                if (value.getSequence() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getSequence()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PathfinderFallbackToWebViewEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSequence() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getSequence()));
                }
                if (!Intrinsics.areEqual(value.getInquiry_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInquiry_id());
                }
                if (value.getReason() != PathfinderFallbackToWebViewEventData.Reason.REASON_UNSPECIFIED) {
                    PathfinderFallbackToWebViewEventData.Reason.ADAPTER.encodeWithTag(writer, 2, (int) value.getReason());
                }
                if (Intrinsics.areEqual(value.getPage(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPage());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PathfinderFallbackToWebViewEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PathfinderFallbackToWebViewEventData.Reason reason = PathfinderFallbackToWebViewEventData.Reason.REASON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                PathfinderFallbackToWebViewEventData.Reason reasonDecode = reason;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PathfinderFallbackToWebViewEventData(strDecode2, reasonDecode, strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            reasonDecode = PathfinderFallbackToWebViewEventData.Reason.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PathfinderFallbackToWebViewEventData redact(PathfinderFallbackToWebViewEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PathfinderFallbackToWebViewEventData.copy$default(value, null, null, null, 0, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathfinderFallbackToWebViewEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "REASON_UNSPECIFIED", "PAGE_DOES_NOT_EXIST", "INCOMPATIBLE_CLIENT_VERSION", "DESERIALIZATION_ERROR", "DID_NOT_FALLBACK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Reason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Reason> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Reason DESERIALIZATION_ERROR;
        public static final Reason DID_NOT_FALLBACK;
        public static final Reason INCOMPATIBLE_CLIENT_VERSION;
        public static final Reason PAGE_DOES_NOT_EXIST;
        public static final Reason REASON_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{REASON_UNSPECIFIED, PAGE_DOES_NOT_EXIST, INCOMPATIBLE_CLIENT_VERSION, DESERIALIZATION_ERROR, DID_NOT_FALLBACK};
        }

        @JvmStatic
        public static final Reason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }

        private Reason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Reason reason = new Reason("REASON_UNSPECIFIED", 0, 0);
            REASON_UNSPECIFIED = reason;
            PAGE_DOES_NOT_EXIST = new Reason("PAGE_DOES_NOT_EXIST", 1, 1);
            INCOMPATIBLE_CLIENT_VERSION = new Reason("INCOMPATIBLE_CLIENT_VERSION", 2, 2);
            DESERIALIZATION_ERROR = new Reason("DESERIALIZATION_ERROR", 3, 3);
            DID_NOT_FALLBACK = new Reason("DID_NOT_FALLBACK", 4, 4);
            Reason[] reasonArr$values = $values();
            $VALUES = reasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(reasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Reason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Reason>(orCreateKotlinClass, syntax, reason) { // from class: com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData$Reason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PathfinderFallbackToWebViewEventData.Reason fromValue(int value) {
                    return PathfinderFallbackToWebViewEventData.Reason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PathfinderFallbackToWebViewEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Reason fromValue(int value) {
                if (value == 0) {
                    return Reason.REASON_UNSPECIFIED;
                }
                if (value == 1) {
                    return Reason.PAGE_DOES_NOT_EXIST;
                }
                if (value == 2) {
                    return Reason.INCOMPATIBLE_CLIENT_VERSION;
                }
                if (value == 3) {
                    return Reason.DESERIALIZATION_ERROR;
                }
                if (value != 4) {
                    return null;
                }
                return Reason.DID_NOT_FALLBACK;
            }
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }
}
