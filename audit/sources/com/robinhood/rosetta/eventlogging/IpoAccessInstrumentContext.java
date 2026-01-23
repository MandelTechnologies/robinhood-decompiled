package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.EquityOrderMeta;
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

/* compiled from: IpoAccessInstrumentContext.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoAccessInstrumentContext;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "projected_allocated_shares", "", "total_ipo_shares", "expected_ipo_date", "projected_allocated_percentage", "", "ipo_access_status", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;JJLjava/lang/String;FLcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getProjected_allocated_shares", "()J", "getTotal_ipo_shares", "getExpected_ipo_date", "getProjected_allocated_percentage", "()F", "getIpo_access_status", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class IpoAccessInstrumentContext extends Message {

    @JvmField
    public static final ProtoAdapter<IpoAccessInstrumentContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "expectedIpoDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String expected_ipo_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderMeta$IPOAccessStatus#ADAPTER", jsonName = "ipoAccessStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final EquityOrderMeta.IPOAccessStatus ipo_access_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "projectedAllocatedPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final float projected_allocated_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "projectedAllocatedShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long projected_allocated_shares;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "totalIpoShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long total_ipo_shares;

    public IpoAccessInstrumentContext() {
        this(null, 0L, 0L, null, 0.0f, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ IpoAccessInstrumentContext(String str, long j, long j2, String str2, float f, EquityOrderMeta.IPOAccessStatus iPOAccessStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0.0f : f, (i & 32) != 0 ? EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED : iPOAccessStatus, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24319newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final long getProjected_allocated_shares() {
        return this.projected_allocated_shares;
    }

    public final long getTotal_ipo_shares() {
        return this.total_ipo_shares;
    }

    public final String getExpected_ipo_date() {
        return this.expected_ipo_date;
    }

    public final float getProjected_allocated_percentage() {
        return this.projected_allocated_percentage;
    }

    public final EquityOrderMeta.IPOAccessStatus getIpo_access_status() {
        return this.ipo_access_status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoAccessInstrumentContext(String instrument_id, long j, long j2, String expected_ipo_date, float f, EquityOrderMeta.IPOAccessStatus ipo_access_status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
        Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.projected_allocated_shares = j;
        this.total_ipo_shares = j2;
        this.expected_ipo_date = expected_ipo_date;
        this.projected_allocated_percentage = f;
        this.ipo_access_status = ipo_access_status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24319newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IpoAccessInstrumentContext)) {
            return false;
        }
        IpoAccessInstrumentContext ipoAccessInstrumentContext = (IpoAccessInstrumentContext) other;
        return Intrinsics.areEqual(unknownFields(), ipoAccessInstrumentContext.unknownFields()) && Intrinsics.areEqual(this.instrument_id, ipoAccessInstrumentContext.instrument_id) && this.projected_allocated_shares == ipoAccessInstrumentContext.projected_allocated_shares && this.total_ipo_shares == ipoAccessInstrumentContext.total_ipo_shares && Intrinsics.areEqual(this.expected_ipo_date, ipoAccessInstrumentContext.expected_ipo_date) && this.projected_allocated_percentage == ipoAccessInstrumentContext.projected_allocated_percentage && this.ipo_access_status == ipoAccessInstrumentContext.ipo_access_status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + Long.hashCode(this.projected_allocated_shares)) * 37) + Long.hashCode(this.total_ipo_shares)) * 37) + this.expected_ipo_date.hashCode()) * 37) + Float.hashCode(this.projected_allocated_percentage)) * 37) + this.ipo_access_status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("projected_allocated_shares=" + this.projected_allocated_shares);
        arrayList.add("total_ipo_shares=" + this.total_ipo_shares);
        arrayList.add("expected_ipo_date=" + Internal.sanitize(this.expected_ipo_date));
        arrayList.add("projected_allocated_percentage=" + this.projected_allocated_percentage);
        arrayList.add("ipo_access_status=" + this.ipo_access_status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IpoAccessInstrumentContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IpoAccessInstrumentContext copy$default(IpoAccessInstrumentContext ipoAccessInstrumentContext, String str, long j, long j2, String str2, float f, EquityOrderMeta.IPOAccessStatus iPOAccessStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipoAccessInstrumentContext.instrument_id;
        }
        if ((i & 2) != 0) {
            j = ipoAccessInstrumentContext.projected_allocated_shares;
        }
        if ((i & 4) != 0) {
            j2 = ipoAccessInstrumentContext.total_ipo_shares;
        }
        if ((i & 8) != 0) {
            str2 = ipoAccessInstrumentContext.expected_ipo_date;
        }
        if ((i & 16) != 0) {
            f = ipoAccessInstrumentContext.projected_allocated_percentage;
        }
        if ((i & 32) != 0) {
            iPOAccessStatus = ipoAccessInstrumentContext.ipo_access_status;
        }
        if ((i & 64) != 0) {
            byteString = ipoAccessInstrumentContext.unknownFields();
        }
        long j3 = j2;
        return ipoAccessInstrumentContext.copy(str, j, j3, str2, f, iPOAccessStatus, byteString);
    }

    public final IpoAccessInstrumentContext copy(String instrument_id, long projected_allocated_shares, long total_ipo_shares, String expected_ipo_date, float projected_allocated_percentage, EquityOrderMeta.IPOAccessStatus ipo_access_status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
        Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IpoAccessInstrumentContext(instrument_id, projected_allocated_shares, total_ipo_shares, expected_ipo_date, projected_allocated_percentage, ipo_access_status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IpoAccessInstrumentContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IpoAccessInstrumentContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IpoAccessInstrumentContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (value.getProjected_allocated_shares() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getProjected_allocated_shares()));
                }
                if (value.getTotal_ipo_shares() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getTotal_ipo_shares()));
                }
                if (!Intrinsics.areEqual(value.getExpected_ipo_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getExpected_ipo_date());
                }
                if (!Float.valueOf(value.getProjected_allocated_percentage()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(5, Float.valueOf(value.getProjected_allocated_percentage()));
                }
                return value.getIpo_access_status() != EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED ? size + EquityOrderMeta.IPOAccessStatus.ADAPTER.encodedSizeWithTag(6, value.getIpo_access_status()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IpoAccessInstrumentContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (value.getProjected_allocated_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getProjected_allocated_shares()));
                }
                if (value.getTotal_ipo_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getTotal_ipo_shares()));
                }
                if (!Intrinsics.areEqual(value.getExpected_ipo_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExpected_ipo_date());
                }
                if (!Float.valueOf(value.getProjected_allocated_percentage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getProjected_allocated_percentage()));
                }
                if (value.getIpo_access_status() != EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED) {
                    EquityOrderMeta.IPOAccessStatus.ADAPTER.encodeWithTag(writer, 6, (int) value.getIpo_access_status());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IpoAccessInstrumentContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIpo_access_status() != EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED) {
                    EquityOrderMeta.IPOAccessStatus.ADAPTER.encodeWithTag(writer, 6, (int) value.getIpo_access_status());
                }
                if (!Float.valueOf(value.getProjected_allocated_percentage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getProjected_allocated_percentage()));
                }
                if (!Intrinsics.areEqual(value.getExpected_ipo_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExpected_ipo_date());
                }
                if (value.getTotal_ipo_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getTotal_ipo_shares()));
                }
                if (value.getProjected_allocated_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getProjected_allocated_shares()));
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
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
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext decode(com.squareup.wire.ProtoReader r18) {
                /*
                    r17 = this;
                    r1 = r18
                    java.lang.String r0 = "reader"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    com.robinhood.rosetta.eventlogging.EquityOrderMeta$IPOAccessStatus r0 = com.robinhood.rosetta.eventlogging.EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED
                    long r2 = r1.beginMessage()
                    java.lang.String r4 = ""
                    r5 = 0
                    r7 = 0
                    r9 = r5
                    r11 = r9
                    r14 = r7
                    r5 = r4
                    r6 = r5
                L17:
                    r4 = r0
                L18:
                    int r7 = r1.nextTag()
                    r0 = -1
                    if (r7 == r0) goto L84
                    switch(r7) {
                        case 1: goto L7b;
                        case 2: goto L6b;
                        case 3: goto L5b;
                        case 4: goto L51;
                        case 5: goto L41;
                        case 6: goto L28;
                        default: goto L22;
                    }
                L22:
                    r1.readUnknownField(r7)
                    r15 = r4
                    r13 = r5
                    goto L3e
                L28:
                    com.squareup.wire.ProtoAdapter<com.robinhood.rosetta.eventlogging.EquityOrderMeta$IPOAccessStatus> r0 = com.robinhood.rosetta.eventlogging.EquityOrderMeta.IPOAccessStatus.ADAPTER     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L2f
                    java.lang.Object r0 = r0.decode(r1)     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L2f
                    goto L17
                L2f:
                    r0 = move-exception
                    com.squareup.wire.FieldEncoding r8 = com.squareup.wire.FieldEncoding.VARINT
                    int r0 = r0.value
                    r15 = r4
                    r13 = r5
                    long r4 = (long) r0
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)
                    r1.addUnknownField(r7, r8, r0)
                L3e:
                    r5 = r13
                    r4 = r15
                    goto L18
                L41:
                    r15 = r4
                    r13 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.Float> r0 = com.squareup.wire.ProtoAdapter.FLOAT
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r0 = r0.floatValue()
                    r14 = r0
                    goto L18
                L51:
                    r15 = r4
                    r13 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r6 = r0
                    goto L18
                L5b:
                    r15 = r4
                    r13 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.Long> r0 = com.squareup.wire.ProtoAdapter.INT64
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r4 = r0.longValue()
                    r11 = r4
                    goto L3e
                L6b:
                    r15 = r4
                    r13 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.Long> r0 = com.squareup.wire.ProtoAdapter.INT64
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r4 = r0.longValue()
                    r9 = r4
                    goto L3e
                L7b:
                    r15 = r4
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r5 = r0
                    goto L18
                L84:
                    r15 = r4
                    r13 = r5
                    okio.ByteString r16 = r1.endMessageAndGetUnknownFields(r2)
                    com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext r7 = new com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext
                    r8 = r13
                    java.lang.String r8 = (java.lang.String) r8
                    r13 = r6
                    java.lang.String r13 = (java.lang.String) r13
                    com.robinhood.rosetta.eventlogging.EquityOrderMeta$IPOAccessStatus r15 = (com.robinhood.rosetta.eventlogging.EquityOrderMeta.IPOAccessStatus) r15
                    r7.<init>(r8, r9, r11, r13, r14, r15, r16)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext2.decode(com.squareup.wire.ProtoReader):com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IpoAccessInstrumentContext redact(IpoAccessInstrumentContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IpoAccessInstrumentContext.copy$default(value, null, 0L, 0L, null, 0.0f, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
