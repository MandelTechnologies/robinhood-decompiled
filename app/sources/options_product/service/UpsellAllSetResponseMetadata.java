package options_product.service;

import com.robinhood.utils.extensions.ResourceTypes;
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
import options_product.service.UpsellAllSetResponseMetadata;

/* compiled from: UpsellAllSetResponseMetadata.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Loptions_product/service/UpsellAllSetResponseMetadata;", "Lcom/squareup/wire/Message;", "", ResourceTypes.STYLE, "Loptions_product/service/UpsellAllSetResponseMetadata$Style;", "account_number", "", "trade_on_expiration_enabled", "", "account_type_in_copy", "Loptions_product/service/UpsellAllSetResponseMetadata$AccountTypeInCopy;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/UpsellAllSetResponseMetadata$Style;Ljava/lang/String;ZLoptions_product/service/UpsellAllSetResponseMetadata$AccountTypeInCopy;Lokio/ByteString;)V", "getStyle", "()Loptions_product/service/UpsellAllSetResponseMetadata$Style;", "getAccount_number", "()Ljava/lang/String;", "getTrade_on_expiration_enabled", "()Z", "getAccount_type_in_copy", "()Loptions_product/service/UpsellAllSetResponseMetadata$AccountTypeInCopy;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Style", "AccountTypeInCopy", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class UpsellAllSetResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<UpsellAllSetResponseMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "options_product.service.UpsellAllSetResponseMetadata$AccountTypeInCopy#ADAPTER", jsonName = "accountTypeInCopy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AccountTypeInCopy account_type_in_copy;

    @WireField(adapter = "options_product.service.UpsellAllSetResponseMetadata$Style#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Style style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tradeOnExpirationEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean trade_on_expiration_enabled;

    public UpsellAllSetResponseMetadata() {
        this(null, null, false, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29618newBuilder();
    }

    public final Style getStyle() {
        return this.style;
    }

    public /* synthetic */ UpsellAllSetResponseMetadata(Style style, String str, boolean z, AccountTypeInCopy accountTypeInCopy, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Style.STYLE_UNSPECIFIED : style, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED : accountTypeInCopy, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final boolean getTrade_on_expiration_enabled() {
        return this.trade_on_expiration_enabled;
    }

    public final AccountTypeInCopy getAccount_type_in_copy() {
        return this.account_type_in_copy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsellAllSetResponseMetadata(Style style, String account_number, boolean z, AccountTypeInCopy account_type_in_copy, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.style = style;
        this.account_number = account_number;
        this.trade_on_expiration_enabled = z;
        this.account_type_in_copy = account_type_in_copy;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29618newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpsellAllSetResponseMetadata)) {
            return false;
        }
        UpsellAllSetResponseMetadata upsellAllSetResponseMetadata = (UpsellAllSetResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), upsellAllSetResponseMetadata.unknownFields()) && this.style == upsellAllSetResponseMetadata.style && Intrinsics.areEqual(this.account_number, upsellAllSetResponseMetadata.account_number) && this.trade_on_expiration_enabled == upsellAllSetResponseMetadata.trade_on_expiration_enabled && this.account_type_in_copy == upsellAllSetResponseMetadata.account_type_in_copy;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.style.hashCode()) * 37) + this.account_number.hashCode()) * 37) + Boolean.hashCode(this.trade_on_expiration_enabled)) * 37) + this.account_type_in_copy.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("style=" + this.style);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("trade_on_expiration_enabled=" + this.trade_on_expiration_enabled);
        arrayList.add("account_type_in_copy=" + this.account_type_in_copy);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellAllSetResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpsellAllSetResponseMetadata copy$default(UpsellAllSetResponseMetadata upsellAllSetResponseMetadata, Style style, String str, boolean z, AccountTypeInCopy accountTypeInCopy, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            style = upsellAllSetResponseMetadata.style;
        }
        if ((i & 2) != 0) {
            str = upsellAllSetResponseMetadata.account_number;
        }
        if ((i & 4) != 0) {
            z = upsellAllSetResponseMetadata.trade_on_expiration_enabled;
        }
        if ((i & 8) != 0) {
            accountTypeInCopy = upsellAllSetResponseMetadata.account_type_in_copy;
        }
        if ((i & 16) != 0) {
            byteString = upsellAllSetResponseMetadata.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return upsellAllSetResponseMetadata.copy(style, str, z2, accountTypeInCopy, byteString2);
    }

    public final UpsellAllSetResponseMetadata copy(Style style, String account_number, boolean trade_on_expiration_enabled, AccountTypeInCopy account_type_in_copy, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpsellAllSetResponseMetadata(style, account_number, trade_on_expiration_enabled, account_type_in_copy, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpsellAllSetResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpsellAllSetResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.UpsellAllSetResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpsellAllSetResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStyle() != UpsellAllSetResponseMetadata.Style.STYLE_UNSPECIFIED) {
                    size += UpsellAllSetResponseMetadata.Style.ADAPTER.encodedSizeWithTag(1, value.getStyle());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (value.getTrade_on_expiration_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getTrade_on_expiration_enabled()));
                }
                return value.getAccount_type_in_copy() != UpsellAllSetResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED ? size + UpsellAllSetResponseMetadata.AccountTypeInCopy.ADAPTER.encodedSizeWithTag(4, value.getAccount_type_in_copy()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpsellAllSetResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStyle() != UpsellAllSetResponseMetadata.Style.STYLE_UNSPECIFIED) {
                    UpsellAllSetResponseMetadata.Style.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getTrade_on_expiration_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getTrade_on_expiration_enabled()));
                }
                if (value.getAccount_type_in_copy() != UpsellAllSetResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    UpsellAllSetResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 4, (int) value.getAccount_type_in_copy());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpsellAllSetResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount_type_in_copy() != UpsellAllSetResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    UpsellAllSetResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 4, (int) value.getAccount_type_in_copy());
                }
                if (value.getTrade_on_expiration_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getTrade_on_expiration_enabled()));
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getStyle() != UpsellAllSetResponseMetadata.Style.STYLE_UNSPECIFIED) {
                    UpsellAllSetResponseMetadata.Style.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpsellAllSetResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                UpsellAllSetResponseMetadata.Style styleDecode = UpsellAllSetResponseMetadata.Style.STYLE_UNSPECIFIED;
                UpsellAllSetResponseMetadata.AccountTypeInCopy accountTypeInCopy = UpsellAllSetResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                UpsellAllSetResponseMetadata.AccountTypeInCopy accountTypeInCopyDecode = accountTypeInCopy;
                while (true) {
                    UpsellAllSetResponseMetadata.Style style = styleDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new UpsellAllSetResponseMetadata(style, strDecode, zBooleanValue, accountTypeInCopyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                styleDecode = UpsellAllSetResponseMetadata.Style.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 4) {
                            try {
                                accountTypeInCopyDecode = UpsellAllSetResponseMetadata.AccountTypeInCopy.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpsellAllSetResponseMetadata redact(UpsellAllSetResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpsellAllSetResponseMetadata.copy$default(value, null, null, false, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpsellAllSetResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/UpsellAllSetResponseMetadata$Style;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STYLE_UNSPECIFIED", "STYLE_INDIVIDUAL", "STYLE_RETIREMENT", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Style implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Style> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Style STYLE_INDIVIDUAL;
        public static final Style STYLE_RETIREMENT;
        public static final Style STYLE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{STYLE_UNSPECIFIED, STYLE_INDIVIDUAL, STYLE_RETIREMENT};
        }

        @JvmStatic
        public static final Style fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        private Style(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Style style = new Style("STYLE_UNSPECIFIED", 0, 0);
            STYLE_UNSPECIFIED = style;
            STYLE_INDIVIDUAL = new Style("STYLE_INDIVIDUAL", 1, 1);
            STYLE_RETIREMENT = new Style("STYLE_RETIREMENT", 2, 2);
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(styleArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Style.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Style>(orCreateKotlinClass, syntax, style) { // from class: options_product.service.UpsellAllSetResponseMetadata$Style$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public UpsellAllSetResponseMetadata.Style fromValue(int value) {
                    return UpsellAllSetResponseMetadata.Style.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: UpsellAllSetResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/UpsellAllSetResponseMetadata$Style$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/UpsellAllSetResponseMetadata$Style;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Style fromValue(int value) {
                if (value == 0) {
                    return Style.STYLE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Style.STYLE_INDIVIDUAL;
                }
                if (value != 2) {
                    return null;
                }
                return Style.STYLE_RETIREMENT;
            }
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpsellAllSetResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Loptions_product/service/UpsellAllSetResponseMetadata$AccountTypeInCopy;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "NONE", "INDIVIDUAL", "IRA_ROTH", "IRA_TRADITIONAL", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
        public static final AccountTypeInCopy NONE;
        private final int value;

        private static final /* synthetic */ AccountTypeInCopy[] $values() {
            return new AccountTypeInCopy[]{ACCOUNT_TYPE_UNSPECIFIED, NONE, INDIVIDUAL, IRA_ROTH, IRA_TRADITIONAL};
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
            AccountTypeInCopy[] accountTypeInCopyArr$values = $values();
            $VALUES = accountTypeInCopyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeInCopyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountTypeInCopy.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountTypeInCopy>(orCreateKotlinClass, syntax, accountTypeInCopy) { // from class: options_product.service.UpsellAllSetResponseMetadata$AccountTypeInCopy$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public UpsellAllSetResponseMetadata.AccountTypeInCopy fromValue(int value) {
                    return UpsellAllSetResponseMetadata.AccountTypeInCopy.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: UpsellAllSetResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/UpsellAllSetResponseMetadata$AccountTypeInCopy$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/UpsellAllSetResponseMetadata$AccountTypeInCopy;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                if (value != 4) {
                    return null;
                }
                return AccountTypeInCopy.IRA_TRADITIONAL;
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
