package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
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

/* compiled from: PaymentLinkingContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "Lcom/squareup/wire/Message;", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;Lokio/ByteString;)V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EntryPoint", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PaymentLinkingContext extends Message {

    @JvmField
    public static final ProtoAdapter<PaymentLinkingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PaymentLinkingContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EntryPoint entry_point;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentLinkingContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24466newBuilder();
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public /* synthetic */ PaymentLinkingContext(EntryPoint entryPoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLinkingContext(EntryPoint entry_point, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point = entry_point;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24466newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PaymentLinkingContext)) {
            return false;
        }
        PaymentLinkingContext paymentLinkingContext = (PaymentLinkingContext) other;
        return Intrinsics.areEqual(unknownFields(), paymentLinkingContext.unknownFields()) && this.entry_point == paymentLinkingContext.entry_point;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.entry_point.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entry_point=" + this.entry_point);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentLinkingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PaymentLinkingContext copy$default(PaymentLinkingContext paymentLinkingContext, EntryPoint entryPoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = paymentLinkingContext.entry_point;
        }
        if ((i & 2) != 0) {
            byteString = paymentLinkingContext.unknownFields();
        }
        return paymentLinkingContext.copy(entryPoint, byteString);
    }

    public final PaymentLinkingContext copy(EntryPoint entry_point, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PaymentLinkingContext(entry_point, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PaymentLinkingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PaymentLinkingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PaymentLinkingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentLinkingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getEntry_point() != PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED ? size + PaymentLinkingContext.EntryPoint.ADAPTER.encodedSizeWithTag(1, value.getEntry_point()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentLinkingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEntry_point() != PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    PaymentLinkingContext.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentLinkingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEntry_point() != PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    PaymentLinkingContext.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentLinkingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PaymentLinkingContext.EntryPoint entryPointDecode = PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PaymentLinkingContext(entryPointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            entryPointDecode = PaymentLinkingContext.EntryPoint.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentLinkingContext redact(PaymentLinkingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PaymentLinkingContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentLinkingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "LINKED_ACCOUNTS_SECTION", "TRANSFER_ACCOUNT_SELECTION", "WITHDRAWAL_CONFIRMATION", "FIRST_TRADE_RECOMMENDATION", "MAX_TRANSFER_REVIEW", "DEEPLINK", "LINKED_ACCOUNTS_SECTION_ACTION_SHEET", "CATPAY", "USER_SIGN_UP", "PLAID_FALLBACK", "MENU_OF_OPTIONS", "TRANSFERS_V2_REVIEW", "CRYPTO_CHECKOUT_ACCOUNT_SELECTION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;
        public static final EntryPoint CATPAY;
        public static final EntryPoint CRYPTO_CHECKOUT_ACCOUNT_SELECTION;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint DEEPLINK;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint FIRST_TRADE_RECOMMENDATION;
        public static final EntryPoint LINKED_ACCOUNTS_SECTION;
        public static final EntryPoint LINKED_ACCOUNTS_SECTION_ACTION_SHEET;
        public static final EntryPoint MAX_TRANSFER_REVIEW;
        public static final EntryPoint MENU_OF_OPTIONS;
        public static final EntryPoint PLAID_FALLBACK;
        public static final EntryPoint TRANSFERS_V2_REVIEW;
        public static final EntryPoint TRANSFER_ACCOUNT_SELECTION;
        public static final EntryPoint USER_SIGN_UP;
        public static final EntryPoint WITHDRAWAL_CONFIRMATION;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, LINKED_ACCOUNTS_SECTION, TRANSFER_ACCOUNT_SELECTION, WITHDRAWAL_CONFIRMATION, FIRST_TRADE_RECOMMENDATION, MAX_TRANSFER_REVIEW, DEEPLINK, LINKED_ACCOUNTS_SECTION_ACTION_SHEET, CATPAY, USER_SIGN_UP, PLAID_FALLBACK, MENU_OF_OPTIONS, TRANSFERS_V2_REVIEW, CRYPTO_CHECKOUT_ACCOUNT_SELECTION};
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
            LINKED_ACCOUNTS_SECTION = new EntryPoint("LINKED_ACCOUNTS_SECTION", 1, 1);
            TRANSFER_ACCOUNT_SELECTION = new EntryPoint("TRANSFER_ACCOUNT_SELECTION", 2, 2);
            WITHDRAWAL_CONFIRMATION = new EntryPoint("WITHDRAWAL_CONFIRMATION", 3, 3);
            FIRST_TRADE_RECOMMENDATION = new EntryPoint("FIRST_TRADE_RECOMMENDATION", 4, 4);
            MAX_TRANSFER_REVIEW = new EntryPoint("MAX_TRANSFER_REVIEW", 5, 5);
            DEEPLINK = new EntryPoint("DEEPLINK", 6, 6);
            LINKED_ACCOUNTS_SECTION_ACTION_SHEET = new EntryPoint("LINKED_ACCOUNTS_SECTION_ACTION_SHEET", 7, 7);
            CATPAY = new EntryPoint("CATPAY", 8, 8);
            USER_SIGN_UP = new EntryPoint("USER_SIGN_UP", 9, 9);
            PLAID_FALLBACK = new EntryPoint("PLAID_FALLBACK", 10, 10);
            MENU_OF_OPTIONS = new EntryPoint("MENU_OF_OPTIONS", 11, 11);
            TRANSFERS_V2_REVIEW = new EntryPoint("TRANSFERS_V2_REVIEW", 12, 12);
            CRYPTO_CHECKOUT_ACCOUNT_SELECTION = new EntryPoint("CRYPTO_CHECKOUT_ACCOUNT_SELECTION", 13, 13);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.PaymentLinkingContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PaymentLinkingContext.EntryPoint fromValue(int value) {
                    return PaymentLinkingContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PaymentLinkingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return EntryPoint.LINKED_ACCOUNTS_SECTION;
                    case 2:
                        return EntryPoint.TRANSFER_ACCOUNT_SELECTION;
                    case 3:
                        return EntryPoint.WITHDRAWAL_CONFIRMATION;
                    case 4:
                        return EntryPoint.FIRST_TRADE_RECOMMENDATION;
                    case 5:
                        return EntryPoint.MAX_TRANSFER_REVIEW;
                    case 6:
                        return EntryPoint.DEEPLINK;
                    case 7:
                        return EntryPoint.LINKED_ACCOUNTS_SECTION_ACTION_SHEET;
                    case 8:
                        return EntryPoint.CATPAY;
                    case 9:
                        return EntryPoint.USER_SIGN_UP;
                    case 10:
                        return EntryPoint.PLAID_FALLBACK;
                    case 11:
                        return EntryPoint.MENU_OF_OPTIONS;
                    case 12:
                        return EntryPoint.TRANSFERS_V2_REVIEW;
                    case 13:
                        return EntryPoint.CRYPTO_CHECKOUT_ACCOUNT_SELECTION;
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
