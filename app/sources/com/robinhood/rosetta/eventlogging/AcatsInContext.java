package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
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
import rosetta.account.BrokerageAccountType;

/* compiled from: AcatsInContext.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u000fH\u0016Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContext;", "Lcom/squareup/wire/Message;", "", "skip_intro", "", "intro_shown", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountType;", "account_contains", "", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "reject_reason", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "from_retry", "source", "", "dtc_number", "is_using_plaid_linked_account", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZLrosetta/account/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;ZLjava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getSkip_intro", "()Z", "getIntro_shown", "getAccount_type", "()Lrosetta/account/BrokerageAccountType;", "getReject_reason", "()Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "getFrom_retry", "getSource", "()Ljava/lang/String;", "getDtc_number", "getAccount_contains", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "AccountContents", "RejectReason", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AcatsInContext extends Message {

    @JvmField
    public static final ProtoAdapter<AcatsInContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AcatsInContext$AccountContents#ADAPTER", jsonName = "accountContains", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final java.util.List<AccountContents> account_contains;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final BrokerageAccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dtcNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String dtc_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fromRetry", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean from_retry;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "introShown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean intro_shown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUsingPlaidLinkedAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean is_using_plaid_linked_account;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AcatsInContext$RejectReason#ADAPTER", jsonName = "rejectReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final RejectReason reject_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "skipIntro", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean skip_intro;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String source;

    public AcatsInContext() {
        this(false, false, null, null, null, false, null, null, false, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23992newBuilder();
    }

    public final boolean getSkip_intro() {
        return this.skip_intro;
    }

    public final boolean getIntro_shown() {
        return this.intro_shown;
    }

    public final BrokerageAccountType getAccount_type() {
        return this.account_type;
    }

    public /* synthetic */ AcatsInContext(boolean z, boolean z2, BrokerageAccountType brokerageAccountType, java.util.List list, RejectReason rejectReason, boolean z3, String str, String str2, boolean z4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? RejectReason.ACCOUNT_TITLE_MISMATCH : rejectReason, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final RejectReason getReject_reason() {
        return this.reject_reason;
    }

    public final boolean getFrom_retry() {
        return this.from_retry;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getDtc_number() {
        return this.dtc_number;
    }

    /* renamed from: is_using_plaid_linked_account, reason: from getter */
    public final boolean getIs_using_plaid_linked_account() {
        return this.is_using_plaid_linked_account;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInContext(boolean z, boolean z2, BrokerageAccountType account_type, java.util.List<? extends AccountContents> account_contains, RejectReason reject_reason, boolean z3, String source, String dtc_number, boolean z4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_contains, "account_contains");
        Intrinsics.checkNotNullParameter(reject_reason, "reject_reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dtc_number, "dtc_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.skip_intro = z;
        this.intro_shown = z2;
        this.account_type = account_type;
        this.reject_reason = reject_reason;
        this.from_retry = z3;
        this.source = source;
        this.dtc_number = dtc_number;
        this.is_using_plaid_linked_account = z4;
        this.account_contains = Internal.immutableCopyOf("account_contains", account_contains);
    }

    public final java.util.List<AccountContents> getAccount_contains() {
        return this.account_contains;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23992newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AcatsInContext)) {
            return false;
        }
        AcatsInContext acatsInContext = (AcatsInContext) other;
        return Intrinsics.areEqual(unknownFields(), acatsInContext.unknownFields()) && this.skip_intro == acatsInContext.skip_intro && this.intro_shown == acatsInContext.intro_shown && this.account_type == acatsInContext.account_type && Intrinsics.areEqual(this.account_contains, acatsInContext.account_contains) && this.reject_reason == acatsInContext.reject_reason && this.from_retry == acatsInContext.from_retry && Intrinsics.areEqual(this.source, acatsInContext.source) && Intrinsics.areEqual(this.dtc_number, acatsInContext.dtc_number) && this.is_using_plaid_linked_account == acatsInContext.is_using_plaid_linked_account;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.skip_intro)) * 37) + java.lang.Boolean.hashCode(this.intro_shown)) * 37) + this.account_type.hashCode()) * 37) + this.account_contains.hashCode()) * 37) + this.reject_reason.hashCode()) * 37) + java.lang.Boolean.hashCode(this.from_retry)) * 37) + this.source.hashCode()) * 37) + this.dtc_number.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_using_plaid_linked_account);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("skip_intro=" + this.skip_intro);
        arrayList.add("intro_shown=" + this.intro_shown);
        arrayList.add("account_type=" + this.account_type);
        if (!this.account_contains.isEmpty()) {
            arrayList.add("account_contains=" + this.account_contains);
        }
        arrayList.add("reject_reason=" + this.reject_reason);
        arrayList.add("from_retry=" + this.from_retry);
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("dtc_number=" + Internal.sanitize(this.dtc_number));
        arrayList.add("is_using_plaid_linked_account=" + this.is_using_plaid_linked_account);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AcatsInContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AcatsInContext copy$default(AcatsInContext acatsInContext, boolean z, boolean z2, BrokerageAccountType brokerageAccountType, java.util.List list, RejectReason rejectReason, boolean z3, String str, String str2, boolean z4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acatsInContext.skip_intro;
        }
        if ((i & 2) != 0) {
            z2 = acatsInContext.intro_shown;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = acatsInContext.account_type;
        }
        if ((i & 8) != 0) {
            list = acatsInContext.account_contains;
        }
        if ((i & 16) != 0) {
            rejectReason = acatsInContext.reject_reason;
        }
        if ((i & 32) != 0) {
            z3 = acatsInContext.from_retry;
        }
        if ((i & 64) != 0) {
            str = acatsInContext.source;
        }
        if ((i & 128) != 0) {
            str2 = acatsInContext.dtc_number;
        }
        if ((i & 256) != 0) {
            z4 = acatsInContext.is_using_plaid_linked_account;
        }
        if ((i & 512) != 0) {
            byteString = acatsInContext.unknownFields();
        }
        boolean z5 = z4;
        ByteString byteString2 = byteString;
        String str3 = str;
        String str4 = str2;
        RejectReason rejectReason2 = rejectReason;
        boolean z6 = z3;
        return acatsInContext.copy(z, z2, brokerageAccountType, list, rejectReason2, z6, str3, str4, z5, byteString2);
    }

    public final AcatsInContext copy(boolean skip_intro, boolean intro_shown, BrokerageAccountType account_type, java.util.List<? extends AccountContents> account_contains, RejectReason reject_reason, boolean from_retry, String source, String dtc_number, boolean is_using_plaid_linked_account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_contains, "account_contains");
        Intrinsics.checkNotNullParameter(reject_reason, "reject_reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dtc_number, "dtc_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AcatsInContext(skip_intro, intro_shown, account_type, account_contains, reject_reason, from_retry, source, dtc_number, is_using_plaid_linked_account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AcatsInContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AcatsInContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AcatsInContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AcatsInContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSkip_intro()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getSkip_intro()));
                }
                if (value.getIntro_shown()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getIntro_shown()));
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(3, value.getAccount_type());
                }
                int iEncodedSizeWithTag = size + AcatsInContext.AccountContents.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getAccount_contains());
                if (value.getReject_reason() != AcatsInContext.RejectReason.ACCOUNT_TITLE_MISMATCH) {
                    iEncodedSizeWithTag += AcatsInContext.RejectReason.ADAPTER.encodedSizeWithTag(5, value.getReject_reason());
                }
                if (value.getFrom_retry()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(6, java.lang.Boolean.valueOf(value.getFrom_retry()));
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getSource());
                }
                if (!Intrinsics.areEqual(value.getDtc_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getDtc_number());
                }
                return value.getIs_using_plaid_linked_account() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(9, java.lang.Boolean.valueOf(value.getIs_using_plaid_linked_account())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AcatsInContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSkip_intro()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getSkip_intro()));
                }
                if (value.getIntro_shown()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIntro_shown()));
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccount_type());
                }
                AcatsInContext.AccountContents.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAccount_contains());
                if (value.getReject_reason() != AcatsInContext.RejectReason.ACCOUNT_TITLE_MISMATCH) {
                    AcatsInContext.RejectReason.ADAPTER.encodeWithTag(writer, 5, (int) value.getReject_reason());
                }
                if (value.getFrom_retry()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getFrom_retry()));
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getDtc_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getDtc_number());
                }
                if (value.getIs_using_plaid_linked_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) java.lang.Boolean.valueOf(value.getIs_using_plaid_linked_account()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AcatsInContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_using_plaid_linked_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) java.lang.Boolean.valueOf(value.getIs_using_plaid_linked_account()));
                }
                if (!Intrinsics.areEqual(value.getDtc_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getDtc_number());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSource());
                }
                if (value.getFrom_retry()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getFrom_retry()));
                }
                if (value.getReject_reason() != AcatsInContext.RejectReason.ACCOUNT_TITLE_MISMATCH) {
                    AcatsInContext.RejectReason.ADAPTER.encodeWithTag(writer, 5, (int) value.getReject_reason());
                }
                AcatsInContext.AccountContents.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAccount_contains());
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAccount_type());
                }
                if (value.getIntro_shown()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIntro_shown()));
                }
                if (value.getSkip_intro()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getSkip_intro()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AcatsInContext decode(ProtoReader reader) throws IOException {
                AcatsInContext.RejectReason rejectReason;
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                AcatsInContext.RejectReason rejectReason2 = AcatsInContext.RejectReason.ACCOUNT_TITLE_MISMATCH;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                String strDecode = "";
                String strDecode2 = strDecode;
                AcatsInContext.RejectReason rejectReasonDecode = rejectReason2;
                boolean zBooleanValue4 = false;
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                rejectReason = rejectReasonDecode;
                                z = zBooleanValue4;
                                z2 = zBooleanValue;
                                try {
                                    brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                zBooleanValue = z2;
                                zBooleanValue4 = z;
                                rejectReasonDecode = rejectReason;
                                break;
                            case 4:
                                rejectReason = rejectReasonDecode;
                                z = zBooleanValue4;
                                try {
                                    AcatsInContext.AccountContents.ADAPTER.tryDecode(reader, arrayList);
                                    z2 = zBooleanValue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    z2 = zBooleanValue;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                                zBooleanValue = z2;
                                zBooleanValue4 = z;
                                rejectReasonDecode = rejectReason;
                                break;
                            case 5:
                                try {
                                    rejectReasonDecode = AcatsInContext.RejectReason.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    rejectReason = rejectReasonDecode;
                                    z = zBooleanValue4;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 6:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                rejectReason = rejectReasonDecode;
                                z = zBooleanValue4;
                                z2 = zBooleanValue;
                                zBooleanValue = z2;
                                zBooleanValue4 = z;
                                rejectReasonDecode = rejectReason;
                                break;
                        }
                    } else {
                        return new AcatsInContext(zBooleanValue4, zBooleanValue, brokerageAccountTypeDecode, arrayList, rejectReasonDecode, zBooleanValue2, strDecode, strDecode2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AcatsInContext redact(AcatsInContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AcatsInContext.copy$default(value, false, false, null, null, null, false, null, null, false, ByteString.EMPTY, 511, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AcatsInContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "MUTUAL_FUNDS", "BONDS", "MARGIN", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountContents implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountContents[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AccountContents> ADAPTER;
        public static final AccountContents BONDS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccountContents MARGIN;
        public static final AccountContents MUTUAL_FUNDS;
        public static final AccountContents NONE;
        private final int value;

        private static final /* synthetic */ AccountContents[] $values() {
            return new AccountContents[]{NONE, MUTUAL_FUNDS, BONDS, MARGIN};
        }

        @JvmStatic
        public static final AccountContents fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AccountContents> getEntries() {
            return $ENTRIES;
        }

        private AccountContents(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AccountContents accountContents = new AccountContents("NONE", 0, 0);
            NONE = accountContents;
            MUTUAL_FUNDS = new AccountContents("MUTUAL_FUNDS", 1, 1);
            BONDS = new AccountContents("BONDS", 2, 2);
            MARGIN = new AccountContents("MARGIN", 3, 3);
            AccountContents[] accountContentsArr$values = $values();
            $VALUES = accountContentsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountContentsArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountContents.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountContents>(orCreateKotlinClass, syntax, accountContents) { // from class: com.robinhood.rosetta.eventlogging.AcatsInContext$AccountContents$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AcatsInContext.AccountContents fromValue(int value) {
                    return AcatsInContext.AccountContents.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AcatsInContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AccountContents fromValue(int value) {
                if (value == 0) {
                    return AccountContents.NONE;
                }
                if (value == 1) {
                    return AccountContents.MUTUAL_FUNDS;
                }
                if (value == 2) {
                    return AccountContents.BONDS;
                }
                if (value != 3) {
                    return null;
                }
                return AccountContents.MARGIN;
            }
        }

        public static AccountContents valueOf(String str) {
            return (AccountContents) Enum.valueOf(AccountContents.class, str);
        }

        public static AccountContents[] values() {
            return (AccountContents[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AcatsInContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TITLE_MISMATCH", "INVALID_ACCOUNT_NUMBER", "UNSUPPORTED_ASSETS", "UNKNOWN", "NOT_REJECTED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RejectReason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RejectReason[] $VALUES;
        public static final RejectReason ACCOUNT_TITLE_MISMATCH;

        @JvmField
        public static final ProtoAdapter<RejectReason> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final RejectReason INVALID_ACCOUNT_NUMBER;
        public static final RejectReason NOT_REJECTED;
        public static final RejectReason UNKNOWN;
        public static final RejectReason UNSUPPORTED_ASSETS;
        private final int value;

        private static final /* synthetic */ RejectReason[] $values() {
            return new RejectReason[]{ACCOUNT_TITLE_MISMATCH, INVALID_ACCOUNT_NUMBER, UNSUPPORTED_ASSETS, UNKNOWN, NOT_REJECTED};
        }

        @JvmStatic
        public static final RejectReason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<RejectReason> getEntries() {
            return $ENTRIES;
        }

        private RejectReason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final RejectReason rejectReason = new RejectReason("ACCOUNT_TITLE_MISMATCH", 0, 0);
            ACCOUNT_TITLE_MISMATCH = rejectReason;
            INVALID_ACCOUNT_NUMBER = new RejectReason("INVALID_ACCOUNT_NUMBER", 1, 1);
            UNSUPPORTED_ASSETS = new RejectReason("UNSUPPORTED_ASSETS", 2, 2);
            UNKNOWN = new RejectReason("UNKNOWN", 3, 3);
            NOT_REJECTED = new RejectReason("NOT_REJECTED", 4, 4);
            RejectReason[] rejectReasonArr$values = $values();
            $VALUES = rejectReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(rejectReasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RejectReason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<RejectReason>(orCreateKotlinClass, syntax, rejectReason) { // from class: com.robinhood.rosetta.eventlogging.AcatsInContext$RejectReason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AcatsInContext.RejectReason fromValue(int value) {
                    return AcatsInContext.RejectReason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AcatsInContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RejectReason fromValue(int value) {
                if (value == 0) {
                    return RejectReason.ACCOUNT_TITLE_MISMATCH;
                }
                if (value == 1) {
                    return RejectReason.INVALID_ACCOUNT_NUMBER;
                }
                if (value == 2) {
                    return RejectReason.UNSUPPORTED_ASSETS;
                }
                if (value == 3) {
                    return RejectReason.UNKNOWN;
                }
                if (value != 4) {
                    return null;
                }
                return RejectReason.NOT_REJECTED;
            }
        }

        public static RejectReason valueOf(String str) {
            return (RejectReason) Enum.valueOf(RejectReason.class, str);
        }

        public static RejectReason[] values() {
            return (RejectReason[]) $VALUES.clone();
        }
    }
}
