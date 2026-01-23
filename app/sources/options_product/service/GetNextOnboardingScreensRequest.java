package options_product.service;

import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.rosetta.i18n.Locality;
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

/* compiled from: GetNextOnboardingScreensRequest.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016Jb\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006)"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "session_id", "screen_requests", "", "Loptions_product/service/OnboardingScreenRequest;", "logging_source", "locality", "Lcom/robinhood/rosetta/i18n/Locality;", "experiments", "Loptions_product/service/OnboardingExperiment;", "entry_point", "Loptions_product/service/OnboardingEntryPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/rosetta/i18n/Locality;Ljava/util/List;Loptions_product/service/OnboardingEntryPoint;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getSession_id", "getLogging_source", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "getEntry_point", "()Loptions_product/service/OnboardingEntryPoint;", "getScreen_requests", "()Ljava/util/List;", "getExperiments", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetNextOnboardingScreensRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetNextOnboardingScreensRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "options_product.service.OnboardingEntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final OnboardingEntryPoint entry_point;

    @WireField(adapter = "options_product.service.OnboardingExperiment#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<OnboardingExperiment> experiments;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String logging_source;

    @WireField(adapter = "options_product.service.OnboardingScreenRequest#ADAPTER", jsonName = "screenRequests", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<OnboardingScreenRequest> screen_requests;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String session_id;

    public GetNextOnboardingScreensRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ GetNextOnboardingScreensRequest(String str, String str2, List list, String str3, Locality locality, List list2, OnboardingEntryPoint onboardingEntryPoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? OnboardingEntryPoint.ONBOARDING_ENTRY_POINT_UNSPECIFIED : onboardingEntryPoint, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29492newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getLogging_source() {
        return this.logging_source;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public final OnboardingEntryPoint getEntry_point() {
        return this.entry_point;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNextOnboardingScreensRequest(String account_number, String session_id, List<OnboardingScreenRequest> screen_requests, String logging_source, Locality locality, List<OnboardingExperiment> experiments, OnboardingEntryPoint entry_point, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(screen_requests, "screen_requests");
        Intrinsics.checkNotNullParameter(logging_source, "logging_source");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.session_id = session_id;
        this.logging_source = logging_source;
        this.locality = locality;
        this.entry_point = entry_point;
        this.screen_requests = Internal.immutableCopyOf("screen_requests", screen_requests);
        this.experiments = Internal.immutableCopyOf("experiments", experiments);
    }

    public final List<OnboardingScreenRequest> getScreen_requests() {
        return this.screen_requests;
    }

    public final List<OnboardingExperiment> getExperiments() {
        return this.experiments;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29492newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNextOnboardingScreensRequest)) {
            return false;
        }
        GetNextOnboardingScreensRequest getNextOnboardingScreensRequest = (GetNextOnboardingScreensRequest) other;
        return Intrinsics.areEqual(unknownFields(), getNextOnboardingScreensRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getNextOnboardingScreensRequest.account_number) && Intrinsics.areEqual(this.session_id, getNextOnboardingScreensRequest.session_id) && Intrinsics.areEqual(this.screen_requests, getNextOnboardingScreensRequest.screen_requests) && Intrinsics.areEqual(this.logging_source, getNextOnboardingScreensRequest.logging_source) && this.locality == getNextOnboardingScreensRequest.locality && Intrinsics.areEqual(this.experiments, getNextOnboardingScreensRequest.experiments) && this.entry_point == getNextOnboardingScreensRequest.entry_point;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.session_id.hashCode()) * 37) + this.screen_requests.hashCode()) * 37) + this.logging_source.hashCode()) * 37) + this.locality.hashCode()) * 37) + this.experiments.hashCode()) * 37) + this.entry_point.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        if (!this.screen_requests.isEmpty()) {
            arrayList.add("screen_requests=" + this.screen_requests);
        }
        arrayList.add("logging_source=" + Internal.sanitize(this.logging_source));
        arrayList.add("locality=" + this.locality);
        if (!this.experiments.isEmpty()) {
            arrayList.add("experiments=" + this.experiments);
        }
        arrayList.add("entry_point=" + this.entry_point);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNextOnboardingScreensRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetNextOnboardingScreensRequest copy$default(GetNextOnboardingScreensRequest getNextOnboardingScreensRequest, String str, String str2, List list, String str3, Locality locality, List list2, OnboardingEntryPoint onboardingEntryPoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getNextOnboardingScreensRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getNextOnboardingScreensRequest.session_id;
        }
        if ((i & 4) != 0) {
            list = getNextOnboardingScreensRequest.screen_requests;
        }
        if ((i & 8) != 0) {
            str3 = getNextOnboardingScreensRequest.logging_source;
        }
        if ((i & 16) != 0) {
            locality = getNextOnboardingScreensRequest.locality;
        }
        if ((i & 32) != 0) {
            list2 = getNextOnboardingScreensRequest.experiments;
        }
        if ((i & 64) != 0) {
            onboardingEntryPoint = getNextOnboardingScreensRequest.entry_point;
        }
        if ((i & 128) != 0) {
            byteString = getNextOnboardingScreensRequest.unknownFields();
        }
        OnboardingEntryPoint onboardingEntryPoint2 = onboardingEntryPoint;
        ByteString byteString2 = byteString;
        Locality locality2 = locality;
        List list3 = list2;
        return getNextOnboardingScreensRequest.copy(str, str2, list, str3, locality2, list3, onboardingEntryPoint2, byteString2);
    }

    public final GetNextOnboardingScreensRequest copy(String account_number, String session_id, List<OnboardingScreenRequest> screen_requests, String logging_source, Locality locality, List<OnboardingExperiment> experiments, OnboardingEntryPoint entry_point, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(screen_requests, "screen_requests");
        Intrinsics.checkNotNullParameter(logging_source, "logging_source");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNextOnboardingScreensRequest(account_number, session_id, screen_requests, logging_source, locality, experiments, entry_point, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNextOnboardingScreensRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNextOnboardingScreensRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.GetNextOnboardingScreensRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNextOnboardingScreensRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                int iEncodedSizeWithTag = size + OnboardingScreenRequest.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getScreen_requests());
                if (!Intrinsics.areEqual(value.getLogging_source(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLogging_source());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    iEncodedSizeWithTag += Locality.ADAPTER.encodedSizeWithTag(5, value.getLocality());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + OnboardingExperiment.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getExperiments());
                return value.getEntry_point() != OnboardingEntryPoint.ONBOARDING_ENTRY_POINT_UNSPECIFIED ? iEncodedSizeWithTag2 + OnboardingEntryPoint.ADAPTER.encodedSizeWithTag(7, value.getEntry_point()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNextOnboardingScreensRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSession_id());
                }
                OnboardingScreenRequest.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getScreen_requests());
                if (!Intrinsics.areEqual(value.getLogging_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_source());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                OnboardingExperiment.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getExperiments());
                if (value.getEntry_point() != OnboardingEntryPoint.ONBOARDING_ENTRY_POINT_UNSPECIFIED) {
                    OnboardingEntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNextOnboardingScreensRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEntry_point() != OnboardingEntryPoint.ONBOARDING_ENTRY_POINT_UNSPECIFIED) {
                    OnboardingEntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                OnboardingExperiment.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getExperiments());
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getLogging_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_source());
                }
                OnboardingScreenRequest.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getScreen_requests());
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSession_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNextOnboardingScreensRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Locality localityDecode = Locality.LOCALITY_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                OnboardingEntryPoint onboardingEntryPoint = OnboardingEntryPoint.ONBOARDING_ENTRY_POINT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                OnboardingEntryPoint onboardingEntryPointDecode = onboardingEntryPoint;
                while (true) {
                    Locality locality = localityDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    arrayList.add(OnboardingScreenRequest.ADAPTER.decode(reader));
                                    break;
                                case 4:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        localityDecode = Locality.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    arrayList2.add(OnboardingExperiment.ADAPTER.decode(reader));
                                    break;
                                case 7:
                                    try {
                                        onboardingEntryPointDecode = OnboardingEntryPoint.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new GetNextOnboardingScreensRequest(strDecode, strDecode2, arrayList, strDecode3, locality, arrayList2, onboardingEntryPointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNextOnboardingScreensRequest redact(GetNextOnboardingScreensRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetNextOnboardingScreensRequest.copy$default(value, null, null, Internal.m26823redactElements(value.getScreen_requests(), OnboardingScreenRequest.ADAPTER), null, null, Internal.m26823redactElements(value.getExperiments(), OnboardingExperiment.ADAPTER), null, ByteString.EMPTY, 91, null);
            }
        };
    }
}
