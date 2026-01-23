package com.robinhood.copilot.proto.p286v1;

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
import java.util.List;
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

/* compiled from: StrategiesDigest.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0091\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0097\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010#R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010#R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010#R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b-\u0010#R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b.\u0010#R\"\u0010\u0011\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b/\u0010+R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b6\u00105¨\u00068"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "Lcom/squareup/wire/Message;", "", "", "id", "account_number", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generated_at", "title", "", "Lcom/robinhood/copilot/proto/v1/DigestItem;", "items", "Lcom/robinhood/copilot/proto/v1/ArticleSource;", "sources", "overview", "period", "next_generation_epoch", "", "portfolio_change_ptc", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;DLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;DLokio/ByteString;)Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "Ljava/lang/String;", "getId", "getAccount_number", "Lj$/time/Instant;", "getGenerated_at", "()Lj$/time/Instant;", "getTitle", "getOverview", "getPeriod", "getNext_generation_epoch", "D", "getPortfolio_change_ptc", "()D", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getSources", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class StrategiesDigest extends Message {

    @JvmField
    public static final ProtoAdapter<StrategiesDigest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "generatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant generated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.DigestItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<DigestItem> items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "nextGenerationEpoch", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant next_generation_epoch;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String overview;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String period;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "portfolioChangePtc", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final double portfolio_change_ptc;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.ArticleSource#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<ArticleSource> sources;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String title;

    public StrategiesDigest() {
        this(null, null, null, null, null, null, null, null, null, 0.0d, null, 2047, null);
    }

    public /* synthetic */ StrategiesDigest(String str, String str2, Instant instant, String str3, List list, List list2, String str4, String str5, Instant instant2, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? "" : str4, (i & 128) == 0 ? str5 : "", (i & 256) == 0 ? instant2 : null, (i & 512) != 0 ? 0.0d : d, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22169newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Instant getGenerated_at() {
        return this.generated_at;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getOverview() {
        return this.overview;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final Instant getNext_generation_epoch() {
        return this.next_generation_epoch;
    }

    public final double getPortfolio_change_ptc() {
        return this.portfolio_change_ptc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategiesDigest(String id, String account_number, Instant instant, String title, List<DigestItem> items, List<ArticleSource> sources, String overview, String period, Instant instant2, double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.generated_at = instant;
        this.title = title;
        this.overview = overview;
        this.period = period;
        this.next_generation_epoch = instant2;
        this.portfolio_change_ptc = d;
        this.items = Internal.immutableCopyOf("items", items);
        this.sources = Internal.immutableCopyOf("sources", sources);
    }

    public final List<DigestItem> getItems() {
        return this.items;
    }

    public final List<ArticleSource> getSources() {
        return this.sources;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22169newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StrategiesDigest)) {
            return false;
        }
        StrategiesDigest strategiesDigest = (StrategiesDigest) other;
        return Intrinsics.areEqual(unknownFields(), strategiesDigest.unknownFields()) && Intrinsics.areEqual(this.id, strategiesDigest.id) && Intrinsics.areEqual(this.account_number, strategiesDigest.account_number) && Intrinsics.areEqual(this.generated_at, strategiesDigest.generated_at) && Intrinsics.areEqual(this.title, strategiesDigest.title) && Intrinsics.areEqual(this.items, strategiesDigest.items) && Intrinsics.areEqual(this.sources, strategiesDigest.sources) && Intrinsics.areEqual(this.overview, strategiesDigest.overview) && Intrinsics.areEqual(this.period, strategiesDigest.period) && Intrinsics.areEqual(this.next_generation_epoch, strategiesDigest.next_generation_epoch) && this.portfolio_change_ptc == strategiesDigest.portfolio_change_ptc;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        Instant instant = this.generated_at;
        int iHashCode2 = (((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.items.hashCode()) * 37) + this.sources.hashCode()) * 37) + this.overview.hashCode()) * 37) + this.period.hashCode()) * 37;
        Instant instant2 = this.next_generation_epoch;
        int iHashCode3 = ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + Double.hashCode(this.portfolio_change_ptc);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        Instant instant = this.generated_at;
        if (instant != null) {
            arrayList.add("generated_at=" + instant);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        if (!this.sources.isEmpty()) {
            arrayList.add("sources=" + this.sources);
        }
        arrayList.add("overview=" + Internal.sanitize(this.overview));
        arrayList.add("period=" + Internal.sanitize(this.period));
        Instant instant2 = this.next_generation_epoch;
        if (instant2 != null) {
            arrayList.add("next_generation_epoch=" + instant2);
        }
        arrayList.add("portfolio_change_ptc=" + this.portfolio_change_ptc);
        return CollectionsKt.joinToString$default(arrayList, ", ", "StrategiesDigest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StrategiesDigest copy$default(StrategiesDigest strategiesDigest, String str, String str2, Instant instant, String str3, List list, List list2, String str4, String str5, Instant instant2, double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategiesDigest.id;
        }
        if ((i & 2) != 0) {
            str2 = strategiesDigest.account_number;
        }
        if ((i & 4) != 0) {
            instant = strategiesDigest.generated_at;
        }
        if ((i & 8) != 0) {
            str3 = strategiesDigest.title;
        }
        if ((i & 16) != 0) {
            list = strategiesDigest.items;
        }
        if ((i & 32) != 0) {
            list2 = strategiesDigest.sources;
        }
        if ((i & 64) != 0) {
            str4 = strategiesDigest.overview;
        }
        if ((i & 128) != 0) {
            str5 = strategiesDigest.period;
        }
        if ((i & 256) != 0) {
            instant2 = strategiesDigest.next_generation_epoch;
        }
        if ((i & 512) != 0) {
            d = strategiesDigest.portfolio_change_ptc;
        }
        if ((i & 1024) != 0) {
            byteString = strategiesDigest.unknownFields();
        }
        ByteString byteString2 = byteString;
        double d2 = d;
        String str6 = str5;
        Instant instant3 = instant2;
        List list3 = list2;
        String str7 = str4;
        List list4 = list;
        Instant instant4 = instant;
        return strategiesDigest.copy(str, str2, instant4, str3, list4, list3, str7, str6, instant3, d2, byteString2);
    }

    public final StrategiesDigest copy(String id, String account_number, Instant generated_at, String title, List<DigestItem> items, List<ArticleSource> sources, String overview, String period, Instant next_generation_epoch, double portfolio_change_ptc, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StrategiesDigest(id, account_number, generated_at, title, items, sources, overview, period, next_generation_epoch, portfolio_change_ptc, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StrategiesDigest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StrategiesDigest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.StrategiesDigest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StrategiesDigest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (value.getGenerated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getGenerated_at());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTitle());
                }
                int iEncodedSizeWithTag = size + DigestItem.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getItems()) + ArticleSource.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getSources());
                if (!Intrinsics.areEqual(value.getOverview(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getOverview());
                }
                if (!Intrinsics.areEqual(value.getPeriod(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPeriod());
                }
                if (value.getNext_generation_epoch() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getNext_generation_epoch());
                }
                return !Double.valueOf(value.getPortfolio_change_ptc()).equals(Double.valueOf(0.0d)) ? iEncodedSizeWithTag + ProtoAdapter.DOUBLE.encodedSizeWithTag(10, Double.valueOf(value.getPortfolio_change_ptc())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StrategiesDigest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getGenerated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getGenerated_at());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                DigestItem.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getItems());
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getSources());
                if (!Intrinsics.areEqual(value.getOverview(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOverview());
                }
                if (!Intrinsics.areEqual(value.getPeriod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPeriod());
                }
                if (value.getNext_generation_epoch() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getNext_generation_epoch());
                }
                if (!Double.valueOf(value.getPortfolio_change_ptc()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getPortfolio_change_ptc()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StrategiesDigest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Double.valueOf(value.getPortfolio_change_ptc()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getPortfolio_change_ptc()));
                }
                if (value.getNext_generation_epoch() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getNext_generation_epoch());
                }
                if (!Intrinsics.areEqual(value.getPeriod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPeriod());
                }
                if (!Intrinsics.areEqual(value.getOverview(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOverview());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getSources());
                DigestItem.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getItems());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (value.getGenerated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getGenerated_at());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StrategiesDigest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                double dDoubleValue = 0.0d;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                arrayList.add(DigestItem.ADAPTER.decode(reader));
                                break;
                            case 6:
                                arrayList2.add(ArticleSource.ADAPTER.decode(reader));
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 10:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new StrategiesDigest(strDecode, strDecode3, instantDecode, strDecode4, arrayList, arrayList2, strDecode5, strDecode2, instantDecode2, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StrategiesDigest redact(StrategiesDigest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant generated_at = value.getGenerated_at();
                Instant instantRedact = generated_at != null ? ProtoAdapter.INSTANT.redact(generated_at) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getItems(), DigestItem.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getSources(), ArticleSource.ADAPTER);
                Instant next_generation_epoch = value.getNext_generation_epoch();
                return StrategiesDigest.copy$default(value, null, null, instantRedact, null, listM26823redactElements, listM26823redactElements2, null, null, next_generation_epoch != null ? ProtoAdapter.INSTANT.redact(next_generation_epoch) : null, 0.0d, ByteString.EMPTY, 715, null);
            }
        };
    }
}
