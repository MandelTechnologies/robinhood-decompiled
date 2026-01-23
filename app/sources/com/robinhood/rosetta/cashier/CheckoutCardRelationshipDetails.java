package com.robinhood.rosetta.cashier;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetails;
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

/* compiled from: CheckoutCardRelationshipDetails.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;", "Lcom/squareup/wire/Message;", "", "relationship_id", "", "user_uuid", "state", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "card_fingerprint", "card_number_last_four", "card_nickname", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getRelationship_id", "()Ljava/lang/String;", "getUser_uuid", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "getCard_fingerprint", "getCard_number_last_four", "getCard_nickname", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CheckoutCardRelationshipState", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CheckoutCardRelationshipDetails extends Message {

    @JvmField
    public static final ProtoAdapter<CheckoutCardRelationshipDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardFingerprint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 7)
    private final String card_fingerprint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNickname", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 9)
    private final String card_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNumberLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 8)
    private final String card_number_last_four;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "relationshipId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String relationship_id;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetails$CheckoutCardRelationshipState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CheckoutCardRelationshipState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_uuid;

    public CheckoutCardRelationshipDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CheckoutCardRelationshipDetails(String str, String str2, CheckoutCardRelationshipState checkoutCardRelationshipState, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED : checkoutCardRelationshipState, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23967newBuilder();
    }

    public final String getRelationship_id() {
        return this.relationship_id;
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final CheckoutCardRelationshipState getState() {
        return this.state;
    }

    public final String getCard_fingerprint() {
        return this.card_fingerprint;
    }

    public final String getCard_number_last_four() {
        return this.card_number_last_four;
    }

    public final String getCard_nickname() {
        return this.card_nickname;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCardRelationshipDetails(String relationship_id, String user_uuid, CheckoutCardRelationshipState state, String card_fingerprint, String card_number_last_four, String card_nickname, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_fingerprint, "card_fingerprint");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.relationship_id = relationship_id;
        this.user_uuid = user_uuid;
        this.state = state;
        this.card_fingerprint = card_fingerprint;
        this.card_number_last_four = card_number_last_four;
        this.card_nickname = card_nickname;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23967newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CheckoutCardRelationshipDetails)) {
            return false;
        }
        CheckoutCardRelationshipDetails checkoutCardRelationshipDetails = (CheckoutCardRelationshipDetails) other;
        return Intrinsics.areEqual(unknownFields(), checkoutCardRelationshipDetails.unknownFields()) && Intrinsics.areEqual(this.relationship_id, checkoutCardRelationshipDetails.relationship_id) && Intrinsics.areEqual(this.user_uuid, checkoutCardRelationshipDetails.user_uuid) && this.state == checkoutCardRelationshipDetails.state && Intrinsics.areEqual(this.card_fingerprint, checkoutCardRelationshipDetails.card_fingerprint) && Intrinsics.areEqual(this.card_number_last_four, checkoutCardRelationshipDetails.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, checkoutCardRelationshipDetails.card_nickname);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.relationship_id.hashCode()) * 37) + this.user_uuid.hashCode()) * 37) + this.state.hashCode()) * 37) + this.card_fingerprint.hashCode()) * 37) + this.card_number_last_four.hashCode()) * 37) + this.card_nickname.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("relationship_id=" + Internal.sanitize(this.relationship_id));
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("state=" + this.state);
        arrayList.add("card_fingerprint=" + Internal.sanitize(this.card_fingerprint));
        arrayList.add("card_number_last_four=" + Internal.sanitize(this.card_number_last_four));
        arrayList.add("card_nickname=" + Internal.sanitize(this.card_nickname));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutCardRelationshipDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CheckoutCardRelationshipDetails copy$default(CheckoutCardRelationshipDetails checkoutCardRelationshipDetails, String str, String str2, CheckoutCardRelationshipState checkoutCardRelationshipState, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutCardRelationshipDetails.relationship_id;
        }
        if ((i & 2) != 0) {
            str2 = checkoutCardRelationshipDetails.user_uuid;
        }
        if ((i & 4) != 0) {
            checkoutCardRelationshipState = checkoutCardRelationshipDetails.state;
        }
        if ((i & 8) != 0) {
            str3 = checkoutCardRelationshipDetails.card_fingerprint;
        }
        if ((i & 16) != 0) {
            str4 = checkoutCardRelationshipDetails.card_number_last_four;
        }
        if ((i & 32) != 0) {
            str5 = checkoutCardRelationshipDetails.card_nickname;
        }
        if ((i & 64) != 0) {
            byteString = checkoutCardRelationshipDetails.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        CheckoutCardRelationshipState checkoutCardRelationshipState2 = checkoutCardRelationshipState;
        return checkoutCardRelationshipDetails.copy(str, str2, checkoutCardRelationshipState2, str3, str7, str6, byteString2);
    }

    public final CheckoutCardRelationshipDetails copy(String relationship_id, String user_uuid, CheckoutCardRelationshipState state, String card_fingerprint, String card_number_last_four, String card_nickname, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_fingerprint, "card_fingerprint");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CheckoutCardRelationshipDetails(relationship_id, user_uuid, state, card_fingerprint, card_number_last_four, card_nickname, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardRelationshipDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CheckoutCardRelationshipDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CheckoutCardRelationshipDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRelationship_id());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUser_uuid());
                }
                if (value.getState() != CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED) {
                    size += CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (!Intrinsics.areEqual(value.getCard_fingerprint(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCard_fingerprint());
                }
                if (!Intrinsics.areEqual(value.getCard_number_last_four(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getCard_number_last_four());
                }
                return !Intrinsics.areEqual(value.getCard_nickname(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(9, value.getCard_nickname()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CheckoutCardRelationshipDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRelationship_id());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_uuid());
                }
                if (value.getState() != CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED) {
                    CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getCard_fingerprint(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCard_fingerprint());
                }
                if (!Intrinsics.areEqual(value.getCard_number_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCard_number_last_four());
                }
                if (!Intrinsics.areEqual(value.getCard_nickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCard_nickname());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CheckoutCardRelationshipDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCard_nickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCard_nickname());
                }
                if (!Intrinsics.areEqual(value.getCard_number_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCard_number_last_four());
                }
                if (!Intrinsics.areEqual(value.getCard_fingerprint(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCard_fingerprint());
                }
                if (value.getState() != CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED) {
                    CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_uuid());
                }
                if (Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRelationship_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardRelationshipDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CheckoutCardRelationshipDetails.CheckoutCardRelationshipState checkoutCardRelationshipStateDecode = CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    CheckoutCardRelationshipDetails.CheckoutCardRelationshipState checkoutCardRelationshipState = checkoutCardRelationshipStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CheckoutCardRelationshipDetails(strDecode, strDecode2, checkoutCardRelationshipState, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                checkoutCardRelationshipStateDecode = CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 7) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 8) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 9) {
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardRelationshipDetails redact(CheckoutCardRelationshipDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CheckoutCardRelationshipDetails.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardRelationshipDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED", "NEW", "PENDING_SCA", "LINKED", "UNLINKED", "REJECTED", "PENDING_ERROR", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckoutCardRelationshipState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardRelationshipState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CheckoutCardRelationshipState> ADAPTER;
        public static final CheckoutCardRelationshipState CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CheckoutCardRelationshipState LINKED;
        public static final CheckoutCardRelationshipState NEW;
        public static final CheckoutCardRelationshipState PENDING_ERROR;
        public static final CheckoutCardRelationshipState PENDING_SCA;
        public static final CheckoutCardRelationshipState REJECTED;
        public static final CheckoutCardRelationshipState UNLINKED;
        private final int value;

        private static final /* synthetic */ CheckoutCardRelationshipState[] $values() {
            return new CheckoutCardRelationshipState[]{CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED, NEW, PENDING_SCA, LINKED, UNLINKED, REJECTED, PENDING_ERROR};
        }

        @JvmStatic
        public static final CheckoutCardRelationshipState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CheckoutCardRelationshipState> getEntries() {
            return $ENTRIES;
        }

        private CheckoutCardRelationshipState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CheckoutCardRelationshipState checkoutCardRelationshipState = new CheckoutCardRelationshipState("CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED", 0, 0);
            CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED = checkoutCardRelationshipState;
            NEW = new CheckoutCardRelationshipState("NEW", 1, 1);
            PENDING_SCA = new CheckoutCardRelationshipState("PENDING_SCA", 2, 2);
            LINKED = new CheckoutCardRelationshipState("LINKED", 3, 3);
            UNLINKED = new CheckoutCardRelationshipState("UNLINKED", 4, 5);
            REJECTED = new CheckoutCardRelationshipState("REJECTED", 5, 6);
            PENDING_ERROR = new CheckoutCardRelationshipState("PENDING_ERROR", 6, 7);
            CheckoutCardRelationshipState[] checkoutCardRelationshipStateArr$values = $values();
            $VALUES = checkoutCardRelationshipStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardRelationshipStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardRelationshipState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CheckoutCardRelationshipState>(orCreateKotlinClass, syntax, checkoutCardRelationshipState) { // from class: com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetails$CheckoutCardRelationshipState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState fromValue(int value) {
                    return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CheckoutCardRelationshipDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CheckoutCardRelationshipState fromValue(int value) {
                if (value == 0) {
                    return CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CheckoutCardRelationshipState.NEW;
                }
                if (value == 2) {
                    return CheckoutCardRelationshipState.PENDING_SCA;
                }
                if (value == 3) {
                    return CheckoutCardRelationshipState.LINKED;
                }
                if (value == 5) {
                    return CheckoutCardRelationshipState.UNLINKED;
                }
                if (value == 6) {
                    return CheckoutCardRelationshipState.REJECTED;
                }
                if (value != 7) {
                    return null;
                }
                return CheckoutCardRelationshipState.PENDING_ERROR;
            }
        }

        public static CheckoutCardRelationshipState valueOf(String str) {
            return (CheckoutCardRelationshipState) Enum.valueOf(CheckoutCardRelationshipState.class, str);
        }

        public static CheckoutCardRelationshipState[] values() {
            return (CheckoutCardRelationshipState[]) $VALUES.clone();
        }
    }
}
