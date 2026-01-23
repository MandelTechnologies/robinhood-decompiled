package com.robinhood.ceres.p284v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FuturesAccountOnboardingInfo.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"com/robinhood/ceres/v1/FuturesAccountOnboardingInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfo;", "investor_profile_infoAdapter", "", "", "getInvestor_profile_infoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "investor_profile_infoAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.ceres.v1.FuturesAccountOnboardingInfo$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes15.dex */
public final class FuturesAccountOnboardingInfo2 extends ProtoAdapter<FuturesAccountOnboardingInfo> {

    /* renamed from: investor_profile_infoAdapter$delegate, reason: from kotlin metadata */
    private final Lazy investor_profile_infoAdapter;

    FuturesAccountOnboardingInfo2(FieldEncoding fieldEncoding, KClass<FuturesAccountOnboardingInfo> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/ceres.entity.FuturesAccountOnboardingInfo", syntax, (Object) null, "ceres/ceres/proto/v1/entity.proto");
        this.investor_profile_infoAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountOnboardingInfo$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAccountOnboardingInfo2.investor_profile_infoAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, String>> getInvestor_profile_infoAdapter() {
        return (ProtoAdapter) this.investor_profile_infoAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter investor_profile_infoAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(FuturesAccountOnboardingInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getFirst_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFirst_name());
        }
        if (!Intrinsics.areEqual(value.getLast_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLast_name());
        }
        if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDate_of_birth());
        }
        if (!Intrinsics.areEqual(value.getEmail(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getEmail());
        }
        if (!Intrinsics.areEqual(value.getPhone_number(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPhone_number());
        }
        if (!Intrinsics.areEqual(value.getCitizenship(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCitizenship());
        }
        if (!Intrinsics.areEqual(value.getMarital_status(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMarital_status());
        }
        if (!Intrinsics.areEqual(value.getSsn(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getSsn());
        }
        if (!Intrinsics.areEqual(value.getEmployment_status(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getEmployment_status());
        }
        if (!Intrinsics.areEqual(value.getEmployer(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getEmployer());
        }
        if (!Intrinsics.areEqual(value.getOccupation(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getOccupation());
        }
        if (!Intrinsics.areEqual(value.getIndustry(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getIndustry());
        }
        if (!Intrinsics.areEqual(value.getAddress(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getAddress());
        }
        if (!Intrinsics.areEqual(value.getLine1(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getLine1());
        }
        if (!Intrinsics.areEqual(value.getLine2(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getLine2());
        }
        if (!Intrinsics.areEqual(value.getLocality(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getLocality());
        }
        if (!Intrinsics.areEqual(value.getRegion(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getRegion());
        }
        if (!Intrinsics.areEqual(value.getPostal_code(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getPostal_code());
        }
        if (!Intrinsics.areEqual(value.getCountry(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getCountry());
        }
        int iEncodedSizeWithTag = size + getInvestor_profile_infoAdapter().encodedSizeWithTag(20, value.getInvestor_profile_info());
        if (!Intrinsics.areEqual(value.getApproved_at(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getApproved_at());
        }
        return !Intrinsics.areEqual(value.getApproved_by(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(22, value.getApproved_by()) : iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, FuturesAccountOnboardingInfo value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getFirst_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFirst_name());
        }
        if (!Intrinsics.areEqual(value.getLast_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLast_name());
        }
        if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDate_of_birth());
        }
        if (!Intrinsics.areEqual(value.getEmail(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEmail());
        }
        if (!Intrinsics.areEqual(value.getPhone_number(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPhone_number());
        }
        if (!Intrinsics.areEqual(value.getCitizenship(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCitizenship());
        }
        if (!Intrinsics.areEqual(value.getMarital_status(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMarital_status());
        }
        if (!Intrinsics.areEqual(value.getSsn(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSsn());
        }
        if (!Intrinsics.areEqual(value.getEmployment_status(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEmployment_status());
        }
        if (!Intrinsics.areEqual(value.getEmployer(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getEmployer());
        }
        if (!Intrinsics.areEqual(value.getOccupation(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getOccupation());
        }
        if (!Intrinsics.areEqual(value.getIndustry(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getIndustry());
        }
        if (!Intrinsics.areEqual(value.getAddress(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAddress());
        }
        if (!Intrinsics.areEqual(value.getLine1(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getLine1());
        }
        if (!Intrinsics.areEqual(value.getLine2(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getLine2());
        }
        if (!Intrinsics.areEqual(value.getLocality(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getLocality());
        }
        if (!Intrinsics.areEqual(value.getRegion(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getRegion());
        }
        if (!Intrinsics.areEqual(value.getPostal_code(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getPostal_code());
        }
        if (!Intrinsics.areEqual(value.getCountry(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getCountry());
        }
        getInvestor_profile_infoAdapter().encodeWithTag(writer, 20, (int) value.getInvestor_profile_info());
        if (!Intrinsics.areEqual(value.getApproved_at(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getApproved_at());
        }
        if (!Intrinsics.areEqual(value.getApproved_by(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getApproved_by());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, FuturesAccountOnboardingInfo value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        if (!Intrinsics.areEqual(value.getApproved_by(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getApproved_by());
        }
        if (!Intrinsics.areEqual(value.getApproved_at(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getApproved_at());
        }
        getInvestor_profile_infoAdapter().encodeWithTag(writer, 20, (int) value.getInvestor_profile_info());
        if (!Intrinsics.areEqual(value.getCountry(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getCountry());
        }
        if (!Intrinsics.areEqual(value.getPostal_code(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getPostal_code());
        }
        if (!Intrinsics.areEqual(value.getRegion(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getRegion());
        }
        if (!Intrinsics.areEqual(value.getLocality(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getLocality());
        }
        if (!Intrinsics.areEqual(value.getLine2(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getLine2());
        }
        if (!Intrinsics.areEqual(value.getLine1(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getLine1());
        }
        if (!Intrinsics.areEqual(value.getAddress(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAddress());
        }
        if (!Intrinsics.areEqual(value.getIndustry(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getIndustry());
        }
        if (!Intrinsics.areEqual(value.getOccupation(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getOccupation());
        }
        if (!Intrinsics.areEqual(value.getEmployer(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getEmployer());
        }
        if (!Intrinsics.areEqual(value.getEmployment_status(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEmployment_status());
        }
        if (!Intrinsics.areEqual(value.getSsn(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSsn());
        }
        if (!Intrinsics.areEqual(value.getMarital_status(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMarital_status());
        }
        if (!Intrinsics.areEqual(value.getCitizenship(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCitizenship());
        }
        if (!Intrinsics.areEqual(value.getPhone_number(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPhone_number());
        }
        if (!Intrinsics.areEqual(value.getEmail(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEmail());
        }
        if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDate_of_birth());
        }
        if (!Intrinsics.areEqual(value.getLast_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLast_name());
        }
        if (Intrinsics.areEqual(value.getFirst_name(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFirst_name());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public FuturesAccountOnboardingInfo decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        String strDecode4 = strDecode3;
        String strDecode5 = strDecode4;
        String strDecode6 = strDecode5;
        String strDecode7 = strDecode6;
        String strDecode8 = strDecode7;
        String strDecode9 = strDecode8;
        String strDecode10 = strDecode9;
        String strDecode11 = strDecode10;
        String strDecode12 = strDecode11;
        String strDecode13 = strDecode12;
        String strDecode14 = strDecode13;
        String strDecode15 = strDecode14;
        String strDecode16 = strDecode15;
        String strDecode17 = strDecode16;
        String strDecode18 = strDecode17;
        String strDecode19 = strDecode18;
        String strDecode20 = strDecode19;
        String strDecode21 = strDecode20;
        while (true) {
            int iNextTag = reader.nextTag();
            String str = strDecode;
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 1:
                        strDecode21 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 3:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 6:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 8:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 9:
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        strDecode9 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 11:
                        strDecode10 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 12:
                        strDecode11 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 13:
                        strDecode12 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 14:
                        strDecode13 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 15:
                        strDecode14 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 16:
                        strDecode15 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 17:
                        strDecode16 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 18:
                        strDecode17 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 19:
                        strDecode18 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 20:
                        linkedHashMap.putAll(getInvestor_profile_infoAdapter().decode(reader));
                        break;
                    case 21:
                        strDecode19 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 22:
                        strDecode20 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        break;
                }
                strDecode = str;
            } else {
                return new FuturesAccountOnboardingInfo(strDecode21, str, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, strDecode15, strDecode16, strDecode17, strDecode18, linkedHashMap, strDecode19, strDecode20, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public FuturesAccountOnboardingInfo redact(FuturesAccountOnboardingInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.copy((4194303 & 1) != 0 ? value.first_name : null, (4194303 & 2) != 0 ? value.last_name : null, (4194303 & 4) != 0 ? value.date_of_birth : null, (4194303 & 8) != 0 ? value.email : null, (4194303 & 16) != 0 ? value.phone_number : null, (4194303 & 32) != 0 ? value.citizenship : null, (4194303 & 64) != 0 ? value.marital_status : null, (4194303 & 128) != 0 ? value.ssn : null, (4194303 & 256) != 0 ? value.employment_status : null, (4194303 & 512) != 0 ? value.employer : null, (4194303 & 1024) != 0 ? value.occupation : null, (4194303 & 2048) != 0 ? value.industry : null, (4194303 & 4096) != 0 ? value.address : null, (4194303 & 8192) != 0 ? value.line1 : null, (4194303 & 16384) != 0 ? value.line2 : null, (4194303 & 32768) != 0 ? value.locality : null, (4194303 & 65536) != 0 ? value.region : null, (4194303 & 131072) != 0 ? value.postal_code : null, (4194303 & 262144) != 0 ? value.country : null, (4194303 & 524288) != 0 ? value.investor_profile_info : null, (4194303 & 1048576) != 0 ? value.approved_at : null, (4194303 & 2097152) != 0 ? value.approved_by : null, (4194303 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }
}
