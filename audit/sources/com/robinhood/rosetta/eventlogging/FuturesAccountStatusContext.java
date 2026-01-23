package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.FuturesAccountStatusContext;
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

/* compiled from: FuturesAccountStatusContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext;", "Lcom/squareup/wire/Message;", "", "account_status", "Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext$AccountStatus;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext$AccountStatus;Lokio/ByteString;)V", "getAccount_status", "()Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext$AccountStatus;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "AccountStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class FuturesAccountStatusContext extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesAccountStatusContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesAccountStatusContext$AccountStatus#ADAPTER", jsonName = "accountStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AccountStatus account_status;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesAccountStatusContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24272newBuilder();
    }

    public final AccountStatus getAccount_status() {
        return this.account_status;
    }

    public /* synthetic */ FuturesAccountStatusContext(AccountStatus accountStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AccountStatus.ACCOUNT_STATUS_UNSPECIFIED : accountStatus, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAccountStatusContext(AccountStatus account_status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_status, "account_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_status = account_status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24272newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesAccountStatusContext)) {
            return false;
        }
        FuturesAccountStatusContext futuresAccountStatusContext = (FuturesAccountStatusContext) other;
        return Intrinsics.areEqual(unknownFields(), futuresAccountStatusContext.unknownFields()) && this.account_status == futuresAccountStatusContext.account_status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.account_status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_status=" + this.account_status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesAccountStatusContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesAccountStatusContext copy$default(FuturesAccountStatusContext futuresAccountStatusContext, AccountStatus accountStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            accountStatus = futuresAccountStatusContext.account_status;
        }
        if ((i & 2) != 0) {
            byteString = futuresAccountStatusContext.unknownFields();
        }
        return futuresAccountStatusContext.copy(accountStatus, byteString);
    }

    public final FuturesAccountStatusContext copy(AccountStatus account_status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_status, "account_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesAccountStatusContext(account_status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesAccountStatusContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesAccountStatusContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesAccountStatusContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesAccountStatusContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getAccount_status() != FuturesAccountStatusContext.AccountStatus.ACCOUNT_STATUS_UNSPECIFIED ? size + FuturesAccountStatusContext.AccountStatus.ADAPTER.encodedSizeWithTag(1, value.getAccount_status()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesAccountStatusContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount_status() != FuturesAccountStatusContext.AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    FuturesAccountStatusContext.AccountStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_status());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesAccountStatusContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount_status() != FuturesAccountStatusContext.AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    FuturesAccountStatusContext.AccountStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_status());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesAccountStatusContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesAccountStatusContext.AccountStatus accountStatusDecode = FuturesAccountStatusContext.AccountStatus.ACCOUNT_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesAccountStatusContext(accountStatusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            accountStatusDecode = FuturesAccountStatusContext.AccountStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesAccountStatusContext redact(FuturesAccountStatusContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FuturesAccountStatusContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesAccountStatusContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext$AccountStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_STATUS_UNSPECIFIED", "NO_ACCOUNT", "ACTIVE", "RESTRICTED", "PENDING", "REJECTED", "INACTIVE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountStatus[] $VALUES;
        public static final AccountStatus ACCOUNT_STATUS_UNSPECIFIED;
        public static final AccountStatus ACTIVE;

        @JvmField
        public static final ProtoAdapter<AccountStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccountStatus INACTIVE;

        @Deprecated
        public static final AccountStatus NO_ACCOUNT;
        public static final AccountStatus PENDING;
        public static final AccountStatus REJECTED;

        @Deprecated
        public static final AccountStatus RESTRICTED;
        private final int value;

        private static final /* synthetic */ AccountStatus[] $values() {
            return new AccountStatus[]{ACCOUNT_STATUS_UNSPECIFIED, NO_ACCOUNT, ACTIVE, RESTRICTED, PENDING, REJECTED, INACTIVE};
        }

        @JvmStatic
        public static final AccountStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AccountStatus> getEntries() {
            return $ENTRIES;
        }

        private AccountStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AccountStatus accountStatus = new AccountStatus("ACCOUNT_STATUS_UNSPECIFIED", 0, 0);
            ACCOUNT_STATUS_UNSPECIFIED = accountStatus;
            NO_ACCOUNT = new AccountStatus("NO_ACCOUNT", 1, 1);
            ACTIVE = new AccountStatus("ACTIVE", 2, 2);
            RESTRICTED = new AccountStatus("RESTRICTED", 3, 3);
            PENDING = new AccountStatus("PENDING", 4, 4);
            REJECTED = new AccountStatus("REJECTED", 5, 5);
            INACTIVE = new AccountStatus("INACTIVE", 6, 6);
            AccountStatus[] accountStatusArr$values = $values();
            $VALUES = accountStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountStatus>(orCreateKotlinClass, syntax, accountStatus) { // from class: com.robinhood.rosetta.eventlogging.FuturesAccountStatusContext$AccountStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesAccountStatusContext.AccountStatus fromValue(int value) {
                    return FuturesAccountStatusContext.AccountStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesAccountStatusContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext$AccountStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext$AccountStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AccountStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return AccountStatus.ACCOUNT_STATUS_UNSPECIFIED;
                    case 1:
                        return AccountStatus.NO_ACCOUNT;
                    case 2:
                        return AccountStatus.ACTIVE;
                    case 3:
                        return AccountStatus.RESTRICTED;
                    case 4:
                        return AccountStatus.PENDING;
                    case 5:
                        return AccountStatus.REJECTED;
                    case 6:
                        return AccountStatus.INACTIVE;
                    default:
                        return null;
                }
            }
        }

        public static AccountStatus valueOf(String str) {
            return (AccountStatus) Enum.valueOf(AccountStatus.class, str);
        }

        public static AccountStatus[] values() {
            return (AccountStatus[]) $VALUES.clone();
        }
    }
}
