package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
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

/* compiled from: AdvisoryFutureReturnsGraphContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016JR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContext;", "Lcom/squareup/wire/Message;", "", "initial_portfolio_value", "", "deposit_frequency", "", "deposit_amount", "projection_range_1", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContext;", "projection_range_15", "projection_range_30", "unknownFields", "Lokio/ByteString;", "<init>", "(DLjava/lang/String;DLcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContext;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContext;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContext;Lokio/ByteString;)V", "getInitial_portfolio_value", "()D", "getDeposit_frequency", "()Ljava/lang/String;", "getDeposit_amount", "getProjection_range_1", "()Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContext;", "getProjection_range_15", "getProjection_range_30", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AdvisoryFutureReturnsGraphContext extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryFutureReturnsGraphContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double deposit_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "depositFrequency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String deposit_frequency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "initialPortfolioValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double initial_portfolio_value;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsProjectionRangeContext#ADAPTER", jsonName = "projectionRange1", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AdvisoryFutureReturnsProjectionRangeContext projection_range_1;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsProjectionRangeContext#ADAPTER", jsonName = "projectionRange15", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AdvisoryFutureReturnsProjectionRangeContext projection_range_15;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsProjectionRangeContext#ADAPTER", jsonName = "projectionRange30", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final AdvisoryFutureReturnsProjectionRangeContext projection_range_30;

    public AdvisoryFutureReturnsGraphContext() {
        this(0.0d, null, 0.0d, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24002newBuilder();
    }

    public final double getInitial_portfolio_value() {
        return this.initial_portfolio_value;
    }

    public final String getDeposit_frequency() {
        return this.deposit_frequency;
    }

    public /* synthetic */ AdvisoryFutureReturnsGraphContext(double d, String str, double d2, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext2, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? null : advisoryFutureReturnsProjectionRangeContext, (i & 16) != 0 ? null : advisoryFutureReturnsProjectionRangeContext2, (i & 32) != 0 ? null : advisoryFutureReturnsProjectionRangeContext3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getDeposit_amount() {
        return this.deposit_amount;
    }

    public final AdvisoryFutureReturnsProjectionRangeContext getProjection_range_1() {
        return this.projection_range_1;
    }

    public final AdvisoryFutureReturnsProjectionRangeContext getProjection_range_15() {
        return this.projection_range_15;
    }

    public final AdvisoryFutureReturnsProjectionRangeContext getProjection_range_30() {
        return this.projection_range_30;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryFutureReturnsGraphContext(double d, String deposit_frequency, double d2, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext2, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.initial_portfolio_value = d;
        this.deposit_frequency = deposit_frequency;
        this.deposit_amount = d2;
        this.projection_range_1 = advisoryFutureReturnsProjectionRangeContext;
        this.projection_range_15 = advisoryFutureReturnsProjectionRangeContext2;
        this.projection_range_30 = advisoryFutureReturnsProjectionRangeContext3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24002newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryFutureReturnsGraphContext)) {
            return false;
        }
        AdvisoryFutureReturnsGraphContext advisoryFutureReturnsGraphContext = (AdvisoryFutureReturnsGraphContext) other;
        return Intrinsics.areEqual(unknownFields(), advisoryFutureReturnsGraphContext.unknownFields()) && this.initial_portfolio_value == advisoryFutureReturnsGraphContext.initial_portfolio_value && Intrinsics.areEqual(this.deposit_frequency, advisoryFutureReturnsGraphContext.deposit_frequency) && this.deposit_amount == advisoryFutureReturnsGraphContext.deposit_amount && Intrinsics.areEqual(this.projection_range_1, advisoryFutureReturnsGraphContext.projection_range_1) && Intrinsics.areEqual(this.projection_range_15, advisoryFutureReturnsGraphContext.projection_range_15) && Intrinsics.areEqual(this.projection_range_30, advisoryFutureReturnsGraphContext.projection_range_30);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + Double.hashCode(this.initial_portfolio_value)) * 37) + this.deposit_frequency.hashCode()) * 37) + Double.hashCode(this.deposit_amount)) * 37;
        AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext = this.projection_range_1;
        int iHashCode2 = (iHashCode + (advisoryFutureReturnsProjectionRangeContext != null ? advisoryFutureReturnsProjectionRangeContext.hashCode() : 0)) * 37;
        AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext2 = this.projection_range_15;
        int iHashCode3 = (iHashCode2 + (advisoryFutureReturnsProjectionRangeContext2 != null ? advisoryFutureReturnsProjectionRangeContext2.hashCode() : 0)) * 37;
        AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext3 = this.projection_range_30;
        int iHashCode4 = iHashCode3 + (advisoryFutureReturnsProjectionRangeContext3 != null ? advisoryFutureReturnsProjectionRangeContext3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("initial_portfolio_value=" + this.initial_portfolio_value);
        arrayList.add("deposit_frequency=" + Internal.sanitize(this.deposit_frequency));
        arrayList.add("deposit_amount=" + this.deposit_amount);
        AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext = this.projection_range_1;
        if (advisoryFutureReturnsProjectionRangeContext != null) {
            arrayList.add("projection_range_1=" + advisoryFutureReturnsProjectionRangeContext);
        }
        AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext2 = this.projection_range_15;
        if (advisoryFutureReturnsProjectionRangeContext2 != null) {
            arrayList.add("projection_range_15=" + advisoryFutureReturnsProjectionRangeContext2);
        }
        AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext3 = this.projection_range_30;
        if (advisoryFutureReturnsProjectionRangeContext3 != null) {
            arrayList.add("projection_range_30=" + advisoryFutureReturnsProjectionRangeContext3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryFutureReturnsGraphContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryFutureReturnsGraphContext copy$default(AdvisoryFutureReturnsGraphContext advisoryFutureReturnsGraphContext, double d, String str, double d2, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext2, AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = advisoryFutureReturnsGraphContext.initial_portfolio_value;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            str = advisoryFutureReturnsGraphContext.deposit_frequency;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            d2 = advisoryFutureReturnsGraphContext.deposit_amount;
        }
        return advisoryFutureReturnsGraphContext.copy(d3, str2, d2, (i & 8) != 0 ? advisoryFutureReturnsGraphContext.projection_range_1 : advisoryFutureReturnsProjectionRangeContext, (i & 16) != 0 ? advisoryFutureReturnsGraphContext.projection_range_15 : advisoryFutureReturnsProjectionRangeContext2, (i & 32) != 0 ? advisoryFutureReturnsGraphContext.projection_range_30 : advisoryFutureReturnsProjectionRangeContext3, (i & 64) != 0 ? advisoryFutureReturnsGraphContext.unknownFields() : byteString);
    }

    public final AdvisoryFutureReturnsGraphContext copy(double initial_portfolio_value, String deposit_frequency, double deposit_amount, AdvisoryFutureReturnsProjectionRangeContext projection_range_1, AdvisoryFutureReturnsProjectionRangeContext projection_range_15, AdvisoryFutureReturnsProjectionRangeContext projection_range_30, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryFutureReturnsGraphContext(initial_portfolio_value, deposit_frequency, deposit_amount, projection_range_1, projection_range_15, projection_range_30, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryFutureReturnsGraphContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryFutureReturnsGraphContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsGraphContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryFutureReturnsGraphContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getInitial_portfolio_value());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getInitial_portfolio_value()));
                }
                if (!Intrinsics.areEqual(value.getDeposit_frequency(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDeposit_frequency());
                }
                if (!Double.valueOf(value.getDeposit_amount()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getDeposit_amount()));
                }
                if (value.getProjection_range_1() != null) {
                    size += AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodedSizeWithTag(4, value.getProjection_range_1());
                }
                if (value.getProjection_range_15() != null) {
                    size += AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodedSizeWithTag(5, value.getProjection_range_15());
                }
                return value.getProjection_range_30() != null ? size + AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodedSizeWithTag(6, value.getProjection_range_30()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryFutureReturnsGraphContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getInitial_portfolio_value());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getInitial_portfolio_value()));
                }
                if (!Intrinsics.areEqual(value.getDeposit_frequency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDeposit_frequency());
                }
                if (!Double.valueOf(value.getDeposit_amount()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDeposit_amount()));
                }
                if (value.getProjection_range_1() != null) {
                    AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getProjection_range_1());
                }
                if (value.getProjection_range_15() != null) {
                    AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getProjection_range_15());
                }
                if (value.getProjection_range_30() != null) {
                    AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodeWithTag(writer, 6, (int) value.getProjection_range_30());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryFutureReturnsGraphContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getProjection_range_30() != null) {
                    AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodeWithTag(writer, 6, (int) value.getProjection_range_30());
                }
                if (value.getProjection_range_15() != null) {
                    AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getProjection_range_15());
                }
                if (value.getProjection_range_1() != null) {
                    AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getProjection_range_1());
                }
                if (!Double.valueOf(value.getDeposit_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDeposit_amount()));
                }
                if (!Intrinsics.areEqual(value.getDeposit_frequency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDeposit_frequency());
                }
                if (Double.valueOf(value.getInitial_portfolio_value()).equals(dValueOf)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getInitial_portfolio_value()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFutureReturnsGraphContext redact(AdvisoryFutureReturnsGraphContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryFutureReturnsProjectionRangeContext projection_range_1 = value.getProjection_range_1();
                AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContextRedact = projection_range_1 != null ? AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.redact(projection_range_1) : null;
                AdvisoryFutureReturnsProjectionRangeContext projection_range_15 = value.getProjection_range_15();
                AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContextRedact2 = projection_range_15 != null ? AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.redact(projection_range_15) : null;
                AdvisoryFutureReturnsProjectionRangeContext projection_range_30 = value.getProjection_range_30();
                return AdvisoryFutureReturnsGraphContext.copy$default(value, 0.0d, null, 0.0d, advisoryFutureReturnsProjectionRangeContextRedact, advisoryFutureReturnsProjectionRangeContextRedact2, projection_range_30 != null ? AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.redact(projection_range_30) : null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFutureReturnsGraphContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContextDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContextDecode2 = null;
                AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContextDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 4:
                                advisoryFutureReturnsProjectionRangeContextDecode = AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.decode(reader);
                                break;
                            case 5:
                                advisoryFutureReturnsProjectionRangeContextDecode2 = AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.decode(reader);
                                break;
                            case 6:
                                advisoryFutureReturnsProjectionRangeContextDecode3 = AdvisoryFutureReturnsProjectionRangeContext.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisoryFutureReturnsGraphContext(dDoubleValue, strDecode, dDoubleValue2, advisoryFutureReturnsProjectionRangeContextDecode, advisoryFutureReturnsProjectionRangeContextDecode2, advisoryFutureReturnsProjectionRangeContextDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
