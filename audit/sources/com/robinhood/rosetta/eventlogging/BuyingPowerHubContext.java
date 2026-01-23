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

/* compiled from: BuyingPowerHubContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContext;", "Lcom/squareup/wire/Message;", "", "margin_health_state", "Lcom/robinhood/rosetta/eventlogging/MarginHealthState;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/AccountType;", "is_margin_enabled", "", "is_in_deficit", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MarginHealthState;Lcom/robinhood/rosetta/eventlogging/AccountType;ZZLokio/ByteString;)V", "getMargin_health_state", "()Lcom/robinhood/rosetta/eventlogging/MarginHealthState;", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/AccountType;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class BuyingPowerHubContext extends Message {

    @JvmField
    public static final ProtoAdapter<BuyingPowerHubContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isInDeficit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_in_deficit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMarginEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_margin_enabled;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MarginHealthState#ADAPTER", jsonName = "marginHealthState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MarginHealthState margin_health_state;

    public BuyingPowerHubContext() {
        this(null, null, false, false, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24040newBuilder();
    }

    public final MarginHealthState getMargin_health_state() {
        return this.margin_health_state;
    }

    public /* synthetic */ BuyingPowerHubContext(MarginHealthState marginHealthState, AccountType accountType, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MarginHealthState.HEALTHY : marginHealthState, (i & 2) != 0 ? AccountType.CASH : accountType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AccountType getAccount_type() {
        return this.account_type;
    }

    /* renamed from: is_margin_enabled, reason: from getter */
    public final boolean getIs_margin_enabled() {
        return this.is_margin_enabled;
    }

    /* renamed from: is_in_deficit, reason: from getter */
    public final boolean getIs_in_deficit() {
        return this.is_in_deficit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyingPowerHubContext(MarginHealthState margin_health_state, AccountType account_type, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.margin_health_state = margin_health_state;
        this.account_type = account_type;
        this.is_margin_enabled = z;
        this.is_in_deficit = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24040newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BuyingPowerHubContext)) {
            return false;
        }
        BuyingPowerHubContext buyingPowerHubContext = (BuyingPowerHubContext) other;
        return Intrinsics.areEqual(unknownFields(), buyingPowerHubContext.unknownFields()) && this.margin_health_state == buyingPowerHubContext.margin_health_state && this.account_type == buyingPowerHubContext.account_type && this.is_margin_enabled == buyingPowerHubContext.is_margin_enabled && this.is_in_deficit == buyingPowerHubContext.is_in_deficit;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.margin_health_state.hashCode()) * 37) + this.account_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_margin_enabled)) * 37) + java.lang.Boolean.hashCode(this.is_in_deficit);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("margin_health_state=" + this.margin_health_state);
        arrayList.add("account_type=" + this.account_type);
        arrayList.add("is_margin_enabled=" + this.is_margin_enabled);
        arrayList.add("is_in_deficit=" + this.is_in_deficit);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BuyingPowerHubContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BuyingPowerHubContext copy$default(BuyingPowerHubContext buyingPowerHubContext, MarginHealthState marginHealthState, AccountType accountType, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            marginHealthState = buyingPowerHubContext.margin_health_state;
        }
        if ((i & 2) != 0) {
            accountType = buyingPowerHubContext.account_type;
        }
        if ((i & 4) != 0) {
            z = buyingPowerHubContext.is_margin_enabled;
        }
        if ((i & 8) != 0) {
            z2 = buyingPowerHubContext.is_in_deficit;
        }
        if ((i & 16) != 0) {
            byteString = buyingPowerHubContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z3 = z;
        return buyingPowerHubContext.copy(marginHealthState, accountType, z3, z2, byteString2);
    }

    public final BuyingPowerHubContext copy(MarginHealthState margin_health_state, AccountType account_type, boolean is_margin_enabled, boolean is_in_deficit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BuyingPowerHubContext(margin_health_state, account_type, is_margin_enabled, is_in_deficit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BuyingPowerHubContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BuyingPowerHubContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.BuyingPowerHubContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BuyingPowerHubContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMargin_health_state() != MarginHealthState.HEALTHY) {
                    size += MarginHealthState.ADAPTER.encodedSizeWithTag(1, value.getMargin_health_state());
                }
                if (value.getAccount_type() != AccountType.CASH) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(2, value.getAccount_type());
                }
                if (value.getIs_margin_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getIs_margin_enabled()));
                }
                return value.getIs_in_deficit() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, java.lang.Boolean.valueOf(value.getIs_in_deficit())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BuyingPowerHubContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMargin_health_state() != MarginHealthState.HEALTHY) {
                    MarginHealthState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_health_state());
                }
                if (value.getAccount_type() != AccountType.CASH) {
                    AccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_type());
                }
                if (value.getIs_margin_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_margin_enabled()));
                }
                if (value.getIs_in_deficit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIs_in_deficit()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BuyingPowerHubContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_in_deficit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIs_in_deficit()));
                }
                if (value.getIs_margin_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_margin_enabled()));
                }
                if (value.getAccount_type() != AccountType.CASH) {
                    AccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_type());
                }
                if (value.getMargin_health_state() != MarginHealthState.HEALTHY) {
                    MarginHealthState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_health_state());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BuyingPowerHubContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MarginHealthState marginHealthStateDecode = MarginHealthState.HEALTHY;
                AccountType accountType = AccountType.CASH;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                AccountType accountTypeDecode = accountType;
                while (true) {
                    MarginHealthState marginHealthState = marginHealthStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BuyingPowerHubContext(marginHealthState, accountTypeDecode, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                marginHealthStateDecode = MarginHealthState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                accountTypeDecode = AccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 4) {
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BuyingPowerHubContext redact(BuyingPowerHubContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BuyingPowerHubContext.copy$default(value, null, null, false, false, ByteString.EMPTY, 15, null);
            }
        };
    }
}
