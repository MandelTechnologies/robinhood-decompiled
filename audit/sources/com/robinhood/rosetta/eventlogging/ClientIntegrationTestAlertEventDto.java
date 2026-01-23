package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientIntegrationTestAlertTypeDto;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
import com.robinhood.rosetta.eventlogging.ClientTestSuiteContextDto;
import com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto;
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
import p479j$.time.Instant;

/* compiled from: ClientIntegrationTestAlertEventDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015JQ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;", "alert_type", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "test_type", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "context", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;)Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getAlert_type", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;", "getDetails", "getTest_type", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientIntegrationTestAlertEventDto implements Dto3<ClientIntegrationTestAlertEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientIntegrationTestAlertEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientIntegrationTestAlertEventDto, ClientIntegrationTestAlertEvent>> binaryBase64Serializer$delegate;
    private static final ClientIntegrationTestAlertEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientIntegrationTestAlertEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientIntegrationTestAlertEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final ClientIntegrationTestAlertTypeDto getAlert_type() {
        return this.surrogate.getAlert_type();
    }

    public final String getDetails() {
        return this.surrogate.getDetails();
    }

    public final ClientTestSuiteTypeDto getTest_type() {
        return this.surrogate.getTest_type();
    }

    public final ClientTestSuiteContextDto getContext() {
        return this.surrogate.getContext();
    }

    public /* synthetic */ ClientIntegrationTestAlertEventDto(ClientPlatformDto clientPlatformDto, Instant instant, ClientIntegrationTestAlertTypeDto clientIntegrationTestAlertTypeDto, String str, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ClientIntegrationTestAlertTypeDto.INSTANCE.getZeroValue() : clientIntegrationTestAlertTypeDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ClientTestSuiteTypeDto.INSTANCE.getZeroValue() : clientTestSuiteTypeDto, (i & 32) != 0 ? ClientTestSuiteContextDto.INSTANCE.getZeroValue() : clientTestSuiteContextDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientIntegrationTestAlertEventDto(ClientPlatformDto platform, Instant instant, ClientIntegrationTestAlertTypeDto alert_type, String details, ClientTestSuiteTypeDto test_type, ClientTestSuiteContextDto context) {
        this(new Surrogate(platform, instant, alert_type, details, test_type, context));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ ClientIntegrationTestAlertEventDto copy$default(ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientPlatformDto clientPlatformDto, Instant instant, ClientIntegrationTestAlertTypeDto clientIntegrationTestAlertTypeDto, String str, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatformDto = clientIntegrationTestAlertEventDto.surrogate.getPlatform();
        }
        if ((i & 2) != 0) {
            instant = clientIntegrationTestAlertEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            clientIntegrationTestAlertTypeDto = clientIntegrationTestAlertEventDto.surrogate.getAlert_type();
        }
        if ((i & 8) != 0) {
            str = clientIntegrationTestAlertEventDto.surrogate.getDetails();
        }
        if ((i & 16) != 0) {
            clientTestSuiteTypeDto = clientIntegrationTestAlertEventDto.surrogate.getTest_type();
        }
        if ((i & 32) != 0) {
            clientTestSuiteContextDto = clientIntegrationTestAlertEventDto.surrogate.getContext();
        }
        ClientTestSuiteTypeDto clientTestSuiteTypeDto2 = clientTestSuiteTypeDto;
        ClientTestSuiteContextDto clientTestSuiteContextDto2 = clientTestSuiteContextDto;
        return clientIntegrationTestAlertEventDto.copy(clientPlatformDto, instant, clientIntegrationTestAlertTypeDto, str, clientTestSuiteTypeDto2, clientTestSuiteContextDto2);
    }

    public final ClientIntegrationTestAlertEventDto copy(ClientPlatformDto platform, Instant timestamp, ClientIntegrationTestAlertTypeDto alert_type, String details, ClientTestSuiteTypeDto test_type, ClientTestSuiteContextDto context) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ClientIntegrationTestAlertEventDto(new Surrogate(platform, timestamp, alert_type, details, test_type, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientIntegrationTestAlertEvent toProto() {
        return new ClientIntegrationTestAlertEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), (ClientIntegrationTestAlertType) this.surrogate.getAlert_type().toProto(), this.surrogate.getDetails(), (ClientTestSuiteType) this.surrogate.getTest_type().toProto(), (ClientTestSuiteContext) this.surrogate.getContext().toProto(), null, 64, null);
    }

    public String toString() {
        return "[ClientIntegrationTestAlertEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientIntegrationTestAlertEventDto) && Intrinsics.areEqual(((ClientIntegrationTestAlertEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientIntegrationTestAlertEventDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002KJBi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BW\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-Jr\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010#RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010%R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010'R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010)R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010+R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010G\u0012\u0004\bI\u0010:\u001a\u0004\bH\u0010-¨\u0006L"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;", "alert_type", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "test_type", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "context", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "component6", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;)Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertTypeDto;", "getAlert_type", "getAlert_type$annotations", "Ljava/lang/String;", "getDetails", "getDetails$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "getTest_type", "getTest_type$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "getContext", "getContext$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientIntegrationTestAlertTypeDto alert_type;
        private final ClientTestSuiteContextDto context;
        private final String details;
        private final ClientPlatformDto platform;
        private final ClientTestSuiteTypeDto test_type;
        private final Instant timestamp;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (ClientIntegrationTestAlertTypeDto) null, (String) null, (ClientTestSuiteTypeDto) null, (ClientTestSuiteContextDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, ClientIntegrationTestAlertTypeDto clientIntegrationTestAlertTypeDto, String str, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i, Object obj) {
            if ((i & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 4) != 0) {
                clientIntegrationTestAlertTypeDto = surrogate.alert_type;
            }
            if ((i & 8) != 0) {
                str = surrogate.details;
            }
            if ((i & 16) != 0) {
                clientTestSuiteTypeDto = surrogate.test_type;
            }
            if ((i & 32) != 0) {
                clientTestSuiteContextDto = surrogate.context;
            }
            ClientTestSuiteTypeDto clientTestSuiteTypeDto2 = clientTestSuiteTypeDto;
            ClientTestSuiteContextDto clientTestSuiteContextDto2 = clientTestSuiteContextDto;
            return surrogate.copy(clientPlatformDto, instant, clientIntegrationTestAlertTypeDto, str, clientTestSuiteTypeDto2, clientTestSuiteContextDto2);
        }

        @SerialName("alertType")
        @JsonAnnotations2(names = {"alert_type"})
        public static /* synthetic */ void getAlert_type$annotations() {
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName(ErrorBundle.DETAIL_ENTRY)
        @JsonAnnotations2(names = {ErrorBundle.DETAIL_ENTRY})
        public static /* synthetic */ void getDetails$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("testType")
        @JsonAnnotations2(names = {"test_type"})
        public static /* synthetic */ void getTest_type$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final ClientIntegrationTestAlertTypeDto getAlert_type() {
            return this.alert_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        /* renamed from: component5, reason: from getter */
        public final ClientTestSuiteTypeDto getTest_type() {
            return this.test_type;
        }

        /* renamed from: component6, reason: from getter */
        public final ClientTestSuiteContextDto getContext() {
            return this.context;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, ClientIntegrationTestAlertTypeDto alert_type, String details, ClientTestSuiteTypeDto test_type, ClientTestSuiteContextDto context) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(alert_type, "alert_type");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(test_type, "test_type");
            Intrinsics.checkNotNullParameter(context, "context");
            return new Surrogate(platform, timestamp, alert_type, details, test_type, context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && this.alert_type == surrogate.alert_type && Intrinsics.areEqual(this.details, surrogate.details) && this.test_type == surrogate.test_type && this.context == surrogate.context;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.alert_type.hashCode()) * 31) + this.details.hashCode()) * 31) + this.test_type.hashCode()) * 31) + this.context.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", alert_type=" + this.alert_type + ", details=" + this.details + ", test_type=" + this.test_type + ", context=" + this.context + ")";
        }

        /* compiled from: ClientIntegrationTestAlertEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientIntegrationTestAlertEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, ClientIntegrationTestAlertTypeDto clientIntegrationTestAlertTypeDto, String str, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.alert_type = ClientIntegrationTestAlertTypeDto.INSTANCE.getZeroValue();
            } else {
                this.alert_type = clientIntegrationTestAlertTypeDto;
            }
            if ((i & 8) == 0) {
                this.details = "";
            } else {
                this.details = str;
            }
            if ((i & 16) == 0) {
                this.test_type = ClientTestSuiteTypeDto.INSTANCE.getZeroValue();
            } else {
                this.test_type = clientTestSuiteTypeDto;
            }
            if ((i & 32) == 0) {
                this.context = ClientTestSuiteContextDto.INSTANCE.getZeroValue();
            } else {
                this.context = clientTestSuiteContextDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.platform != ClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.alert_type != ClientIntegrationTestAlertTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ClientIntegrationTestAlertTypeDto.Serializer.INSTANCE, self.alert_type);
            }
            if (!Intrinsics.areEqual(self.details, "")) {
                output.encodeStringElement(serialDesc, 3, self.details);
            }
            if (self.test_type != ClientTestSuiteTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, ClientTestSuiteTypeDto.Serializer.INSTANCE, self.test_type);
            }
            if (self.context != ClientTestSuiteContextDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, ClientTestSuiteContextDto.Serializer.INSTANCE, self.context);
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, ClientIntegrationTestAlertTypeDto alert_type, String details, ClientTestSuiteTypeDto test_type, ClientTestSuiteContextDto context) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(alert_type, "alert_type");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(test_type, "test_type");
            Intrinsics.checkNotNullParameter(context, "context");
            this.platform = platform;
            this.timestamp = instant;
            this.alert_type = alert_type;
            this.details = details;
            this.test_type = test_type;
            this.context = context;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, ClientIntegrationTestAlertTypeDto clientIntegrationTestAlertTypeDto, String str, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ClientIntegrationTestAlertTypeDto.INSTANCE.getZeroValue() : clientIntegrationTestAlertTypeDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ClientTestSuiteTypeDto.INSTANCE.getZeroValue() : clientTestSuiteTypeDto, (i & 32) != 0 ? ClientTestSuiteContextDto.INSTANCE.getZeroValue() : clientTestSuiteContextDto);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final ClientIntegrationTestAlertTypeDto getAlert_type() {
            return this.alert_type;
        }

        public final String getDetails() {
            return this.details;
        }

        public final ClientTestSuiteTypeDto getTest_type() {
            return this.test_type;
        }

        public final ClientTestSuiteContextDto getContext() {
            return this.context;
        }
    }

    /* compiled from: ClientIntegrationTestAlertEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientIntegrationTestAlertEventDto, ClientIntegrationTestAlertEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientIntegrationTestAlertEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientIntegrationTestAlertEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientIntegrationTestAlertEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientIntegrationTestAlertEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientIntegrationTestAlertEvent> getProtoAdapter() {
            return ClientIntegrationTestAlertEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientIntegrationTestAlertEventDto getZeroValue() {
            return ClientIntegrationTestAlertEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientIntegrationTestAlertEventDto fromProto(ClientIntegrationTestAlertEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientIntegrationTestAlertEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), ClientIntegrationTestAlertTypeDto.INSTANCE.fromProto(proto.getAlert_type()), proto.getDetails(), ClientTestSuiteTypeDto.INSTANCE.fromProto(proto.getTest_type()), ClientTestSuiteContextDto.INSTANCE.fromProto(proto.getContext())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientIntegrationTestAlertEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientIntegrationTestAlertEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientIntegrationTestAlertEventDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientIntegrationTestAlertEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientIntegrationTestAlertEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientIntegrationTestAlertEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientIntegrationTestAlertEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientIntegrationTestAlertEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientIntegrationTestAlertEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientIntegrationTestAlertEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientIntegrationTestAlertEventDto";
        }
    }
}
