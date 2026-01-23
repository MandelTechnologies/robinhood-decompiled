package com.robinhood.rosetta.midas.p369v1;

import com.robinhood.rosetta.common.Date;
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

/* compiled from: PlanSwitchedDetails.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B}\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0083\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b/\u0010$R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b0\u0010$R\"\u0010\u0010\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b1\u0010'R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b2\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetails;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "new_subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/rosetta/common/Date;", "billing_start", "", "free_days", "", "charged_account", "plan_id", "old_subscription_id", "old_subscription_ended_at", "promotion_name", "unknownFields", "<init>", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Date;ILjava/lang/String;Lokio/ByteString;Lokio/ByteString;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Date;ILjava/lang/String;Lokio/ByteString;Lokio/ByteString;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetails;", "Lokio/ByteString;", "getNew_subscription_id", "()Lokio/ByteString;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/common/Date;", "getBilling_start", "()Lcom/robinhood/rosetta/common/Date;", "I", "getFree_days", "Ljava/lang/String;", "getCharged_account", "getPlan_id", "getOld_subscription_id", "getOld_subscription_ended_at", "getPromotion_name", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PlanSwitchedDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PlanSwitchedDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "billingStart", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Date billing_start;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chargedAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String charged_account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "freeDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int free_days;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "newSubscriptionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString new_subscription_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "oldSubscriptionEndedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant old_subscription_ended_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "oldSubscriptionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ByteString old_subscription_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "planId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ByteString plan_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promotionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String promotion_name;

    public PlanSwitchedDetails() {
        this(null, null, null, 0, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24713newBuilder();
    }

    public final ByteString getNew_subscription_id() {
        return this.new_subscription_id;
    }

    public /* synthetic */ PlanSwitchedDetails(ByteString byteString, Instant instant, Date date, int i, String str, ByteString byteString2, ByteString byteString3, Instant instant2, String str2, ByteString byteString4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ByteString.EMPTY : byteString, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? null : date, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? ByteString.EMPTY : byteString2, (i2 & 64) != 0 ? ByteString.EMPTY : byteString3, (i2 & 128) != 0 ? null : instant2, (i2 & 256) != 0 ? "" : str2, (i2 & 512) != 0 ? ByteString.EMPTY : byteString4);
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Date getBilling_start() {
        return this.billing_start;
    }

    public final int getFree_days() {
        return this.free_days;
    }

    public final String getCharged_account() {
        return this.charged_account;
    }

    public final ByteString getPlan_id() {
        return this.plan_id;
    }

    public final ByteString getOld_subscription_id() {
        return this.old_subscription_id;
    }

    public final Instant getOld_subscription_ended_at() {
        return this.old_subscription_ended_at;
    }

    public final String getPromotion_name() {
        return this.promotion_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanSwitchedDetails(ByteString new_subscription_id, Instant instant, Date date, int i, String charged_account, ByteString plan_id, ByteString old_subscription_id, Instant instant2, String promotion_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(new_subscription_id, "new_subscription_id");
        Intrinsics.checkNotNullParameter(charged_account, "charged_account");
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(old_subscription_id, "old_subscription_id");
        Intrinsics.checkNotNullParameter(promotion_name, "promotion_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.new_subscription_id = new_subscription_id;
        this.created_at = instant;
        this.billing_start = date;
        this.free_days = i;
        this.charged_account = charged_account;
        this.plan_id = plan_id;
        this.old_subscription_id = old_subscription_id;
        this.old_subscription_ended_at = instant2;
        this.promotion_name = promotion_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24713newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlanSwitchedDetails)) {
            return false;
        }
        PlanSwitchedDetails planSwitchedDetails = (PlanSwitchedDetails) other;
        return Intrinsics.areEqual(unknownFields(), planSwitchedDetails.unknownFields()) && Intrinsics.areEqual(this.new_subscription_id, planSwitchedDetails.new_subscription_id) && Intrinsics.areEqual(this.created_at, planSwitchedDetails.created_at) && Intrinsics.areEqual(this.billing_start, planSwitchedDetails.billing_start) && this.free_days == planSwitchedDetails.free_days && Intrinsics.areEqual(this.charged_account, planSwitchedDetails.charged_account) && Intrinsics.areEqual(this.plan_id, planSwitchedDetails.plan_id) && Intrinsics.areEqual(this.old_subscription_id, planSwitchedDetails.old_subscription_id) && Intrinsics.areEqual(this.old_subscription_ended_at, planSwitchedDetails.old_subscription_ended_at) && Intrinsics.areEqual(this.promotion_name, planSwitchedDetails.promotion_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.new_subscription_id.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Date date = this.billing_start;
        int iHashCode3 = (((((((((iHashCode2 + (date != null ? date.hashCode() : 0)) * 37) + Integer.hashCode(this.free_days)) * 37) + this.charged_account.hashCode()) * 37) + this.plan_id.hashCode()) * 37) + this.old_subscription_id.hashCode()) * 37;
        Instant instant2 = this.old_subscription_ended_at;
        int iHashCode4 = ((iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.promotion_name.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("new_subscription_id=" + this.new_subscription_id);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Date date = this.billing_start;
        if (date != null) {
            arrayList.add("billing_start=" + date);
        }
        arrayList.add("free_days=" + this.free_days);
        arrayList.add("charged_account=" + Internal.sanitize(this.charged_account));
        arrayList.add("plan_id=" + this.plan_id);
        arrayList.add("old_subscription_id=" + this.old_subscription_id);
        Instant instant2 = this.old_subscription_ended_at;
        if (instant2 != null) {
            arrayList.add("old_subscription_ended_at=" + instant2);
        }
        arrayList.add("promotion_name=" + Internal.sanitize(this.promotion_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlanSwitchedDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlanSwitchedDetails copy$default(PlanSwitchedDetails planSwitchedDetails, ByteString byteString, Instant instant, Date date, int i, String str, ByteString byteString2, ByteString byteString3, Instant instant2, String str2, ByteString byteString4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            byteString = planSwitchedDetails.new_subscription_id;
        }
        if ((i2 & 2) != 0) {
            instant = planSwitchedDetails.created_at;
        }
        if ((i2 & 4) != 0) {
            date = planSwitchedDetails.billing_start;
        }
        if ((i2 & 8) != 0) {
            i = planSwitchedDetails.free_days;
        }
        if ((i2 & 16) != 0) {
            str = planSwitchedDetails.charged_account;
        }
        if ((i2 & 32) != 0) {
            byteString2 = planSwitchedDetails.plan_id;
        }
        if ((i2 & 64) != 0) {
            byteString3 = planSwitchedDetails.old_subscription_id;
        }
        if ((i2 & 128) != 0) {
            instant2 = planSwitchedDetails.old_subscription_ended_at;
        }
        if ((i2 & 256) != 0) {
            str2 = planSwitchedDetails.promotion_name;
        }
        if ((i2 & 512) != 0) {
            byteString4 = planSwitchedDetails.unknownFields();
        }
        String str3 = str2;
        ByteString byteString5 = byteString4;
        ByteString byteString6 = byteString3;
        Instant instant3 = instant2;
        String str4 = str;
        ByteString byteString7 = byteString2;
        return planSwitchedDetails.copy(byteString, instant, date, i, str4, byteString7, byteString6, instant3, str3, byteString5);
    }

    public final PlanSwitchedDetails copy(ByteString new_subscription_id, Instant created_at, Date billing_start, int free_days, String charged_account, ByteString plan_id, ByteString old_subscription_id, Instant old_subscription_ended_at, String promotion_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(new_subscription_id, "new_subscription_id");
        Intrinsics.checkNotNullParameter(charged_account, "charged_account");
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(old_subscription_id, "old_subscription_id");
        Intrinsics.checkNotNullParameter(promotion_name, "promotion_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlanSwitchedDetails(new_subscription_id, created_at, billing_start, free_days, charged_account, plan_id, old_subscription_id, old_subscription_ended_at, promotion_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlanSwitchedDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlanSwitchedDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.midas.v1.PlanSwitchedDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlanSwitchedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString new_subscription_id = value.getNew_subscription_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(new_subscription_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getNew_subscription_id());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getCreated_at());
                }
                if (value.getBilling_start() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(3, value.getBilling_start());
                }
                if (value.getFree_days() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getFree_days()));
                }
                if (!Intrinsics.areEqual(value.getCharged_account(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCharged_account());
                }
                if (!Intrinsics.areEqual(value.getPlan_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(6, value.getPlan_id());
                }
                if (!Intrinsics.areEqual(value.getOld_subscription_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(7, value.getOld_subscription_id());
                }
                if (value.getOld_subscription_ended_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getOld_subscription_ended_at());
                }
                return !Intrinsics.areEqual(value.getPromotion_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(9, value.getPromotion_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlanSwitchedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString new_subscription_id = value.getNew_subscription_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(new_subscription_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getNew_subscription_id());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (value.getBilling_start() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getBilling_start());
                }
                if (value.getFree_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getFree_days()));
                }
                if (!Intrinsics.areEqual(value.getCharged_account(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCharged_account());
                }
                if (!Intrinsics.areEqual(value.getPlan_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 6, (int) value.getPlan_id());
                }
                if (!Intrinsics.areEqual(value.getOld_subscription_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getOld_subscription_id());
                }
                if (value.getOld_subscription_ended_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getOld_subscription_ended_at());
                }
                if (!Intrinsics.areEqual(value.getPromotion_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getPromotion_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlanSwitchedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPromotion_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getPromotion_name());
                }
                if (value.getOld_subscription_ended_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getOld_subscription_ended_at());
                }
                ByteString old_subscription_id = value.getOld_subscription_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(old_subscription_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getOld_subscription_id());
                }
                if (!Intrinsics.areEqual(value.getPlan_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 6, (int) value.getPlan_id());
                }
                if (!Intrinsics.areEqual(value.getCharged_account(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCharged_account());
                }
                if (value.getFree_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getFree_days()));
                }
                if (value.getBilling_start() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getBilling_start());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (Intrinsics.areEqual(value.getNew_subscription_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getNew_subscription_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlanSwitchedDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                Date dateDecode = null;
                Instant instantDecode = null;
                int iIntValue = 0;
                String strDecode = "";
                String strDecode2 = strDecode;
                ByteString byteStringDecode2 = byteStringDecode;
                ByteString byteStringDecode3 = byteStringDecode2;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 2:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                            case 4:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 7:
                                byteStringDecode3 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 8:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PlanSwitchedDetails(byteStringDecode, instantDecode2, dateDecode, iIntValue, strDecode, byteStringDecode2, byteStringDecode3, instantDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlanSwitchedDetails redact(PlanSwitchedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Date billing_start = value.getBilling_start();
                Date dateRedact = billing_start != null ? Date.ADAPTER.redact(billing_start) : null;
                Instant old_subscription_ended_at = value.getOld_subscription_ended_at();
                return PlanSwitchedDetails.copy$default(value, null, instantRedact, dateRedact, 0, null, null, null, old_subscription_ended_at != null ? ProtoAdapter.INSTANT.redact(old_subscription_ended_at) : null, null, ByteString.EMPTY, 377, null);
            }
        };
    }
}
