package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.CryptoAssetContextDto;
import com.robinhood.rosetta.eventlogging.NcwFundingContext;
import com.robinhood.rosetta.eventlogging.NcwFundingContextDto;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.ScreenDto;
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

/* compiled from: NcwFundingContextDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005./012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0013JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Surrogate;)V", "funding_session_id", "", "session_flow", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "deeplink", "token_selected", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "final_robinhood_app_transfer_screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;", "connect_id", "source_screen", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;)V", "getFunding_session_id", "()Ljava/lang/String;", "getSession_flow", "()Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "getDeeplink", "getToken_selected", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getFinal_robinhood_app_transfer_screen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;", "getConnect_id", "getSource_screen", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SessionFlowDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NcwFundingContextDto implements Dto3<NcwFundingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NcwFundingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NcwFundingContextDto, NcwFundingContext>> binaryBase64Serializer$delegate;
    private static final NcwFundingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NcwFundingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NcwFundingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFunding_session_id() {
        return this.surrogate.getFunding_session_id();
    }

    public final SessionFlowDto getSession_flow() {
        return this.surrogate.getSession_flow();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final CryptoAssetContextDto getToken_selected() {
        return this.surrogate.getToken_selected();
    }

    public final ScreenDto.NameDto getFinal_robinhood_app_transfer_screen() {
        return this.surrogate.getFinal_robinhood_app_transfer_screen();
    }

    public final String getConnect_id() {
        return this.surrogate.getConnect_id();
    }

    public final ScreenDto.NameDto getSource_screen() {
        return this.surrogate.getSource_screen();
    }

    public /* synthetic */ NcwFundingContextDto(String str, SessionFlowDto sessionFlowDto, String str2, CryptoAssetContextDto cryptoAssetContextDto, ScreenDto.NameDto nameDto, String str3, ScreenDto.NameDto nameDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SessionFlowDto.INSTANCE.getZeroValue() : sessionFlowDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : cryptoAssetContextDto, (i & 16) != 0 ? ScreenDto.NameDto.INSTANCE.getZeroValue() : nameDto, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ScreenDto.NameDto.INSTANCE.getZeroValue() : nameDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NcwFundingContextDto(String funding_session_id, SessionFlowDto session_flow, String deeplink, CryptoAssetContextDto cryptoAssetContextDto, ScreenDto.NameDto final_robinhood_app_transfer_screen, String connect_id, ScreenDto.NameDto source_screen) {
        this(new Surrogate(funding_session_id, session_flow, deeplink, cryptoAssetContextDto, final_robinhood_app_transfer_screen, connect_id, source_screen));
        Intrinsics.checkNotNullParameter(funding_session_id, "funding_session_id");
        Intrinsics.checkNotNullParameter(session_flow, "session_flow");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(final_robinhood_app_transfer_screen, "final_robinhood_app_transfer_screen");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
    }

    public static /* synthetic */ NcwFundingContextDto copy$default(NcwFundingContextDto ncwFundingContextDto, String str, SessionFlowDto sessionFlowDto, String str2, CryptoAssetContextDto cryptoAssetContextDto, ScreenDto.NameDto nameDto, String str3, ScreenDto.NameDto nameDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ncwFundingContextDto.surrogate.getFunding_session_id();
        }
        if ((i & 2) != 0) {
            sessionFlowDto = ncwFundingContextDto.surrogate.getSession_flow();
        }
        if ((i & 4) != 0) {
            str2 = ncwFundingContextDto.surrogate.getDeeplink();
        }
        if ((i & 8) != 0) {
            cryptoAssetContextDto = ncwFundingContextDto.surrogate.getToken_selected();
        }
        if ((i & 16) != 0) {
            nameDto = ncwFundingContextDto.surrogate.getFinal_robinhood_app_transfer_screen();
        }
        if ((i & 32) != 0) {
            str3 = ncwFundingContextDto.surrogate.getConnect_id();
        }
        if ((i & 64) != 0) {
            nameDto2 = ncwFundingContextDto.surrogate.getSource_screen();
        }
        String str4 = str3;
        ScreenDto.NameDto nameDto3 = nameDto2;
        ScreenDto.NameDto nameDto4 = nameDto;
        String str5 = str2;
        return ncwFundingContextDto.copy(str, sessionFlowDto, str5, cryptoAssetContextDto, nameDto4, str4, nameDto3);
    }

    public final NcwFundingContextDto copy(String funding_session_id, SessionFlowDto session_flow, String deeplink, CryptoAssetContextDto token_selected, ScreenDto.NameDto final_robinhood_app_transfer_screen, String connect_id, ScreenDto.NameDto source_screen) {
        Intrinsics.checkNotNullParameter(funding_session_id, "funding_session_id");
        Intrinsics.checkNotNullParameter(session_flow, "session_flow");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(final_robinhood_app_transfer_screen, "final_robinhood_app_transfer_screen");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        return new NcwFundingContextDto(new Surrogate(funding_session_id, session_flow, deeplink, token_selected, final_robinhood_app_transfer_screen, connect_id, source_screen));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NcwFundingContext toProto() {
        String funding_session_id = this.surrogate.getFunding_session_id();
        NcwFundingContext.SessionFlow sessionFlow = (NcwFundingContext.SessionFlow) this.surrogate.getSession_flow().toProto();
        String deeplink = this.surrogate.getDeeplink();
        CryptoAssetContextDto token_selected = this.surrogate.getToken_selected();
        return new NcwFundingContext(funding_session_id, sessionFlow, deeplink, token_selected != null ? token_selected.toProto() : null, (Screen.Name) this.surrogate.getFinal_robinhood_app_transfer_screen().toProto(), this.surrogate.getConnect_id(), (Screen.Name) this.surrogate.getSource_screen().toProto(), null, 128, null);
    }

    public String toString() {
        return "[NcwFundingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NcwFundingContextDto) && Intrinsics.areEqual(((NcwFundingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: NcwFundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002<=BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003JQ\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0010HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017R\u001c\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\"¨\u0006>"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Surrogate;", "", "funding_session_id", "", "session_flow", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "deeplink", "token_selected", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "final_robinhood_app_transfer_screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;", "connect_id", "source_screen", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFunding_session_id$annotations", "()V", "getFunding_session_id", "()Ljava/lang/String;", "getSession_flow$annotations", "getSession_flow", "()Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "getDeeplink$annotations", "getDeeplink", "getToken_selected$annotations", "getToken_selected", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getFinal_robinhood_app_transfer_screen$annotations", "getFinal_robinhood_app_transfer_screen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto$NameDto;", "getConnect_id$annotations", "getConnect_id", "getSource_screen$annotations", "getSource_screen", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String connect_id;
        private final String deeplink;
        private final ScreenDto.NameDto final_robinhood_app_transfer_screen;
        private final String funding_session_id;
        private final SessionFlowDto session_flow;
        private final ScreenDto.NameDto source_screen;
        private final CryptoAssetContextDto token_selected;

        public Surrogate() {
            this((String) null, (SessionFlowDto) null, (String) null, (CryptoAssetContextDto) null, (ScreenDto.NameDto) null, (String) null, (ScreenDto.NameDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, SessionFlowDto sessionFlowDto, String str2, CryptoAssetContextDto cryptoAssetContextDto, ScreenDto.NameDto nameDto, String str3, ScreenDto.NameDto nameDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.funding_session_id;
            }
            if ((i & 2) != 0) {
                sessionFlowDto = surrogate.session_flow;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.deeplink;
            }
            if ((i & 8) != 0) {
                cryptoAssetContextDto = surrogate.token_selected;
            }
            if ((i & 16) != 0) {
                nameDto = surrogate.final_robinhood_app_transfer_screen;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.connect_id;
            }
            if ((i & 64) != 0) {
                nameDto2 = surrogate.source_screen;
            }
            String str4 = str3;
            ScreenDto.NameDto nameDto3 = nameDto2;
            ScreenDto.NameDto nameDto4 = nameDto;
            String str5 = str2;
            return surrogate.copy(str, sessionFlowDto, str5, cryptoAssetContextDto, nameDto4, str4, nameDto3);
        }

        @SerialName("connectId")
        @JsonAnnotations2(names = {"connect_id"})
        public static /* synthetic */ void getConnect_id$annotations() {
        }

        @SerialName("deeplink")
        @JsonAnnotations2(names = {"deeplink"})
        public static /* synthetic */ void getDeeplink$annotations() {
        }

        @SerialName("finalRobinhoodAppTransferScreen")
        @JsonAnnotations2(names = {"final_robinhood_app_transfer_screen"})
        public static /* synthetic */ void getFinal_robinhood_app_transfer_screen$annotations() {
        }

        @SerialName("fundingSessionId")
        @JsonAnnotations2(names = {"funding_session_id"})
        public static /* synthetic */ void getFunding_session_id$annotations() {
        }

        @SerialName("sessionFlow")
        @JsonAnnotations2(names = {"session_flow"})
        public static /* synthetic */ void getSession_flow$annotations() {
        }

        @SerialName("sourceScreen")
        @JsonAnnotations2(names = {"source_screen"})
        public static /* synthetic */ void getSource_screen$annotations() {
        }

        @SerialName("tokenSelected")
        @JsonAnnotations2(names = {"token_selected"})
        public static /* synthetic */ void getToken_selected$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFunding_session_id() {
            return this.funding_session_id;
        }

        /* renamed from: component2, reason: from getter */
        public final SessionFlowDto getSession_flow() {
            return this.session_flow;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoAssetContextDto getToken_selected() {
            return this.token_selected;
        }

        /* renamed from: component5, reason: from getter */
        public final ScreenDto.NameDto getFinal_robinhood_app_transfer_screen() {
            return this.final_robinhood_app_transfer_screen;
        }

        /* renamed from: component6, reason: from getter */
        public final String getConnect_id() {
            return this.connect_id;
        }

        /* renamed from: component7, reason: from getter */
        public final ScreenDto.NameDto getSource_screen() {
            return this.source_screen;
        }

        public final Surrogate copy(String funding_session_id, SessionFlowDto session_flow, String deeplink, CryptoAssetContextDto token_selected, ScreenDto.NameDto final_robinhood_app_transfer_screen, String connect_id, ScreenDto.NameDto source_screen) {
            Intrinsics.checkNotNullParameter(funding_session_id, "funding_session_id");
            Intrinsics.checkNotNullParameter(session_flow, "session_flow");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(final_robinhood_app_transfer_screen, "final_robinhood_app_transfer_screen");
            Intrinsics.checkNotNullParameter(connect_id, "connect_id");
            Intrinsics.checkNotNullParameter(source_screen, "source_screen");
            return new Surrogate(funding_session_id, session_flow, deeplink, token_selected, final_robinhood_app_transfer_screen, connect_id, source_screen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.funding_session_id, surrogate.funding_session_id) && this.session_flow == surrogate.session_flow && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.token_selected, surrogate.token_selected) && this.final_robinhood_app_transfer_screen == surrogate.final_robinhood_app_transfer_screen && Intrinsics.areEqual(this.connect_id, surrogate.connect_id) && this.source_screen == surrogate.source_screen;
        }

        public int hashCode() {
            int iHashCode = ((((this.funding_session_id.hashCode() * 31) + this.session_flow.hashCode()) * 31) + this.deeplink.hashCode()) * 31;
            CryptoAssetContextDto cryptoAssetContextDto = this.token_selected;
            return ((((((iHashCode + (cryptoAssetContextDto == null ? 0 : cryptoAssetContextDto.hashCode())) * 31) + this.final_robinhood_app_transfer_screen.hashCode()) * 31) + this.connect_id.hashCode()) * 31) + this.source_screen.hashCode();
        }

        public String toString() {
            return "Surrogate(funding_session_id=" + this.funding_session_id + ", session_flow=" + this.session_flow + ", deeplink=" + this.deeplink + ", token_selected=" + this.token_selected + ", final_robinhood_app_transfer_screen=" + this.final_robinhood_app_transfer_screen + ", connect_id=" + this.connect_id + ", source_screen=" + this.source_screen + ")";
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NcwFundingContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SessionFlowDto sessionFlowDto, String str2, CryptoAssetContextDto cryptoAssetContextDto, ScreenDto.NameDto nameDto, String str3, ScreenDto.NameDto nameDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.funding_session_id = "";
            } else {
                this.funding_session_id = str;
            }
            if ((i & 2) == 0) {
                this.session_flow = SessionFlowDto.INSTANCE.getZeroValue();
            } else {
                this.session_flow = sessionFlowDto;
            }
            if ((i & 4) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str2;
            }
            if ((i & 8) == 0) {
                this.token_selected = null;
            } else {
                this.token_selected = cryptoAssetContextDto;
            }
            if ((i & 16) == 0) {
                this.final_robinhood_app_transfer_screen = ScreenDto.NameDto.INSTANCE.getZeroValue();
            } else {
                this.final_robinhood_app_transfer_screen = nameDto;
            }
            if ((i & 32) == 0) {
                this.connect_id = "";
            } else {
                this.connect_id = str3;
            }
            if ((i & 64) == 0) {
                this.source_screen = ScreenDto.NameDto.INSTANCE.getZeroValue();
            } else {
                this.source_screen = nameDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.funding_session_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.funding_session_id);
            }
            if (self.session_flow != SessionFlowDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SessionFlowDto.Serializer.INSTANCE, self.session_flow);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 2, self.deeplink);
            }
            CryptoAssetContextDto cryptoAssetContextDto = self.token_selected;
            if (cryptoAssetContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto);
            }
            ScreenDto.NameDto nameDto = self.final_robinhood_app_transfer_screen;
            ScreenDto.NameDto.Companion companion = ScreenDto.NameDto.INSTANCE;
            if (nameDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, ScreenDto.NameDto.Serializer.INSTANCE, self.final_robinhood_app_transfer_screen);
            }
            if (!Intrinsics.areEqual(self.connect_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.connect_id);
            }
            if (self.source_screen != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, ScreenDto.NameDto.Serializer.INSTANCE, self.source_screen);
            }
        }

        public Surrogate(String funding_session_id, SessionFlowDto session_flow, String deeplink, CryptoAssetContextDto cryptoAssetContextDto, ScreenDto.NameDto final_robinhood_app_transfer_screen, String connect_id, ScreenDto.NameDto source_screen) {
            Intrinsics.checkNotNullParameter(funding_session_id, "funding_session_id");
            Intrinsics.checkNotNullParameter(session_flow, "session_flow");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(final_robinhood_app_transfer_screen, "final_robinhood_app_transfer_screen");
            Intrinsics.checkNotNullParameter(connect_id, "connect_id");
            Intrinsics.checkNotNullParameter(source_screen, "source_screen");
            this.funding_session_id = funding_session_id;
            this.session_flow = session_flow;
            this.deeplink = deeplink;
            this.token_selected = cryptoAssetContextDto;
            this.final_robinhood_app_transfer_screen = final_robinhood_app_transfer_screen;
            this.connect_id = connect_id;
            this.source_screen = source_screen;
        }

        public /* synthetic */ Surrogate(String str, SessionFlowDto sessionFlowDto, String str2, CryptoAssetContextDto cryptoAssetContextDto, ScreenDto.NameDto nameDto, String str3, ScreenDto.NameDto nameDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SessionFlowDto.INSTANCE.getZeroValue() : sessionFlowDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : cryptoAssetContextDto, (i & 16) != 0 ? ScreenDto.NameDto.INSTANCE.getZeroValue() : nameDto, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ScreenDto.NameDto.INSTANCE.getZeroValue() : nameDto2);
        }

        public final String getFunding_session_id() {
            return this.funding_session_id;
        }

        public final SessionFlowDto getSession_flow() {
            return this.session_flow;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final CryptoAssetContextDto getToken_selected() {
            return this.token_selected;
        }

        public final ScreenDto.NameDto getFinal_robinhood_app_transfer_screen() {
            return this.final_robinhood_app_transfer_screen;
        }

        public final String getConnect_id() {
            return this.connect_id;
        }

        public final ScreenDto.NameDto getSource_screen() {
            return this.source_screen;
        }
    }

    /* compiled from: NcwFundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NcwFundingContextDto, NcwFundingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NcwFundingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwFundingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwFundingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) NcwFundingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NcwFundingContext> getProtoAdapter() {
            return NcwFundingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwFundingContextDto getZeroValue() {
            return NcwFundingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwFundingContextDto fromProto(NcwFundingContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String funding_session_id = proto.getFunding_session_id();
            SessionFlowDto sessionFlowDtoFromProto = SessionFlowDto.INSTANCE.fromProto(proto.getSession_flow());
            String deeplink = proto.getDeeplink();
            CryptoAssetContext token_selected = proto.getToken_selected();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CryptoAssetContextDto cryptoAssetContextDtoFromProto = token_selected != null ? CryptoAssetContextDto.INSTANCE.fromProto(token_selected) : null;
            ScreenDto.NameDto.Companion companion = ScreenDto.NameDto.INSTANCE;
            return new NcwFundingContextDto(new Surrogate(funding_session_id, sessionFlowDtoFromProto, deeplink, cryptoAssetContextDtoFromProto, companion.fromProto(proto.getFinal_robinhood_app_transfer_screen()), proto.getConnect_id(), companion.fromProto(proto.getSource_screen())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwFundingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NcwFundingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NcwFundingContextDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwFundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FLOW_UNSPECIFIED", "ONBOARDING", "WALLET_HUB", "BUYING_PROMPT", "RECEIVE_FLOW", "OTHER", "NUX_FUNDING_PROMPT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SessionFlowDto implements Dto2<NcwFundingContext.SessionFlow>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SessionFlowDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SessionFlowDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SessionFlowDto, NcwFundingContext.SessionFlow>> binaryBase64Serializer$delegate;
        public static final SessionFlowDto FLOW_UNSPECIFIED = new FLOW_UNSPECIFIED("FLOW_UNSPECIFIED", 0);
        public static final SessionFlowDto ONBOARDING = new ONBOARDING("ONBOARDING", 1);
        public static final SessionFlowDto WALLET_HUB = new WALLET_HUB("WALLET_HUB", 2);
        public static final SessionFlowDto BUYING_PROMPT = new BUYING_PROMPT("BUYING_PROMPT", 3);
        public static final SessionFlowDto RECEIVE_FLOW = new RECEIVE_FLOW("RECEIVE_FLOW", 4);
        public static final SessionFlowDto OTHER = new OTHER("OTHER", 5);
        public static final SessionFlowDto NUX_FUNDING_PROMPT = new NUX_FUNDING_PROMPT("NUX_FUNDING_PROMPT", 6);

        private static final /* synthetic */ SessionFlowDto[] $values() {
            return new SessionFlowDto[]{FLOW_UNSPECIFIED, ONBOARDING, WALLET_HUB, BUYING_PROMPT, RECEIVE_FLOW, OTHER, NUX_FUNDING_PROMPT};
        }

        public /* synthetic */ SessionFlowDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SessionFlowDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwFundingContextDto.SessionFlowDto.FLOW_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FLOW_UNSPECIFIED extends SessionFlowDto {
            FLOW_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwFundingContext.SessionFlow toProto() {
                return NcwFundingContext.SessionFlow.FLOW_UNSPECIFIED;
            }
        }

        private SessionFlowDto(String str, int i) {
        }

        static {
            SessionFlowDto[] sessionFlowDtoArr$values = $values();
            $VALUES = sessionFlowDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sessionFlowDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwFundingContextDto$SessionFlowDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwFundingContextDto.SessionFlowDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwFundingContextDto.SessionFlowDto.ONBOARDING", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONBOARDING extends SessionFlowDto {
            ONBOARDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwFundingContext.SessionFlow toProto() {
                return NcwFundingContext.SessionFlow.ONBOARDING;
            }
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwFundingContextDto.SessionFlowDto.WALLET_HUB", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WALLET_HUB extends SessionFlowDto {
            WALLET_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwFundingContext.SessionFlow toProto() {
                return NcwFundingContext.SessionFlow.WALLET_HUB;
            }
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwFundingContextDto.SessionFlowDto.BUYING_PROMPT", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUYING_PROMPT extends SessionFlowDto {
            BUYING_PROMPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwFundingContext.SessionFlow toProto() {
                return NcwFundingContext.SessionFlow.BUYING_PROMPT;
            }
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwFundingContextDto.SessionFlowDto.RECEIVE_FLOW", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECEIVE_FLOW extends SessionFlowDto {
            RECEIVE_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwFundingContext.SessionFlow toProto() {
                return NcwFundingContext.SessionFlow.RECEIVE_FLOW;
            }
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwFundingContextDto.SessionFlowDto.OTHER", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OTHER extends SessionFlowDto {
            OTHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwFundingContext.SessionFlow toProto() {
                return NcwFundingContext.SessionFlow.OTHER;
            }
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwFundingContextDto.SessionFlowDto.NUX_FUNDING_PROMPT", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NUX_FUNDING_PROMPT extends SessionFlowDto {
            NUX_FUNDING_PROMPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwFundingContext.SessionFlow toProto() {
                return NcwFundingContext.SessionFlow.NUX_FUNDING_PROMPT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SessionFlowDto, NcwFundingContext.SessionFlow> {

            /* compiled from: NcwFundingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwFundingContext.SessionFlow.values().length];
                    try {
                        iArr[NcwFundingContext.SessionFlow.FLOW_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwFundingContext.SessionFlow.ONBOARDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NcwFundingContext.SessionFlow.WALLET_HUB.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NcwFundingContext.SessionFlow.BUYING_PROMPT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NcwFundingContext.SessionFlow.RECEIVE_FLOW.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[NcwFundingContext.SessionFlow.OTHER.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[NcwFundingContext.SessionFlow.NUX_FUNDING_PROMPT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SessionFlowDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SessionFlowDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SessionFlowDto> getBinaryBase64Serializer() {
                return (KSerializer) SessionFlowDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NcwFundingContext.SessionFlow> getProtoAdapter() {
                return NcwFundingContext.SessionFlow.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SessionFlowDto getZeroValue() {
                return SessionFlowDto.FLOW_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SessionFlowDto fromProto(NcwFundingContext.SessionFlow proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SessionFlowDto.FLOW_UNSPECIFIED;
                    case 2:
                        return SessionFlowDto.ONBOARDING;
                    case 3:
                        return SessionFlowDto.WALLET_HUB;
                    case 4:
                        return SessionFlowDto.BUYING_PROMPT;
                    case 5:
                        return SessionFlowDto.RECEIVE_FLOW;
                    case 6:
                        return SessionFlowDto.OTHER;
                    case 7:
                        return SessionFlowDto.NUX_FUNDING_PROMPT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwFundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$SessionFlowDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SessionFlowDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SessionFlowDto, NcwFundingContext.SessionFlow> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwFundingContext.SessionFlow", SessionFlowDto.getEntries(), SessionFlowDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SessionFlowDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SessionFlowDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SessionFlowDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SessionFlowDto valueOf(String str) {
            return (SessionFlowDto) Enum.valueOf(SessionFlowDto.class, str);
        }

        public static SessionFlowDto[] values() {
            return (SessionFlowDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NcwFundingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NcwFundingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NcwFundingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NcwFundingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NcwFundingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NcwFundingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NcwFundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NcwFundingContextDto";
        }
    }
}
