package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.CatpayClientDto;
import com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto;
import com.robinhood.rosetta.eventlogging.CatpayOrderErrorDto;
import com.robinhood.rosetta.eventlogging.CatpayOrderEventData;
import com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.CatpayOrderMetaDto;
import com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CatpayOrderEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000545678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0006\u0010\u0016JV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Surrogate;)V", "session_id", "", "step", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "payload", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "funding_source", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "error", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderErrorDto;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "client", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderErrorDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;)V", "getSession_id", "()Ljava/lang/String;", "getStep", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "getFunding_source", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "getError", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderErrorDto;", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "getClient", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CatpayOrderStepDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CatpayOrderEventDataDto implements Dto3<CatpayOrderEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CatpayOrderEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CatpayOrderEventDataDto, CatpayOrderEventData>> binaryBase64Serializer$delegate;
    private static final CatpayOrderEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CatpayOrderEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CatpayOrderEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final CatpayOrderStepDto getStep() {
        return this.surrogate.getStep();
    }

    public final CatpayOrderPayloadDto getPayload() {
        return this.surrogate.getPayload();
    }

    public final CatpayFundingSourceDto getFunding_source() {
        return this.surrogate.getFunding_source();
    }

    public final CatpayOrderErrorDto getError() {
        return this.surrogate.getError();
    }

    public final CatpayOrderMetaDto getMeta() {
        return this.surrogate.getMeta();
    }

    public final CatpayClientDto getClient() {
        return this.surrogate.getClient();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CatpayOrderEventDataDto(java.lang.String r2, com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto.CatpayOrderStepDto r3, com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto r4, com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto r5, com.robinhood.rosetta.eventlogging.CatpayOrderErrorDto r6, com.robinhood.rosetta.eventlogging.CatpayOrderMetaDto r7, com.robinhood.rosetta.eventlogging.CatpayClientDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto L10
            com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$CatpayOrderStepDto$Companion r3 = com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto.CatpayOrderStepDto.INSTANCE
            com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$CatpayOrderStepDto r3 = r3.getZeroValue()
        L10:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L16
            r4 = r0
        L16:
            r10 = r9 & 8
            if (r10 == 0) goto L1b
            r5 = r0
        L1b:
            r10 = r9 & 16
            if (r10 == 0) goto L20
            r6 = r0
        L20:
            r10 = r9 & 32
            if (r10 == 0) goto L25
            r7 = r0
        L25:
            r9 = r9 & 64
            if (r9 == 0) goto L32
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3a
        L32:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto.<init>(java.lang.String, com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$CatpayOrderStepDto, com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto, com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto, com.robinhood.rosetta.eventlogging.CatpayOrderErrorDto, com.robinhood.rosetta.eventlogging.CatpayOrderMetaDto, com.robinhood.rosetta.eventlogging.CatpayClientDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatpayOrderEventDataDto(String session_id, CatpayOrderStepDto step, CatpayOrderPayloadDto catpayOrderPayloadDto, CatpayFundingSourceDto catpayFundingSourceDto, CatpayOrderErrorDto catpayOrderErrorDto, CatpayOrderMetaDto catpayOrderMetaDto, CatpayClientDto catpayClientDto) {
        this(new Surrogate(session_id, step, catpayOrderPayloadDto, catpayFundingSourceDto, catpayOrderErrorDto, catpayOrderMetaDto, catpayClientDto));
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(step, "step");
    }

    public static /* synthetic */ CatpayOrderEventDataDto copy$default(CatpayOrderEventDataDto catpayOrderEventDataDto, String str, CatpayOrderStepDto catpayOrderStepDto, CatpayOrderPayloadDto catpayOrderPayloadDto, CatpayFundingSourceDto catpayFundingSourceDto, CatpayOrderErrorDto catpayOrderErrorDto, CatpayOrderMetaDto catpayOrderMetaDto, CatpayClientDto catpayClientDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catpayOrderEventDataDto.surrogate.getSession_id();
        }
        if ((i & 2) != 0) {
            catpayOrderStepDto = catpayOrderEventDataDto.surrogate.getStep();
        }
        if ((i & 4) != 0) {
            catpayOrderPayloadDto = catpayOrderEventDataDto.surrogate.getPayload();
        }
        if ((i & 8) != 0) {
            catpayFundingSourceDto = catpayOrderEventDataDto.surrogate.getFunding_source();
        }
        if ((i & 16) != 0) {
            catpayOrderErrorDto = catpayOrderEventDataDto.surrogate.getError();
        }
        if ((i & 32) != 0) {
            catpayOrderMetaDto = catpayOrderEventDataDto.surrogate.getMeta();
        }
        if ((i & 64) != 0) {
            catpayClientDto = catpayOrderEventDataDto.surrogate.getClient();
        }
        CatpayOrderMetaDto catpayOrderMetaDto2 = catpayOrderMetaDto;
        CatpayClientDto catpayClientDto2 = catpayClientDto;
        CatpayOrderErrorDto catpayOrderErrorDto2 = catpayOrderErrorDto;
        CatpayOrderPayloadDto catpayOrderPayloadDto2 = catpayOrderPayloadDto;
        return catpayOrderEventDataDto.copy(str, catpayOrderStepDto, catpayOrderPayloadDto2, catpayFundingSourceDto, catpayOrderErrorDto2, catpayOrderMetaDto2, catpayClientDto2);
    }

    public final CatpayOrderEventDataDto copy(String session_id, CatpayOrderStepDto step, CatpayOrderPayloadDto payload, CatpayFundingSourceDto funding_source, CatpayOrderErrorDto error, CatpayOrderMetaDto meta, CatpayClientDto client) {
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(step, "step");
        return new CatpayOrderEventDataDto(new Surrogate(session_id, step, payload, funding_source, error, meta, client));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CatpayOrderEventData toProto() {
        String session_id = this.surrogate.getSession_id();
        CatpayOrderEventData.CatpayOrderStep catpayOrderStep = (CatpayOrderEventData.CatpayOrderStep) this.surrogate.getStep().toProto();
        CatpayOrderPayloadDto payload = this.surrogate.getPayload();
        CatpayOrderPayload proto = payload != null ? payload.toProto() : null;
        CatpayFundingSourceDto funding_source = this.surrogate.getFunding_source();
        CatpayFundingSource proto2 = funding_source != null ? funding_source.toProto() : null;
        CatpayOrderErrorDto error = this.surrogate.getError();
        CatpayOrderError proto3 = error != null ? error.toProto() : null;
        CatpayOrderMetaDto meta = this.surrogate.getMeta();
        CatpayOrderMeta proto4 = meta != null ? meta.toProto() : null;
        CatpayClientDto client = this.surrogate.getClient();
        return new CatpayOrderEventData(session_id, catpayOrderStep, proto, proto2, proto3, proto4, client != null ? client.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[CatpayOrderEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CatpayOrderEventDataDto) && Intrinsics.areEqual(((CatpayOrderEventDataDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CatpayOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002BCBW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011Ba\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003JY\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0013HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J%\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010#R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010&R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,¨\u0006D"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Surrogate;", "", "session_id", "", "step", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "payload", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "funding_source", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "error", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderErrorDto;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "client", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderErrorDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderErrorDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSession_id$annotations", "()V", "getSession_id", "()Ljava/lang/String;", "getStep$annotations", "getStep", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "getPayload$annotations", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "getFunding_source$annotations", "getFunding_source", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "getError$annotations", "getError", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderErrorDto;", "getMeta$annotations", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "getClient$annotations", "getClient", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CatpayClientDto client;
        private final CatpayOrderErrorDto error;
        private final CatpayFundingSourceDto funding_source;
        private final CatpayOrderMetaDto meta;
        private final CatpayOrderPayloadDto payload;
        private final String session_id;
        private final CatpayOrderStepDto step;

        public Surrogate() {
            this((String) null, (CatpayOrderStepDto) null, (CatpayOrderPayloadDto) null, (CatpayFundingSourceDto) null, (CatpayOrderErrorDto) null, (CatpayOrderMetaDto) null, (CatpayClientDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, CatpayOrderStepDto catpayOrderStepDto, CatpayOrderPayloadDto catpayOrderPayloadDto, CatpayFundingSourceDto catpayFundingSourceDto, CatpayOrderErrorDto catpayOrderErrorDto, CatpayOrderMetaDto catpayOrderMetaDto, CatpayClientDto catpayClientDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.session_id;
            }
            if ((i & 2) != 0) {
                catpayOrderStepDto = surrogate.step;
            }
            if ((i & 4) != 0) {
                catpayOrderPayloadDto = surrogate.payload;
            }
            if ((i & 8) != 0) {
                catpayFundingSourceDto = surrogate.funding_source;
            }
            if ((i & 16) != 0) {
                catpayOrderErrorDto = surrogate.error;
            }
            if ((i & 32) != 0) {
                catpayOrderMetaDto = surrogate.meta;
            }
            if ((i & 64) != 0) {
                catpayClientDto = surrogate.client;
            }
            CatpayOrderMetaDto catpayOrderMetaDto2 = catpayOrderMetaDto;
            CatpayClientDto catpayClientDto2 = catpayClientDto;
            CatpayOrderErrorDto catpayOrderErrorDto2 = catpayOrderErrorDto;
            CatpayOrderPayloadDto catpayOrderPayloadDto2 = catpayOrderPayloadDto;
            return surrogate.copy(str, catpayOrderStepDto, catpayOrderPayloadDto2, catpayFundingSourceDto, catpayOrderErrorDto2, catpayOrderMetaDto2, catpayClientDto2);
        }

        @SerialName("client")
        @JsonAnnotations2(names = {"client"})
        public static /* synthetic */ void getClient$annotations() {
        }

        @SerialName("error")
        @JsonAnnotations2(names = {"error"})
        public static /* synthetic */ void getError$annotations() {
        }

        @SerialName("fundingSource")
        @JsonAnnotations2(names = {"funding_source"})
        public static /* synthetic */ void getFunding_source$annotations() {
        }

        @SerialName(Constants.REFERRER_API_META)
        @JsonAnnotations2(names = {Constants.REFERRER_API_META})
        public static /* synthetic */ void getMeta$annotations() {
        }

        @SerialName("payload")
        @JsonAnnotations2(names = {"payload"})
        public static /* synthetic */ void getPayload$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("step")
        @JsonAnnotations2(names = {"step"})
        public static /* synthetic */ void getStep$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component2, reason: from getter */
        public final CatpayOrderStepDto getStep() {
            return this.step;
        }

        /* renamed from: component3, reason: from getter */
        public final CatpayOrderPayloadDto getPayload() {
            return this.payload;
        }

        /* renamed from: component4, reason: from getter */
        public final CatpayFundingSourceDto getFunding_source() {
            return this.funding_source;
        }

        /* renamed from: component5, reason: from getter */
        public final CatpayOrderErrorDto getError() {
            return this.error;
        }

        /* renamed from: component6, reason: from getter */
        public final CatpayOrderMetaDto getMeta() {
            return this.meta;
        }

        /* renamed from: component7, reason: from getter */
        public final CatpayClientDto getClient() {
            return this.client;
        }

        public final Surrogate copy(String session_id, CatpayOrderStepDto step, CatpayOrderPayloadDto payload, CatpayFundingSourceDto funding_source, CatpayOrderErrorDto error, CatpayOrderMetaDto meta, CatpayClientDto client) {
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(step, "step");
            return new Surrogate(session_id, step, payload, funding_source, error, meta, client);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.session_id, surrogate.session_id) && this.step == surrogate.step && Intrinsics.areEqual(this.payload, surrogate.payload) && Intrinsics.areEqual(this.funding_source, surrogate.funding_source) && Intrinsics.areEqual(this.error, surrogate.error) && Intrinsics.areEqual(this.meta, surrogate.meta) && Intrinsics.areEqual(this.client, surrogate.client);
        }

        public int hashCode() {
            int iHashCode = ((this.session_id.hashCode() * 31) + this.step.hashCode()) * 31;
            CatpayOrderPayloadDto catpayOrderPayloadDto = this.payload;
            int iHashCode2 = (iHashCode + (catpayOrderPayloadDto == null ? 0 : catpayOrderPayloadDto.hashCode())) * 31;
            CatpayFundingSourceDto catpayFundingSourceDto = this.funding_source;
            int iHashCode3 = (iHashCode2 + (catpayFundingSourceDto == null ? 0 : catpayFundingSourceDto.hashCode())) * 31;
            CatpayOrderErrorDto catpayOrderErrorDto = this.error;
            int iHashCode4 = (iHashCode3 + (catpayOrderErrorDto == null ? 0 : catpayOrderErrorDto.hashCode())) * 31;
            CatpayOrderMetaDto catpayOrderMetaDto = this.meta;
            int iHashCode5 = (iHashCode4 + (catpayOrderMetaDto == null ? 0 : catpayOrderMetaDto.hashCode())) * 31;
            CatpayClientDto catpayClientDto = this.client;
            return iHashCode5 + (catpayClientDto != null ? catpayClientDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(session_id=" + this.session_id + ", step=" + this.step + ", payload=" + this.payload + ", funding_source=" + this.funding_source + ", error=" + this.error + ", meta=" + this.meta + ", client=" + this.client + ")";
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CatpayOrderEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CatpayOrderStepDto catpayOrderStepDto, CatpayOrderPayloadDto catpayOrderPayloadDto, CatpayFundingSourceDto catpayFundingSourceDto, CatpayOrderErrorDto catpayOrderErrorDto, CatpayOrderMetaDto catpayOrderMetaDto, CatpayClientDto catpayClientDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.session_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.step = CatpayOrderStepDto.INSTANCE.getZeroValue();
            } else {
                this.step = catpayOrderStepDto;
            }
            if ((i & 4) == 0) {
                this.payload = null;
            } else {
                this.payload = catpayOrderPayloadDto;
            }
            if ((i & 8) == 0) {
                this.funding_source = null;
            } else {
                this.funding_source = catpayFundingSourceDto;
            }
            if ((i & 16) == 0) {
                this.error = null;
            } else {
                this.error = catpayOrderErrorDto;
            }
            if ((i & 32) == 0) {
                this.meta = null;
            } else {
                this.meta = catpayOrderMetaDto;
            }
            if ((i & 64) == 0) {
                this.client = null;
            } else {
                this.client = catpayClientDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.session_id);
            }
            if (self.step != CatpayOrderStepDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CatpayOrderStepDto.Serializer.INSTANCE, self.step);
            }
            CatpayOrderPayloadDto catpayOrderPayloadDto = self.payload;
            if (catpayOrderPayloadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CatpayOrderPayloadDto.Serializer.INSTANCE, catpayOrderPayloadDto);
            }
            CatpayFundingSourceDto catpayFundingSourceDto = self.funding_source;
            if (catpayFundingSourceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CatpayFundingSourceDto.Serializer.INSTANCE, catpayFundingSourceDto);
            }
            CatpayOrderErrorDto catpayOrderErrorDto = self.error;
            if (catpayOrderErrorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CatpayOrderErrorDto.Serializer.INSTANCE, catpayOrderErrorDto);
            }
            CatpayOrderMetaDto catpayOrderMetaDto = self.meta;
            if (catpayOrderMetaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CatpayOrderMetaDto.Serializer.INSTANCE, catpayOrderMetaDto);
            }
            CatpayClientDto catpayClientDto = self.client;
            if (catpayClientDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CatpayClientDto.Serializer.INSTANCE, catpayClientDto);
            }
        }

        public Surrogate(String session_id, CatpayOrderStepDto step, CatpayOrderPayloadDto catpayOrderPayloadDto, CatpayFundingSourceDto catpayFundingSourceDto, CatpayOrderErrorDto catpayOrderErrorDto, CatpayOrderMetaDto catpayOrderMetaDto, CatpayClientDto catpayClientDto) {
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(step, "step");
            this.session_id = session_id;
            this.step = step;
            this.payload = catpayOrderPayloadDto;
            this.funding_source = catpayFundingSourceDto;
            this.error = catpayOrderErrorDto;
            this.meta = catpayOrderMetaDto;
            this.client = catpayClientDto;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto.CatpayOrderStepDto r3, com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto r4, com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto r5, com.robinhood.rosetta.eventlogging.CatpayOrderErrorDto r6, com.robinhood.rosetta.eventlogging.CatpayOrderMetaDto r7, com.robinhood.rosetta.eventlogging.CatpayClientDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto L10
                com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$CatpayOrderStepDto$Companion r3 = com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto.CatpayOrderStepDto.INSTANCE
                com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$CatpayOrderStepDto r3 = r3.getZeroValue()
            L10:
                r10 = r9 & 4
                r0 = 0
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                if (r10 == 0) goto L1b
                r5 = r0
            L1b:
                r10 = r9 & 16
                if (r10 == 0) goto L20
                r6 = r0
            L20:
                r10 = r9 & 32
                if (r10 == 0) goto L25
                r7 = r0
            L25:
                r9 = r9 & 64
                if (r9 == 0) goto L32
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3a
            L32:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto.Surrogate.<init>(java.lang.String, com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$CatpayOrderStepDto, com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto, com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto, com.robinhood.rosetta.eventlogging.CatpayOrderErrorDto, com.robinhood.rosetta.eventlogging.CatpayOrderMetaDto, com.robinhood.rosetta.eventlogging.CatpayClientDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final CatpayOrderStepDto getStep() {
            return this.step;
        }

        public final CatpayOrderPayloadDto getPayload() {
            return this.payload;
        }

        public final CatpayFundingSourceDto getFunding_source() {
            return this.funding_source;
        }

        public final CatpayOrderErrorDto getError() {
            return this.error;
        }

        public final CatpayOrderMetaDto getMeta() {
            return this.meta;
        }

        public final CatpayClientDto getClient() {
            return this.client;
        }
    }

    /* compiled from: CatpayOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CatpayOrderEventDataDto, CatpayOrderEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CatpayOrderEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) CatpayOrderEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CatpayOrderEventData> getProtoAdapter() {
            return CatpayOrderEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderEventDataDto getZeroValue() {
            return CatpayOrderEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderEventDataDto fromProto(CatpayOrderEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String session_id = proto.getSession_id();
            CatpayOrderStepDto catpayOrderStepDtoFromProto = CatpayOrderStepDto.INSTANCE.fromProto(proto.getStep());
            CatpayOrderPayload payload = proto.getPayload();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CatpayOrderPayloadDto catpayOrderPayloadDtoFromProto = payload != null ? CatpayOrderPayloadDto.INSTANCE.fromProto(payload) : null;
            CatpayFundingSource funding_source = proto.getFunding_source();
            CatpayFundingSourceDto catpayFundingSourceDtoFromProto = funding_source != null ? CatpayFundingSourceDto.INSTANCE.fromProto(funding_source) : null;
            CatpayOrderError error = proto.getError();
            CatpayOrderErrorDto catpayOrderErrorDtoFromProto = error != null ? CatpayOrderErrorDto.INSTANCE.fromProto(error) : null;
            CatpayOrderMeta meta = proto.getMeta();
            CatpayOrderMetaDto catpayOrderMetaDtoFromProto = meta != null ? CatpayOrderMetaDto.INSTANCE.fromProto(meta) : null;
            CatpayClient client = proto.getClient();
            return new CatpayOrderEventDataDto(new Surrogate(session_id, catpayOrderStepDtoFromProto, catpayOrderPayloadDtoFromProto, catpayFundingSourceDtoFromProto, catpayOrderErrorDtoFromProto, catpayOrderMetaDtoFromProto, client != null ? CatpayClientDto.INSTANCE.fromProto(client) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatpayOrderEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CatpayOrderEventDataDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002()B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FLOW_STEP_UNSPECIFIED", "SELECT_ASSET_SCREEN_READY", "SELECT_ASSET", "SELECT_FUNDING_SOURCE", "AMOUNT_INPUT_SCREEN_READY", "AMOUNT_INPUT_ERROR", "SELECT_NETWORK", "REVIEW", "REVIEW_ERROR", "REVIEW_SUCCESS", "REVIEW_CONTINUE", "SUBMIT", "SUBMIT_ERROR", "SUBMIT_SUCCESS", "MFA_START", "MFA_ERROR", "MFA_SUCCESS", "ENROLLMENT_START", "ENROLLMENT_ERROR", "ENROLLMENT_SUCCESS", "CONFIRM_WALLET_ADDRESS", "LOGIN", "UNAVAILABLE", "FIAT_3DS_START", "FIAT_3DS_SUCCESS", "FIAT_3DS_FAILURE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CatpayOrderStepDto implements Dto2<CatpayOrderEventData.CatpayOrderStep>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayOrderStepDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CatpayOrderStepDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CatpayOrderStepDto, CatpayOrderEventData.CatpayOrderStep>> binaryBase64Serializer$delegate;
        public static final CatpayOrderStepDto FLOW_STEP_UNSPECIFIED = new FLOW_STEP_UNSPECIFIED("FLOW_STEP_UNSPECIFIED", 0);
        public static final CatpayOrderStepDto SELECT_ASSET_SCREEN_READY = new SELECT_ASSET_SCREEN_READY("SELECT_ASSET_SCREEN_READY", 1);
        public static final CatpayOrderStepDto SELECT_ASSET = new SELECT_ASSET("SELECT_ASSET", 2);
        public static final CatpayOrderStepDto SELECT_FUNDING_SOURCE = new SELECT_FUNDING_SOURCE("SELECT_FUNDING_SOURCE", 3);
        public static final CatpayOrderStepDto AMOUNT_INPUT_SCREEN_READY = new AMOUNT_INPUT_SCREEN_READY("AMOUNT_INPUT_SCREEN_READY", 4);
        public static final CatpayOrderStepDto AMOUNT_INPUT_ERROR = new AMOUNT_INPUT_ERROR("AMOUNT_INPUT_ERROR", 5);
        public static final CatpayOrderStepDto SELECT_NETWORK = new SELECT_NETWORK("SELECT_NETWORK", 6);
        public static final CatpayOrderStepDto REVIEW = new REVIEW("REVIEW", 7);
        public static final CatpayOrderStepDto REVIEW_ERROR = new REVIEW_ERROR("REVIEW_ERROR", 8);
        public static final CatpayOrderStepDto REVIEW_SUCCESS = new REVIEW_SUCCESS("REVIEW_SUCCESS", 9);
        public static final CatpayOrderStepDto REVIEW_CONTINUE = new REVIEW_CONTINUE("REVIEW_CONTINUE", 10);
        public static final CatpayOrderStepDto SUBMIT = new SUBMIT("SUBMIT", 11);
        public static final CatpayOrderStepDto SUBMIT_ERROR = new SUBMIT_ERROR("SUBMIT_ERROR", 12);
        public static final CatpayOrderStepDto SUBMIT_SUCCESS = new SUBMIT_SUCCESS("SUBMIT_SUCCESS", 13);
        public static final CatpayOrderStepDto MFA_START = new MFA_START("MFA_START", 14);
        public static final CatpayOrderStepDto MFA_ERROR = new MFA_ERROR("MFA_ERROR", 15);
        public static final CatpayOrderStepDto MFA_SUCCESS = new MFA_SUCCESS("MFA_SUCCESS", 16);
        public static final CatpayOrderStepDto ENROLLMENT_START = new ENROLLMENT_START("ENROLLMENT_START", 17);
        public static final CatpayOrderStepDto ENROLLMENT_ERROR = new ENROLLMENT_ERROR("ENROLLMENT_ERROR", 18);
        public static final CatpayOrderStepDto ENROLLMENT_SUCCESS = new ENROLLMENT_SUCCESS("ENROLLMENT_SUCCESS", 19);
        public static final CatpayOrderStepDto CONFIRM_WALLET_ADDRESS = new CONFIRM_WALLET_ADDRESS("CONFIRM_WALLET_ADDRESS", 20);
        public static final CatpayOrderStepDto LOGIN = new LOGIN("LOGIN", 21);
        public static final CatpayOrderStepDto UNAVAILABLE = new UNAVAILABLE("UNAVAILABLE", 22);
        public static final CatpayOrderStepDto FIAT_3DS_START = new FIAT_3DS_START("FIAT_3DS_START", 23);
        public static final CatpayOrderStepDto FIAT_3DS_SUCCESS = new FIAT_3DS_SUCCESS("FIAT_3DS_SUCCESS", 24);
        public static final CatpayOrderStepDto FIAT_3DS_FAILURE = new FIAT_3DS_FAILURE("FIAT_3DS_FAILURE", 25);

        private static final /* synthetic */ CatpayOrderStepDto[] $values() {
            return new CatpayOrderStepDto[]{FLOW_STEP_UNSPECIFIED, SELECT_ASSET_SCREEN_READY, SELECT_ASSET, SELECT_FUNDING_SOURCE, AMOUNT_INPUT_SCREEN_READY, AMOUNT_INPUT_ERROR, SELECT_NETWORK, REVIEW, REVIEW_ERROR, REVIEW_SUCCESS, REVIEW_CONTINUE, SUBMIT, SUBMIT_ERROR, SUBMIT_SUCCESS, MFA_START, MFA_ERROR, MFA_SUCCESS, ENROLLMENT_START, ENROLLMENT_ERROR, ENROLLMENT_SUCCESS, CONFIRM_WALLET_ADDRESS, LOGIN, UNAVAILABLE, FIAT_3DS_START, FIAT_3DS_SUCCESS, FIAT_3DS_FAILURE};
        }

        public /* synthetic */ CatpayOrderStepDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CatpayOrderStepDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CatpayOrderStepDto(String str, int i) {
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.FLOW_STEP_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FLOW_STEP_UNSPECIFIED extends CatpayOrderStepDto {
            FLOW_STEP_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.FLOW_STEP_UNSPECIFIED;
            }
        }

        static {
            CatpayOrderStepDto[] catpayOrderStepDtoArr$values = $values();
            $VALUES = catpayOrderStepDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayOrderStepDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto$CatpayOrderStepDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayOrderEventDataDto.CatpayOrderStepDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.SELECT_ASSET_SCREEN_READY", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELECT_ASSET_SCREEN_READY extends CatpayOrderStepDto {
            SELECT_ASSET_SCREEN_READY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.SELECT_ASSET_SCREEN_READY;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.SELECT_ASSET", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELECT_ASSET extends CatpayOrderStepDto {
            SELECT_ASSET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.SELECT_ASSET;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.SELECT_FUNDING_SOURCE", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELECT_FUNDING_SOURCE extends CatpayOrderStepDto {
            SELECT_FUNDING_SOURCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.SELECT_FUNDING_SOURCE;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.AMOUNT_INPUT_SCREEN_READY", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AMOUNT_INPUT_SCREEN_READY extends CatpayOrderStepDto {
            AMOUNT_INPUT_SCREEN_READY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.AMOUNT_INPUT_SCREEN_READY;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.AMOUNT_INPUT_ERROR", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AMOUNT_INPUT_ERROR extends CatpayOrderStepDto {
            AMOUNT_INPUT_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.AMOUNT_INPUT_ERROR;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.SELECT_NETWORK", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELECT_NETWORK extends CatpayOrderStepDto {
            SELECT_NETWORK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.SELECT_NETWORK;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.REVIEW", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW extends CatpayOrderStepDto {
            REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.REVIEW;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.REVIEW_ERROR", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW_ERROR extends CatpayOrderStepDto {
            REVIEW_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.REVIEW_ERROR;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.REVIEW_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW_SUCCESS extends CatpayOrderStepDto {
            REVIEW_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.REVIEW_SUCCESS;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.REVIEW_CONTINUE", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW_CONTINUE extends CatpayOrderStepDto {
            REVIEW_CONTINUE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.REVIEW_CONTINUE;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.SUBMIT", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMIT extends CatpayOrderStepDto {
            SUBMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.SUBMIT;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.SUBMIT_ERROR", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMIT_ERROR extends CatpayOrderStepDto {
            SUBMIT_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.SUBMIT_ERROR;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.SUBMIT_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMIT_SUCCESS extends CatpayOrderStepDto {
            SUBMIT_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.SUBMIT_SUCCESS;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.MFA_START", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MFA_START extends CatpayOrderStepDto {
            MFA_START(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.MFA_START;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.MFA_ERROR", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MFA_ERROR extends CatpayOrderStepDto {
            MFA_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.MFA_ERROR;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.MFA_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MFA_SUCCESS extends CatpayOrderStepDto {
            MFA_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.MFA_SUCCESS;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.ENROLLMENT_START", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENROLLMENT_START extends CatpayOrderStepDto {
            ENROLLMENT_START(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.ENROLLMENT_START;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.ENROLLMENT_ERROR", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENROLLMENT_ERROR extends CatpayOrderStepDto {
            ENROLLMENT_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.ENROLLMENT_ERROR;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.ENROLLMENT_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENROLLMENT_SUCCESS extends CatpayOrderStepDto {
            ENROLLMENT_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.ENROLLMENT_SUCCESS;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.CONFIRM_WALLET_ADDRESS", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONFIRM_WALLET_ADDRESS extends CatpayOrderStepDto {
            CONFIRM_WALLET_ADDRESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.CONFIRM_WALLET_ADDRESS;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.LOGIN", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOGIN extends CatpayOrderStepDto {
            LOGIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.LOGIN;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.UNAVAILABLE", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNAVAILABLE extends CatpayOrderStepDto {
            UNAVAILABLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.UNAVAILABLE;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.FIAT_3DS_START", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIAT_3DS_START extends CatpayOrderStepDto {
            FIAT_3DS_START(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.FIAT_3DS_START;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.FIAT_3DS_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIAT_3DS_SUCCESS extends CatpayOrderStepDto {
            FIAT_3DS_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.FIAT_3DS_SUCCESS;
            }
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto.CatpayOrderStepDto.FIAT_3DS_FAILURE", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIAT_3DS_FAILURE extends CatpayOrderStepDto {
            FIAT_3DS_FAILURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderEventData.CatpayOrderStep toProto() {
                return CatpayOrderEventData.CatpayOrderStep.FIAT_3DS_FAILURE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData$CatpayOrderStep;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CatpayOrderStepDto, CatpayOrderEventData.CatpayOrderStep> {

            /* compiled from: CatpayOrderEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CatpayOrderEventData.CatpayOrderStep.values().length];
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.FLOW_STEP_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.SELECT_ASSET_SCREEN_READY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.SELECT_ASSET.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.SELECT_FUNDING_SOURCE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.AMOUNT_INPUT_SCREEN_READY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.AMOUNT_INPUT_ERROR.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.SELECT_NETWORK.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.REVIEW.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.REVIEW_ERROR.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.REVIEW_SUCCESS.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.REVIEW_CONTINUE.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.SUBMIT.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.SUBMIT_ERROR.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.SUBMIT_SUCCESS.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.MFA_START.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.MFA_ERROR.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.MFA_SUCCESS.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.ENROLLMENT_START.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.ENROLLMENT_ERROR.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.ENROLLMENT_SUCCESS.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.CONFIRM_WALLET_ADDRESS.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.LOGIN.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.UNAVAILABLE.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.FIAT_3DS_START.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.FIAT_3DS_SUCCESS.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[CatpayOrderEventData.CatpayOrderStep.FIAT_3DS_FAILURE.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CatpayOrderStepDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayOrderStepDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayOrderStepDto> getBinaryBase64Serializer() {
                return (KSerializer) CatpayOrderStepDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CatpayOrderEventData.CatpayOrderStep> getProtoAdapter() {
                return CatpayOrderEventData.CatpayOrderStep.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayOrderStepDto getZeroValue() {
                return CatpayOrderStepDto.FLOW_STEP_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayOrderStepDto fromProto(CatpayOrderEventData.CatpayOrderStep proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CatpayOrderStepDto.FLOW_STEP_UNSPECIFIED;
                    case 2:
                        return CatpayOrderStepDto.SELECT_ASSET_SCREEN_READY;
                    case 3:
                        return CatpayOrderStepDto.SELECT_ASSET;
                    case 4:
                        return CatpayOrderStepDto.SELECT_FUNDING_SOURCE;
                    case 5:
                        return CatpayOrderStepDto.AMOUNT_INPUT_SCREEN_READY;
                    case 6:
                        return CatpayOrderStepDto.AMOUNT_INPUT_ERROR;
                    case 7:
                        return CatpayOrderStepDto.SELECT_NETWORK;
                    case 8:
                        return CatpayOrderStepDto.REVIEW;
                    case 9:
                        return CatpayOrderStepDto.REVIEW_ERROR;
                    case 10:
                        return CatpayOrderStepDto.REVIEW_SUCCESS;
                    case 11:
                        return CatpayOrderStepDto.REVIEW_CONTINUE;
                    case 12:
                        return CatpayOrderStepDto.SUBMIT;
                    case 13:
                        return CatpayOrderStepDto.SUBMIT_ERROR;
                    case 14:
                        return CatpayOrderStepDto.SUBMIT_SUCCESS;
                    case 15:
                        return CatpayOrderStepDto.MFA_START;
                    case 16:
                        return CatpayOrderStepDto.MFA_ERROR;
                    case 17:
                        return CatpayOrderStepDto.MFA_SUCCESS;
                    case 18:
                        return CatpayOrderStepDto.ENROLLMENT_START;
                    case 19:
                        return CatpayOrderStepDto.ENROLLMENT_ERROR;
                    case 20:
                        return CatpayOrderStepDto.ENROLLMENT_SUCCESS;
                    case 21:
                        return CatpayOrderStepDto.CONFIRM_WALLET_ADDRESS;
                    case 22:
                        return CatpayOrderStepDto.LOGIN;
                    case 23:
                        return CatpayOrderStepDto.UNAVAILABLE;
                    case 24:
                        return CatpayOrderStepDto.FIAT_3DS_START;
                    case 25:
                        return CatpayOrderStepDto.FIAT_3DS_SUCCESS;
                    case 26:
                        return CatpayOrderStepDto.FIAT_3DS_FAILURE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CatpayOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$CatpayOrderStepDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CatpayOrderStepDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CatpayOrderStepDto, CatpayOrderEventData.CatpayOrderStep> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CatpayOrderEventData.CatpayOrderStep", CatpayOrderStepDto.getEntries(), CatpayOrderStepDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CatpayOrderStepDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CatpayOrderStepDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CatpayOrderStepDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CatpayOrderStepDto valueOf(String str) {
            return (CatpayOrderStepDto) Enum.valueOf(CatpayOrderStepDto.class, str);
        }

        public static CatpayOrderStepDto[] values() {
            return (CatpayOrderStepDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CatpayOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CatpayOrderEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CatpayOrderEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CatpayOrderEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CatpayOrderEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CatpayOrderEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CatpayOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto";
        }
    }
}
