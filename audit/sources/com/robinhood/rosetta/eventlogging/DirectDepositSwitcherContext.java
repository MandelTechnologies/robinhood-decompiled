package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
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

/* compiled from: DirectDepositSwitcherContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext;", "Lcom/squareup/wire/Message;", "", "payroll_provider", "", "close_reason", "distribution_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "distribution_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;DLokio/ByteString;)V", "getPayroll_provider", "()Ljava/lang/String;", "getClose_reason", "getDistribution_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "getDistribution_amount", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "DistributionType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DirectDepositSwitcherContext extends Message {

    @JvmField
    public static final ProtoAdapter<DirectDepositSwitcherContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "closeReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String close_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "distributionAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double distribution_amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext$DistributionType#ADAPTER", jsonName = "distributionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final DistributionType distribution_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "payrollProvider", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String payroll_provider;

    public DirectDepositSwitcherContext() {
        this(null, null, null, 0.0d, null, 31, null);
    }

    public /* synthetic */ DirectDepositSwitcherContext(String str, String str2, DistributionType distributionType, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED : distributionType, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24225newBuilder();
    }

    public final String getPayroll_provider() {
        return this.payroll_provider;
    }

    public final String getClose_reason() {
        return this.close_reason;
    }

    public final DistributionType getDistribution_type() {
        return this.distribution_type;
    }

    public final double getDistribution_amount() {
        return this.distribution_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositSwitcherContext(String payroll_provider, String close_reason, DistributionType distribution_type, double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(payroll_provider, "payroll_provider");
        Intrinsics.checkNotNullParameter(close_reason, "close_reason");
        Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.payroll_provider = payroll_provider;
        this.close_reason = close_reason;
        this.distribution_type = distribution_type;
        this.distribution_amount = d;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24225newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DirectDepositSwitcherContext)) {
            return false;
        }
        DirectDepositSwitcherContext directDepositSwitcherContext = (DirectDepositSwitcherContext) other;
        return Intrinsics.areEqual(unknownFields(), directDepositSwitcherContext.unknownFields()) && Intrinsics.areEqual(this.payroll_provider, directDepositSwitcherContext.payroll_provider) && Intrinsics.areEqual(this.close_reason, directDepositSwitcherContext.close_reason) && this.distribution_type == directDepositSwitcherContext.distribution_type && this.distribution_amount == directDepositSwitcherContext.distribution_amount;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.payroll_provider.hashCode()) * 37) + this.close_reason.hashCode()) * 37) + this.distribution_type.hashCode()) * 37) + Double.hashCode(this.distribution_amount);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("payroll_provider=" + Internal.sanitize(this.payroll_provider));
        arrayList.add("close_reason=" + Internal.sanitize(this.close_reason));
        arrayList.add("distribution_type=" + this.distribution_type);
        arrayList.add("distribution_amount=" + this.distribution_amount);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DirectDepositSwitcherContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DirectDepositSwitcherContext copy$default(DirectDepositSwitcherContext directDepositSwitcherContext, String str, String str2, DistributionType distributionType, double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directDepositSwitcherContext.payroll_provider;
        }
        if ((i & 2) != 0) {
            str2 = directDepositSwitcherContext.close_reason;
        }
        if ((i & 4) != 0) {
            distributionType = directDepositSwitcherContext.distribution_type;
        }
        if ((i & 8) != 0) {
            d = directDepositSwitcherContext.distribution_amount;
        }
        if ((i & 16) != 0) {
            byteString = directDepositSwitcherContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        DistributionType distributionType2 = distributionType;
        return directDepositSwitcherContext.copy(str, str2, distributionType2, d, byteString2);
    }

    public final DirectDepositSwitcherContext copy(String payroll_provider, String close_reason, DistributionType distribution_type, double distribution_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(payroll_provider, "payroll_provider");
        Intrinsics.checkNotNullParameter(close_reason, "close_reason");
        Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DirectDepositSwitcherContext(payroll_provider, close_reason, distribution_type, distribution_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DirectDepositSwitcherContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DirectDepositSwitcherContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DirectDepositSwitcherContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPayroll_provider(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPayroll_provider());
                }
                if (!Intrinsics.areEqual(value.getClose_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getClose_reason());
                }
                if (value.getDistribution_type() != DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED) {
                    size += DirectDepositSwitcherContext.DistributionType.ADAPTER.encodedSizeWithTag(3, value.getDistribution_type());
                }
                return !Double.valueOf(value.getDistribution_amount()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getDistribution_amount())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DirectDepositSwitcherContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPayroll_provider(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayroll_provider());
                }
                if (!Intrinsics.areEqual(value.getClose_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClose_reason());
                }
                if (value.getDistribution_type() != DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED) {
                    DirectDepositSwitcherContext.DistributionType.ADAPTER.encodeWithTag(writer, 3, (int) value.getDistribution_type());
                }
                if (!Double.valueOf(value.getDistribution_amount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDistribution_amount()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DirectDepositSwitcherContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Double.valueOf(value.getDistribution_amount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDistribution_amount()));
                }
                if (value.getDistribution_type() != DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED) {
                    DirectDepositSwitcherContext.DistributionType.ADAPTER.encodeWithTag(writer, 3, (int) value.getDistribution_type());
                }
                if (!Intrinsics.areEqual(value.getClose_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClose_reason());
                }
                if (Intrinsics.areEqual(value.getPayroll_provider(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayroll_provider());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DirectDepositSwitcherContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DirectDepositSwitcherContext.DistributionType distributionTypeDecode = DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                String strDecode = "";
                String strDecode2 = strDecode;
                while (true) {
                    DirectDepositSwitcherContext.DistributionType distributionType = distributionTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DirectDepositSwitcherContext(strDecode, strDecode2, distributionType, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                distributionTypeDecode = DirectDepositSwitcherContext.DistributionType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DirectDepositSwitcherContext redact(DirectDepositSwitcherContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DirectDepositSwitcherContext.copy$default(value, null, null, null, 0.0d, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositSwitcherContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DISTRIBUTION_TYPE_UNSPECIFIED", "PERCENT", "FIXED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DistributionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DistributionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DistributionType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DistributionType DISTRIBUTION_TYPE_UNSPECIFIED;
        public static final DistributionType FIXED;
        public static final DistributionType PERCENT;
        private final int value;

        private static final /* synthetic */ DistributionType[] $values() {
            return new DistributionType[]{DISTRIBUTION_TYPE_UNSPECIFIED, PERCENT, FIXED};
        }

        @JvmStatic
        public static final DistributionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DistributionType> getEntries() {
            return $ENTRIES;
        }

        private DistributionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DistributionType distributionType = new DistributionType("DISTRIBUTION_TYPE_UNSPECIFIED", 0, 0);
            DISTRIBUTION_TYPE_UNSPECIFIED = distributionType;
            PERCENT = new DistributionType("PERCENT", 1, 1);
            FIXED = new DistributionType("FIXED", 2, 2);
            DistributionType[] distributionTypeArr$values = $values();
            $VALUES = distributionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(distributionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DistributionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DistributionType>(orCreateKotlinClass, syntax, distributionType) { // from class: com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext$DistributionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DirectDepositSwitcherContext.DistributionType fromValue(int value) {
                    return DirectDepositSwitcherContext.DistributionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DirectDepositSwitcherContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DistributionType fromValue(int value) {
                if (value == 0) {
                    return DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return DistributionType.PERCENT;
                }
                if (value != 2) {
                    return null;
                }
                return DistributionType.FIXED;
            }
        }

        public static DistributionType valueOf(String str) {
            return (DistributionType) Enum.valueOf(DistributionType.class, str);
        }

        public static DistributionType[] values() {
            return (DistributionType[]) $VALUES.clone();
        }
    }
}
