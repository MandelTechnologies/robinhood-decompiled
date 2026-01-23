package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: BrokerageAccountContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\"\u001a\u00020\u0002H\u0017J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010*R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\n\u0010\u001dR\u001c\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\r\u0010\u001fR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "Lcom/squareup/wire/Message;", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountType;", "account_number", "", "management_type", "Lrosetta/account/ManagementType;", "account_state", "is_original", "", "is_default", "is_original_account", "is_default_account", "masked_account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/account/BrokerageAccountType;Ljava/lang/String;Lrosetta/account/ManagementType;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_type", "()Lrosetta/account/BrokerageAccountType;", "getAccount_number", "()Ljava/lang/String;", "getManagement_type", "()Lrosetta/account/ManagementType;", "getAccount_state", "is_original$annotations", "()V", "()Z", "is_default$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMasked_account_number", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lrosetta/account/BrokerageAccountType;Ljava/lang/String;Lrosetta/account/ManagementType;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class BrokerageAccountContext extends Message {

    @JvmField
    public static final ProtoAdapter<BrokerageAccountContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_state;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BrokerageAccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDefault", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_default;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDefaultAccount", oneofName = "default_wrapper", schemaIndex = 7, tag = 8)
    private final java.lang.Boolean is_default_account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOriginal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_original;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOriginalAccount", oneofName = "original_wrapper", schemaIndex = 6, tag = 7)
    private final java.lang.Boolean is_original_account;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ManagementType management_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 1002)
    private final String masked_account_number;

    public BrokerageAccountContext() {
        this(null, null, null, null, false, false, null, null, null, null, 1023, null);
    }

    @Deprecated
    public static /* synthetic */ void is_default$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void is_original$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24033newBuilder();
    }

    public final BrokerageAccountType getAccount_type() {
        return this.account_type;
    }

    public /* synthetic */ BrokerageAccountContext(BrokerageAccountType brokerageAccountType, String str, ManagementType managementType, String str2, boolean z, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    public final String getAccount_state() {
        return this.account_state;
    }

    /* renamed from: is_original, reason: from getter */
    public final boolean getIs_original() {
        return this.is_original;
    }

    /* renamed from: is_default, reason: from getter */
    public final boolean getIs_default() {
        return this.is_default;
    }

    /* renamed from: is_original_account, reason: from getter */
    public final java.lang.Boolean getIs_original_account() {
        return this.is_original_account;
    }

    /* renamed from: is_default_account, reason: from getter */
    public final java.lang.Boolean getIs_default_account() {
        return this.is_default_account;
    }

    public final String getMasked_account_number() {
        return this.masked_account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrokerageAccountContext(BrokerageAccountType account_type, String account_number, ManagementType management_type, String account_state, boolean z, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, String masked_account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(account_state, "account_state");
        Intrinsics.checkNotNullParameter(masked_account_number, "masked_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_type = account_type;
        this.account_number = account_number;
        this.management_type = management_type;
        this.account_state = account_state;
        this.is_original = z;
        this.is_default = z2;
        this.is_original_account = bool;
        this.is_default_account = bool2;
        this.masked_account_number = masked_account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24033newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrokerageAccountContext)) {
            return false;
        }
        BrokerageAccountContext brokerageAccountContext = (BrokerageAccountContext) other;
        return Intrinsics.areEqual(unknownFields(), brokerageAccountContext.unknownFields()) && this.account_type == brokerageAccountContext.account_type && Intrinsics.areEqual(this.account_number, brokerageAccountContext.account_number) && this.management_type == brokerageAccountContext.management_type && Intrinsics.areEqual(this.account_state, brokerageAccountContext.account_state) && this.is_original == brokerageAccountContext.is_original && this.is_default == brokerageAccountContext.is_default && Intrinsics.areEqual(this.is_original_account, brokerageAccountContext.is_original_account) && Intrinsics.areEqual(this.is_default_account, brokerageAccountContext.is_default_account) && Intrinsics.areEqual(this.masked_account_number, brokerageAccountContext.masked_account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.account_type.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.management_type.hashCode()) * 37) + this.account_state.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_original)) * 37) + java.lang.Boolean.hashCode(this.is_default)) * 37;
        java.lang.Boolean bool = this.is_original_account;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        java.lang.Boolean bool2 = this.is_default_account;
        int iHashCode3 = ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37) + this.masked_account_number.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_type=" + this.account_type);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("management_type=" + this.management_type);
        arrayList.add("account_state=" + Internal.sanitize(this.account_state));
        arrayList.add("is_original=" + this.is_original);
        arrayList.add("is_default=" + this.is_default);
        java.lang.Boolean bool = this.is_original_account;
        if (bool != null) {
            arrayList.add("is_original_account=" + bool);
        }
        java.lang.Boolean bool2 = this.is_default_account;
        if (bool2 != null) {
            arrayList.add("is_default_account=" + bool2);
        }
        arrayList.add("masked_account_number=" + Internal.sanitize(this.masked_account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrokerageAccountContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BrokerageAccountContext copy$default(BrokerageAccountContext brokerageAccountContext, BrokerageAccountType brokerageAccountType, String str, ManagementType managementType, String str2, boolean z, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = brokerageAccountContext.account_type;
        }
        if ((i & 2) != 0) {
            str = brokerageAccountContext.account_number;
        }
        if ((i & 4) != 0) {
            managementType = brokerageAccountContext.management_type;
        }
        if ((i & 8) != 0) {
            str2 = brokerageAccountContext.account_state;
        }
        if ((i & 16) != 0) {
            z = brokerageAccountContext.is_original;
        }
        if ((i & 32) != 0) {
            z2 = brokerageAccountContext.is_default;
        }
        if ((i & 64) != 0) {
            bool = brokerageAccountContext.is_original_account;
        }
        if ((i & 128) != 0) {
            bool2 = brokerageAccountContext.is_default_account;
        }
        if ((i & 256) != 0) {
            str3 = brokerageAccountContext.masked_account_number;
        }
        if ((i & 512) != 0) {
            byteString = brokerageAccountContext.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        java.lang.Boolean bool3 = bool;
        java.lang.Boolean bool4 = bool2;
        boolean z3 = z;
        boolean z4 = z2;
        return brokerageAccountContext.copy(brokerageAccountType, str, managementType, str2, z3, z4, bool3, bool4, str4, byteString2);
    }

    public final BrokerageAccountContext copy(BrokerageAccountType account_type, String account_number, ManagementType management_type, String account_state, boolean is_original, boolean is_default, java.lang.Boolean is_original_account, java.lang.Boolean is_default_account, String masked_account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(account_state, "account_state");
        Intrinsics.checkNotNullParameter(masked_account_number, "masked_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BrokerageAccountContext(account_type, account_number, management_type, account_state, is_original, is_default, is_original_account, is_default_account, masked_account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BrokerageAccountContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrokerageAccountContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.BrokerageAccountContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrokerageAccountContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(1, value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    size += ManagementType.ADAPTER.encodedSizeWithTag(3, value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_state(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_state());
                }
                if (value.getIs_original()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, java.lang.Boolean.valueOf(value.getIs_original()));
                }
                if (value.getIs_default()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, java.lang.Boolean.valueOf(value.getIs_default()));
                }
                ProtoAdapter<java.lang.Boolean> protoAdapter = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(7, value.getIs_original_account()) + protoAdapter.encodedSizeWithTag(8, value.getIs_default_account());
                return !Intrinsics.areEqual(value.getMasked_account_number(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(1002, value.getMasked_account_number()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrokerageAccountContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_state());
                }
                if (value.getIs_original()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getIs_original()));
                }
                if (value.getIs_default()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getIs_default()));
                }
                if (!Intrinsics.areEqual(value.getMasked_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_account_number());
                }
                ProtoAdapter<java.lang.Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getIs_original_account());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getIs_default_account());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrokerageAccountContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<java.lang.Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getIs_default_account());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getIs_original_account());
                if (!Intrinsics.areEqual(value.getMasked_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_account_number());
                }
                if (value.getIs_default()) {
                    protoAdapter.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getIs_default()));
                }
                if (value.getIs_original()) {
                    protoAdapter.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getIs_original()));
                }
                if (!Intrinsics.areEqual(value.getAccount_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_state());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrokerageAccountContext decode(ProtoReader reader) throws IOException {
                ManagementType managementType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ManagementType managementType2 = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                java.lang.Boolean boolDecode = null;
                java.lang.Boolean boolDecode2 = null;
                ManagementType managementTypeDecode = managementType2;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BrokerageAccountContext(brokerageAccountTypeDecode, strDecode2, managementTypeDecode, strDecode3, zBooleanValue, zBooleanValue2, boolDecode, boolDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 1002) {
                        switch (iNextTag) {
                            case 1:
                                managementType = managementTypeDecode;
                                str = strDecode2;
                                try {
                                    brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str2 = strDecode3;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode2 = str;
                                managementTypeDecode = managementType;
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                try {
                                    managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    managementType = managementTypeDecode;
                                    str = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 8:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                managementType = managementTypeDecode;
                                str = strDecode2;
                                str2 = strDecode3;
                                strDecode3 = str2;
                                strDecode2 = str;
                                managementTypeDecode = managementType;
                                break;
                        }
                    } else {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrokerageAccountContext redact(BrokerageAccountContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BrokerageAccountContext.copy$default(value, null, null, null, null, false, false, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}
