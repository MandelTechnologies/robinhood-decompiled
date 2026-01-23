package bonfire.proto.idl.crypto.p033v1;

import bonfire.proto.idl.crypto.p033v1.GetNonCurrencyPairAccountSwitcherResponse;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
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
import java.util.List;
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
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.Icon;
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: GetNonCurrencyPairAccountSwitcherResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse;", "Lcom/squareup/wire/Message;", "", CryptoHomeCtaButtons.DEFAULT_ID, "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher;Lokio/ByteString;)V", "getHome", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "NonCurrencyPairAccountSwitcherType", "NonCurrencyPairAccountSwitcherAccount", "NonCurrencyPairAccountSwitcher", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetNonCurrencyPairAccountSwitcherResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetNonCurrencyPairAccountSwitcherResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final NonCurrencyPairAccountSwitcher home;

    /* JADX WARN: Multi-variable type inference failed */
    public GetNonCurrencyPairAccountSwitcherResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8949newBuilder();
    }

    public final NonCurrencyPairAccountSwitcher getHome() {
        return this.home;
    }

    public /* synthetic */ GetNonCurrencyPairAccountSwitcherResponse(NonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nonCurrencyPairAccountSwitcher, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNonCurrencyPairAccountSwitcherResponse(NonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.home = nonCurrencyPairAccountSwitcher;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8949newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNonCurrencyPairAccountSwitcherResponse)) {
            return false;
        }
        GetNonCurrencyPairAccountSwitcherResponse getNonCurrencyPairAccountSwitcherResponse = (GetNonCurrencyPairAccountSwitcherResponse) other;
        return Intrinsics.areEqual(unknownFields(), getNonCurrencyPairAccountSwitcherResponse.unknownFields()) && Intrinsics.areEqual(this.home, getNonCurrencyPairAccountSwitcherResponse.home);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        NonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher = this.home;
        int iHashCode2 = iHashCode + (nonCurrencyPairAccountSwitcher != null ? nonCurrencyPairAccountSwitcher.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        NonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher = this.home;
        if (nonCurrencyPairAccountSwitcher != null) {
            arrayList.add("home=" + nonCurrencyPairAccountSwitcher);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNonCurrencyPairAccountSwitcherResponse{", "}", 0, null, null, 56, null);
    }

    public final GetNonCurrencyPairAccountSwitcherResponse copy(NonCurrencyPairAccountSwitcher home, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNonCurrencyPairAccountSwitcherResponse(home, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNonCurrencyPairAccountSwitcherResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNonCurrencyPairAccountSwitcherResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNonCurrencyPairAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getHome() != null ? size + GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher.ADAPTER.encodedSizeWithTag(1, value.getHome()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNonCurrencyPairAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHome() != null) {
                    GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 1, (int) value.getHome());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNonCurrencyPairAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHome() != null) {
                    GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 1, (int) value.getHome());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNonCurrencyPairAccountSwitcherResponse redact(GetNonCurrencyPairAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher home = value.getHome();
                return value.copy(home != null ? GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher.ADAPTER.redact(home) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetNonCurrencyPairAccountSwitcherResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcherDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetNonCurrencyPairAccountSwitcherResponse(nonCurrencyPairAccountSwitcherDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        nonCurrencyPairAccountSwitcherDecode = GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetNonCurrencyPairAccountSwitcherResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", "NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NonCurrencyPairAccountSwitcherType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NonCurrencyPairAccountSwitcherType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<NonCurrencyPairAccountSwitcherType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final NonCurrencyPairAccountSwitcherType NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME;
        public static final NonCurrencyPairAccountSwitcherType NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ NonCurrencyPairAccountSwitcherType[] $values() {
            return new NonCurrencyPairAccountSwitcherType[]{NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED, NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME};
        }

        @JvmStatic
        public static final NonCurrencyPairAccountSwitcherType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<NonCurrencyPairAccountSwitcherType> getEntries() {
            return $ENTRIES;
        }

        private NonCurrencyPairAccountSwitcherType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final NonCurrencyPairAccountSwitcherType nonCurrencyPairAccountSwitcherType = new NonCurrencyPairAccountSwitcherType("NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", 0, 0);
            NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED = nonCurrencyPairAccountSwitcherType;
            NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME = new NonCurrencyPairAccountSwitcherType("NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME", 1, 1);
            NonCurrencyPairAccountSwitcherType[] nonCurrencyPairAccountSwitcherTypeArr$values = $values();
            $VALUES = nonCurrencyPairAccountSwitcherTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nonCurrencyPairAccountSwitcherTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NonCurrencyPairAccountSwitcherType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<NonCurrencyPairAccountSwitcherType>(orCreateKotlinClass, syntax, nonCurrencyPairAccountSwitcherType) { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType fromValue(int value) {
                    return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "fromValue", "value", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final NonCurrencyPairAccountSwitcherType fromValue(int value) {
                if (value == 0) {
                    return NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME;
            }
        }

        public static NonCurrencyPairAccountSwitcherType valueOf(String str) {
            return (NonCurrencyPairAccountSwitcherType) Enum.valueOf(NonCurrencyPairAccountSwitcherType.class, str);
        }

        public static NonCurrencyPairAccountSwitcherType[] values() {
            return (NonCurrencyPairAccountSwitcherType[]) $VALUES.clone();
        }
    }

    /* compiled from: GetNonCurrencyPairAccountSwitcherResponse.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0089\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u008f\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010#R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010#R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010#R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b+\u0010#R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b\r\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\"\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount;", "Lcom/squareup/wire/Message;", "", "", "rhf_account_number", "rhs_account_number", "crypto_account_id", "entry_title", "title", "subtitle", "Lrh_server_driven_ui/v1/Icon;", "icon", "", "is_selectable", "Lrosetta/account/BrokerageAccountType;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementType;", "management_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;ZLrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;ZLrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Lj$/time/Instant;Lokio/ByteString;)Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount;", "Ljava/lang/String;", "getRhf_account_number", "getRhs_account_number", "getCrypto_account_id", "getEntry_title", "getTitle", "getSubtitle", "Lrh_server_driven_ui/v1/Icon;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "Z", "()Z", "Lrosetta/account/BrokerageAccountType;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "Lrosetta/account/ManagementType;", "getManagement_type", "()Lrosetta/account/ManagementType;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NonCurrencyPairAccountSwitcherAccount extends Message {

        @JvmField
        public static final ProtoAdapter<NonCurrencyPairAccountSwitcherAccount> ADAPTER;

        @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
        private final BrokerageAccountType brokerage_account_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
        private final Instant created_at;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        private final String crypto_account_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String entry_title;

        @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final boolean is_selectable;

        @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
        private final ManagementType management_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String rhf_account_number;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String rhs_account_number;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String title;

        public NonCurrencyPairAccountSwitcherAccount() {
            this(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null);
        }

        public /* synthetic */ NonCurrencyPairAccountSwitcherAccount(String str, String str2, String str3, String str4, String str5, String str6, Icon icon, boolean z, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 128) != 0 ? false : z, (i & 256) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 512) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 1024) == 0 ? instant : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8951newBuilder();
        }

        public final String getRhf_account_number() {
            return this.rhf_account_number;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getCrypto_account_id() {
            return this.crypto_account_id;
        }

        public final String getEntry_title() {
            return this.entry_title;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: is_selectable, reason: from getter */
        public final boolean getIs_selectable() {
            return this.is_selectable;
        }

        public final BrokerageAccountType getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        public final ManagementType getManagement_type() {
            return this.management_type;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonCurrencyPairAccountSwitcherAccount(String rhf_account_number, String rhs_account_number, String str, String entry_title, String title, String subtitle, Icon icon, boolean z, BrokerageAccountType brokerage_account_type, ManagementType management_type, Instant instant, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(entry_title, "entry_title");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.rhf_account_number = rhf_account_number;
            this.rhs_account_number = rhs_account_number;
            this.crypto_account_id = str;
            this.entry_title = entry_title;
            this.title = title;
            this.subtitle = subtitle;
            this.icon = icon;
            this.is_selectable = z;
            this.brokerage_account_type = brokerage_account_type;
            this.management_type = management_type;
            this.created_at = instant;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8951newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof NonCurrencyPairAccountSwitcherAccount)) {
                return false;
            }
            NonCurrencyPairAccountSwitcherAccount nonCurrencyPairAccountSwitcherAccount = (NonCurrencyPairAccountSwitcherAccount) other;
            return Intrinsics.areEqual(unknownFields(), nonCurrencyPairAccountSwitcherAccount.unknownFields()) && Intrinsics.areEqual(this.rhf_account_number, nonCurrencyPairAccountSwitcherAccount.rhf_account_number) && Intrinsics.areEqual(this.rhs_account_number, nonCurrencyPairAccountSwitcherAccount.rhs_account_number) && Intrinsics.areEqual(this.crypto_account_id, nonCurrencyPairAccountSwitcherAccount.crypto_account_id) && Intrinsics.areEqual(this.entry_title, nonCurrencyPairAccountSwitcherAccount.entry_title) && Intrinsics.areEqual(this.title, nonCurrencyPairAccountSwitcherAccount.title) && Intrinsics.areEqual(this.subtitle, nonCurrencyPairAccountSwitcherAccount.subtitle) && this.icon == nonCurrencyPairAccountSwitcherAccount.icon && this.is_selectable == nonCurrencyPairAccountSwitcherAccount.is_selectable && this.brokerage_account_type == nonCurrencyPairAccountSwitcherAccount.brokerage_account_type && this.management_type == nonCurrencyPairAccountSwitcherAccount.management_type && Intrinsics.areEqual(this.created_at, nonCurrencyPairAccountSwitcherAccount.created_at);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.rhf_account_number.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37;
            String str = this.crypto_account_id;
            int iHashCode2 = (((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.entry_title.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.icon.hashCode()) * 37) + Boolean.hashCode(this.is_selectable)) * 37) + this.brokerage_account_type.hashCode()) * 37) + this.management_type.hashCode()) * 37;
            Instant instant = this.created_at;
            int iHashCode3 = iHashCode2 + (instant != null ? instant.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("rhf_account_number=" + Internal.sanitize(this.rhf_account_number));
            arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
            String str = this.crypto_account_id;
            if (str != null) {
                arrayList.add("crypto_account_id=" + Internal.sanitize(str));
            }
            arrayList.add("entry_title=" + Internal.sanitize(this.entry_title));
            arrayList.add("title=" + Internal.sanitize(this.title));
            arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
            arrayList.add("icon=" + this.icon);
            arrayList.add("is_selectable=" + this.is_selectable);
            arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
            arrayList.add("management_type=" + this.management_type);
            Instant instant = this.created_at;
            if (instant != null) {
                arrayList.add("created_at=" + instant);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NonCurrencyPairAccountSwitcherAccount{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ NonCurrencyPairAccountSwitcherAccount copy$default(NonCurrencyPairAccountSwitcherAccount nonCurrencyPairAccountSwitcherAccount, String str, String str2, String str3, String str4, String str5, String str6, Icon icon, boolean z, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nonCurrencyPairAccountSwitcherAccount.rhf_account_number;
            }
            if ((i & 2) != 0) {
                str2 = nonCurrencyPairAccountSwitcherAccount.rhs_account_number;
            }
            if ((i & 4) != 0) {
                str3 = nonCurrencyPairAccountSwitcherAccount.crypto_account_id;
            }
            if ((i & 8) != 0) {
                str4 = nonCurrencyPairAccountSwitcherAccount.entry_title;
            }
            if ((i & 16) != 0) {
                str5 = nonCurrencyPairAccountSwitcherAccount.title;
            }
            if ((i & 32) != 0) {
                str6 = nonCurrencyPairAccountSwitcherAccount.subtitle;
            }
            if ((i & 64) != 0) {
                icon = nonCurrencyPairAccountSwitcherAccount.icon;
            }
            if ((i & 128) != 0) {
                z = nonCurrencyPairAccountSwitcherAccount.is_selectable;
            }
            if ((i & 256) != 0) {
                brokerageAccountType = nonCurrencyPairAccountSwitcherAccount.brokerage_account_type;
            }
            if ((i & 512) != 0) {
                managementType = nonCurrencyPairAccountSwitcherAccount.management_type;
            }
            if ((i & 1024) != 0) {
                instant = nonCurrencyPairAccountSwitcherAccount.created_at;
            }
            if ((i & 2048) != 0) {
                byteString = nonCurrencyPairAccountSwitcherAccount.unknownFields();
            }
            Instant instant2 = instant;
            ByteString byteString2 = byteString;
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            ManagementType managementType2 = managementType;
            Icon icon2 = icon;
            boolean z2 = z;
            String str7 = str5;
            String str8 = str6;
            return nonCurrencyPairAccountSwitcherAccount.copy(str, str2, str3, str4, str7, str8, icon2, z2, brokerageAccountType2, managementType2, instant2, byteString2);
        }

        public final NonCurrencyPairAccountSwitcherAccount copy(String rhf_account_number, String rhs_account_number, String crypto_account_id, String entry_title, String title, String subtitle, Icon icon, boolean is_selectable, BrokerageAccountType brokerage_account_type, ManagementType management_type, Instant created_at, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(entry_title, "entry_title");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new NonCurrencyPairAccountSwitcherAccount(rhf_account_number, rhs_account_number, crypto_account_id, entry_title, title, subtitle, icon, is_selectable, brokerage_account_type, management_type, created_at, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NonCurrencyPairAccountSwitcherAccount.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<NonCurrencyPairAccountSwitcherAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhf_account_number());
                    }
                    if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRhs_account_number());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getCrypto_account_id());
                    if (!Intrinsics.areEqual(value.getEntry_title(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getEntry_title());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getSubtitle());
                    }
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        iEncodedSizeWithTag += Icon.ADAPTER.encodedSizeWithTag(7, value.getIcon());
                    }
                    if (value.getIs_selectable()) {
                        iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_selectable()));
                    }
                    if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                        iEncodedSizeWithTag += BrokerageAccountType.ADAPTER.encodedSizeWithTag(9, value.getBrokerage_account_type());
                    }
                    if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                        iEncodedSizeWithTag += ManagementType.ADAPTER.encodedSizeWithTag(10, value.getManagement_type());
                    }
                    return value.getCreated_at() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getCreated_at()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhf_account_number());
                    }
                    if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getCrypto_account_id());
                    if (!Intrinsics.areEqual(value.getEntry_title(), "")) {
                        protoAdapter.encodeWithTag(writer, 4, (int) value.getEntry_title());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        protoAdapter.encodeWithTag(writer, 5, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        protoAdapter.encodeWithTag(writer, 6, (int) value.getSubtitle());
                    }
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        Icon.ADAPTER.encodeWithTag(writer, 7, (int) value.getIcon());
                    }
                    if (value.getIs_selectable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_selectable()));
                    }
                    if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                        BrokerageAccountType.ADAPTER.encodeWithTag(writer, 9, (int) value.getBrokerage_account_type());
                    }
                    if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                        ManagementType.ADAPTER.encodeWithTag(writer, 10, (int) value.getManagement_type());
                    }
                    if (value.getCreated_at() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getCreated_at() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                    }
                    if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                        ManagementType.ADAPTER.encodeWithTag(writer, 10, (int) value.getManagement_type());
                    }
                    if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                        BrokerageAccountType.ADAPTER.encodeWithTag(writer, 9, (int) value.getBrokerage_account_type());
                    }
                    if (value.getIs_selectable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_selectable()));
                    }
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        Icon.ADAPTER.encodeWithTag(writer, 7, (int) value.getIcon());
                    }
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSubtitle());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getEntry_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEntry_title());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getCrypto_account_id());
                    if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                    }
                    if (Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                        return;
                    }
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getRhf_account_number());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount decode(ProtoReader reader) throws IOException {
                    Icon icon;
                    BrokerageAccountType brokerageAccountType;
                    ManagementType managementType;
                    String str;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Icon icon2 = Icon.ICON_UNSPECIFIED;
                    BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                    ManagementType managementType2 = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    String strDecode4 = null;
                    Instant instantDecode = null;
                    boolean zBooleanValue = false;
                    ManagementType managementTypeDecode = managementType2;
                    String strDecode5 = strDecode3;
                    String strDecode6 = strDecode5;
                    BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType2;
                    Icon iconDecode = icon2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 3:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 4:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 5:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 6:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 7:
                                    icon = iconDecode;
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    managementType = managementTypeDecode;
                                    str = strDecode5;
                                    try {
                                        iconDecode = Icon.ADAPTER.decode(reader);
                                        strDecode5 = str;
                                        managementTypeDecode = managementType;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 8:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 9:
                                    icon = iconDecode;
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    try {
                                        brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                        iconDecode = icon;
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        managementType = managementTypeDecode;
                                        str = strDecode5;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 10:
                                    try {
                                        managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        icon = iconDecode;
                                        brokerageAccountType = brokerageAccountTypeDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 11:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    icon = iconDecode;
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    managementType = managementTypeDecode;
                                    str = strDecode5;
                                    strDecode5 = str;
                                    managementTypeDecode = managementType;
                                    iconDecode = icon;
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                            }
                        } else {
                            return new GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount(strDecode5, strDecode6, strDecode4, strDecode, strDecode2, strDecode3, iconDecode, zBooleanValue, brokerageAccountTypeDecode, managementTypeDecode, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount redact(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Instant created_at = value.getCreated_at();
                    return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount.copy$default(value, null, null, null, null, null, null, null, false, null, null, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, ByteString.EMPTY, 1023, null);
                }
            };
        }
    }

    /* compiled from: GetNonCurrencyPairAccountSwitcherResponse.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher;", "Lcom/squareup/wire/Message;", "", "type", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "title", "", "accounts", "", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount;", "positive_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "getTitle", "()Ljava/lang/String;", "getPositive_button_text", "getAccounts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NonCurrencyPairAccountSwitcher extends Message {

        @JvmField
        public static final ProtoAdapter<NonCurrencyPairAccountSwitcher> ADAPTER;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        private final List<NonCurrencyPairAccountSwitcherAccount> accounts;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String positive_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String title;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final NonCurrencyPairAccountSwitcherType type;

        public NonCurrencyPairAccountSwitcher() {
            this(null, null, null, null, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8950newBuilder();
        }

        public final NonCurrencyPairAccountSwitcherType getType() {
            return this.type;
        }

        public /* synthetic */ NonCurrencyPairAccountSwitcher(NonCurrencyPairAccountSwitcherType nonCurrencyPairAccountSwitcherType, String str, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED : nonCurrencyPairAccountSwitcherType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPositive_button_text() {
            return this.positive_button_text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonCurrencyPairAccountSwitcher(NonCurrencyPairAccountSwitcherType type2, String title, List<NonCurrencyPairAccountSwitcherAccount> accounts2, String positive_button_text, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.type = type2;
            this.title = title;
            this.positive_button_text = positive_button_text;
            this.accounts = Internal.immutableCopyOf("accounts", accounts2);
        }

        public final List<NonCurrencyPairAccountSwitcherAccount> getAccounts() {
            return this.accounts;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8950newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof NonCurrencyPairAccountSwitcher)) {
                return false;
            }
            NonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher = (NonCurrencyPairAccountSwitcher) other;
            return Intrinsics.areEqual(unknownFields(), nonCurrencyPairAccountSwitcher.unknownFields()) && this.type == nonCurrencyPairAccountSwitcher.type && Intrinsics.areEqual(this.title, nonCurrencyPairAccountSwitcher.title) && Intrinsics.areEqual(this.accounts, nonCurrencyPairAccountSwitcher.accounts) && Intrinsics.areEqual(this.positive_button_text, nonCurrencyPairAccountSwitcher.positive_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.title.hashCode()) * 37) + this.accounts.hashCode()) * 37) + this.positive_button_text.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("type=" + this.type);
            arrayList.add("title=" + Internal.sanitize(this.title));
            if (!this.accounts.isEmpty()) {
                arrayList.add("accounts=" + this.accounts);
            }
            arrayList.add("positive_button_text=" + Internal.sanitize(this.positive_button_text));
            return CollectionsKt.joinToString$default(arrayList, ", ", "NonCurrencyPairAccountSwitcher{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ NonCurrencyPairAccountSwitcher copy$default(NonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher, NonCurrencyPairAccountSwitcherType nonCurrencyPairAccountSwitcherType, String str, List list, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                nonCurrencyPairAccountSwitcherType = nonCurrencyPairAccountSwitcher.type;
            }
            if ((i & 2) != 0) {
                str = nonCurrencyPairAccountSwitcher.title;
            }
            if ((i & 4) != 0) {
                list = nonCurrencyPairAccountSwitcher.accounts;
            }
            if ((i & 8) != 0) {
                str2 = nonCurrencyPairAccountSwitcher.positive_button_text;
            }
            if ((i & 16) != 0) {
                byteString = nonCurrencyPairAccountSwitcher.unknownFields();
            }
            ByteString byteString2 = byteString;
            List list2 = list;
            return nonCurrencyPairAccountSwitcher.copy(nonCurrencyPairAccountSwitcherType, str, list2, str2, byteString2);
        }

        public final NonCurrencyPairAccountSwitcher copy(NonCurrencyPairAccountSwitcherType type2, String title, List<NonCurrencyPairAccountSwitcherAccount> accounts2, String positive_button_text, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new NonCurrencyPairAccountSwitcher(type2, title, accounts2, positive_button_text, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NonCurrencyPairAccountSwitcher.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<NonCurrencyPairAccountSwitcher>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getType() != GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED) {
                        size += GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.ADAPTER.encodedSizeWithTag(1, value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                    }
                    int iEncodedSizeWithTag = size + GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAccounts());
                    return !Intrinsics.areEqual(value.getPositive_button_text(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPositive_button_text()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getType() != GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED) {
                        GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAccounts());
                    if (!Intrinsics.areEqual(value.getPositive_button_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPositive_button_text());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getPositive_button_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPositive_button_text());
                    }
                    GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAccounts());
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    if (value.getType() != GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED) {
                        GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType nonCurrencyPairAccountSwitcherTypeDecode = GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    while (true) {
                        GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType nonCurrencyPairAccountSwitcherType = nonCurrencyPairAccountSwitcherTypeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher(nonCurrencyPairAccountSwitcherType, strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    nonCurrencyPairAccountSwitcherTypeDecode = GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                arrayList.add(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount.ADAPTER.decode(reader));
                            } else if (iNextTag == 4) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher redact(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher.copy$default(value, null, null, Internal.m26823redactElements(value.getAccounts(), GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount.ADAPTER), null, ByteString.EMPTY, 11, null);
                }
            };
        }
    }
}
