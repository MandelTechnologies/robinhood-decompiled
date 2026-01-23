package accio.service.p003v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: LinkedAccount.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MBÁ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0017¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+JÇ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010+R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b0\u0010+R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b>\u0010+R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\bE\u0010DR\u001a\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\bF\u0010+R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010IR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, m3636d2 = {"Laccio/service/v1/LinkedAccount;", "Lcom/squareup/wire/Message;", "", "", "account_id", "", "metadata", "name", "official_name", "Laccio/service/v1/AccountType;", "type", "Laccio/service/v1/AccountSubtype;", "subtype", "Laccio/service/v1/PlaidAccountDetails;", "plaid_account_details", "", "Laccio/service/v1/Purpose;", "purposes", "Laccio/service/v1/AccountState;", "state", "id", "Laccio/service/v1/Entity;", "source_entity", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "lookback_start_time", "last_updated_at_time", "earliest_balance", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Laccio/service/v1/AccountType;Laccio/service/v1/AccountSubtype;Laccio/service/v1/PlaidAccountDetails;Ljava/util/List;Laccio/service/v1/AccountState;Ljava/lang/String;Laccio/service/v1/Entity;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Laccio/service/v1/AccountType;Laccio/service/v1/AccountSubtype;Laccio/service/v1/PlaidAccountDetails;Ljava/util/List;Laccio/service/v1/AccountState;Ljava/lang/String;Laccio/service/v1/Entity;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Laccio/service/v1/LinkedAccount;", "Ljava/lang/String;", "getAccount_id", "getName", "getOfficial_name", "Laccio/service/v1/AccountType;", "getType", "()Laccio/service/v1/AccountType;", "Laccio/service/v1/AccountSubtype;", "getSubtype", "()Laccio/service/v1/AccountSubtype;", "Laccio/service/v1/PlaidAccountDetails;", "getPlaid_account_details", "()Laccio/service/v1/PlaidAccountDetails;", "Laccio/service/v1/AccountState;", "getState", "()Laccio/service/v1/AccountState;", "getId", "Laccio/service/v1/Entity;", "getSource_entity", "()Laccio/service/v1/Entity;", "Lj$/time/Instant;", "getLookback_start_time", "()Lj$/time/Instant;", "getLast_updated_at_time", "getEarliest_balance", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Ljava/util/List;", "getPurposes", "()Ljava/util/List;", "Companion", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class LinkedAccount extends Message {

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "earliestBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String earliest_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastUpdatedAtTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Instant last_updated_at_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lookbackStartTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Instant lookback_start_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final Map<String, String> metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "officialName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String official_name;

    @WireField(adapter = "accio.service.v1.PlaidAccountDetails#ADAPTER", jsonName = "plaidAccountDetails", oneofName = "account_details", schemaIndex = 6, tag = 7)
    private final PlaidAccountDetails plaid_account_details;

    @WireField(adapter = "accio.service.v1.Purpose#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<Purpose> purposes;

    @WireField(adapter = "accio.service.v1.Entity#ADAPTER", jsonName = "sourceEntity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Entity source_entity;

    @WireField(adapter = "accio.service.v1.AccountState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final AccountState state;

    @WireField(adapter = "accio.service.v1.AccountSubtype#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final AccountSubtype subtype;

    @WireField(adapter = "accio.service.v1.AccountType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AccountType type;

    @JvmField
    public static final ProtoAdapter<LinkedAccount> ADAPTER = new LinkedAccount2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(LinkedAccount.class), Syntax.PROTO_3);

    public LinkedAccount() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ LinkedAccount(String str, Map map, String str2, String str3, AccountType accountType, AccountSubtype accountSubtype, PlaidAccountDetails plaidAccountDetails, List list, AccountState accountState, String str4, Entity entity, Instant instant, Instant instant2, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 32) != 0 ? AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED : accountSubtype, (i & 64) != 0 ? null : plaidAccountDetails, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? AccountState.ACCOUNT_STATE_UNSPECIFIED : accountState, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? Entity.ENTITY_UNSPECIFIED : entity, (i & 2048) != 0 ? null : instant, (i & 4096) == 0 ? instant2 : null, (i & 8192) == 0 ? str5 : "", (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4324newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOfficial_name() {
        return this.official_name;
    }

    public final AccountType getType() {
        return this.type;
    }

    public final AccountSubtype getSubtype() {
        return this.subtype;
    }

    public final PlaidAccountDetails getPlaid_account_details() {
        return this.plaid_account_details;
    }

    public final AccountState getState() {
        return this.state;
    }

    public final String getId() {
        return this.id;
    }

    public final Entity getSource_entity() {
        return this.source_entity;
    }

    public final Instant getLookback_start_time() {
        return this.lookback_start_time;
    }

    public final Instant getLast_updated_at_time() {
        return this.last_updated_at_time;
    }

    public final String getEarliest_balance() {
        return this.earliest_balance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedAccount(String account_id, Map<String, String> metadata, String name, String official_name, AccountType type2, AccountSubtype subtype, PlaidAccountDetails plaidAccountDetails, List<? extends Purpose> purposes, AccountState state, String id, Entity source_entity, Instant instant, Instant instant2, String earliest_balance, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(official_name, "official_name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(source_entity, "source_entity");
        Intrinsics.checkNotNullParameter(earliest_balance, "earliest_balance");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.name = name;
        this.official_name = official_name;
        this.type = type2;
        this.subtype = subtype;
        this.plaid_account_details = plaidAccountDetails;
        this.state = state;
        this.id = id;
        this.source_entity = source_entity;
        this.lookback_start_time = instant;
        this.last_updated_at_time = instant2;
        this.earliest_balance = earliest_balance;
        this.metadata = Internal.immutableCopyOf("metadata", metadata);
        this.purposes = Internal.immutableCopyOf("purposes", purposes);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final List<Purpose> getPurposes() {
        return this.purposes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4324newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LinkedAccount)) {
            return false;
        }
        LinkedAccount linkedAccount = (LinkedAccount) other;
        return Intrinsics.areEqual(unknownFields(), linkedAccount.unknownFields()) && Intrinsics.areEqual(this.account_id, linkedAccount.account_id) && Intrinsics.areEqual(this.metadata, linkedAccount.metadata) && Intrinsics.areEqual(this.name, linkedAccount.name) && Intrinsics.areEqual(this.official_name, linkedAccount.official_name) && this.type == linkedAccount.type && this.subtype == linkedAccount.subtype && Intrinsics.areEqual(this.plaid_account_details, linkedAccount.plaid_account_details) && Intrinsics.areEqual(this.purposes, linkedAccount.purposes) && this.state == linkedAccount.state && Intrinsics.areEqual(this.id, linkedAccount.id) && this.source_entity == linkedAccount.source_entity && Intrinsics.areEqual(this.lookback_start_time, linkedAccount.lookback_start_time) && Intrinsics.areEqual(this.last_updated_at_time, linkedAccount.last_updated_at_time) && Intrinsics.areEqual(this.earliest_balance, linkedAccount.earliest_balance);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.metadata.hashCode()) * 37) + this.name.hashCode()) * 37) + this.official_name.hashCode()) * 37) + this.type.hashCode()) * 37) + this.subtype.hashCode()) * 37;
        PlaidAccountDetails plaidAccountDetails = this.plaid_account_details;
        int iHashCode2 = (((((((((iHashCode + (plaidAccountDetails != null ? plaidAccountDetails.hashCode() : 0)) * 37) + this.purposes.hashCode()) * 37) + this.state.hashCode()) * 37) + this.id.hashCode()) * 37) + this.source_entity.hashCode()) * 37;
        Instant instant = this.lookback_start_time;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.last_updated_at_time;
        int iHashCode4 = ((iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.earliest_balance.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.metadata.isEmpty()) {
            arrayList.add("metadata=" + this.metadata);
        }
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("official_name=" + Internal.sanitize(this.official_name));
        arrayList.add("type=" + this.type);
        arrayList.add("subtype=" + this.subtype);
        PlaidAccountDetails plaidAccountDetails = this.plaid_account_details;
        if (plaidAccountDetails != null) {
            arrayList.add("plaid_account_details=" + plaidAccountDetails);
        }
        if (!this.purposes.isEmpty()) {
            arrayList.add("purposes=" + this.purposes);
        }
        arrayList.add("state=" + this.state);
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("source_entity=" + this.source_entity);
        Instant instant = this.lookback_start_time;
        if (instant != null) {
            arrayList.add("lookback_start_time=" + instant);
        }
        Instant instant2 = this.last_updated_at_time;
        if (instant2 != null) {
            arrayList.add("last_updated_at_time=" + instant2);
        }
        arrayList.add("earliest_balance=" + Internal.sanitize(this.earliest_balance));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkedAccount{", "}", 0, null, null, 56, null);
    }

    public final LinkedAccount copy(String account_id, Map<String, String> metadata, String name, String official_name, AccountType type2, AccountSubtype subtype, PlaidAccountDetails plaid_account_details, List<? extends Purpose> purposes, AccountState state, String id, Entity source_entity, Instant lookback_start_time, Instant last_updated_at_time, String earliest_balance, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(official_name, "official_name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(source_entity, "source_entity");
        Intrinsics.checkNotNullParameter(earliest_balance, "earliest_balance");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LinkedAccount(account_id, metadata, name, official_name, type2, subtype, plaid_account_details, purposes, state, id, source_entity, lookback_start_time, last_updated_at_time, earliest_balance, unknownFields);
    }
}
