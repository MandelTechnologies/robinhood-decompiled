package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto;
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

/* compiled from: TwilioConversationsSdkEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007%&'()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Surrogate;)V", "client_sdk_status", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "conversation_sync_status", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "action", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "(Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;)V", "getClient_sdk_status", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "getConversation_sync_status", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ConnectionStateDto", "ConversationSyncStatusDto", "ActionDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class TwilioConversationsSdkEventDataDto implements Dto3<TwilioConversationsSdkEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TwilioConversationsSdkEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TwilioConversationsSdkEventDataDto, TwilioConversationsSdkEventData>> binaryBase64Serializer$delegate;
    private static final TwilioConversationsSdkEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TwilioConversationsSdkEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TwilioConversationsSdkEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ConnectionStateDto getClient_sdk_status() {
        return this.surrogate.getClient_sdk_status();
    }

    public final ConversationSyncStatusDto getConversation_sync_status() {
        return this.surrogate.getConversation_sync_status();
    }

    public final ActionDto getAction() {
        return this.surrogate.getAction();
    }

    public /* synthetic */ TwilioConversationsSdkEventDataDto(ConnectionStateDto connectionStateDto, ConversationSyncStatusDto conversationSyncStatusDto, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConnectionStateDto.INSTANCE.getZeroValue() : connectionStateDto, (i & 2) != 0 ? ConversationSyncStatusDto.INSTANCE.getZeroValue() : conversationSyncStatusDto, (i & 4) != 0 ? ActionDto.INSTANCE.getZeroValue() : actionDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwilioConversationsSdkEventDataDto(ConnectionStateDto client_sdk_status, ConversationSyncStatusDto conversation_sync_status, ActionDto action) {
        this(new Surrogate(client_sdk_status, conversation_sync_status, action));
        Intrinsics.checkNotNullParameter(client_sdk_status, "client_sdk_status");
        Intrinsics.checkNotNullParameter(conversation_sync_status, "conversation_sync_status");
        Intrinsics.checkNotNullParameter(action, "action");
    }

    public static /* synthetic */ TwilioConversationsSdkEventDataDto copy$default(TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, ConnectionStateDto connectionStateDto, ConversationSyncStatusDto conversationSyncStatusDto, ActionDto actionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionStateDto = twilioConversationsSdkEventDataDto.surrogate.getClient_sdk_status();
        }
        if ((i & 2) != 0) {
            conversationSyncStatusDto = twilioConversationsSdkEventDataDto.surrogate.getConversation_sync_status();
        }
        if ((i & 4) != 0) {
            actionDto = twilioConversationsSdkEventDataDto.surrogate.getAction();
        }
        return twilioConversationsSdkEventDataDto.copy(connectionStateDto, conversationSyncStatusDto, actionDto);
    }

    public final TwilioConversationsSdkEventDataDto copy(ConnectionStateDto client_sdk_status, ConversationSyncStatusDto conversation_sync_status, ActionDto action) {
        Intrinsics.checkNotNullParameter(client_sdk_status, "client_sdk_status");
        Intrinsics.checkNotNullParameter(conversation_sync_status, "conversation_sync_status");
        Intrinsics.checkNotNullParameter(action, "action");
        return new TwilioConversationsSdkEventDataDto(new Surrogate(client_sdk_status, conversation_sync_status, action));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TwilioConversationsSdkEventData toProto() {
        return new TwilioConversationsSdkEventData((TwilioConversationsSdkEventData.ConnectionState) this.surrogate.getClient_sdk_status().toProto(), (TwilioConversationsSdkEventData.ConversationSyncStatus) this.surrogate.getConversation_sync_status().toProto(), (TwilioConversationsSdkEventData.Action) this.surrogate.getAction().toProto(), null, 8, null);
    }

    public String toString() {
        return "[TwilioConversationsSdkEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TwilioConversationsSdkEventDataDto) && Intrinsics.areEqual(((TwilioConversationsSdkEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: TwilioConversationsSdkEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Surrogate;", "", "client_sdk_status", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "conversation_sync_status", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "action", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getClient_sdk_status$annotations", "()V", "getClient_sdk_status", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "getConversation_sync_status$annotations", "getConversation_sync_status", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "getAction$annotations", "getAction", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final ConnectionStateDto client_sdk_status;
        private final ConversationSyncStatusDto conversation_sync_status;

        public Surrogate() {
            this((ConnectionStateDto) null, (ConversationSyncStatusDto) null, (ActionDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ConnectionStateDto connectionStateDto, ConversationSyncStatusDto conversationSyncStatusDto, ActionDto actionDto, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionStateDto = surrogate.client_sdk_status;
            }
            if ((i & 2) != 0) {
                conversationSyncStatusDto = surrogate.conversation_sync_status;
            }
            if ((i & 4) != 0) {
                actionDto = surrogate.action;
            }
            return surrogate.copy(connectionStateDto, conversationSyncStatusDto, actionDto);
        }

        @SerialName("action")
        @JsonAnnotations2(names = {"action"})
        public static /* synthetic */ void getAction$annotations() {
        }

        @SerialName("clientSdkStatus")
        @JsonAnnotations2(names = {"client_sdk_status"})
        public static /* synthetic */ void getClient_sdk_status$annotations() {
        }

        @SerialName("conversationSyncStatus")
        @JsonAnnotations2(names = {"conversation_sync_status"})
        public static /* synthetic */ void getConversation_sync_status$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ConnectionStateDto getClient_sdk_status() {
            return this.client_sdk_status;
        }

        /* renamed from: component2, reason: from getter */
        public final ConversationSyncStatusDto getConversation_sync_status() {
            return this.conversation_sync_status;
        }

        /* renamed from: component3, reason: from getter */
        public final ActionDto getAction() {
            return this.action;
        }

        public final Surrogate copy(ConnectionStateDto client_sdk_status, ConversationSyncStatusDto conversation_sync_status, ActionDto action) {
            Intrinsics.checkNotNullParameter(client_sdk_status, "client_sdk_status");
            Intrinsics.checkNotNullParameter(conversation_sync_status, "conversation_sync_status");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Surrogate(client_sdk_status, conversation_sync_status, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.client_sdk_status == surrogate.client_sdk_status && this.conversation_sync_status == surrogate.conversation_sync_status && this.action == surrogate.action;
        }

        public int hashCode() {
            return (((this.client_sdk_status.hashCode() * 31) + this.conversation_sync_status.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "Surrogate(client_sdk_status=" + this.client_sdk_status + ", conversation_sync_status=" + this.conversation_sync_status + ", action=" + this.action + ")";
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TwilioConversationsSdkEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ConnectionStateDto connectionStateDto, ConversationSyncStatusDto conversationSyncStatusDto, ActionDto actionDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.client_sdk_status = (i & 1) == 0 ? ConnectionStateDto.INSTANCE.getZeroValue() : connectionStateDto;
            if ((i & 2) == 0) {
                this.conversation_sync_status = ConversationSyncStatusDto.INSTANCE.getZeroValue();
            } else {
                this.conversation_sync_status = conversationSyncStatusDto;
            }
            if ((i & 4) == 0) {
                this.action = ActionDto.INSTANCE.getZeroValue();
            } else {
                this.action = actionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.client_sdk_status != ConnectionStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ConnectionStateDto.Serializer.INSTANCE, self.client_sdk_status);
            }
            if (self.conversation_sync_status != ConversationSyncStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ConversationSyncStatusDto.Serializer.INSTANCE, self.conversation_sync_status);
            }
            if (self.action != ActionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ActionDto.Serializer.INSTANCE, self.action);
            }
        }

        public Surrogate(ConnectionStateDto client_sdk_status, ConversationSyncStatusDto conversation_sync_status, ActionDto action) {
            Intrinsics.checkNotNullParameter(client_sdk_status, "client_sdk_status");
            Intrinsics.checkNotNullParameter(conversation_sync_status, "conversation_sync_status");
            Intrinsics.checkNotNullParameter(action, "action");
            this.client_sdk_status = client_sdk_status;
            this.conversation_sync_status = conversation_sync_status;
            this.action = action;
        }

        public final ConnectionStateDto getClient_sdk_status() {
            return this.client_sdk_status;
        }

        public /* synthetic */ Surrogate(ConnectionStateDto connectionStateDto, ConversationSyncStatusDto conversationSyncStatusDto, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ConnectionStateDto.INSTANCE.getZeroValue() : connectionStateDto, (i & 2) != 0 ? ConversationSyncStatusDto.INSTANCE.getZeroValue() : conversationSyncStatusDto, (i & 4) != 0 ? ActionDto.INSTANCE.getZeroValue() : actionDto);
        }

        public final ConversationSyncStatusDto getConversation_sync_status() {
            return this.conversation_sync_status;
        }

        public final ActionDto getAction() {
            return this.action;
        }
    }

    /* compiled from: TwilioConversationsSdkEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TwilioConversationsSdkEventDataDto, TwilioConversationsSdkEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TwilioConversationsSdkEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TwilioConversationsSdkEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TwilioConversationsSdkEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) TwilioConversationsSdkEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TwilioConversationsSdkEventData> getProtoAdapter() {
            return TwilioConversationsSdkEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TwilioConversationsSdkEventDataDto getZeroValue() {
            return TwilioConversationsSdkEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TwilioConversationsSdkEventDataDto fromProto(TwilioConversationsSdkEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TwilioConversationsSdkEventDataDto(new Surrogate(ConnectionStateDto.INSTANCE.fromProto(proto.getClient_sdk_status()), ConversationSyncStatusDto.INSTANCE.fromProto(proto.getConversation_sync_status()), ActionDto.INSTANCE.fromProto(proto.getAction())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwilioConversationsSdkEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TwilioConversationsSdkEventDataDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilioConversationsSdkEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTION_STATE_UNSPECIFIED", "CONNECTING", "CONNECTED", "DISCONNECTED", "DENIED", "ERROR", "FATAL_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ConnectionStateDto implements Dto2<TwilioConversationsSdkEventData.ConnectionState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConnectionStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ConnectionStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ConnectionStateDto, TwilioConversationsSdkEventData.ConnectionState>> binaryBase64Serializer$delegate;
        public static final ConnectionStateDto CONNECTION_STATE_UNSPECIFIED = new CONNECTION_STATE_UNSPECIFIED("CONNECTION_STATE_UNSPECIFIED", 0);
        public static final ConnectionStateDto CONNECTING = new CONNECTING("CONNECTING", 1);
        public static final ConnectionStateDto CONNECTED = new CONNECTED("CONNECTED", 2);
        public static final ConnectionStateDto DISCONNECTED = new DISCONNECTED("DISCONNECTED", 3);
        public static final ConnectionStateDto DENIED = new DENIED("DENIED", 4);
        public static final ConnectionStateDto ERROR = new ERROR("ERROR", 5);
        public static final ConnectionStateDto FATAL_ERROR = new FATAL_ERROR("FATAL_ERROR", 6);

        private static final /* synthetic */ ConnectionStateDto[] $values() {
            return new ConnectionStateDto[]{CONNECTION_STATE_UNSPECIFIED, CONNECTING, CONNECTED, DISCONNECTED, DENIED, ERROR, FATAL_ERROR};
        }

        public /* synthetic */ ConnectionStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ConnectionStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ConnectionStateDto(String str, int i) {
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConnectionStateDto.CONNECTION_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTION_STATE_UNSPECIFIED extends ConnectionStateDto {
            CONNECTION_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConnectionState toProto() {
                return TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED;
            }
        }

        static {
            ConnectionStateDto[] connectionStateDtoArr$values = $values();
            $VALUES = connectionStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(connectionStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto$ConnectionStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TwilioConversationsSdkEventDataDto.ConnectionStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConnectionStateDto.CONNECTING", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTING extends ConnectionStateDto {
            CONNECTING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConnectionState toProto() {
                return TwilioConversationsSdkEventData.ConnectionState.CONNECTING;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConnectionStateDto.CONNECTED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTED extends ConnectionStateDto {
            CONNECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConnectionState toProto() {
                return TwilioConversationsSdkEventData.ConnectionState.CONNECTED;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConnectionStateDto.DISCONNECTED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISCONNECTED extends ConnectionStateDto {
            DISCONNECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConnectionState toProto() {
                return TwilioConversationsSdkEventData.ConnectionState.DISCONNECTED;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConnectionStateDto.DENIED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DENIED extends ConnectionStateDto {
            DENIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConnectionState toProto() {
                return TwilioConversationsSdkEventData.ConnectionState.DENIED;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConnectionStateDto.ERROR", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR extends ConnectionStateDto {
            ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConnectionState toProto() {
                return TwilioConversationsSdkEventData.ConnectionState.ERROR;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConnectionStateDto.FATAL_ERROR", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FATAL_ERROR extends ConnectionStateDto {
            FATAL_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConnectionState toProto() {
                return TwilioConversationsSdkEventData.ConnectionState.FATAL_ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ConnectionStateDto, TwilioConversationsSdkEventData.ConnectionState> {

            /* compiled from: TwilioConversationsSdkEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TwilioConversationsSdkEventData.ConnectionState.values().length];
                    try {
                        iArr[TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConnectionState.CONNECTING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConnectionState.CONNECTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConnectionState.DISCONNECTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConnectionState.DENIED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConnectionState.ERROR.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConnectionState.FATAL_ERROR.ordinal()] = 7;
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

            public final KSerializer<ConnectionStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ConnectionStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ConnectionStateDto> getBinaryBase64Serializer() {
                return (KSerializer) ConnectionStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TwilioConversationsSdkEventData.ConnectionState> getProtoAdapter() {
                return TwilioConversationsSdkEventData.ConnectionState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConnectionStateDto getZeroValue() {
                return ConnectionStateDto.CONNECTION_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConnectionStateDto fromProto(TwilioConversationsSdkEventData.ConnectionState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ConnectionStateDto.CONNECTION_STATE_UNSPECIFIED;
                    case 2:
                        return ConnectionStateDto.CONNECTING;
                    case 3:
                        return ConnectionStateDto.CONNECTED;
                    case 4:
                        return ConnectionStateDto.DISCONNECTED;
                    case 5:
                        return ConnectionStateDto.DENIED;
                    case 6:
                        return ConnectionStateDto.ERROR;
                    case 7:
                        return ConnectionStateDto.FATAL_ERROR;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConnectionStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ConnectionStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ConnectionStateDto, TwilioConversationsSdkEventData.ConnectionState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TwilioConversationsSdkEventData.ConnectionState", ConnectionStateDto.getEntries(), ConnectionStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ConnectionStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ConnectionStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ConnectionStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ConnectionStateDto valueOf(String str) {
            return (ConnectionStateDto) Enum.valueOf(ConnectionStateDto.class, str);
        }

        public static ConnectionStateDto[] values() {
            return (ConnectionStateDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilioConversationsSdkEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONVERSATION_SYNC_STATUS_UNSPECIFIED", "NONE", "IDENTIFIER", "METADATA", DisplaySpans.ALL, "FAILED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ConversationSyncStatusDto implements Dto2<TwilioConversationsSdkEventData.ConversationSyncStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConversationSyncStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ConversationSyncStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ConversationSyncStatusDto, TwilioConversationsSdkEventData.ConversationSyncStatus>> binaryBase64Serializer$delegate;
        public static final ConversationSyncStatusDto CONVERSATION_SYNC_STATUS_UNSPECIFIED = new CONVERSATION_SYNC_STATUS_UNSPECIFIED("CONVERSATION_SYNC_STATUS_UNSPECIFIED", 0);
        public static final ConversationSyncStatusDto NONE = new NONE("NONE", 1);
        public static final ConversationSyncStatusDto IDENTIFIER = new IDENTIFIER("IDENTIFIER", 2);
        public static final ConversationSyncStatusDto METADATA = new METADATA("METADATA", 3);
        public static final ConversationSyncStatusDto ALL = new ALL(DisplaySpans.ALL, 4);
        public static final ConversationSyncStatusDto FAILED = new FAILED("FAILED", 5);

        private static final /* synthetic */ ConversationSyncStatusDto[] $values() {
            return new ConversationSyncStatusDto[]{CONVERSATION_SYNC_STATUS_UNSPECIFIED, NONE, IDENTIFIER, METADATA, ALL, FAILED};
        }

        public /* synthetic */ ConversationSyncStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ConversationSyncStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ConversationSyncStatusDto(String str, int i) {
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConversationSyncStatusDto.CONVERSATION_SYNC_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONVERSATION_SYNC_STATUS_UNSPECIFIED extends ConversationSyncStatusDto {
            CONVERSATION_SYNC_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConversationSyncStatus toProto() {
                return TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED;
            }
        }

        static {
            ConversationSyncStatusDto[] conversationSyncStatusDtoArr$values = $values();
            $VALUES = conversationSyncStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(conversationSyncStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TwilioConversationsSdkEventDataDto.ConversationSyncStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConversationSyncStatusDto.NONE", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NONE extends ConversationSyncStatusDto {
            NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConversationSyncStatus toProto() {
                return TwilioConversationsSdkEventData.ConversationSyncStatus.NONE;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConversationSyncStatusDto.IDENTIFIER", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IDENTIFIER extends ConversationSyncStatusDto {
            IDENTIFIER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConversationSyncStatus toProto() {
                return TwilioConversationsSdkEventData.ConversationSyncStatus.IDENTIFIER;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConversationSyncStatusDto.METADATA", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class METADATA extends ConversationSyncStatusDto {
            METADATA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConversationSyncStatus toProto() {
                return TwilioConversationsSdkEventData.ConversationSyncStatus.METADATA;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConversationSyncStatusDto.ALL", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALL extends ConversationSyncStatusDto {
            ALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConversationSyncStatus toProto() {
                return TwilioConversationsSdkEventData.ConversationSyncStatus.ALL;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ConversationSyncStatusDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends ConversationSyncStatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.ConversationSyncStatus toProto() {
                return TwilioConversationsSdkEventData.ConversationSyncStatus.FAILED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ConversationSyncStatusDto, TwilioConversationsSdkEventData.ConversationSyncStatus> {

            /* compiled from: TwilioConversationsSdkEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TwilioConversationsSdkEventData.ConversationSyncStatus.values().length];
                    try {
                        iArr[TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConversationSyncStatus.NONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConversationSyncStatus.IDENTIFIER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConversationSyncStatus.METADATA.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConversationSyncStatus.ALL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.ConversationSyncStatus.FAILED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ConversationSyncStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ConversationSyncStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ConversationSyncStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) ConversationSyncStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TwilioConversationsSdkEventData.ConversationSyncStatus> getProtoAdapter() {
                return TwilioConversationsSdkEventData.ConversationSyncStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConversationSyncStatusDto getZeroValue() {
                return ConversationSyncStatusDto.CONVERSATION_SYNC_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConversationSyncStatusDto fromProto(TwilioConversationsSdkEventData.ConversationSyncStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ConversationSyncStatusDto.CONVERSATION_SYNC_STATUS_UNSPECIFIED;
                    case 2:
                        return ConversationSyncStatusDto.NONE;
                    case 3:
                        return ConversationSyncStatusDto.IDENTIFIER;
                    case 4:
                        return ConversationSyncStatusDto.METADATA;
                    case 5:
                        return ConversationSyncStatusDto.ALL;
                    case 6:
                        return ConversationSyncStatusDto.FAILED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ConversationSyncStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ConversationSyncStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ConversationSyncStatusDto, TwilioConversationsSdkEventData.ConversationSyncStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TwilioConversationsSdkEventData.ConversationSyncStatus", ConversationSyncStatusDto.getEntries(), ConversationSyncStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ConversationSyncStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ConversationSyncStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ConversationSyncStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ConversationSyncStatusDto valueOf(String str) {
            return (ConversationSyncStatusDto) Enum.valueOf(ConversationSyncStatusDto.class, str);
        }

        public static ConversationSyncStatusDto[] values() {
            return (ConversationSyncStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilioConversationsSdkEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_UNSPECIFIED", "INITIALIZED", "INITIALIZATION_FAILED", "SHUTDOWN", "LOAD_CONVERSATION", "CONNECTION_STATUS_CHANGE", "CONVERSATION_SYNC_STATUS_CHANGE", "TOKEN_EXPIRED", "TOKEN_ABOUT_TO_EXPIRE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ActionDto implements Dto2<TwilioConversationsSdkEventData.Action>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ActionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ActionDto, TwilioConversationsSdkEventData.Action>> binaryBase64Serializer$delegate;
        public static final ActionDto ACTION_UNSPECIFIED = new ACTION_UNSPECIFIED("ACTION_UNSPECIFIED", 0);
        public static final ActionDto INITIALIZED = new INITIALIZED("INITIALIZED", 1);
        public static final ActionDto INITIALIZATION_FAILED = new INITIALIZATION_FAILED("INITIALIZATION_FAILED", 2);
        public static final ActionDto SHUTDOWN = new SHUTDOWN("SHUTDOWN", 3);
        public static final ActionDto LOAD_CONVERSATION = new LOAD_CONVERSATION("LOAD_CONVERSATION", 4);
        public static final ActionDto CONNECTION_STATUS_CHANGE = new CONNECTION_STATUS_CHANGE("CONNECTION_STATUS_CHANGE", 5);
        public static final ActionDto CONVERSATION_SYNC_STATUS_CHANGE = new CONVERSATION_SYNC_STATUS_CHANGE("CONVERSATION_SYNC_STATUS_CHANGE", 6);
        public static final ActionDto TOKEN_EXPIRED = new TOKEN_EXPIRED("TOKEN_EXPIRED", 7);
        public static final ActionDto TOKEN_ABOUT_TO_EXPIRE = new TOKEN_ABOUT_TO_EXPIRE("TOKEN_ABOUT_TO_EXPIRE", 8);

        private static final /* synthetic */ ActionDto[] $values() {
            return new ActionDto[]{ACTION_UNSPECIFIED, INITIALIZED, INITIALIZATION_FAILED, SHUTDOWN, LOAD_CONVERSATION, CONNECTION_STATUS_CHANGE, CONVERSATION_SYNC_STATUS_CHANGE, TOKEN_EXPIRED, TOKEN_ABOUT_TO_EXPIRE};
        }

        public /* synthetic */ ActionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ActionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.ACTION_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACTION_UNSPECIFIED extends ActionDto {
            ACTION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.ACTION_UNSPECIFIED;
            }
        }

        private ActionDto(String str, int i) {
        }

        static {
            ActionDto[] actionDtoArr$values = $values();
            $VALUES = actionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto$ActionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TwilioConversationsSdkEventDataDto.ActionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.INITIALIZED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INITIALIZED extends ActionDto {
            INITIALIZED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.INITIALIZED;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.INITIALIZATION_FAILED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INITIALIZATION_FAILED extends ActionDto {
            INITIALIZATION_FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.INITIALIZATION_FAILED;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.SHUTDOWN", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHUTDOWN extends ActionDto {
            SHUTDOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.SHUTDOWN;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.LOAD_CONVERSATION", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOAD_CONVERSATION extends ActionDto {
            LOAD_CONVERSATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.LOAD_CONVERSATION;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.CONNECTION_STATUS_CHANGE", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTION_STATUS_CHANGE extends ActionDto {
            CONNECTION_STATUS_CHANGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.CONNECTION_STATUS_CHANGE;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.CONVERSATION_SYNC_STATUS_CHANGE", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONVERSATION_SYNC_STATUS_CHANGE extends ActionDto {
            CONVERSATION_SYNC_STATUS_CHANGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.CONVERSATION_SYNC_STATUS_CHANGE;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.TOKEN_EXPIRED", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKEN_EXPIRED extends ActionDto {
            TOKEN_EXPIRED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.TOKEN_EXPIRED;
            }
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto.ActionDto.TOKEN_ABOUT_TO_EXPIRE", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKEN_ABOUT_TO_EXPIRE extends ActionDto {
            TOKEN_ABOUT_TO_EXPIRE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TwilioConversationsSdkEventData.Action toProto() {
                return TwilioConversationsSdkEventData.Action.TOKEN_ABOUT_TO_EXPIRE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ActionDto, TwilioConversationsSdkEventData.Action> {

            /* compiled from: TwilioConversationsSdkEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TwilioConversationsSdkEventData.Action.values().length];
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.ACTION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.INITIALIZED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.INITIALIZATION_FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.SHUTDOWN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.LOAD_CONVERSATION.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.CONNECTION_STATUS_CHANGE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.CONVERSATION_SYNC_STATUS_CHANGE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.TOKEN_EXPIRED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[TwilioConversationsSdkEventData.Action.TOKEN_ABOUT_TO_EXPIRE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ActionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ActionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ActionDto> getBinaryBase64Serializer() {
                return (KSerializer) ActionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TwilioConversationsSdkEventData.Action> getProtoAdapter() {
                return TwilioConversationsSdkEventData.Action.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ActionDto getZeroValue() {
                return ActionDto.ACTION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ActionDto fromProto(TwilioConversationsSdkEventData.Action proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ActionDto.ACTION_UNSPECIFIED;
                    case 2:
                        return ActionDto.INITIALIZED;
                    case 3:
                        return ActionDto.INITIALIZATION_FAILED;
                    case 4:
                        return ActionDto.SHUTDOWN;
                    case 5:
                        return ActionDto.LOAD_CONVERSATION;
                    case 6:
                        return ActionDto.CONNECTION_STATUS_CHANGE;
                    case 7:
                        return ActionDto.CONVERSATION_SYNC_STATUS_CHANGE;
                    case 8:
                        return ActionDto.TOKEN_EXPIRED;
                    case 9:
                        return ActionDto.TOKEN_ABOUT_TO_EXPIRE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TwilioConversationsSdkEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$ActionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ActionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ActionDto, TwilioConversationsSdkEventData.Action> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TwilioConversationsSdkEventData.Action", ActionDto.getEntries(), ActionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ActionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ActionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ActionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ActionDto valueOf(String str) {
            return (ActionDto) Enum.valueOf(ActionDto.class, str);
        }

        public static ActionDto[] values() {
            return (ActionDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TwilioConversationsSdkEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TwilioConversationsSdkEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.TwilioConversationsSdkEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TwilioConversationsSdkEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TwilioConversationsSdkEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TwilioConversationsSdkEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TwilioConversationsSdkEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto";
        }
    }
}
