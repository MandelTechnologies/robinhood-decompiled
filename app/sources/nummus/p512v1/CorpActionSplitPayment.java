package nummus.p512v1;

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
import p479j$.time.Instant;

/* compiled from: CorpActionSplitPayment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0085\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u008b\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010 R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010 R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\"\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b1\u00100R\"\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b2\u00100¨\u00064"}, m3636d2 = {"Lnummus/v1/CorpActionSplitPayment;", "Lcom/squareup/wire/Message;", "", "", "id", "account_id", "new_shares", "old_shares", "Lnummus/v1/CorpActionSplit;", "split", "Lnummus/v1/CorpActionPaymentState;", "corp_action_payment_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "paid_at", "updated_at", "created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CorpActionSplit;Lnummus/v1/CorpActionPaymentState;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CorpActionSplit;Lnummus/v1/CorpActionPaymentState;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lnummus/v1/CorpActionSplitPayment;", "Ljava/lang/String;", "getId", "getAccount_id", "getNew_shares", "getOld_shares", "Lnummus/v1/CorpActionSplit;", "getSplit", "()Lnummus/v1/CorpActionSplit;", "Lnummus/v1/CorpActionPaymentState;", "getCorp_action_payment_state", "()Lnummus/v1/CorpActionPaymentState;", "Lj$/time/Instant;", "getPaid_at", "()Lj$/time/Instant;", "getUpdated_at", "getCreated_at", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CorpActionSplitPayment extends Message {

    @JvmField
    public static final ProtoAdapter<CorpActionSplitPayment> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "nummus.v1.CorpActionPaymentState#ADAPTER", jsonName = "corpActionPaymentState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final CorpActionPaymentState corp_action_payment_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String new_shares;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "oldShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String old_shares;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "paidAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant paid_at;

    @WireField(adapter = "nummus.v1.CorpActionSplit#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CorpActionSplit split;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant updated_at;

    public CorpActionSplitPayment() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ CorpActionSplitPayment(String str, String str2, String str3, String str4, CorpActionSplit corpActionSplit, CorpActionPaymentState corpActionPaymentState, Instant instant, Instant instant2, Instant instant3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : corpActionSplit, (i & 32) != 0 ? CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED : corpActionPaymentState, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? null : instant2, (i & 256) != 0 ? null : instant3, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29403newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getNew_shares() {
        return this.new_shares;
    }

    public final String getOld_shares() {
        return this.old_shares;
    }

    public final CorpActionSplit getSplit() {
        return this.split;
    }

    public final CorpActionPaymentState getCorp_action_payment_state() {
        return this.corp_action_payment_state;
    }

    public final Instant getPaid_at() {
        return this.paid_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpActionSplitPayment(String id, String account_id, String new_shares, String old_shares, CorpActionSplit corpActionSplit, CorpActionPaymentState corp_action_payment_state, Instant instant, Instant instant2, Instant instant3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(new_shares, "new_shares");
        Intrinsics.checkNotNullParameter(old_shares, "old_shares");
        Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = account_id;
        this.new_shares = new_shares;
        this.old_shares = old_shares;
        this.split = corpActionSplit;
        this.corp_action_payment_state = corp_action_payment_state;
        this.paid_at = instant;
        this.updated_at = instant2;
        this.created_at = instant3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29403newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CorpActionSplitPayment)) {
            return false;
        }
        CorpActionSplitPayment corpActionSplitPayment = (CorpActionSplitPayment) other;
        return Intrinsics.areEqual(unknownFields(), corpActionSplitPayment.unknownFields()) && Intrinsics.areEqual(this.id, corpActionSplitPayment.id) && Intrinsics.areEqual(this.account_id, corpActionSplitPayment.account_id) && Intrinsics.areEqual(this.new_shares, corpActionSplitPayment.new_shares) && Intrinsics.areEqual(this.old_shares, corpActionSplitPayment.old_shares) && Intrinsics.areEqual(this.split, corpActionSplitPayment.split) && this.corp_action_payment_state == corpActionSplitPayment.corp_action_payment_state && Intrinsics.areEqual(this.paid_at, corpActionSplitPayment.paid_at) && Intrinsics.areEqual(this.updated_at, corpActionSplitPayment.updated_at) && Intrinsics.areEqual(this.created_at, corpActionSplitPayment.created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.new_shares.hashCode()) * 37) + this.old_shares.hashCode()) * 37;
        CorpActionSplit corpActionSplit = this.split;
        int iHashCode2 = (((iHashCode + (corpActionSplit != null ? corpActionSplit.hashCode() : 0)) * 37) + this.corp_action_payment_state.hashCode()) * 37;
        Instant instant = this.paid_at;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.created_at;
        int iHashCode5 = iHashCode4 + (instant3 != null ? instant3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("new_shares=" + Internal.sanitize(this.new_shares));
        arrayList.add("old_shares=" + Internal.sanitize(this.old_shares));
        CorpActionSplit corpActionSplit = this.split;
        if (corpActionSplit != null) {
            arrayList.add("split=" + corpActionSplit);
        }
        arrayList.add("corp_action_payment_state=" + this.corp_action_payment_state);
        Instant instant = this.paid_at;
        if (instant != null) {
            arrayList.add("paid_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        Instant instant3 = this.created_at;
        if (instant3 != null) {
            arrayList.add("created_at=" + instant3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CorpActionSplitPayment{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CorpActionSplitPayment copy$default(CorpActionSplitPayment corpActionSplitPayment, String str, String str2, String str3, String str4, CorpActionSplit corpActionSplit, CorpActionPaymentState corpActionPaymentState, Instant instant, Instant instant2, Instant instant3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = corpActionSplitPayment.id;
        }
        if ((i & 2) != 0) {
            str2 = corpActionSplitPayment.account_id;
        }
        if ((i & 4) != 0) {
            str3 = corpActionSplitPayment.new_shares;
        }
        if ((i & 8) != 0) {
            str4 = corpActionSplitPayment.old_shares;
        }
        if ((i & 16) != 0) {
            corpActionSplit = corpActionSplitPayment.split;
        }
        if ((i & 32) != 0) {
            corpActionPaymentState = corpActionSplitPayment.corp_action_payment_state;
        }
        if ((i & 64) != 0) {
            instant = corpActionSplitPayment.paid_at;
        }
        if ((i & 128) != 0) {
            instant2 = corpActionSplitPayment.updated_at;
        }
        if ((i & 256) != 0) {
            instant3 = corpActionSplitPayment.created_at;
        }
        if ((i & 512) != 0) {
            byteString = corpActionSplitPayment.unknownFields();
        }
        Instant instant4 = instant3;
        ByteString byteString2 = byteString;
        Instant instant5 = instant;
        Instant instant6 = instant2;
        CorpActionSplit corpActionSplit2 = corpActionSplit;
        CorpActionPaymentState corpActionPaymentState2 = corpActionPaymentState;
        return corpActionSplitPayment.copy(str, str2, str3, str4, corpActionSplit2, corpActionPaymentState2, instant5, instant6, instant4, byteString2);
    }

    public final CorpActionSplitPayment copy(String id, String account_id, String new_shares, String old_shares, CorpActionSplit split, CorpActionPaymentState corp_action_payment_state, Instant paid_at, Instant updated_at, Instant created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(new_shares, "new_shares");
        Intrinsics.checkNotNullParameter(old_shares, "old_shares");
        Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CorpActionSplitPayment(id, account_id, new_shares, old_shares, split, corp_action_payment_state, paid_at, updated_at, created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CorpActionSplitPayment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CorpActionSplitPayment>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CorpActionSplitPayment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CorpActionSplitPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getNew_shares(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNew_shares());
                }
                if (!Intrinsics.areEqual(value.getOld_shares(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOld_shares());
                }
                if (value.getSplit() != null) {
                    size += CorpActionSplit.ADAPTER.encodedSizeWithTag(5, value.getSplit());
                }
                if (value.getCorp_action_payment_state() != CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED) {
                    size += CorpActionPaymentState.ADAPTER.encodedSizeWithTag(6, value.getCorp_action_payment_state());
                }
                if (value.getPaid_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getPaid_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getUpdated_at());
                }
                return value.getCreated_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getCreated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CorpActionSplitPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getNew_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNew_shares());
                }
                if (!Intrinsics.areEqual(value.getOld_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOld_shares());
                }
                if (value.getSplit() != null) {
                    CorpActionSplit.ADAPTER.encodeWithTag(writer, 5, (int) value.getSplit());
                }
                if (value.getCorp_action_payment_state() != CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED) {
                    CorpActionPaymentState.ADAPTER.encodeWithTag(writer, 6, (int) value.getCorp_action_payment_state());
                }
                if (value.getPaid_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getPaid_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CorpActionSplitPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getUpdated_at());
                }
                if (value.getPaid_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getPaid_at());
                }
                if (value.getCorp_action_payment_state() != CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED) {
                    CorpActionPaymentState.ADAPTER.encodeWithTag(writer, 6, (int) value.getCorp_action_payment_state());
                }
                if (value.getSplit() != null) {
                    CorpActionSplit.ADAPTER.encodeWithTag(writer, 5, (int) value.getSplit());
                }
                if (!Intrinsics.areEqual(value.getOld_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOld_shares());
                }
                if (!Intrinsics.areEqual(value.getNew_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNew_shares());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionSplitPayment decode(ProtoReader reader) throws IOException {
                CorpActionPaymentState corpActionPaymentState;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CorpActionPaymentState corpActionPaymentState2 = CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                CorpActionSplit corpActionSplitDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                CorpActionPaymentState corpActionPaymentStateDecode = corpActionPaymentState2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                corpActionSplitDecode = CorpActionSplit.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                try {
                                    corpActionPaymentStateDecode = CorpActionPaymentState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    corpActionPaymentState = corpActionPaymentStateDecode;
                                    str = strDecode4;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 8:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 9:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                corpActionPaymentState = corpActionPaymentStateDecode;
                                str = strDecode4;
                                break;
                        }
                        strDecode4 = str;
                        corpActionPaymentStateDecode = corpActionPaymentState;
                    } else {
                        return new CorpActionSplitPayment(strDecode4, strDecode, strDecode2, strDecode3, corpActionSplitDecode, corpActionPaymentStateDecode, instantDecode, instantDecode2, instantDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionSplitPayment redact(CorpActionSplitPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CorpActionSplit split = value.getSplit();
                CorpActionSplit corpActionSplitRedact = split != null ? CorpActionSplit.ADAPTER.redact(split) : null;
                Instant paid_at = value.getPaid_at();
                Instant instantRedact = paid_at != null ? ProtoAdapter.INSTANT.redact(paid_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                Instant created_at = value.getCreated_at();
                return CorpActionSplitPayment.copy$default(value, null, null, null, null, corpActionSplitRedact, null, instantRedact, instantRedact2, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, ByteString.EMPTY, 47, null);
            }
        };
    }
}
