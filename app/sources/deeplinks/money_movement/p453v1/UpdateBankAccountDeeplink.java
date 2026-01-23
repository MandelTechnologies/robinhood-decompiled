package deeplinks.money_movement.p453v1;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
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
import deeplinks.money_movement.p453v1.UpdateBankAccountDeeplink;
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

/* compiled from: UpdateBankAccountDeeplink.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink;", "Lcom/squareup/wire/Message;", "", "bank_account_id", "", MatchSelectionActivity.TRANSFER_ID_EXTRA, "require_new_link", "", "entry_point", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;Lokio/ByteString;)V", "getBank_account_id", "()Ljava/lang/String;", "getTransfer_id", "getRequire_new_link", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEntry_point", "()Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;Lokio/ByteString;)Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink;", "Companion", "EntryPoint", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UpdateBankAccountDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateBankAccountDeeplink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String bank_account_id;

    @WireField(adapter = "deeplinks.money_movement.v1.UpdateBankAccountDeeplink$EntryPoint#ADAPTER", schemaIndex = 3, tag = 4)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    private final Boolean require_new_link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String transfer_id;

    public UpdateBankAccountDeeplink() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27958newBuilder();
    }

    public final String getBank_account_id() {
        return this.bank_account_id;
    }

    public /* synthetic */ UpdateBankAccountDeeplink(String str, String str2, Boolean bool, EntryPoint entryPoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : entryPoint, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    public final Boolean getRequire_new_link() {
        return this.require_new_link;
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateBankAccountDeeplink(String bank_account_id, String str, Boolean bool, EntryPoint entryPoint, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bank_account_id, "bank_account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bank_account_id = bank_account_id;
        this.transfer_id = str;
        this.require_new_link = bool;
        this.entry_point = entryPoint;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27958newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateBankAccountDeeplink)) {
            return false;
        }
        UpdateBankAccountDeeplink updateBankAccountDeeplink = (UpdateBankAccountDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), updateBankAccountDeeplink.unknownFields()) && Intrinsics.areEqual(this.bank_account_id, updateBankAccountDeeplink.bank_account_id) && Intrinsics.areEqual(this.transfer_id, updateBankAccountDeeplink.transfer_id) && Intrinsics.areEqual(this.require_new_link, updateBankAccountDeeplink.require_new_link) && this.entry_point == updateBankAccountDeeplink.entry_point;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.bank_account_id.hashCode()) * 37;
        String str = this.transfer_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.require_new_link;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        EntryPoint entryPoint = this.entry_point;
        int iHashCode4 = iHashCode3 + (entryPoint != null ? entryPoint.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bank_account_id=" + Internal.sanitize(this.bank_account_id));
        String str = this.transfer_id;
        if (str != null) {
            arrayList.add("transfer_id=" + Internal.sanitize(str));
        }
        Boolean bool = this.require_new_link;
        if (bool != null) {
            arrayList.add("require_new_link=" + bool);
        }
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateBankAccountDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateBankAccountDeeplink copy$default(UpdateBankAccountDeeplink updateBankAccountDeeplink, String str, String str2, Boolean bool, EntryPoint entryPoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateBankAccountDeeplink.bank_account_id;
        }
        if ((i & 2) != 0) {
            str2 = updateBankAccountDeeplink.transfer_id;
        }
        if ((i & 4) != 0) {
            bool = updateBankAccountDeeplink.require_new_link;
        }
        if ((i & 8) != 0) {
            entryPoint = updateBankAccountDeeplink.entry_point;
        }
        if ((i & 16) != 0) {
            byteString = updateBankAccountDeeplink.unknownFields();
        }
        ByteString byteString2 = byteString;
        Boolean bool2 = bool;
        return updateBankAccountDeeplink.copy(str, str2, bool2, entryPoint, byteString2);
    }

    public final UpdateBankAccountDeeplink copy(String bank_account_id, String transfer_id, Boolean require_new_link, EntryPoint entry_point, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bank_account_id, "bank_account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateBankAccountDeeplink(bank_account_id, transfer_id, require_new_link, entry_point, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateBankAccountDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateBankAccountDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.money_movement.v1.UpdateBankAccountDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateBankAccountDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBank_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBank_account_id());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTransfer_id()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getRequire_new_link()) + UpdateBankAccountDeeplink.EntryPoint.ADAPTER.encodedSizeWithTag(4, value.getEntry_point());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateBankAccountDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBank_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBank_account_id());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransfer_id());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getRequire_new_link());
                UpdateBankAccountDeeplink.EntryPoint.ADAPTER.encodeWithTag(writer, 4, (int) value.getEntry_point());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateBankAccountDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UpdateBankAccountDeeplink.EntryPoint.ADAPTER.encodeWithTag(writer, 4, (int) value.getEntry_point());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getRequire_new_link());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTransfer_id());
                if (Intrinsics.areEqual(value.getBank_account_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getBank_account_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateBankAccountDeeplink redact(UpdateBankAccountDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateBankAccountDeeplink.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateBankAccountDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                Boolean boolDecode = null;
                UpdateBankAccountDeeplink.EntryPoint entryPointDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new UpdateBankAccountDeeplink(str, strDecode2, boolDecode, entryPointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                            } else if (iNextTag == 4) {
                                try {
                                    entryPointDecode = UpdateBankAccountDeeplink.EntryPoint.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpdateBankAccountDeeplink.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "POST_TRANSFER", "INBOX", "RECURRING_DEPOSITS_HUB", "RECURRING_DEPOSIT_DETAIL", "EMAIL", "PUSH_NOTIFICATION", "Companion", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint EMAIL;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint INBOX;
        public static final EntryPoint POST_TRANSFER;
        public static final EntryPoint PUSH_NOTIFICATION;
        public static final EntryPoint RECURRING_DEPOSITS_HUB;
        public static final EntryPoint RECURRING_DEPOSIT_DETAIL;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, POST_TRANSFER, INBOX, RECURRING_DEPOSITS_HUB, RECURRING_DEPOSIT_DETAIL, EMAIL, PUSH_NOTIFICATION};
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
            POST_TRANSFER = new EntryPoint("POST_TRANSFER", 1, 1);
            INBOX = new EntryPoint("INBOX", 2, 2);
            RECURRING_DEPOSITS_HUB = new EntryPoint("RECURRING_DEPOSITS_HUB", 3, 3);
            RECURRING_DEPOSIT_DETAIL = new EntryPoint("RECURRING_DEPOSIT_DETAIL", 4, 4);
            EMAIL = new EntryPoint("EMAIL", 5, 5);
            PUSH_NOTIFICATION = new EntryPoint("PUSH_NOTIFICATION", 6, 6);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: deeplinks.money_movement.v1.UpdateBankAccountDeeplink$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public UpdateBankAccountDeeplink.EntryPoint fromValue(int value) {
                    return UpdateBankAccountDeeplink.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: UpdateBankAccountDeeplink.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "fromValue", "value", "", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return EntryPoint.POST_TRANSFER;
                    case 2:
                        return EntryPoint.INBOX;
                    case 3:
                        return EntryPoint.RECURRING_DEPOSITS_HUB;
                    case 4:
                        return EntryPoint.RECURRING_DEPOSIT_DETAIL;
                    case 5:
                        return EntryPoint.EMAIL;
                    case 6:
                        return EntryPoint.PUSH_NOTIFICATION;
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
