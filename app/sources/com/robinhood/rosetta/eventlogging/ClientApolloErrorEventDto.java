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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent;
import com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
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
import p479j$.time.Instant;

/* compiled from: ClientApolloErrorEventDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006879:;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0015J[\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001b¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "error_type", "", "job_url", "name", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "context", "request", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;Ljava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "getJob_url", "getName", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "getRequest", "Companion", "Surrogate", "ErrorTypeDto", "ContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientApolloErrorEventDto implements Dto3<ClientApolloErrorEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientApolloErrorEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientApolloErrorEventDto, ClientApolloErrorEvent>> binaryBase64Serializer$delegate;
    private static final ClientApolloErrorEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientApolloErrorEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientApolloErrorEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final ErrorTypeDto getError_type() {
        return this.surrogate.getError_type();
    }

    public final String getJob_url() {
        return this.surrogate.getJob_url();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final ContextDto getContext() {
        return this.surrogate.getContext();
    }

    public final String getRequest() {
        return this.surrogate.getRequest();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientApolloErrorEventDto(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ErrorTypeDto r4, java.lang.String r5, java.lang.String r6, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ContextDto r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
        La:
            r10 = r9 & 2
            if (r10 == 0) goto Lf
            r3 = 0
        Lf:
            r10 = r9 & 4
            if (r10 == 0) goto L19
            com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ErrorTypeDto$Companion r4 = com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ErrorTypeDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ErrorTypeDto r4 = r4.getZeroValue()
        L19:
            r10 = r9 & 8
            java.lang.String r0 = ""
            if (r10 == 0) goto L20
            r5 = r0
        L20:
            r10 = r9 & 16
            if (r10 == 0) goto L25
            r6 = r0
        L25:
            r10 = r9 & 32
            if (r10 == 0) goto L2f
            com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ContextDto$Companion r7 = com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ContextDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ContextDto r7 = r7.getZeroValue()
        L2f:
            r9 = r9 & 64
            if (r9 == 0) goto L3c
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L44
        L3c:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L44:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ErrorTypeDto, java.lang.String, java.lang.String, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ContextDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientApolloErrorEventDto(ClientPlatformDto platform, Instant instant, ErrorTypeDto error_type, String job_url, String name, ContextDto context, String request) {
        this(new Surrogate(platform, instant, error_type, job_url, name, context, request));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(job_url, "job_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public static /* synthetic */ ClientApolloErrorEventDto copy$default(ClientApolloErrorEventDto clientApolloErrorEventDto, ClientPlatformDto clientPlatformDto, Instant instant, ErrorTypeDto errorTypeDto, String str, String str2, ContextDto contextDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatformDto = clientApolloErrorEventDto.surrogate.getPlatform();
        }
        if ((i & 2) != 0) {
            instant = clientApolloErrorEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            errorTypeDto = clientApolloErrorEventDto.surrogate.getError_type();
        }
        if ((i & 8) != 0) {
            str = clientApolloErrorEventDto.surrogate.getJob_url();
        }
        if ((i & 16) != 0) {
            str2 = clientApolloErrorEventDto.surrogate.getName();
        }
        if ((i & 32) != 0) {
            contextDto = clientApolloErrorEventDto.surrogate.getContext();
        }
        if ((i & 64) != 0) {
            str3 = clientApolloErrorEventDto.surrogate.getRequest();
        }
        ContextDto contextDto2 = contextDto;
        String str4 = str3;
        String str5 = str2;
        ErrorTypeDto errorTypeDto2 = errorTypeDto;
        return clientApolloErrorEventDto.copy(clientPlatformDto, instant, errorTypeDto2, str, str5, contextDto2, str4);
    }

    public final ClientApolloErrorEventDto copy(ClientPlatformDto platform, Instant timestamp, ErrorTypeDto error_type, String job_url, String name, ContextDto context, String request) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(job_url, "job_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        return new ClientApolloErrorEventDto(new Surrogate(platform, timestamp, error_type, job_url, name, context, request));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientApolloErrorEvent toProto() {
        return new ClientApolloErrorEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), (ClientApolloErrorEvent.ErrorType) this.surrogate.getError_type().toProto(), this.surrogate.getJob_url(), this.surrogate.getName(), (ClientApolloErrorEvent.Context) this.surrogate.getContext().toProto(), this.surrogate.getRequest(), null, 128, null);
    }

    public String toString() {
        return "[ClientApolloErrorEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientApolloErrorEventDto) && Intrinsics.areEqual(((ClientApolloErrorEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientApolloErrorEventDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKBs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013Ba\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b-\u0010)J|\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010#RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010%R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010'R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010)R \u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010A\u0012\u0004\bE\u0010:\u001a\u0004\bD\u0010)R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010,R \u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010A\u0012\u0004\bJ\u0010:\u001a\u0004\bI\u0010)¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "error_type", "", "job_url", "name", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "context", "request", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "component7", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "getError_type", "getError_type$annotations", "Ljava/lang/String;", "getJob_url", "getJob_url$annotations", "getName", "getName$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "getContext", "getContext$annotations", "getRequest", "getRequest$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ContextDto context;
        private final ErrorTypeDto error_type;
        private final String job_url;
        private final String name;
        private final ClientPlatformDto platform;
        private final String request;
        private final Instant timestamp;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (ErrorTypeDto) null, (String) null, (String) null, (ContextDto) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, ErrorTypeDto errorTypeDto, String str, String str2, ContextDto contextDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 4) != 0) {
                errorTypeDto = surrogate.error_type;
            }
            if ((i & 8) != 0) {
                str = surrogate.job_url;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.name;
            }
            if ((i & 32) != 0) {
                contextDto = surrogate.context;
            }
            if ((i & 64) != 0) {
                str3 = surrogate.request;
            }
            ContextDto contextDto2 = contextDto;
            String str4 = str3;
            String str5 = str2;
            ErrorTypeDto errorTypeDto2 = errorTypeDto;
            return surrogate.copy(clientPlatformDto, instant, errorTypeDto2, str, str5, contextDto2, str4);
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("jobUrl")
        @JsonAnnotations2(names = {"job_url"})
        public static /* synthetic */ void getJob_url$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("request")
        @JsonAnnotations2(names = {"request"})
        public static /* synthetic */ void getRequest$annotations() {
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
        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getJob_url() {
            return this.job_url;
        }

        /* renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component6, reason: from getter */
        public final ContextDto getContext() {
            return this.context;
        }

        /* renamed from: component7, reason: from getter */
        public final String getRequest() {
            return this.request;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, ErrorTypeDto error_type, String job_url, String name, ContextDto context, String request) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(job_url, "job_url");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(request, "request");
            return new Surrogate(platform, timestamp, error_type, job_url, name, context, request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && this.error_type == surrogate.error_type && Intrinsics.areEqual(this.job_url, surrogate.job_url) && Intrinsics.areEqual(this.name, surrogate.name) && this.context == surrogate.context && Intrinsics.areEqual(this.request, surrogate.request);
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.error_type.hashCode()) * 31) + this.job_url.hashCode()) * 31) + this.name.hashCode()) * 31) + this.context.hashCode()) * 31) + this.request.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", error_type=" + this.error_type + ", job_url=" + this.job_url + ", name=" + this.name + ", context=" + this.context + ", request=" + this.request + ")";
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientApolloErrorEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, ErrorTypeDto errorTypeDto, String str, String str2, ContextDto contextDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.error_type = ErrorTypeDto.INSTANCE.getZeroValue();
            } else {
                this.error_type = errorTypeDto;
            }
            if ((i & 8) == 0) {
                this.job_url = "";
            } else {
                this.job_url = str;
            }
            if ((i & 16) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 32) == 0) {
                this.context = ContextDto.INSTANCE.getZeroValue();
            } else {
                this.context = contextDto;
            }
            if ((i & 64) == 0) {
                this.request = "";
            } else {
                this.request = str3;
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
            if (self.error_type != ErrorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ErrorTypeDto.Serializer.INSTANCE, self.error_type);
            }
            if (!Intrinsics.areEqual(self.job_url, "")) {
                output.encodeStringElement(serialDesc, 3, self.job_url);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 4, self.name);
            }
            if (self.context != ContextDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, ContextDto.Serializer.INSTANCE, self.context);
            }
            if (Intrinsics.areEqual(self.request, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.request);
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, ErrorTypeDto error_type, String job_url, String name, ContextDto context, String request) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(job_url, "job_url");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(request, "request");
            this.platform = platform;
            this.timestamp = instant;
            this.error_type = error_type;
            this.job_url = job_url;
            this.name = name;
            this.context = context;
            this.request = request;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ErrorTypeDto r4, java.lang.String r5, java.lang.String r6, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ContextDto r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                if (r10 == 0) goto Lf
                r3 = 0
            Lf:
                r10 = r9 & 4
                if (r10 == 0) goto L19
                com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ErrorTypeDto$Companion r4 = com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ErrorTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ErrorTypeDto r4 = r4.getZeroValue()
            L19:
                r10 = r9 & 8
                java.lang.String r0 = ""
                if (r10 == 0) goto L20
                r5 = r0
            L20:
                r10 = r9 & 16
                if (r10 == 0) goto L25
                r6 = r0
            L25:
                r10 = r9 & 32
                if (r10 == 0) goto L2f
                com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ContextDto$Companion r7 = com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.ContextDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ContextDto r7 = r7.getZeroValue()
            L2f:
                r9 = r9 & 64
                if (r9 == 0) goto L3c
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L44
            L3c:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L44:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ErrorTypeDto, java.lang.String, java.lang.String, com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ContextDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        public final String getJob_url() {
            return this.job_url;
        }

        public final String getName() {
            return this.name;
        }

        public final ContextDto getContext() {
            return this.context;
        }

        public final String getRequest() {
            return this.request;
        }
    }

    /* compiled from: ClientApolloErrorEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientApolloErrorEventDto, ClientApolloErrorEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientApolloErrorEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientApolloErrorEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientApolloErrorEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientApolloErrorEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientApolloErrorEvent> getProtoAdapter() {
            return ClientApolloErrorEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientApolloErrorEventDto getZeroValue() {
            return ClientApolloErrorEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientApolloErrorEventDto fromProto(ClientApolloErrorEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientApolloErrorEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), ErrorTypeDto.INSTANCE.fromProto(proto.getError_type()), proto.getJob_url(), proto.getName(), ContextDto.INSTANCE.fromProto(proto.getContext()), proto.getRequest()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientApolloErrorEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientApolloErrorEventDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientApolloErrorEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "DEFAULT_ERROR_TYPE", "NAMESPACE_CREATION", "SERVICE_SPINUP", "TEST_DATA_API_RECIPE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorTypeDto implements Dto2<ClientApolloErrorEvent.ErrorType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ErrorTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ErrorTypeDto DEFAULT_ERROR_TYPE = new DEFAULT_ERROR_TYPE("DEFAULT_ERROR_TYPE", 0);
        public static final ErrorTypeDto NAMESPACE_CREATION = new NAMESPACE_CREATION("NAMESPACE_CREATION", 1);
        public static final ErrorTypeDto SERVICE_SPINUP = new SERVICE_SPINUP("SERVICE_SPINUP", 2);
        public static final ErrorTypeDto TEST_DATA_API_RECIPE = new TEST_DATA_API_RECIPE("TEST_DATA_API_RECIPE", 3);
        private static final Lazy<BinaryBase64DtoSerializer<ErrorTypeDto, ClientApolloErrorEvent.ErrorType>> binaryBase64Serializer$delegate;
        private final String json_value;

        private static final /* synthetic */ ErrorTypeDto[] $values() {
            return new ErrorTypeDto[]{DEFAULT_ERROR_TYPE, NAMESPACE_CREATION, SERVICE_SPINUP, TEST_DATA_API_RECIPE};
        }

        public /* synthetic */ ErrorTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<ErrorTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ErrorTypeDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto.ErrorTypeDto.DEFAULT_ERROR_TYPE", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEFAULT_ERROR_TYPE extends ErrorTypeDto {
            DEFAULT_ERROR_TYPE(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientApolloErrorEvent.ErrorType toProto() {
                return ClientApolloErrorEvent.ErrorType.DEFAULT_ERROR_TYPE;
            }
        }

        static {
            ErrorTypeDto[] errorTypeDtoArr$values = $values();
            $VALUES = errorTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ErrorTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClientApolloErrorEventDto.ErrorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto.ErrorTypeDto.NAMESPACE_CREATION", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NAMESPACE_CREATION extends ErrorTypeDto {
            NAMESPACE_CREATION(String str, int i) {
                super(str, i, "namespace_creation", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientApolloErrorEvent.ErrorType toProto() {
                return ClientApolloErrorEvent.ErrorType.NAMESPACE_CREATION;
            }
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto.ErrorTypeDto.SERVICE_SPINUP", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SERVICE_SPINUP extends ErrorTypeDto {
            SERVICE_SPINUP(String str, int i) {
                super(str, i, "service_spinup", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientApolloErrorEvent.ErrorType toProto() {
                return ClientApolloErrorEvent.ErrorType.SERVICE_SPINUP;
            }
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto.ErrorTypeDto.TEST_DATA_API_RECIPE", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TEST_DATA_API_RECIPE extends ErrorTypeDto {
            TEST_DATA_API_RECIPE(String str, int i) {
                super(str, i, "test_data_api_recipe", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientApolloErrorEvent.ErrorType toProto() {
                return ClientApolloErrorEvent.ErrorType.TEST_DATA_API_RECIPE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ErrorTypeDto, ClientApolloErrorEvent.ErrorType> {

            /* compiled from: ClientApolloErrorEventDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ClientApolloErrorEvent.ErrorType.values().length];
                    try {
                        iArr[ClientApolloErrorEvent.ErrorType.DEFAULT_ERROR_TYPE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ClientApolloErrorEvent.ErrorType.NAMESPACE_CREATION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ClientApolloErrorEvent.ErrorType.SERVICE_SPINUP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ClientApolloErrorEvent.ErrorType.TEST_DATA_API_RECIPE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ClientApolloErrorEvent.ErrorType> getProtoAdapter() {
                return ClientApolloErrorEvent.ErrorType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto getZeroValue() {
                return ErrorTypeDto.DEFAULT_ERROR_TYPE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto fromProto(ClientApolloErrorEvent.ErrorType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ErrorTypeDto.DEFAULT_ERROR_TYPE;
                }
                if (i == 2) {
                    return ErrorTypeDto.NAMESPACE_CREATION;
                }
                if (i == 3) {
                    return ErrorTypeDto.SERVICE_SPINUP;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return ErrorTypeDto.TEST_DATA_API_RECIPE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ErrorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ErrorTypeDto, ClientApolloErrorEvent.ErrorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ClientApolloErrorEvent.ErrorType", ErrorTypeDto.getEntries(), ErrorTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ErrorTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ErrorTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ErrorTypeDto valueOf(String str) {
            return (ErrorTypeDto) Enum.valueOf(ErrorTypeDto.class, str);
        }

        public static ErrorTypeDto[] values() {
            return (ErrorTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientApolloErrorEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "DEFAULT_CONTEXT_TYPE", "RECORD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContextDto implements Dto2<ClientApolloErrorEvent.Context>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContextDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ContextDto DEFAULT_CONTEXT_TYPE = new DEFAULT_CONTEXT_TYPE("DEFAULT_CONTEXT_TYPE", 0);
        public static final ContextDto RECORD = new RECORD("RECORD", 1);
        private static final Lazy<BinaryBase64DtoSerializer<ContextDto, ClientApolloErrorEvent.Context>> binaryBase64Serializer$delegate;
        private final String json_value;

        private static final /* synthetic */ ContextDto[] $values() {
            return new ContextDto[]{DEFAULT_CONTEXT_TYPE, RECORD};
        }

        public /* synthetic */ ContextDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<ContextDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ContextDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto.ContextDto.DEFAULT_CONTEXT_TYPE", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEFAULT_CONTEXT_TYPE extends ContextDto {
            DEFAULT_CONTEXT_TYPE(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientApolloErrorEvent.Context toProto() {
                return ClientApolloErrorEvent.Context.DEFAULT_CONTEXT_TYPE;
            }
        }

        static {
            ContextDto[] contextDtoArr$values = $values();
            $VALUES = contextDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contextDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto$ContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClientApolloErrorEventDto.ContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto.ContextDto.RECORD", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECORD extends ContextDto {
            RECORD(String str, int i) {
                super(str, i, "record", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientApolloErrorEvent.Context toProto() {
                return ClientApolloErrorEvent.Context.RECORD;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ContextDto, ClientApolloErrorEvent.Context> {

            /* compiled from: ClientApolloErrorEventDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ClientApolloErrorEvent.Context.values().length];
                    try {
                        iArr[ClientApolloErrorEvent.Context.DEFAULT_CONTEXT_TYPE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ClientApolloErrorEvent.Context.RECORD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContextDto> getBinaryBase64Serializer() {
                return (KSerializer) ContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ClientApolloErrorEvent.Context> getProtoAdapter() {
                return ClientApolloErrorEvent.Context.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContextDto getZeroValue() {
                return ContextDto.DEFAULT_CONTEXT_TYPE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContextDto fromProto(ClientApolloErrorEvent.Context proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ContextDto.DEFAULT_CONTEXT_TYPE;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return ContextDto.RECORD;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ClientApolloErrorEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$ContextDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ContextDto, ClientApolloErrorEvent.Context> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ClientApolloErrorEvent.Context", ContextDto.getEntries(), ContextDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ContextDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ContextDto valueOf(String str) {
            return (ContextDto) Enum.valueOf(ContextDto.class, str);
        }

        public static ContextDto[] values() {
            return (ContextDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ClientApolloErrorEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientApolloErrorEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientApolloErrorEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientApolloErrorEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientApolloErrorEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientApolloErrorEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientApolloErrorEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto";
        }
    }
}
