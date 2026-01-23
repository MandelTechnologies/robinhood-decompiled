package account_aggregation.service.p005v1;

import account_aggregation.service.models.p004v1.AccountSwitcherAccount;
import account_aggregation.service.models.p004v1.AccountSwitcherLocation;
import account_aggregation.service.p005v1.GetAccountSwitcherResponse;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetAccountSwitcherResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JJ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponse;", "Lcom/squareup/wire/Message;", "", "asset_id", "", "location", "Laccount_aggregation/service/models/v1/AccountSwitcherLocation;", "title", "accounts", "", "Laccount_aggregation/service/v1/GetAccountSwitcherResponse$SelectableItem;", "positive_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Laccount_aggregation/service/models/v1/AccountSwitcherLocation;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getAsset_id", "()Ljava/lang/String;", "getLocation", "()Laccount_aggregation/service/models/v1/AccountSwitcherLocation;", "getTitle", "getPositive_button_text", "getAccounts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "SelectableItem", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetAccountSwitcherResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountSwitcherResponse> ADAPTER;

    @WireField(adapter = "account_aggregation.service.v1.GetAccountSwitcherResponse$SelectableItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<SelectableItem> accounts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetId", schemaIndex = 0, tag = 1)
    private final String asset_id;

    @WireField(adapter = "account_aggregation.service.models.v1.AccountSwitcherLocation#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountSwitcherLocation location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "positiveButtonText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String positive_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    public GetAccountSwitcherResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4340newBuilder();
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final AccountSwitcherLocation getLocation() {
        return this.location;
    }

    public /* synthetic */ GetAccountSwitcherResponse(String str, AccountSwitcherLocation accountSwitcherLocation, String str2, List list, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? AccountSwitcherLocation.ASL_UNSPECIFIED : accountSwitcherLocation, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPositive_button_text() {
        return this.positive_button_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountSwitcherResponse(String str, AccountSwitcherLocation location, String title, List<SelectableItem> accounts2, String positive_button_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_id = str;
        this.location = location;
        this.title = title;
        this.positive_button_text = positive_button_text;
        this.accounts = Internal.immutableCopyOf("accounts", accounts2);
    }

    public final List<SelectableItem> getAccounts() {
        return this.accounts;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4340newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountSwitcherResponse)) {
            return false;
        }
        GetAccountSwitcherResponse getAccountSwitcherResponse = (GetAccountSwitcherResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountSwitcherResponse.unknownFields()) && Intrinsics.areEqual(this.asset_id, getAccountSwitcherResponse.asset_id) && this.location == getAccountSwitcherResponse.location && Intrinsics.areEqual(this.title, getAccountSwitcherResponse.title) && Intrinsics.areEqual(this.accounts, getAccountSwitcherResponse.accounts) && Intrinsics.areEqual(this.positive_button_text, getAccountSwitcherResponse.positive_button_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.asset_id;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.location.hashCode()) * 37) + this.title.hashCode()) * 37) + this.accounts.hashCode()) * 37) + this.positive_button_text.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_id;
        if (str != null) {
            arrayList.add("asset_id=" + Internal.sanitize(str));
        }
        arrayList.add("location=" + this.location);
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.accounts.isEmpty()) {
            arrayList.add("accounts=" + this.accounts);
        }
        arrayList.add("positive_button_text=" + Internal.sanitize(this.positive_button_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountSwitcherResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountSwitcherResponse copy$default(GetAccountSwitcherResponse getAccountSwitcherResponse, String str, AccountSwitcherLocation accountSwitcherLocation, String str2, List list, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountSwitcherResponse.asset_id;
        }
        if ((i & 2) != 0) {
            accountSwitcherLocation = getAccountSwitcherResponse.location;
        }
        if ((i & 4) != 0) {
            str2 = getAccountSwitcherResponse.title;
        }
        if ((i & 8) != 0) {
            list = getAccountSwitcherResponse.accounts;
        }
        if ((i & 16) != 0) {
            str3 = getAccountSwitcherResponse.positive_button_text;
        }
        if ((i & 32) != 0) {
            byteString = getAccountSwitcherResponse.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return getAccountSwitcherResponse.copy(str, accountSwitcherLocation, str2, list, str4, byteString2);
    }

    public final GetAccountSwitcherResponse copy(String asset_id, AccountSwitcherLocation location, String title, List<SelectableItem> accounts2, String positive_button_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountSwitcherResponse(asset_id, location, title, accounts2, positive_button_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountSwitcherResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountSwitcherResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: account_aggregation.service.v1.GetAccountSwitcherResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getAsset_id());
                if (value.getLocation() != AccountSwitcherLocation.ASL_UNSPECIFIED) {
                    iEncodedSizeWithTag += AccountSwitcherLocation.ADAPTER.encodedSizeWithTag(2, value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getTitle());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + GetAccountSwitcherResponse.SelectableItem.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getAccounts());
                return !Intrinsics.areEqual(value.getPositive_button_text(), "") ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(5, value.getPositive_button_text()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAsset_id());
                if (value.getLocation() != AccountSwitcherLocation.ASL_UNSPECIFIED) {
                    AccountSwitcherLocation.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                GetAccountSwitcherResponse.SelectableItem.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAccounts());
                if (!Intrinsics.areEqual(value.getPositive_button_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getPositive_button_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPositive_button_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPositive_button_text());
                }
                GetAccountSwitcherResponse.SelectableItem.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAccounts());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (value.getLocation() != AccountSwitcherLocation.ASL_UNSPECIFIED) {
                    AccountSwitcherLocation.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocation());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountSwitcherResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AccountSwitcherLocation accountSwitcherLocationDecode = AccountSwitcherLocation.ASL_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                while (true) {
                    AccountSwitcherLocation accountSwitcherLocation = accountSwitcherLocationDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetAccountSwitcherResponse(strDecode3, accountSwitcherLocation, strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                accountSwitcherLocationDecode = AccountSwitcherLocation.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            arrayList.add(GetAccountSwitcherResponse.SelectableItem.ADAPTER.decode(reader));
                        } else if (iNextTag == 5) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountSwitcherResponse redact(GetAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccountSwitcherResponse.copy$default(value, null, null, null, Internal.m26823redactElements(value.getAccounts(), GetAccountSwitcherResponse.SelectableItem.ADAPTER), null, ByteString.EMPTY, 23, null);
            }
        };
    }

    /* compiled from: GetAccountSwitcherResponse.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponse$SelectableItem;", "Lcom/squareup/wire/Message;", "", "account", "Laccount_aggregation/service/models/v1/AccountSwitcherAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Laccount_aggregation/service/models/v1/AccountSwitcherAccount;Lokio/ByteString;)V", "getAccount", "()Laccount_aggregation/service/models/v1/AccountSwitcherAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SelectableItem extends Message {

        @JvmField
        public static final ProtoAdapter<SelectableItem> ADAPTER;

        @WireField(adapter = "account_aggregation.service.models.v1.AccountSwitcherAccount#ADAPTER", oneofName = OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, schemaIndex = 0, tag = 1)
        private final AccountSwitcherAccount account;

        /* JADX WARN: Multi-variable type inference failed */
        public SelectableItem() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m4341newBuilder();
        }

        public final AccountSwitcherAccount getAccount() {
            return this.account;
        }

        public /* synthetic */ SelectableItem(AccountSwitcherAccount accountSwitcherAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : accountSwitcherAccount, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectableItem(AccountSwitcherAccount accountSwitcherAccount, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.account = accountSwitcherAccount;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m4341newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SelectableItem)) {
                return false;
            }
            SelectableItem selectableItem = (SelectableItem) other;
            return Intrinsics.areEqual(unknownFields(), selectableItem.unknownFields()) && Intrinsics.areEqual(this.account, selectableItem.account);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            AccountSwitcherAccount accountSwitcherAccount = this.account;
            int iHashCode2 = iHashCode + (accountSwitcherAccount != null ? accountSwitcherAccount.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            AccountSwitcherAccount accountSwitcherAccount = this.account;
            if (accountSwitcherAccount != null) {
                arrayList.add("account=" + accountSwitcherAccount);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectableItem{", "}", 0, null, null, 56, null);
        }

        public final SelectableItem copy(AccountSwitcherAccount account, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new SelectableItem(account, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelectableItem.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<SelectableItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: account_aggregation.service.v1.GetAccountSwitcherResponse$SelectableItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetAccountSwitcherResponse.SelectableItem value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + AccountSwitcherAccount.ADAPTER.encodedSizeWithTag(1, value.getAccount());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetAccountSwitcherResponse.SelectableItem value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    AccountSwitcherAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetAccountSwitcherResponse.SelectableItem value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    AccountSwitcherAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetAccountSwitcherResponse.SelectableItem redact(GetAccountSwitcherResponse.SelectableItem value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    AccountSwitcherAccount account = value.getAccount();
                    return value.copy(account != null ? AccountSwitcherAccount.ADAPTER.redact(account) : null, ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetAccountSwitcherResponse.SelectableItem decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    AccountSwitcherAccount accountSwitcherAccountDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetAccountSwitcherResponse.SelectableItem(accountSwitcherAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            accountSwitcherAccountDecode = AccountSwitcherAccount.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
