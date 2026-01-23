package bff_money_movement.service.p019v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: InvestmentsTrackerGetPageResponse.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BW\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016JV\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponse;", "Lcom/squareup/wire/Message;", "", "components", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponent;", "title", "", "navigation_title", "account_last_four", "onboarding_data", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingData;", "tooltip", "Lbff_money_movement/service/v1/InvestmentsTrackerTooltipData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingData;Lbff_money_movement/service/v1/InvestmentsTrackerTooltipData;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getNavigation_title", "getAccount_last_four", "getOnboarding_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingData;", "getTooltip", "()Lbff_money_movement/service/v1/InvestmentsTrackerTooltipData;", "getComponents", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerGetPageResponse extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerGetPageResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_last_four;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<InvestmentsTrackerComponent> components;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navigationTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String navigation_title;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerOnboardingData#ADAPTER", jsonName = "onboardingData", schemaIndex = 4, tag = 5)
    private final InvestmentsTrackerOnboardingData onboarding_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerTooltipData#ADAPTER", schemaIndex = 5, tag = 6)
    private final InvestmentsTrackerTooltipData tooltip;

    public InvestmentsTrackerGetPageResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8476newBuilder();
    }

    public /* synthetic */ InvestmentsTrackerGetPageResponse(List list, String str, String str2, String str3, InvestmentsTrackerOnboardingData investmentsTrackerOnboardingData, InvestmentsTrackerTooltipData investmentsTrackerTooltipData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : investmentsTrackerOnboardingData, (i & 32) != 0 ? null : investmentsTrackerTooltipData, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getNavigation_title() {
        return this.navigation_title;
    }

    public final String getAccount_last_four() {
        return this.account_last_four;
    }

    public final InvestmentsTrackerOnboardingData getOnboarding_data() {
        return this.onboarding_data;
    }

    public final InvestmentsTrackerTooltipData getTooltip() {
        return this.tooltip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerGetPageResponse(List<InvestmentsTrackerComponent> components, String title, String navigation_title, String account_last_four, InvestmentsTrackerOnboardingData investmentsTrackerOnboardingData, InvestmentsTrackerTooltipData investmentsTrackerTooltipData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.navigation_title = navigation_title;
        this.account_last_four = account_last_four;
        this.onboarding_data = investmentsTrackerOnboardingData;
        this.tooltip = investmentsTrackerTooltipData;
        this.components = Internal.immutableCopyOf("components", components);
    }

    public final List<InvestmentsTrackerComponent> getComponents() {
        return this.components;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8476newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerGetPageResponse)) {
            return false;
        }
        InvestmentsTrackerGetPageResponse investmentsTrackerGetPageResponse = (InvestmentsTrackerGetPageResponse) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerGetPageResponse.unknownFields()) && Intrinsics.areEqual(this.components, investmentsTrackerGetPageResponse.components) && Intrinsics.areEqual(this.title, investmentsTrackerGetPageResponse.title) && Intrinsics.areEqual(this.navigation_title, investmentsTrackerGetPageResponse.navigation_title) && Intrinsics.areEqual(this.account_last_four, investmentsTrackerGetPageResponse.account_last_four) && Intrinsics.areEqual(this.onboarding_data, investmentsTrackerGetPageResponse.onboarding_data) && Intrinsics.areEqual(this.tooltip, investmentsTrackerGetPageResponse.tooltip);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.components.hashCode()) * 37) + this.title.hashCode()) * 37) + this.navigation_title.hashCode()) * 37) + this.account_last_four.hashCode()) * 37;
        InvestmentsTrackerOnboardingData investmentsTrackerOnboardingData = this.onboarding_data;
        int iHashCode2 = (iHashCode + (investmentsTrackerOnboardingData != null ? investmentsTrackerOnboardingData.hashCode() : 0)) * 37;
        InvestmentsTrackerTooltipData investmentsTrackerTooltipData = this.tooltip;
        int iHashCode3 = iHashCode2 + (investmentsTrackerTooltipData != null ? investmentsTrackerTooltipData.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.components.isEmpty()) {
            arrayList.add("components=" + this.components);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("navigation_title=" + Internal.sanitize(this.navigation_title));
        arrayList.add("account_last_four=" + Internal.sanitize(this.account_last_four));
        InvestmentsTrackerOnboardingData investmentsTrackerOnboardingData = this.onboarding_data;
        if (investmentsTrackerOnboardingData != null) {
            arrayList.add("onboarding_data=" + investmentsTrackerOnboardingData);
        }
        InvestmentsTrackerTooltipData investmentsTrackerTooltipData = this.tooltip;
        if (investmentsTrackerTooltipData != null) {
            arrayList.add("tooltip=" + investmentsTrackerTooltipData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerGetPageResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerGetPageResponse copy$default(InvestmentsTrackerGetPageResponse investmentsTrackerGetPageResponse, List list, String str, String str2, String str3, InvestmentsTrackerOnboardingData investmentsTrackerOnboardingData, InvestmentsTrackerTooltipData investmentsTrackerTooltipData, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investmentsTrackerGetPageResponse.components;
        }
        if ((i & 2) != 0) {
            str = investmentsTrackerGetPageResponse.title;
        }
        if ((i & 4) != 0) {
            str2 = investmentsTrackerGetPageResponse.navigation_title;
        }
        if ((i & 8) != 0) {
            str3 = investmentsTrackerGetPageResponse.account_last_four;
        }
        if ((i & 16) != 0) {
            investmentsTrackerOnboardingData = investmentsTrackerGetPageResponse.onboarding_data;
        }
        if ((i & 32) != 0) {
            investmentsTrackerTooltipData = investmentsTrackerGetPageResponse.tooltip;
        }
        if ((i & 64) != 0) {
            byteString = investmentsTrackerGetPageResponse.unknownFields();
        }
        InvestmentsTrackerTooltipData investmentsTrackerTooltipData2 = investmentsTrackerTooltipData;
        ByteString byteString2 = byteString;
        InvestmentsTrackerOnboardingData investmentsTrackerOnboardingData2 = investmentsTrackerOnboardingData;
        String str4 = str2;
        return investmentsTrackerGetPageResponse.copy(list, str, str4, str3, investmentsTrackerOnboardingData2, investmentsTrackerTooltipData2, byteString2);
    }

    public final InvestmentsTrackerGetPageResponse copy(List<InvestmentsTrackerComponent> components, String title, String navigation_title, String account_last_four, InvestmentsTrackerOnboardingData onboarding_data, InvestmentsTrackerTooltipData tooltip, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerGetPageResponse(components, title, navigation_title, account_last_four, onboarding_data, tooltip, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerGetPageResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerGetPageResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerGetPageResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerGetPageResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + InvestmentsTrackerComponent.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getComponents());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNavigation_title());
                }
                if (!Intrinsics.areEqual(value.getAccount_last_four(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_last_four());
                }
                return size + InvestmentsTrackerOnboardingData.ADAPTER.encodedSizeWithTag(5, value.getOnboarding_data()) + InvestmentsTrackerTooltipData.ADAPTER.encodedSizeWithTag(6, value.getTooltip());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerGetPageResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerComponent.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getComponents());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNavigation_title());
                }
                if (!Intrinsics.areEqual(value.getAccount_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_last_four());
                }
                InvestmentsTrackerOnboardingData.ADAPTER.encodeWithTag(writer, 5, (int) value.getOnboarding_data());
                InvestmentsTrackerTooltipData.ADAPTER.encodeWithTag(writer, 6, (int) value.getTooltip());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerGetPageResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InvestmentsTrackerTooltipData.ADAPTER.encodeWithTag(writer, 6, (int) value.getTooltip());
                InvestmentsTrackerOnboardingData.ADAPTER.encodeWithTag(writer, 5, (int) value.getOnboarding_data());
                if (!Intrinsics.areEqual(value.getAccount_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_last_four());
                }
                if (!Intrinsics.areEqual(value.getNavigation_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNavigation_title());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                InvestmentsTrackerComponent.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getComponents());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGetPageResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                InvestmentsTrackerOnboardingData investmentsTrackerOnboardingDataDecode = null;
                InvestmentsTrackerTooltipData investmentsTrackerTooltipDataDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                arrayList.add(InvestmentsTrackerComponent.ADAPTER.decode(reader));
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                investmentsTrackerOnboardingDataDecode = InvestmentsTrackerOnboardingData.ADAPTER.decode(reader);
                                break;
                            case 6:
                                investmentsTrackerTooltipDataDecode = InvestmentsTrackerTooltipData.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InvestmentsTrackerGetPageResponse(arrayList, strDecode, strDecode3, strDecode2, investmentsTrackerOnboardingDataDecode, investmentsTrackerTooltipDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGetPageResponse redact(InvestmentsTrackerGetPageResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getComponents(), InvestmentsTrackerComponent.ADAPTER);
                InvestmentsTrackerOnboardingData onboarding_data = value.getOnboarding_data();
                InvestmentsTrackerOnboardingData investmentsTrackerOnboardingDataRedact = onboarding_data != null ? InvestmentsTrackerOnboardingData.ADAPTER.redact(onboarding_data) : null;
                InvestmentsTrackerTooltipData tooltip = value.getTooltip();
                return InvestmentsTrackerGetPageResponse.copy$default(value, listM26823redactElements, null, null, null, investmentsTrackerOnboardingDataRedact, tooltip != null ? InvestmentsTrackerTooltipData.ADAPTER.redact(tooltip) : null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
