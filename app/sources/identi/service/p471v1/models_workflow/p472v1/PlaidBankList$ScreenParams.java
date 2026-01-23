package identi.service.p471v1.models_workflow.p472v1;

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
import identi.service.p471v1.models_workflow.p472v1.PlaidBankList$ScreenParams;
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

/* compiled from: PlaidBankList.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002$%B?\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u001b\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001aR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m3636d2 = {"identi/service/v1/models_workflow/v1/PlaidBankList$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams;", "", "", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount;", "bank_list", "", "fallback_cta_text", "heading", "subheading", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams;", "Ljava/lang/String;", "getFallback_cta_text", "getHeading", "getSubheading", "Ljava/util/List;", "getBank_list", "()Ljava/util/List;", "Companion", "BankAccount", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PlaidBankList$ScreenParams extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidBankList$ScreenParams> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidBankList$ScreenParams$BankAccount#ADAPTER", jsonName = "bankList", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<BankAccount> bank_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fallbackCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String fallback_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String heading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String subheading;

    public PlaidBankList$ScreenParams() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28376newBuilder();
    }

    public /* synthetic */ PlaidBankList$ScreenParams(List list, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getFallback_cta_text() {
        return this.fallback_cta_text;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidBankList$ScreenParams(List<BankAccount> bank_list, String fallback_cta_text, String heading, String subheading, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bank_list, "bank_list");
        Intrinsics.checkNotNullParameter(fallback_cta_text, "fallback_cta_text");
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fallback_cta_text = fallback_cta_text;
        this.heading = heading;
        this.subheading = subheading;
        this.bank_list = Internal.immutableCopyOf("bank_list", bank_list);
    }

    public final List<BankAccount> getBank_list() {
        return this.bank_list;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28376newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidBankList$ScreenParams)) {
            return false;
        }
        PlaidBankList$ScreenParams plaidBankList$ScreenParams = (PlaidBankList$ScreenParams) other;
        return Intrinsics.areEqual(unknownFields(), plaidBankList$ScreenParams.unknownFields()) && Intrinsics.areEqual(this.bank_list, plaidBankList$ScreenParams.bank_list) && Intrinsics.areEqual(this.fallback_cta_text, plaidBankList$ScreenParams.fallback_cta_text) && Intrinsics.areEqual(this.heading, plaidBankList$ScreenParams.heading) && Intrinsics.areEqual(this.subheading, plaidBankList$ScreenParams.subheading);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.bank_list.hashCode()) * 37) + this.fallback_cta_text.hashCode()) * 37) + this.heading.hashCode()) * 37) + this.subheading.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.bank_list.isEmpty()) {
            arrayList.add("bank_list=" + this.bank_list);
        }
        arrayList.add("fallback_cta_text=" + Internal.sanitize(this.fallback_cta_text));
        arrayList.add("heading=" + Internal.sanitize(this.heading));
        arrayList.add("subheading=" + Internal.sanitize(this.subheading));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidBankList$ScreenParams copy$default(PlaidBankList$ScreenParams plaidBankList$ScreenParams, List list, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = plaidBankList$ScreenParams.bank_list;
        }
        if ((i & 2) != 0) {
            str = plaidBankList$ScreenParams.fallback_cta_text;
        }
        if ((i & 4) != 0) {
            str2 = plaidBankList$ScreenParams.heading;
        }
        if ((i & 8) != 0) {
            str3 = plaidBankList$ScreenParams.subheading;
        }
        if ((i & 16) != 0) {
            byteString = plaidBankList$ScreenParams.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return plaidBankList$ScreenParams.copy(list, str, str4, str3, byteString2);
    }

    public final PlaidBankList$ScreenParams copy(List<BankAccount> bank_list, String fallback_cta_text, String heading, String subheading, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bank_list, "bank_list");
        Intrinsics.checkNotNullParameter(fallback_cta_text, "fallback_cta_text");
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidBankList$ScreenParams(bank_list, fallback_cta_text, heading, subheading, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidBankList$ScreenParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidBankList$ScreenParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidBankList$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidBankList$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + PlaidBankList$ScreenParams.BankAccount.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getBank_list());
                if (!Intrinsics.areEqual(value.getFallback_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFallback_cta_text());
                }
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getHeading());
                }
                return !Intrinsics.areEqual(value.getSubheading(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubheading()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidBankList$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidBankList$ScreenParams.BankAccount.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getBank_list());
                if (!Intrinsics.areEqual(value.getFallback_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFallback_cta_text());
                }
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHeading());
                }
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubheading());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidBankList$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubheading());
                }
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHeading());
                }
                if (!Intrinsics.areEqual(value.getFallback_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFallback_cta_text());
                }
                PlaidBankList$ScreenParams.BankAccount.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getBank_list());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidBankList$ScreenParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaidBankList$ScreenParams(arrayList, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(PlaidBankList$ScreenParams.BankAccount.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidBankList$ScreenParams redact(PlaidBankList$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PlaidBankList$ScreenParams.copy$default(value, Internal.m26823redactElements(value.getBank_list(), PlaidBankList$ScreenParams.BankAccount.ADAPTER), null, null, null, ByteString.EMPTY, 14, null);
            }
        };
    }

    /* compiled from: PlaidBankList.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount;", "Lcom/squareup/wire/Message;", "", "bank_account_nickname", "", "bank_account_type", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount$Type;", "bank_account_number_last_four", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount$Type;Ljava/lang/String;Lokio/ByteString;)V", "getBank_account_nickname", "()Ljava/lang/String;", "getBank_account_type", "()Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount$Type;", "getBank_account_number_last_four", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Type", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BankAccount extends Message {

        @JvmField
        public static final ProtoAdapter<BankAccount> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountNickname", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String bank_account_nickname;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountNumberLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String bank_account_number_last_four;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidBankList$ScreenParams$BankAccount$Type#ADAPTER", jsonName = "bankAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Type bank_account_type;

        public BankAccount() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ BankAccount(String str, Type type2, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28377newBuilder();
        }

        public final String getBank_account_nickname() {
            return this.bank_account_nickname;
        }

        public final Type getBank_account_type() {
            return this.bank_account_type;
        }

        public final String getBank_account_number_last_four() {
            return this.bank_account_number_last_four;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(String bank_account_nickname, Type bank_account_type, String bank_account_number_last_four, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
            Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
            Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.bank_account_nickname = bank_account_nickname;
            this.bank_account_type = bank_account_type;
            this.bank_account_number_last_four = bank_account_number_last_four;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28377newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BankAccount)) {
                return false;
            }
            BankAccount bankAccount = (BankAccount) other;
            return Intrinsics.areEqual(unknownFields(), bankAccount.unknownFields()) && Intrinsics.areEqual(this.bank_account_nickname, bankAccount.bank_account_nickname) && this.bank_account_type == bankAccount.bank_account_type && Intrinsics.areEqual(this.bank_account_number_last_four, bankAccount.bank_account_number_last_four);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.bank_account_nickname.hashCode()) * 37) + this.bank_account_type.hashCode()) * 37) + this.bank_account_number_last_four.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("bank_account_nickname=" + Internal.sanitize(this.bank_account_nickname));
            arrayList.add("bank_account_type=" + this.bank_account_type);
            arrayList.add("bank_account_number_last_four=" + Internal.sanitize(this.bank_account_number_last_four));
            return CollectionsKt.joinToString$default(arrayList, ", ", "BankAccount{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, Type type2, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.bank_account_nickname;
            }
            if ((i & 2) != 0) {
                type2 = bankAccount.bank_account_type;
            }
            if ((i & 4) != 0) {
                str2 = bankAccount.bank_account_number_last_four;
            }
            if ((i & 8) != 0) {
                byteString = bankAccount.unknownFields();
            }
            return bankAccount.copy(str, type2, str2, byteString);
        }

        public final BankAccount copy(String bank_account_nickname, Type bank_account_type, String bank_account_number_last_four, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
            Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
            Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new BankAccount(bank_account_nickname, bank_account_type, bank_account_number_last_four, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BankAccount.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<BankAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidBankList$ScreenParams$BankAccount$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PlaidBankList$ScreenParams.BankAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getBank_account_nickname(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBank_account_nickname());
                    }
                    if (value.getBank_account_type() != PlaidBankList$ScreenParams.BankAccount.Type.TYPE_UNSPECIFIED) {
                        size += PlaidBankList$ScreenParams.BankAccount.Type.ADAPTER.encodedSizeWithTag(2, value.getBank_account_type());
                    }
                    return !Intrinsics.areEqual(value.getBank_account_number_last_four(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBank_account_number_last_four()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PlaidBankList$ScreenParams.BankAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getBank_account_nickname(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBank_account_nickname());
                    }
                    if (value.getBank_account_type() != PlaidBankList$ScreenParams.BankAccount.Type.TYPE_UNSPECIFIED) {
                        PlaidBankList$ScreenParams.BankAccount.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getBank_account_type());
                    }
                    if (!Intrinsics.areEqual(value.getBank_account_number_last_four(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBank_account_number_last_four());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PlaidBankList$ScreenParams.BankAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getBank_account_number_last_four(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBank_account_number_last_four());
                    }
                    if (value.getBank_account_type() != PlaidBankList$ScreenParams.BankAccount.Type.TYPE_UNSPECIFIED) {
                        PlaidBankList$ScreenParams.BankAccount.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getBank_account_type());
                    }
                    if (Intrinsics.areEqual(value.getBank_account_nickname(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBank_account_nickname());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$ScreenParams.BankAccount decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    PlaidBankList$ScreenParams.BankAccount.Type typeDecode = PlaidBankList$ScreenParams.BankAccount.Type.TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PlaidBankList$ScreenParams.BankAccount(strDecode, typeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                typeDecode = PlaidBankList$ScreenParams.BankAccount.Type.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$ScreenParams.BankAccount redact(PlaidBankList$ScreenParams.BankAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return PlaidBankList$ScreenParams.BankAccount.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PlaidBankList.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "CHECKING", "SAVINGS", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Type implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Type> ADAPTER;
            public static final Type CHECKING;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Type SAVINGS;
            public static final Type TYPE_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TYPE_UNSPECIFIED, CHECKING, SAVINGS};
            }

            @JvmStatic
            public static final Type fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
                TYPE_UNSPECIFIED = type2;
                CHECKING = new Type("CHECKING", 1, 1);
                SAVINGS = new Type("SAVINGS", 2, 2);
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: identi.service.v1.models_workflow.v1.PlaidBankList$ScreenParams$BankAccount$Type$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public PlaidBankList$ScreenParams.BankAccount.Type fromValue(int value) {
                        return PlaidBankList$ScreenParams.BankAccount.Type.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: PlaidBankList.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams$BankAccount$Type;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Type fromValue(int value) {
                    if (value == 0) {
                        return Type.TYPE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Type.CHECKING;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Type.SAVINGS;
                }
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }
}
