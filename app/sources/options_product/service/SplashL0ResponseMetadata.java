package options_product.service;

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
import options_product.service.SplashL0ResponseMetadata;

/* compiled from: SplashL0ResponseMetadata.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/SplashL0ResponseMetadata;", "Lcom/squareup/wire/Message;", "", "account_type_in_copy", "Loptions_product/service/SplashL0ResponseMetadata$AccountTypeInCopy;", "account_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/SplashL0ResponseMetadata$AccountTypeInCopy;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_type_in_copy", "()Loptions_product/service/SplashL0ResponseMetadata$AccountTypeInCopy;", "getAccount_number", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AccountTypeInCopy", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SplashL0ResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<SplashL0ResponseMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "options_product.service.SplashL0ResponseMetadata$AccountTypeInCopy#ADAPTER", jsonName = "accountTypeInCopy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AccountTypeInCopy account_type_in_copy;

    public SplashL0ResponseMetadata() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29566newBuilder();
    }

    public final AccountTypeInCopy getAccount_type_in_copy() {
        return this.account_type_in_copy;
    }

    public /* synthetic */ SplashL0ResponseMetadata(AccountTypeInCopy accountTypeInCopy, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED : accountTypeInCopy, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashL0ResponseMetadata(AccountTypeInCopy account_type_in_copy, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_type_in_copy = account_type_in_copy;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29566newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SplashL0ResponseMetadata)) {
            return false;
        }
        SplashL0ResponseMetadata splashL0ResponseMetadata = (SplashL0ResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), splashL0ResponseMetadata.unknownFields()) && this.account_type_in_copy == splashL0ResponseMetadata.account_type_in_copy && Intrinsics.areEqual(this.account_number, splashL0ResponseMetadata.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.account_type_in_copy.hashCode()) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_type_in_copy=" + this.account_type_in_copy);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SplashL0ResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SplashL0ResponseMetadata copy$default(SplashL0ResponseMetadata splashL0ResponseMetadata, AccountTypeInCopy accountTypeInCopy, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            accountTypeInCopy = splashL0ResponseMetadata.account_type_in_copy;
        }
        if ((i & 2) != 0) {
            str = splashL0ResponseMetadata.account_number;
        }
        if ((i & 4) != 0) {
            byteString = splashL0ResponseMetadata.unknownFields();
        }
        return splashL0ResponseMetadata.copy(accountTypeInCopy, str, byteString);
    }

    public final SplashL0ResponseMetadata copy(AccountTypeInCopy account_type_in_copy, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SplashL0ResponseMetadata(account_type_in_copy, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SplashL0ResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SplashL0ResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.SplashL0ResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SplashL0ResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAccount_type_in_copy() != SplashL0ResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += SplashL0ResponseMetadata.AccountTypeInCopy.ADAPTER.encodedSizeWithTag(1, value.getAccount_type_in_copy());
                }
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SplashL0ResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount_type_in_copy() != SplashL0ResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    SplashL0ResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type_in_copy());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SplashL0ResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getAccount_type_in_copy() != SplashL0ResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    SplashL0ResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type_in_copy());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SplashL0ResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SplashL0ResponseMetadata.AccountTypeInCopy accountTypeInCopyDecode = SplashL0ResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SplashL0ResponseMetadata(accountTypeInCopyDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            accountTypeInCopyDecode = SplashL0ResponseMetadata.AccountTypeInCopy.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SplashL0ResponseMetadata redact(SplashL0ResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SplashL0ResponseMetadata.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SplashL0ResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Loptions_product/service/SplashL0ResponseMetadata$AccountTypeInCopy;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "NONE", "INDIVIDUAL", "JOINT_TENANCY_WITH_ROS", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class AccountTypeInCopy implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountTypeInCopy[] $VALUES;
        public static final AccountTypeInCopy ACCOUNT_TYPE_UNSPECIFIED;

        @JvmField
        public static final ProtoAdapter<AccountTypeInCopy> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccountTypeInCopy INDIVIDUAL;
        public static final AccountTypeInCopy JOINT_TENANCY_WITH_ROS;
        public static final AccountTypeInCopy NONE;
        private final int value;

        private static final /* synthetic */ AccountTypeInCopy[] $values() {
            return new AccountTypeInCopy[]{ACCOUNT_TYPE_UNSPECIFIED, NONE, INDIVIDUAL, JOINT_TENANCY_WITH_ROS};
        }

        @JvmStatic
        public static final AccountTypeInCopy fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AccountTypeInCopy> getEntries() {
            return $ENTRIES;
        }

        private AccountTypeInCopy(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AccountTypeInCopy accountTypeInCopy = new AccountTypeInCopy("ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
            ACCOUNT_TYPE_UNSPECIFIED = accountTypeInCopy;
            NONE = new AccountTypeInCopy("NONE", 1, 1);
            INDIVIDUAL = new AccountTypeInCopy("INDIVIDUAL", 2, 2);
            JOINT_TENANCY_WITH_ROS = new AccountTypeInCopy("JOINT_TENANCY_WITH_ROS", 3, 3);
            AccountTypeInCopy[] accountTypeInCopyArr$values = $values();
            $VALUES = accountTypeInCopyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeInCopyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountTypeInCopy.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountTypeInCopy>(orCreateKotlinClass, syntax, accountTypeInCopy) { // from class: options_product.service.SplashL0ResponseMetadata$AccountTypeInCopy$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SplashL0ResponseMetadata.AccountTypeInCopy fromValue(int value) {
                    return SplashL0ResponseMetadata.AccountTypeInCopy.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SplashL0ResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/SplashL0ResponseMetadata$AccountTypeInCopy$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/SplashL0ResponseMetadata$AccountTypeInCopy;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AccountTypeInCopy fromValue(int value) {
                if (value == 0) {
                    return AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AccountTypeInCopy.NONE;
                }
                if (value == 2) {
                    return AccountTypeInCopy.INDIVIDUAL;
                }
                if (value != 3) {
                    return null;
                }
                return AccountTypeInCopy.JOINT_TENANCY_WITH_ROS;
            }
        }

        public static AccountTypeInCopy valueOf(String str) {
            return (AccountTypeInCopy) Enum.valueOf(AccountTypeInCopy.class, str);
        }

        public static AccountTypeInCopy[] values() {
            return (AccountTypeInCopy[]) $VALUES.clone();
        }
    }
}
