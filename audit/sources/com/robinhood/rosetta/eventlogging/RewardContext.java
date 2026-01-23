package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: RewardContext.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JZ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RewardContext;", "Lcom/squareup/wire/Message;", "", "reward_id", "", "reward_amount", "Lcom/robinhood/rosetta/eventlogging/Money;", "reward_quantity", "", "instrument_price", "button_text", "instrument_disabled", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "reward_type", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Money;DLcom/robinhood/rosetta/eventlogging/Money;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "getReward_id", "()Ljava/lang/String;", "getReward_amount", "()Lcom/robinhood/rosetta/eventlogging/Money;", "getReward_quantity", "()D", "getInstrument_price", "getButton_text", "getInstrument_disabled", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getReward_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RewardContext extends Message {

    @JvmField
    public static final ProtoAdapter<RewardContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String button_text;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "instrumentDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Boolean instrument_disabled;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", jsonName = "instrumentPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money instrument_price;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", jsonName = "rewardAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money reward_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rewardId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String reward_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "rewardQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double reward_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rewardType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String reward_type;

    public RewardContext() {
        this(null, null, 0.0d, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ RewardContext(String str, Money money, double d, Money money2, String str2, Boolean r9, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r9, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24541newBuilder();
    }

    public final String getReward_id() {
        return this.reward_id;
    }

    public final Money getReward_amount() {
        return this.reward_amount;
    }

    public final double getReward_quantity() {
        return this.reward_quantity;
    }

    public final Money getInstrument_price() {
        return this.instrument_price;
    }

    public final String getButton_text() {
        return this.button_text;
    }

    public final Boolean getInstrument_disabled() {
        return this.instrument_disabled;
    }

    public final String getReward_type() {
        return this.reward_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardContext(String reward_id, Money money, double d, Money money2, String button_text, Boolean instrument_disabled, String reward_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(reward_id, "reward_id");
        Intrinsics.checkNotNullParameter(button_text, "button_text");
        Intrinsics.checkNotNullParameter(instrument_disabled, "instrument_disabled");
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.reward_id = reward_id;
        this.reward_amount = money;
        this.reward_quantity = d;
        this.instrument_price = money2;
        this.button_text = button_text;
        this.instrument_disabled = instrument_disabled;
        this.reward_type = reward_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24541newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RewardContext)) {
            return false;
        }
        RewardContext rewardContext = (RewardContext) other;
        return Intrinsics.areEqual(unknownFields(), rewardContext.unknownFields()) && Intrinsics.areEqual(this.reward_id, rewardContext.reward_id) && Intrinsics.areEqual(this.reward_amount, rewardContext.reward_amount) && this.reward_quantity == rewardContext.reward_quantity && Intrinsics.areEqual(this.instrument_price, rewardContext.instrument_price) && Intrinsics.areEqual(this.button_text, rewardContext.button_text) && this.instrument_disabled == rewardContext.instrument_disabled && Intrinsics.areEqual(this.reward_type, rewardContext.reward_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.reward_id.hashCode()) * 37;
        Money money = this.reward_amount;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + Double.hashCode(this.reward_quantity)) * 37;
        Money money2 = this.instrument_price;
        int iHashCode3 = ((((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.button_text.hashCode()) * 37) + this.instrument_disabled.hashCode()) * 37) + this.reward_type.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("reward_id=" + Internal.sanitize(this.reward_id));
        Money money = this.reward_amount;
        if (money != null) {
            arrayList.add("reward_amount=" + money);
        }
        arrayList.add("reward_quantity=" + this.reward_quantity);
        Money money2 = this.instrument_price;
        if (money2 != null) {
            arrayList.add("instrument_price=" + money2);
        }
        arrayList.add("button_text=" + Internal.sanitize(this.button_text));
        arrayList.add("instrument_disabled=" + this.instrument_disabled);
        arrayList.add("reward_type=" + Internal.sanitize(this.reward_type));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RewardContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RewardContext copy$default(RewardContext rewardContext, String str, Money money, double d, Money money2, String str2, Boolean r7, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardContext.reward_id;
        }
        if ((i & 2) != 0) {
            money = rewardContext.reward_amount;
        }
        if ((i & 4) != 0) {
            d = rewardContext.reward_quantity;
        }
        if ((i & 8) != 0) {
            money2 = rewardContext.instrument_price;
        }
        if ((i & 16) != 0) {
            str2 = rewardContext.button_text;
        }
        if ((i & 32) != 0) {
            r7 = rewardContext.instrument_disabled;
        }
        if ((i & 64) != 0) {
            str3 = rewardContext.reward_type;
        }
        if ((i & 128) != 0) {
            byteString = rewardContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        Boolean r9 = r7;
        Money money3 = money2;
        double d2 = d;
        return rewardContext.copy(str, money, d2, money3, str2, r9, str3, byteString2);
    }

    public final RewardContext copy(String reward_id, Money reward_amount, double reward_quantity, Money instrument_price, String button_text, Boolean instrument_disabled, String reward_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(reward_id, "reward_id");
        Intrinsics.checkNotNullParameter(button_text, "button_text");
        Intrinsics.checkNotNullParameter(instrument_disabled, "instrument_disabled");
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RewardContext(reward_id, reward_amount, reward_quantity, instrument_price, button_text, instrument_disabled, reward_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RewardContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RewardContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RewardContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RewardContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getReward_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getReward_id());
                }
                if (value.getReward_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getReward_amount());
                }
                if (!Double.valueOf(value.getReward_quantity()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getReward_quantity()));
                }
                if (value.getInstrument_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getInstrument_price());
                }
                if (!Intrinsics.areEqual(value.getButton_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getButton_text());
                }
                if (value.getInstrument_disabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(6, value.getInstrument_disabled());
                }
                return !Intrinsics.areEqual(value.getReward_type(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getReward_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RewardContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getReward_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getReward_id());
                }
                if (value.getReward_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getReward_amount());
                }
                if (!Double.valueOf(value.getReward_quantity()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getReward_quantity()));
                }
                if (value.getInstrument_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstrument_price());
                }
                if (!Intrinsics.areEqual(value.getButton_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getButton_text());
                }
                if (value.getInstrument_disabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getInstrument_disabled());
                }
                if (!Intrinsics.areEqual(value.getReward_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getReward_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RewardContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getReward_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getReward_type());
                }
                if (value.getInstrument_disabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getInstrument_disabled());
                }
                if (!Intrinsics.areEqual(value.getButton_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getButton_text());
                }
                if (value.getInstrument_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstrument_price());
                }
                if (!Double.valueOf(value.getReward_quantity()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getReward_quantity()));
                }
                if (value.getReward_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getReward_amount());
                }
                if (Intrinsics.areEqual(value.getReward_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getReward_id());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public com.robinhood.rosetta.eventlogging.RewardContext decode(com.squareup.wire.ProtoReader r21) {
                /*
                    r20 = this;
                    r1 = r21
                    java.lang.String r0 = "reader"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    com.robinhood.rosetta.eventlogging.Boolean r0 = com.robinhood.rosetta.eventlogging.Boolean.BOOLEAN_UNSPECIFIED
                    long r2 = r1.beginMessage()
                    java.lang.String r4 = ""
                    r5 = 0
                    r6 = 0
                    r8 = r5
                    r9 = r8
                    r13 = r6
                    r5 = r4
                    r6 = r5
                    r7 = r6
                L18:
                    r4 = r0
                L19:
                    int r10 = r1.nextTag()
                    r0 = -1
                    if (r10 == r0) goto L81
                    switch(r10) {
                        case 1: goto L78;
                        case 2: goto L6e;
                        case 3: goto L5e;
                        case 4: goto L54;
                        case 5: goto L4a;
                        case 6: goto L31;
                        case 7: goto L29;
                        default: goto L23;
                    }
                L23:
                    r1.readUnknownField(r10)
                    r15 = r4
                    r12 = r5
                    goto L47
                L29:
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r7 = r0
                    goto L19
                L31:
                    com.squareup.wire.ProtoAdapter<com.robinhood.rosetta.eventlogging.Boolean> r0 = com.robinhood.rosetta.eventlogging.Boolean.ADAPTER     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L38
                    java.lang.Object r0 = r0.decode(r1)     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L38
                    goto L18
                L38:
                    r0 = move-exception
                    com.squareup.wire.FieldEncoding r11 = com.squareup.wire.FieldEncoding.VARINT
                    int r0 = r0.value
                    r15 = r4
                    r12 = r5
                    long r4 = (long) r0
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)
                    r1.addUnknownField(r10, r11, r0)
                L47:
                    r5 = r12
                    r4 = r15
                    goto L19
                L4a:
                    r15 = r4
                    r12 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r6 = r0
                    goto L19
                L54:
                    r15 = r4
                    r12 = r5
                    com.squareup.wire.ProtoAdapter<com.robinhood.rosetta.eventlogging.Money> r0 = com.robinhood.rosetta.eventlogging.Money.ADAPTER
                    java.lang.Object r0 = r0.decode(r1)
                    r9 = r0
                    goto L19
                L5e:
                    r15 = r4
                    r12 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.Double> r0 = com.squareup.wire.ProtoAdapter.DOUBLE
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    double r4 = r0.doubleValue()
                    r13 = r4
                    goto L47
                L6e:
                    r15 = r4
                    r12 = r5
                    com.squareup.wire.ProtoAdapter<com.robinhood.rosetta.eventlogging.Money> r0 = com.robinhood.rosetta.eventlogging.Money.ADAPTER
                    java.lang.Object r0 = r0.decode(r1)
                    r8 = r0
                    goto L19
                L78:
                    r15 = r4
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r5 = r0
                    goto L19
                L81:
                    r15 = r4
                    r12 = r5
                    okio.ByteString r19 = r1.endMessageAndGetUnknownFields(r2)
                    com.robinhood.rosetta.eventlogging.RewardContext r10 = new com.robinhood.rosetta.eventlogging.RewardContext
                    r11 = r12
                    java.lang.String r11 = (java.lang.String) r11
                    r12 = r8
                    com.robinhood.rosetta.eventlogging.Money r12 = (com.robinhood.rosetta.eventlogging.Money) r12
                    com.robinhood.rosetta.eventlogging.Money r9 = (com.robinhood.rosetta.eventlogging.Money) r9
                    r16 = r6
                    java.lang.String r16 = (java.lang.String) r16
                    r17 = r15
                    com.robinhood.rosetta.eventlogging.Boolean r17 = (com.robinhood.rosetta.eventlogging.Boolean) r17
                    r18 = r7
                    java.lang.String r18 = (java.lang.String) r18
                    r15 = r9
                    r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19)
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.RewardContext2.decode(com.squareup.wire.ProtoReader):com.robinhood.rosetta.eventlogging.RewardContext");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RewardContext redact(RewardContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money reward_amount = value.getReward_amount();
                Money moneyRedact = reward_amount != null ? Money.ADAPTER.redact(reward_amount) : null;
                Money instrument_price = value.getInstrument_price();
                return RewardContext.copy$default(value, null, moneyRedact, 0.0d, instrument_price != null ? Money.ADAPTER.redact(instrument_price) : null, null, null, null, ByteString.EMPTY, 117, null);
            }
        };
    }
}
