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
import options_product.service.ApprovedTradesResponseMetadata;

/* compiled from: ApprovedTradesResponseMetadata.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004 !\"#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadata;", "Lcom/squareup/wire/Message;", "", "account_type_in_copy", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "option_level", "Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "account_number", "", "graphic_type", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;Ljava/lang/String;Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;Lokio/ByteString;)V", "getAccount_type_in_copy", "()Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "getOption_level", "()Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "getAccount_number", "()Ljava/lang/String;", "getGraphic_type", "()Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AccountTypeInCopy", "OptionLevel", "GraphicType", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ApprovedTradesResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<ApprovedTradesResponseMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "options_product.service.ApprovedTradesResponseMetadata$AccountTypeInCopy#ADAPTER", jsonName = "accountTypeInCopy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AccountTypeInCopy account_type_in_copy;

    @WireField(adapter = "options_product.service.ApprovedTradesResponseMetadata$GraphicType#ADAPTER", jsonName = "graphicType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final GraphicType graphic_type;

    @WireField(adapter = "options_product.service.ApprovedTradesResponseMetadata$OptionLevel#ADAPTER", jsonName = "optionLevel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OptionLevel option_level;

    public ApprovedTradesResponseMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29459newBuilder();
    }

    public final AccountTypeInCopy getAccount_type_in_copy() {
        return this.account_type_in_copy;
    }

    public /* synthetic */ ApprovedTradesResponseMetadata(AccountTypeInCopy accountTypeInCopy, OptionLevel optionLevel, String str, GraphicType graphicType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED : accountTypeInCopy, (i & 2) != 0 ? OptionLevel.OPTION_LEVEL_UNSPECIFIED : optionLevel, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? GraphicType.GRAPHIC_TYPE_UNSPECIFIED : graphicType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OptionLevel getOption_level() {
        return this.option_level;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final GraphicType getGraphic_type() {
        return this.graphic_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApprovedTradesResponseMetadata(AccountTypeInCopy account_type_in_copy, OptionLevel option_level, String account_number, GraphicType graphic_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(option_level, "option_level");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_type_in_copy = account_type_in_copy;
        this.option_level = option_level;
        this.account_number = account_number;
        this.graphic_type = graphic_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29459newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ApprovedTradesResponseMetadata)) {
            return false;
        }
        ApprovedTradesResponseMetadata approvedTradesResponseMetadata = (ApprovedTradesResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), approvedTradesResponseMetadata.unknownFields()) && this.account_type_in_copy == approvedTradesResponseMetadata.account_type_in_copy && this.option_level == approvedTradesResponseMetadata.option_level && Intrinsics.areEqual(this.account_number, approvedTradesResponseMetadata.account_number) && this.graphic_type == approvedTradesResponseMetadata.graphic_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.account_type_in_copy.hashCode()) * 37) + this.option_level.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.graphic_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_type_in_copy=" + this.account_type_in_copy);
        arrayList.add("option_level=" + this.option_level);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("graphic_type=" + this.graphic_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ApprovedTradesResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ApprovedTradesResponseMetadata copy$default(ApprovedTradesResponseMetadata approvedTradesResponseMetadata, AccountTypeInCopy accountTypeInCopy, OptionLevel optionLevel, String str, GraphicType graphicType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            accountTypeInCopy = approvedTradesResponseMetadata.account_type_in_copy;
        }
        if ((i & 2) != 0) {
            optionLevel = approvedTradesResponseMetadata.option_level;
        }
        if ((i & 4) != 0) {
            str = approvedTradesResponseMetadata.account_number;
        }
        if ((i & 8) != 0) {
            graphicType = approvedTradesResponseMetadata.graphic_type;
        }
        if ((i & 16) != 0) {
            byteString = approvedTradesResponseMetadata.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str2 = str;
        return approvedTradesResponseMetadata.copy(accountTypeInCopy, optionLevel, str2, graphicType, byteString2);
    }

    public final ApprovedTradesResponseMetadata copy(AccountTypeInCopy account_type_in_copy, OptionLevel option_level, String account_number, GraphicType graphic_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(option_level, "option_level");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ApprovedTradesResponseMetadata(account_type_in_copy, option_level, account_number, graphic_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApprovedTradesResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ApprovedTradesResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.ApprovedTradesResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ApprovedTradesResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAccount_type_in_copy() != ApprovedTradesResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += ApprovedTradesResponseMetadata.AccountTypeInCopy.ADAPTER.encodedSizeWithTag(1, value.getAccount_type_in_copy());
                }
                if (value.getOption_level() != ApprovedTradesResponseMetadata.OptionLevel.OPTION_LEVEL_UNSPECIFIED) {
                    size += ApprovedTradesResponseMetadata.OptionLevel.ADAPTER.encodedSizeWithTag(2, value.getOption_level());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number());
                }
                return value.getGraphic_type() != ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED ? size + ApprovedTradesResponseMetadata.GraphicType.ADAPTER.encodedSizeWithTag(4, value.getGraphic_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ApprovedTradesResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount_type_in_copy() != ApprovedTradesResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    ApprovedTradesResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type_in_copy());
                }
                if (value.getOption_level() != ApprovedTradesResponseMetadata.OptionLevel.OPTION_LEVEL_UNSPECIFIED) {
                    ApprovedTradesResponseMetadata.OptionLevel.ADAPTER.encodeWithTag(writer, 2, (int) value.getOption_level());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getGraphic_type() != ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    ApprovedTradesResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 4, (int) value.getGraphic_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ApprovedTradesResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getGraphic_type() != ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    ApprovedTradesResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 4, (int) value.getGraphic_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getOption_level() != ApprovedTradesResponseMetadata.OptionLevel.OPTION_LEVEL_UNSPECIFIED) {
                    ApprovedTradesResponseMetadata.OptionLevel.ADAPTER.encodeWithTag(writer, 2, (int) value.getOption_level());
                }
                if (value.getAccount_type_in_copy() != ApprovedTradesResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    ApprovedTradesResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type_in_copy());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ApprovedTradesResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ApprovedTradesResponseMetadata.AccountTypeInCopy accountTypeInCopyDecode = ApprovedTradesResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
                ApprovedTradesResponseMetadata.OptionLevel optionLevel = ApprovedTradesResponseMetadata.OptionLevel.OPTION_LEVEL_UNSPECIFIED;
                ApprovedTradesResponseMetadata.GraphicType graphicType = ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ApprovedTradesResponseMetadata.GraphicType graphicTypeDecode = graphicType;
                ApprovedTradesResponseMetadata.OptionLevel optionLevelDecode = optionLevel;
                while (true) {
                    ApprovedTradesResponseMetadata.AccountTypeInCopy accountTypeInCopy = accountTypeInCopyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ApprovedTradesResponseMetadata(accountTypeInCopy, optionLevelDecode, strDecode, graphicTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                accountTypeInCopyDecode = ApprovedTradesResponseMetadata.AccountTypeInCopy.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                optionLevelDecode = ApprovedTradesResponseMetadata.OptionLevel.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                graphicTypeDecode = ApprovedTradesResponseMetadata.GraphicType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ApprovedTradesResponseMetadata redact(ApprovedTradesResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ApprovedTradesResponseMetadata.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApprovedTradesResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "NONE", "INDIVIDUAL", "IRA_ROTH", "IRA_TRADITIONAL", "JOINT", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
        public static final AccountTypeInCopy IRA_ROTH;
        public static final AccountTypeInCopy IRA_TRADITIONAL;
        public static final AccountTypeInCopy JOINT;
        public static final AccountTypeInCopy NONE;
        private final int value;

        private static final /* synthetic */ AccountTypeInCopy[] $values() {
            return new AccountTypeInCopy[]{ACCOUNT_TYPE_UNSPECIFIED, NONE, INDIVIDUAL, IRA_ROTH, IRA_TRADITIONAL, JOINT};
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
            IRA_ROTH = new AccountTypeInCopy("IRA_ROTH", 3, 3);
            IRA_TRADITIONAL = new AccountTypeInCopy("IRA_TRADITIONAL", 4, 4);
            JOINT = new AccountTypeInCopy("JOINT", 5, 5);
            AccountTypeInCopy[] accountTypeInCopyArr$values = $values();
            $VALUES = accountTypeInCopyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeInCopyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountTypeInCopy.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountTypeInCopy>(orCreateKotlinClass, syntax, accountTypeInCopy) { // from class: options_product.service.ApprovedTradesResponseMetadata$AccountTypeInCopy$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ApprovedTradesResponseMetadata.AccountTypeInCopy fromValue(int value) {
                    return ApprovedTradesResponseMetadata.AccountTypeInCopy.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ApprovedTradesResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                if (value == 3) {
                    return AccountTypeInCopy.IRA_ROTH;
                }
                if (value == 4) {
                    return AccountTypeInCopy.IRA_TRADITIONAL;
                }
                if (value != 5) {
                    return null;
                }
                return AccountTypeInCopy.JOINT;
            }
        }

        public static AccountTypeInCopy valueOf(String str) {
            return (AccountTypeInCopy) Enum.valueOf(AccountTypeInCopy.class, str);
        }

        public static AccountTypeInCopy[] values() {
            return (AccountTypeInCopy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApprovedTradesResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OPTION_LEVEL_UNSPECIFIED", "L2", "L3", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class OptionLevel implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionLevel[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OptionLevel> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: L2 */
        public static final OptionLevel f7149L2;

        /* renamed from: L3 */
        public static final OptionLevel f7150L3;
        public static final OptionLevel OPTION_LEVEL_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OptionLevel[] $values() {
            return new OptionLevel[]{OPTION_LEVEL_UNSPECIFIED, f7149L2, f7150L3};
        }

        @JvmStatic
        public static final OptionLevel fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OptionLevel> getEntries() {
            return $ENTRIES;
        }

        private OptionLevel(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OptionLevel optionLevel = new OptionLevel("OPTION_LEVEL_UNSPECIFIED", 0, 0);
            OPTION_LEVEL_UNSPECIFIED = optionLevel;
            f7149L2 = new OptionLevel("L2", 1, 1);
            f7150L3 = new OptionLevel("L3", 2, 2);
            OptionLevel[] optionLevelArr$values = $values();
            $VALUES = optionLevelArr$values;
            $ENTRIES = EnumEntries2.enumEntries(optionLevelArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionLevel.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OptionLevel>(orCreateKotlinClass, syntax, optionLevel) { // from class: options_product.service.ApprovedTradesResponseMetadata$OptionLevel$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ApprovedTradesResponseMetadata.OptionLevel fromValue(int value) {
                    return ApprovedTradesResponseMetadata.OptionLevel.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ApprovedTradesResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OptionLevel fromValue(int value) {
                if (value == 0) {
                    return OptionLevel.OPTION_LEVEL_UNSPECIFIED;
                }
                if (value == 1) {
                    return OptionLevel.f7149L2;
                }
                if (value != 2) {
                    return null;
                }
                return OptionLevel.f7150L3;
            }
        }

        public static OptionLevel valueOf(String str) {
            return (OptionLevel) Enum.valueOf(OptionLevel.class, str);
        }

        public static OptionLevel[] values() {
            return (OptionLevel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApprovedTradesResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GRAPHIC_TYPE_UNSPECIFIED", "GRAPHIC_TYPE_INDIVIDUAL", "GRAPHIC_TYPE_RETIREMENT", "GRAPHIC_TYPE_JOINT_ACCOUNT", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class GraphicType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GraphicType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<GraphicType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final GraphicType GRAPHIC_TYPE_INDIVIDUAL;
        public static final GraphicType GRAPHIC_TYPE_JOINT_ACCOUNT;
        public static final GraphicType GRAPHIC_TYPE_RETIREMENT;
        public static final GraphicType GRAPHIC_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ GraphicType[] $values() {
            return new GraphicType[]{GRAPHIC_TYPE_UNSPECIFIED, GRAPHIC_TYPE_INDIVIDUAL, GRAPHIC_TYPE_RETIREMENT, GRAPHIC_TYPE_JOINT_ACCOUNT};
        }

        @JvmStatic
        public static final GraphicType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<GraphicType> getEntries() {
            return $ENTRIES;
        }

        private GraphicType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final GraphicType graphicType = new GraphicType("GRAPHIC_TYPE_UNSPECIFIED", 0, 0);
            GRAPHIC_TYPE_UNSPECIFIED = graphicType;
            GRAPHIC_TYPE_INDIVIDUAL = new GraphicType("GRAPHIC_TYPE_INDIVIDUAL", 1, 1);
            GRAPHIC_TYPE_RETIREMENT = new GraphicType("GRAPHIC_TYPE_RETIREMENT", 2, 2);
            GRAPHIC_TYPE_JOINT_ACCOUNT = new GraphicType("GRAPHIC_TYPE_JOINT_ACCOUNT", 3, 3);
            GraphicType[] graphicTypeArr$values = $values();
            $VALUES = graphicTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(graphicTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GraphicType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<GraphicType>(orCreateKotlinClass, syntax, graphicType) { // from class: options_product.service.ApprovedTradesResponseMetadata$GraphicType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ApprovedTradesResponseMetadata.GraphicType fromValue(int value) {
                    return ApprovedTradesResponseMetadata.GraphicType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ApprovedTradesResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final GraphicType fromValue(int value) {
                if (value == 0) {
                    return GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return GraphicType.GRAPHIC_TYPE_INDIVIDUAL;
                }
                if (value == 2) {
                    return GraphicType.GRAPHIC_TYPE_RETIREMENT;
                }
                if (value != 3) {
                    return null;
                }
                return GraphicType.GRAPHIC_TYPE_JOINT_ACCOUNT;
            }
        }

        public static GraphicType valueOf(String str) {
            return (GraphicType) Enum.valueOf(GraphicType.class, str);
        }

        public static GraphicType[] values() {
            return (GraphicType[]) $VALUES.clone();
        }
    }
}
