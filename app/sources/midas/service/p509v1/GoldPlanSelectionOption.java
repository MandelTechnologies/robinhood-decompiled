package midas.service.p509v1;

import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsDuxo;
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

/* compiled from: GoldPlanSelectionOption.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006%"}, m3636d2 = {"Lmidas/service/v1/GoldPlanSelectionOption;", "Lcom/squareup/wire/Message;", "", "title", "", "plan_id", "badge", "description", FinalTermsDuxo.GOLD_AGREEMENT_NAME, "Lmidas/service/v1/Agreement;", "gold_sweep_agreements", "Lmidas/service/v1/GoldSweepAgreements;", "select_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/Agreement;Lmidas/service/v1/GoldSweepAgreements;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getPlan_id", "getBadge", "getDescription", "getGold_agreement", "()Lmidas/service/v1/Agreement;", "getGold_sweep_agreements", "()Lmidas/service/v1/GoldSweepAgreements;", "getSelect_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GoldPlanSelectionOption extends Message {

    @JvmField
    public static final ProtoAdapter<GoldPlanSelectionOption> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String badge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String description;

    @WireField(adapter = "midas.service.v1.Agreement#ADAPTER", schemaIndex = 4, tag = 5)
    private final Agreement gold_agreement;

    @WireField(adapter = "midas.service.v1.GoldSweepAgreements#ADAPTER", schemaIndex = 5, tag = 6)
    private final GoldSweepAgreements gold_sweep_agreements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String plan_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String select_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public GoldPlanSelectionOption() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ GoldPlanSelectionOption(String str, String str2, String str3, String str4, Agreement agreement, GoldSweepAgreements goldSweepAgreements, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : agreement, (i & 32) != 0 ? null : goldSweepAgreements, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29317newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPlan_id() {
        return this.plan_id;
    }

    public final String getBadge() {
        return this.badge;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Agreement getGold_agreement() {
        return this.gold_agreement;
    }

    public final GoldSweepAgreements getGold_sweep_agreements() {
        return this.gold_sweep_agreements;
    }

    public final String getSelect_text() {
        return this.select_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldPlanSelectionOption(String title, String plan_id, String str, String description, Agreement agreement, GoldSweepAgreements goldSweepAgreements, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.plan_id = plan_id;
        this.badge = str;
        this.description = description;
        this.gold_agreement = agreement;
        this.gold_sweep_agreements = goldSweepAgreements;
        this.select_text = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29317newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldPlanSelectionOption)) {
            return false;
        }
        GoldPlanSelectionOption goldPlanSelectionOption = (GoldPlanSelectionOption) other;
        return Intrinsics.areEqual(unknownFields(), goldPlanSelectionOption.unknownFields()) && Intrinsics.areEqual(this.title, goldPlanSelectionOption.title) && Intrinsics.areEqual(this.plan_id, goldPlanSelectionOption.plan_id) && Intrinsics.areEqual(this.badge, goldPlanSelectionOption.badge) && Intrinsics.areEqual(this.description, goldPlanSelectionOption.description) && Intrinsics.areEqual(this.gold_agreement, goldPlanSelectionOption.gold_agreement) && Intrinsics.areEqual(this.gold_sweep_agreements, goldPlanSelectionOption.gold_sweep_agreements) && Intrinsics.areEqual(this.select_text, goldPlanSelectionOption.select_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.plan_id.hashCode()) * 37;
        String str = this.badge;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.description.hashCode()) * 37;
        Agreement agreement = this.gold_agreement;
        int iHashCode3 = (iHashCode2 + (agreement != null ? agreement.hashCode() : 0)) * 37;
        GoldSweepAgreements goldSweepAgreements = this.gold_sweep_agreements;
        int iHashCode4 = (iHashCode3 + (goldSweepAgreements != null ? goldSweepAgreements.hashCode() : 0)) * 37;
        String str2 = this.select_text;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("plan_id=" + Internal.sanitize(this.plan_id));
        String str = this.badge;
        if (str != null) {
            arrayList.add("badge=" + Internal.sanitize(str));
        }
        arrayList.add("description=" + Internal.sanitize(this.description));
        Agreement agreement = this.gold_agreement;
        if (agreement != null) {
            arrayList.add("gold_agreement=" + agreement);
        }
        GoldSweepAgreements goldSweepAgreements = this.gold_sweep_agreements;
        if (goldSweepAgreements != null) {
            arrayList.add("gold_sweep_agreements=" + goldSweepAgreements);
        }
        String str2 = this.select_text;
        if (str2 != null) {
            arrayList.add("select_text=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldPlanSelectionOption{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldPlanSelectionOption copy$default(GoldPlanSelectionOption goldPlanSelectionOption, String str, String str2, String str3, String str4, Agreement agreement, GoldSweepAgreements goldSweepAgreements, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldPlanSelectionOption.title;
        }
        if ((i & 2) != 0) {
            str2 = goldPlanSelectionOption.plan_id;
        }
        if ((i & 4) != 0) {
            str3 = goldPlanSelectionOption.badge;
        }
        if ((i & 8) != 0) {
            str4 = goldPlanSelectionOption.description;
        }
        if ((i & 16) != 0) {
            agreement = goldPlanSelectionOption.gold_agreement;
        }
        if ((i & 32) != 0) {
            goldSweepAgreements = goldPlanSelectionOption.gold_sweep_agreements;
        }
        if ((i & 64) != 0) {
            str5 = goldPlanSelectionOption.select_text;
        }
        if ((i & 128) != 0) {
            byteString = goldPlanSelectionOption.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        Agreement agreement2 = agreement;
        GoldSweepAgreements goldSweepAgreements2 = goldSweepAgreements;
        return goldPlanSelectionOption.copy(str, str2, str3, str4, agreement2, goldSweepAgreements2, str6, byteString2);
    }

    public final GoldPlanSelectionOption copy(String title, String plan_id, String badge, String description, Agreement gold_agreement, GoldSweepAgreements gold_sweep_agreements, String select_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldPlanSelectionOption(title, plan_id, badge, description, gold_agreement, gold_sweep_agreements, select_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldPlanSelectionOption.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldPlanSelectionOption>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.GoldPlanSelectionOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldPlanSelectionOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getPlan_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPlan_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getBadge());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getDescription());
                }
                return iEncodedSizeWithTag + Agreement.ADAPTER.encodedSizeWithTag(5, value.getGold_agreement()) + GoldSweepAgreements.ADAPTER.encodedSizeWithTag(6, value.getGold_sweep_agreements()) + protoAdapter.encodedSizeWithTag(7, value.getSelect_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldPlanSelectionOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getPlan_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPlan_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBadge());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                Agreement.ADAPTER.encodeWithTag(writer, 5, (int) value.getGold_agreement());
                GoldSweepAgreements.ADAPTER.encodeWithTag(writer, 6, (int) value.getGold_sweep_agreements());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getSelect_text());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldPlanSelectionOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getSelect_text());
                GoldSweepAgreements.ADAPTER.encodeWithTag(writer, 6, (int) value.getGold_sweep_agreements());
                Agreement.ADAPTER.encodeWithTag(writer, 5, (int) value.getGold_agreement());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBadge());
                if (!Intrinsics.areEqual(value.getPlan_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPlan_id());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldPlanSelectionOption redact(GoldPlanSelectionOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Agreement gold_agreement = value.getGold_agreement();
                Agreement agreementRedact = gold_agreement != null ? Agreement.ADAPTER.redact(gold_agreement) : null;
                GoldSweepAgreements gold_sweep_agreements = value.getGold_sweep_agreements();
                return GoldPlanSelectionOption.copy$default(value, null, null, null, null, agreementRedact, gold_sweep_agreements != null ? GoldSweepAgreements.ADAPTER.redact(gold_sweep_agreements) : null, null, ByteString.EMPTY, 79, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldPlanSelectionOption decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                Agreement agreementDecode = null;
                GoldSweepAgreements goldSweepAgreementsDecode = null;
                String strDecode4 = null;
                String strDecode5 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                agreementDecode = Agreement.ADAPTER.decode(reader);
                                break;
                            case 6:
                                goldSweepAgreementsDecode = GoldSweepAgreements.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GoldPlanSelectionOption(strDecode, strDecode5, strDecode3, strDecode2, agreementDecode, goldSweepAgreementsDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
