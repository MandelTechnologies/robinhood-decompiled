package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.copilot.proto.p286v1.InstrumentTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ReturnDriverDigestItemDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0013JV\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tJ\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015¨\u00062"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItem;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Surrogate;", "<init>", "(Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Surrogate;)V", "ticker", "", "security_name", RhGcmListenerService.EXTRA_CATEGORY, "change_pct", "", "weight", ErrorBundle.DETAIL_ENTRY, "instrument_type", "Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "instrument_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Ljava/lang/String;)V", "getTicker", "()Ljava/lang/String;", "getSecurity_name", "getCategory", "getChange_pct", "()F", "getWeight", "getDetails", "getInstrument_type", "()Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "getInstrument_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ReturnDriverDigestItemDto implements Dto3<ReturnDriverDigestItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ReturnDriverDigestItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ReturnDriverDigestItemDto, ReturnDriverDigestItem>> binaryBase64Serializer$delegate;
    private static final ReturnDriverDigestItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ReturnDriverDigestItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ReturnDriverDigestItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTicker() {
        return this.surrogate.getTicker();
    }

    public final String getSecurity_name() {
        return this.surrogate.getSecurity_name();
    }

    public final String getCategory() {
        return this.surrogate.getCategory();
    }

    public final float getChange_pct() {
        return this.surrogate.getChange_pct();
    }

    public final float getWeight() {
        return this.surrogate.getWeight();
    }

    public final String getDetails() {
        return this.surrogate.getDetails();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public /* synthetic */ ReturnDriverDigestItemDto(String str, String str2, String str3, float f, float f2, String str4, InstrumentTypeDto instrumentTypeDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? 0.0f : f2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 128) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReturnDriverDigestItemDto(String ticker, String security_name, String category, float f, float f2, String details, InstrumentTypeDto instrument_type, String instrument_id) {
        this(new Surrogate(ticker, security_name, category, f, f2, details, instrument_type, instrument_id));
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(security_name, "security_name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
    }

    public static /* synthetic */ ReturnDriverDigestItemDto copy$default(ReturnDriverDigestItemDto returnDriverDigestItemDto, String str, String str2, String str3, float f, float f2, String str4, InstrumentTypeDto instrumentTypeDto, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = returnDriverDigestItemDto.surrogate.getTicker();
        }
        if ((i & 2) != 0) {
            str2 = returnDriverDigestItemDto.surrogate.getSecurity_name();
        }
        if ((i & 4) != 0) {
            str3 = returnDriverDigestItemDto.surrogate.getCategory();
        }
        if ((i & 8) != 0) {
            f = returnDriverDigestItemDto.surrogate.getChange_pct();
        }
        if ((i & 16) != 0) {
            f2 = returnDriverDigestItemDto.surrogate.getWeight();
        }
        if ((i & 32) != 0) {
            str4 = returnDriverDigestItemDto.surrogate.getDetails();
        }
        if ((i & 64) != 0) {
            instrumentTypeDto = returnDriverDigestItemDto.surrogate.getInstrument_type();
        }
        if ((i & 128) != 0) {
            str5 = returnDriverDigestItemDto.surrogate.getInstrument_id();
        }
        InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
        String str6 = str5;
        float f3 = f2;
        String str7 = str4;
        return returnDriverDigestItemDto.copy(str, str2, str3, f, f3, str7, instrumentTypeDto2, str6);
    }

    public final ReturnDriverDigestItemDto copy(String ticker, String security_name, String category, float change_pct, float weight, String details, InstrumentTypeDto instrument_type, String instrument_id) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(security_name, "security_name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        return new ReturnDriverDigestItemDto(new Surrogate(ticker, security_name, category, change_pct, weight, details, instrument_type, instrument_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ReturnDriverDigestItem toProto() {
        return new ReturnDriverDigestItem(this.surrogate.getTicker(), this.surrogate.getSecurity_name(), this.surrogate.getCategory(), this.surrogate.getChange_pct(), this.surrogate.getWeight(), this.surrogate.getDetails(), (InstrumentType) this.surrogate.getInstrument_type().toProto(), this.surrogate.getInstrument_id(), null, 256, null);
    }

    public String toString() {
        return "[ReturnDriverDigestItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ReturnDriverDigestItemDto) && Intrinsics.areEqual(((ReturnDriverDigestItemDto) other).surrogate, this.surrogate);
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
    /* compiled from: ReturnDriverDigestItemDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002ABBu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0018\u0010.\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010/\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003Jw\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0013HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R+\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010!R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001a¨\u0006C"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Surrogate;", "", "ticker", "", "security_name", RhGcmListenerService.EXTRA_CATEGORY, "change_pct", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "weight", ErrorBundle.DETAIL_ENTRY, "instrument_type", "Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "instrument_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTicker$annotations", "()V", "getTicker", "()Ljava/lang/String;", "getSecurity_name$annotations", "getSecurity_name", "getCategory$annotations", "getCategory", "getChange_pct$annotations", "getChange_pct", "()F", "getWeight$annotations", "getWeight", "getDetails$annotations", "getDetails", "getInstrument_type$annotations", "getInstrument_type", "()Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "getInstrument_id$annotations", "getInstrument_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$copilot_service_v1_externalRelease", "$serializer", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String category;
        private final float change_pct;
        private final String details;
        private final String instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final String security_name;
        private final String ticker;
        private final float weight;

        public Surrogate() {
            this((String) null, (String) null, (String) null, 0.0f, 0.0f, (String) null, (InstrumentTypeDto) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, float f, float f2, String str4, InstrumentTypeDto instrumentTypeDto, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.ticker;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.security_name;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.category;
            }
            if ((i & 8) != 0) {
                f = surrogate.change_pct;
            }
            if ((i & 16) != 0) {
                f2 = surrogate.weight;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.details;
            }
            if ((i & 64) != 0) {
                instrumentTypeDto = surrogate.instrument_type;
            }
            if ((i & 128) != 0) {
                str5 = surrogate.instrument_id;
            }
            InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
            String str6 = str5;
            float f3 = f2;
            String str7 = str4;
            return surrogate.copy(str, str2, str3, f, f3, str7, instrumentTypeDto2, str6);
        }

        @SerialName(RhGcmListenerService.EXTRA_CATEGORY)
        @JsonAnnotations2(names = {RhGcmListenerService.EXTRA_CATEGORY})
        public static /* synthetic */ void getCategory$annotations() {
        }

        @SerialName("changePct")
        @JsonAnnotations2(names = {"change_pct"})
        public static /* synthetic */ void getChange_pct$annotations() {
        }

        @SerialName(ErrorBundle.DETAIL_ENTRY)
        @JsonAnnotations2(names = {ErrorBundle.DETAIL_ENTRY})
        public static /* synthetic */ void getDetails$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("securityName")
        @JsonAnnotations2(names = {"security_name"})
        public static /* synthetic */ void getSecurity_name$annotations() {
        }

        @SerialName("ticker")
        @JsonAnnotations2(names = {"ticker"})
        public static /* synthetic */ void getTicker$annotations() {
        }

        @SerialName("weight")
        @JsonAnnotations2(names = {"weight"})
        public static /* synthetic */ void getWeight$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTicker() {
            return this.ticker;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSecurity_name() {
            return this.security_name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component4, reason: from getter */
        public final float getChange_pct() {
            return this.change_pct;
        }

        /* renamed from: component5, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        /* renamed from: component7, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        /* renamed from: component8, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final Surrogate copy(String ticker, String security_name, String category, float change_pct, float weight, String details, InstrumentTypeDto instrument_type, String instrument_id) {
            Intrinsics.checkNotNullParameter(ticker, "ticker");
            Intrinsics.checkNotNullParameter(security_name, "security_name");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            return new Surrogate(ticker, security_name, category, change_pct, weight, details, instrument_type, instrument_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ticker, surrogate.ticker) && Intrinsics.areEqual(this.security_name, surrogate.security_name) && Intrinsics.areEqual(this.category, surrogate.category) && Float.compare(this.change_pct, surrogate.change_pct) == 0 && Float.compare(this.weight, surrogate.weight) == 0 && Intrinsics.areEqual(this.details, surrogate.details) && this.instrument_type == surrogate.instrument_type && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id);
        }

        public int hashCode() {
            return (((((((((((((this.ticker.hashCode() * 31) + this.security_name.hashCode()) * 31) + this.category.hashCode()) * 31) + Float.hashCode(this.change_pct)) * 31) + Float.hashCode(this.weight)) * 31) + this.details.hashCode()) * 31) + this.instrument_type.hashCode()) * 31) + this.instrument_id.hashCode();
        }

        public String toString() {
            return "Surrogate(ticker=" + this.ticker + ", security_name=" + this.security_name + ", category=" + this.category + ", change_pct=" + this.change_pct + ", weight=" + this.weight + ", details=" + this.details + ", instrument_type=" + this.instrument_type + ", instrument_id=" + this.instrument_id + ")";
        }

        /* compiled from: ReturnDriverDigestItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ReturnDriverDigestItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, float f, float f2, String str4, InstrumentTypeDto instrumentTypeDto, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ticker = "";
            } else {
                this.ticker = str;
            }
            if ((i & 2) == 0) {
                this.security_name = "";
            } else {
                this.security_name = str2;
            }
            if ((i & 4) == 0) {
                this.category = "";
            } else {
                this.category = str3;
            }
            if ((i & 8) == 0) {
                this.change_pct = 0.0f;
            } else {
                this.change_pct = f;
            }
            if ((i & 16) == 0) {
                this.weight = 0.0f;
            } else {
                this.weight = f2;
            }
            if ((i & 32) == 0) {
                this.details = "";
            } else {
                this.details = str4;
            }
            if ((i & 64) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
            if ((i & 128) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ticker, "")) {
                output.encodeStringElement(serialDesc, 0, self.ticker);
            }
            if (!Intrinsics.areEqual(self.security_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.security_name);
            }
            if (!Intrinsics.areEqual(self.category, "")) {
                output.encodeStringElement(serialDesc, 2, self.category);
            }
            if (Float.compare(self.change_pct, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.change_pct));
            }
            if (Float.compare(self.weight, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 4, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.weight));
            }
            if (!Intrinsics.areEqual(self.details, "")) {
                output.encodeStringElement(serialDesc, 5, self.details);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            if (Intrinsics.areEqual(self.instrument_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.instrument_id);
        }

        public Surrogate(String ticker, String security_name, String category, float f, float f2, String details, InstrumentTypeDto instrument_type, String instrument_id) {
            Intrinsics.checkNotNullParameter(ticker, "ticker");
            Intrinsics.checkNotNullParameter(security_name, "security_name");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            this.ticker = ticker;
            this.security_name = security_name;
            this.category = category;
            this.change_pct = f;
            this.weight = f2;
            this.details = details;
            this.instrument_type = instrument_type;
            this.instrument_id = instrument_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, float f, float f2, String str4, InstrumentTypeDto instrumentTypeDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? 0.0f : f2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 128) != 0 ? "" : str5);
        }

        public final String getTicker() {
            return this.ticker;
        }

        public final String getSecurity_name() {
            return this.security_name;
        }

        public final String getCategory() {
            return this.category;
        }

        public final float getChange_pct() {
            return this.change_pct;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final String getDetails() {
            return this.details;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }
    }

    /* compiled from: ReturnDriverDigestItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ReturnDriverDigestItemDto, ReturnDriverDigestItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReturnDriverDigestItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReturnDriverDigestItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReturnDriverDigestItemDto> getBinaryBase64Serializer() {
            return (KSerializer) ReturnDriverDigestItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ReturnDriverDigestItem> getProtoAdapter() {
            return ReturnDriverDigestItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReturnDriverDigestItemDto getZeroValue() {
            return ReturnDriverDigestItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReturnDriverDigestItemDto fromProto(ReturnDriverDigestItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ReturnDriverDigestItemDto(new Surrogate(proto.getTicker(), proto.getSecurity_name(), proto.getCategory(), proto.getChange_pct(), proto.getWeight(), proto.getDetails(), InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type()), proto.getInstrument_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.ReturnDriverDigestItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReturnDriverDigestItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ReturnDriverDigestItemDto(null, null, null, 0.0f, 0.0f, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ReturnDriverDigestItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ReturnDriverDigestItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.ReturnDriverDigestItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ReturnDriverDigestItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ReturnDriverDigestItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ReturnDriverDigestItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ReturnDriverDigestItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.ReturnDriverDigestItemDto";
        }
    }
}
