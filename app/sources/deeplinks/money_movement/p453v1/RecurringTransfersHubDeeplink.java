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
import deeplinks.money_movement.p453v1.RecurringTransfersHubDeeplink;
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

/* compiled from: RecurringTransfersHubDeeplink.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink;", "Lcom/squareup/wire/Message;", "", "entry_point", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;Lokio/ByteString;)V", "getEntry_point", "()Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EntryPoint", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RecurringTransfersHubDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<RecurringTransfersHubDeeplink> ADAPTER;

    @WireField(adapter = "deeplinks.money_movement.v1.RecurringTransfersHubDeeplink$EntryPoint#ADAPTER", schemaIndex = 0, tag = 1)
    private final EntryPoint entry_point;

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringTransfersHubDeeplink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27954newBuilder();
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public /* synthetic */ RecurringTransfersHubDeeplink(EntryPoint entryPoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : entryPoint, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringTransfersHubDeeplink(EntryPoint entryPoint, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point = entryPoint;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27954newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RecurringTransfersHubDeeplink)) {
            return false;
        }
        RecurringTransfersHubDeeplink recurringTransfersHubDeeplink = (RecurringTransfersHubDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), recurringTransfersHubDeeplink.unknownFields()) && this.entry_point == recurringTransfersHubDeeplink.entry_point;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringTransfersHubDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RecurringTransfersHubDeeplink copy$default(RecurringTransfersHubDeeplink recurringTransfersHubDeeplink, EntryPoint entryPoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = recurringTransfersHubDeeplink.entry_point;
        }
        if ((i & 2) != 0) {
            byteString = recurringTransfersHubDeeplink.unknownFields();
        }
        return recurringTransfersHubDeeplink.copy(entryPoint, byteString);
    }

    public final RecurringTransfersHubDeeplink copy(EntryPoint entry_point, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RecurringTransfersHubDeeplink(entry_point, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecurringTransfersHubDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RecurringTransfersHubDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.money_movement.v1.RecurringTransfersHubDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RecurringTransfersHubDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + RecurringTransfersHubDeeplink.EntryPoint.ADAPTER.encodedSizeWithTag(1, value.getEntry_point());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RecurringTransfersHubDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                RecurringTransfersHubDeeplink.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RecurringTransfersHubDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RecurringTransfersHubDeeplink.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecurringTransfersHubDeeplink redact(RecurringTransfersHubDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RecurringTransfersHubDeeplink.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RecurringTransfersHubDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                RecurringTransfersHubDeeplink.EntryPoint entryPointDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RecurringTransfersHubDeeplink(entryPointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            entryPointDecode = RecurringTransfersHubDeeplink.EntryPoint.ADAPTER.decode(reader);
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
    /* compiled from: RecurringTransfersHubDeeplink.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "EMAIL", "INBOX", "PUSH_NOTIFICATION", "EMAIL_EXTRA_CASH_CREATED", "EMAIL_EXTRA_CASH_CANCELLED", "EMAIL_EXTRA_CASH_PAUSED", "PUSH_NOTIFICATION_EXTRA_CASH_CREATED", "INBOX_EXTRA_CASH_CREATED", "EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "EMAIL_EXTRA_CASH_SCHEDULED", "PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED", "INBOX_EXTRA_CASH_SCHEDULED", "EMAIL_EXTRA_CASH_FAILED", "Companion", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint EMAIL;
        public static final EntryPoint EMAIL_EXTRA_CASH_CANCELLED;
        public static final EntryPoint EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
        public static final EntryPoint EMAIL_EXTRA_CASH_CREATED;
        public static final EntryPoint EMAIL_EXTRA_CASH_FAILED;
        public static final EntryPoint EMAIL_EXTRA_CASH_PAUSED;
        public static final EntryPoint EMAIL_EXTRA_CASH_SCHEDULED;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint INBOX;
        public static final EntryPoint INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
        public static final EntryPoint INBOX_EXTRA_CASH_CREATED;
        public static final EntryPoint INBOX_EXTRA_CASH_SCHEDULED;
        public static final EntryPoint PUSH_NOTIFICATION;
        public static final EntryPoint PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
        public static final EntryPoint PUSH_NOTIFICATION_EXTRA_CASH_CREATED;
        public static final EntryPoint PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, EMAIL, INBOX, PUSH_NOTIFICATION, EMAIL_EXTRA_CASH_CREATED, EMAIL_EXTRA_CASH_CANCELLED, EMAIL_EXTRA_CASH_PAUSED, PUSH_NOTIFICATION_EXTRA_CASH_CREATED, INBOX_EXTRA_CASH_CREATED, EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE, PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE, INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE, EMAIL_EXTRA_CASH_SCHEDULED, PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED, INBOX_EXTRA_CASH_SCHEDULED, EMAIL_EXTRA_CASH_FAILED};
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
            EMAIL = new EntryPoint("EMAIL", 1, 1);
            INBOX = new EntryPoint("INBOX", 2, 2);
            PUSH_NOTIFICATION = new EntryPoint("PUSH_NOTIFICATION", 3, 3);
            EMAIL_EXTRA_CASH_CREATED = new EntryPoint("EMAIL_EXTRA_CASH_CREATED", 4, 4);
            EMAIL_EXTRA_CASH_CANCELLED = new EntryPoint("EMAIL_EXTRA_CASH_CANCELLED", 5, 5);
            EMAIL_EXTRA_CASH_PAUSED = new EntryPoint("EMAIL_EXTRA_CASH_PAUSED", 6, 6);
            PUSH_NOTIFICATION_EXTRA_CASH_CREATED = new EntryPoint("PUSH_NOTIFICATION_EXTRA_CASH_CREATED", 7, 7);
            INBOX_EXTRA_CASH_CREATED = new EntryPoint("INBOX_EXTRA_CASH_CREATED", 8, 8);
            EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE = new EntryPoint("EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", 9, 9);
            PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE = new EntryPoint("PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", 10, 10);
            INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE = new EntryPoint("INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", 11, 11);
            EMAIL_EXTRA_CASH_SCHEDULED = new EntryPoint("EMAIL_EXTRA_CASH_SCHEDULED", 12, 12);
            PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED = new EntryPoint("PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED", 13, 13);
            INBOX_EXTRA_CASH_SCHEDULED = new EntryPoint("INBOX_EXTRA_CASH_SCHEDULED", 14, 14);
            EMAIL_EXTRA_CASH_FAILED = new EntryPoint("EMAIL_EXTRA_CASH_FAILED", 15, 15);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: deeplinks.money_movement.v1.RecurringTransfersHubDeeplink$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecurringTransfersHubDeeplink.EntryPoint fromValue(int value) {
                    return RecurringTransfersHubDeeplink.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecurringTransfersHubDeeplink.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "fromValue", "value", "", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                switch (value) {
                    case 0:
                        return EntryPoint.ENTRY_POINT_UNSPECIFIED;
                    case 1:
                        return EntryPoint.EMAIL;
                    case 2:
                        return EntryPoint.INBOX;
                    case 3:
                        return EntryPoint.PUSH_NOTIFICATION;
                    case 4:
                        return EntryPoint.EMAIL_EXTRA_CASH_CREATED;
                    case 5:
                        return EntryPoint.EMAIL_EXTRA_CASH_CANCELLED;
                    case 6:
                        return EntryPoint.EMAIL_EXTRA_CASH_PAUSED;
                    case 7:
                        return EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_CREATED;
                    case 8:
                        return EntryPoint.INBOX_EXTRA_CASH_CREATED;
                    case 9:
                        return EntryPoint.EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
                    case 10:
                        return EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
                    case 11:
                        return EntryPoint.INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
                    case 12:
                        return EntryPoint.EMAIL_EXTRA_CASH_SCHEDULED;
                    case 13:
                        return EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED;
                    case 14:
                        return EntryPoint.INBOX_EXTRA_CASH_SCHEDULED;
                    case 15:
                        return EntryPoint.EMAIL_EXTRA_CASH_FAILED;
                    default:
                        return null;
                }
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
