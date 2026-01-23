package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.RetirementContext;
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

/* compiled from: RetirementContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementContext;", "Lcom/squareup/wire/Message;", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "", "account_state", "Lcom/robinhood/rosetta/eventlogging/RetirementContext$AccountState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RetirementContext$AccountState;Lokio/ByteString;)V", "getAccount_type", "()Ljava/lang/String;", "getAccount_state", "()Lcom/robinhood/rosetta/eventlogging/RetirementContext$AccountState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AccountState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RetirementContext extends Message {

    @JvmField
    public static final ProtoAdapter<RetirementContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RetirementContext$AccountState#ADAPTER", jsonName = "accountState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountState account_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_type;

    public RetirementContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24536newBuilder();
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public /* synthetic */ RetirementContext(String str, AccountState accountState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AccountState.ACCOUNT_STATE_UNSPECIFIED : accountState, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AccountState getAccount_state() {
        return this.account_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementContext(String account_type, AccountState account_state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_state, "account_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_type = account_type;
        this.account_state = account_state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24536newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RetirementContext)) {
            return false;
        }
        RetirementContext retirementContext = (RetirementContext) other;
        return Intrinsics.areEqual(unknownFields(), retirementContext.unknownFields()) && Intrinsics.areEqual(this.account_type, retirementContext.account_type) && this.account_state == retirementContext.account_state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.account_type.hashCode()) * 37) + this.account_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        arrayList.add("account_state=" + this.account_state);
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetirementContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RetirementContext copy$default(RetirementContext retirementContext, String str, AccountState accountState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementContext.account_type;
        }
        if ((i & 2) != 0) {
            accountState = retirementContext.account_state;
        }
        if ((i & 4) != 0) {
            byteString = retirementContext.unknownFields();
        }
        return retirementContext.copy(str, accountState, byteString);
    }

    public final RetirementContext copy(String account_type, AccountState account_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_state, "account_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RetirementContext(account_type, account_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RetirementContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RetirementContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RetirementContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RetirementContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_type());
                }
                return value.getAccount_state() != RetirementContext.AccountState.ACCOUNT_STATE_UNSPECIFIED ? size + RetirementContext.AccountState.ADAPTER.encodedSizeWithTag(2, value.getAccount_state()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RetirementContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_type());
                }
                if (value.getAccount_state() != RetirementContext.AccountState.ACCOUNT_STATE_UNSPECIFIED) {
                    RetirementContext.AccountState.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_state());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RetirementContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount_state() != RetirementContext.AccountState.ACCOUNT_STATE_UNSPECIFIED) {
                    RetirementContext.AccountState.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_state());
                }
                if (Intrinsics.areEqual(value.getAccount_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_type());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RetirementContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RetirementContext.AccountState accountStateDecode = RetirementContext.AccountState.ACCOUNT_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RetirementContext(strDecode, accountStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            accountStateDecode = RetirementContext.AccountState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RetirementContext redact(RetirementContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RetirementContext.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RetirementContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementContext$AccountState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_STATE_UNSPECIFIED", "FUNDED_NOT_INVESTED", "INVESTED_ZERO_EQUITY", "INVESTED_POSITIVE_EQUITY", "UNFUNDED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountState[] $VALUES;
        public static final AccountState ACCOUNT_STATE_UNSPECIFIED;

        @JvmField
        public static final ProtoAdapter<AccountState> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccountState FUNDED_NOT_INVESTED;
        public static final AccountState INVESTED_POSITIVE_EQUITY;
        public static final AccountState INVESTED_ZERO_EQUITY;
        public static final AccountState UNFUNDED;
        private final int value;

        private static final /* synthetic */ AccountState[] $values() {
            return new AccountState[]{ACCOUNT_STATE_UNSPECIFIED, FUNDED_NOT_INVESTED, INVESTED_ZERO_EQUITY, INVESTED_POSITIVE_EQUITY, UNFUNDED};
        }

        @JvmStatic
        public static final AccountState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AccountState> getEntries() {
            return $ENTRIES;
        }

        private AccountState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AccountState accountState = new AccountState("ACCOUNT_STATE_UNSPECIFIED", 0, 0);
            ACCOUNT_STATE_UNSPECIFIED = accountState;
            FUNDED_NOT_INVESTED = new AccountState("FUNDED_NOT_INVESTED", 1, 1);
            INVESTED_ZERO_EQUITY = new AccountState("INVESTED_ZERO_EQUITY", 2, 2);
            INVESTED_POSITIVE_EQUITY = new AccountState("INVESTED_POSITIVE_EQUITY", 3, 3);
            UNFUNDED = new AccountState("UNFUNDED", 4, 4);
            AccountState[] accountStateArr$values = $values();
            $VALUES = accountStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountState>(orCreateKotlinClass, syntax, accountState) { // from class: com.robinhood.rosetta.eventlogging.RetirementContext$AccountState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RetirementContext.AccountState fromValue(int value) {
                    return RetirementContext.AccountState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RetirementContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementContext$AccountState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RetirementContext$AccountState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AccountState fromValue(int value) {
                if (value == 0) {
                    return AccountState.ACCOUNT_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AccountState.FUNDED_NOT_INVESTED;
                }
                if (value == 2) {
                    return AccountState.INVESTED_ZERO_EQUITY;
                }
                if (value == 3) {
                    return AccountState.INVESTED_POSITIVE_EQUITY;
                }
                if (value != 4) {
                    return null;
                }
                return AccountState.UNFUNDED;
            }
        }

        public static AccountState valueOf(String str) {
            return (AccountState) Enum.valueOf(AccountState.class, str);
        }

        public static AccountState[] values() {
            return (AccountState[]) $VALUES.clone();
        }
    }
}
