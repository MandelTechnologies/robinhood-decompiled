package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContextDto;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContextDto;
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

/* compiled from: MAXTransferAccountSelectionContextDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005!\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Surrogate;)V", "max_transfer_account_selection_state", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "transfer_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;)V", "getMax_transfer_account_selection_state", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "getTransfer_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "MAXTransferAccountSelectionStateDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class MAXTransferAccountSelectionContextDto implements Dto3<MAXTransferAccountSelectionContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MAXTransferAccountSelectionContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MAXTransferAccountSelectionContextDto, MAXTransferAccountSelectionContext>> binaryBase64Serializer$delegate;
    private static final MAXTransferAccountSelectionContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MAXTransferAccountSelectionContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MAXTransferAccountSelectionContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MAXTransferAccountSelectionStateDto getMax_transfer_account_selection_state() {
        return this.surrogate.getMax_transfer_account_selection_state();
    }

    public final MAXTransferContextDto.TransferAccountDto getTransfer_account() {
        return this.surrogate.getTransfer_account();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MAXTransferAccountSelectionContextDto(MAXTransferAccountSelectionStateDto max_transfer_account_selection_state, MAXTransferContextDto.TransferAccountDto transferAccountDto) {
        this(new Surrogate(max_transfer_account_selection_state, transferAccountDto));
        Intrinsics.checkNotNullParameter(max_transfer_account_selection_state, "max_transfer_account_selection_state");
    }

    public /* synthetic */ MAXTransferAccountSelectionContextDto(MAXTransferAccountSelectionStateDto mAXTransferAccountSelectionStateDto, MAXTransferContextDto.TransferAccountDto transferAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MAXTransferAccountSelectionStateDto.INSTANCE.getZeroValue() : mAXTransferAccountSelectionStateDto, (i & 2) != 0 ? null : transferAccountDto);
    }

    public static /* synthetic */ MAXTransferAccountSelectionContextDto copy$default(MAXTransferAccountSelectionContextDto mAXTransferAccountSelectionContextDto, MAXTransferAccountSelectionStateDto mAXTransferAccountSelectionStateDto, MAXTransferContextDto.TransferAccountDto transferAccountDto, int i, Object obj) {
        if ((i & 1) != 0) {
            mAXTransferAccountSelectionStateDto = mAXTransferAccountSelectionContextDto.surrogate.getMax_transfer_account_selection_state();
        }
        if ((i & 2) != 0) {
            transferAccountDto = mAXTransferAccountSelectionContextDto.surrogate.getTransfer_account();
        }
        return mAXTransferAccountSelectionContextDto.copy(mAXTransferAccountSelectionStateDto, transferAccountDto);
    }

    public final MAXTransferAccountSelectionContextDto copy(MAXTransferAccountSelectionStateDto max_transfer_account_selection_state, MAXTransferContextDto.TransferAccountDto transfer_account) {
        Intrinsics.checkNotNullParameter(max_transfer_account_selection_state, "max_transfer_account_selection_state");
        return new MAXTransferAccountSelectionContextDto(new Surrogate(max_transfer_account_selection_state, transfer_account));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MAXTransferAccountSelectionContext toProto() {
        MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState mAXTransferAccountSelectionState = (MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState) this.surrogate.getMax_transfer_account_selection_state().toProto();
        MAXTransferContextDto.TransferAccountDto transfer_account = this.surrogate.getTransfer_account();
        return new MAXTransferAccountSelectionContext(mAXTransferAccountSelectionState, transfer_account != null ? transfer_account.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[MAXTransferAccountSelectionContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MAXTransferAccountSelectionContextDto) && Intrinsics.areEqual(((MAXTransferAccountSelectionContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: MAXTransferAccountSelectionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Surrogate;", "", "max_transfer_account_selection_state", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "transfer_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMax_transfer_account_selection_state$annotations", "()V", "getMax_transfer_account_selection_state", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "getTransfer_account$annotations", "getTransfer_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MAXTransferAccountSelectionStateDto max_transfer_account_selection_state;
        private final MAXTransferContextDto.TransferAccountDto transfer_account;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((MAXTransferAccountSelectionStateDto) null, (MAXTransferContextDto.TransferAccountDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MAXTransferAccountSelectionStateDto mAXTransferAccountSelectionStateDto, MAXTransferContextDto.TransferAccountDto transferAccountDto, int i, Object obj) {
            if ((i & 1) != 0) {
                mAXTransferAccountSelectionStateDto = surrogate.max_transfer_account_selection_state;
            }
            if ((i & 2) != 0) {
                transferAccountDto = surrogate.transfer_account;
            }
            return surrogate.copy(mAXTransferAccountSelectionStateDto, transferAccountDto);
        }

        @SerialName("maxTransferAccountSelectionState")
        @JsonAnnotations2(names = {"max_transfer_account_selection_state"})
        public static /* synthetic */ void getMax_transfer_account_selection_state$annotations() {
        }

        @SerialName("transferAccount")
        @JsonAnnotations2(names = {"transfer_account"})
        public static /* synthetic */ void getTransfer_account$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MAXTransferAccountSelectionStateDto getMax_transfer_account_selection_state() {
            return this.max_transfer_account_selection_state;
        }

        /* renamed from: component2, reason: from getter */
        public final MAXTransferContextDto.TransferAccountDto getTransfer_account() {
            return this.transfer_account;
        }

        public final Surrogate copy(MAXTransferAccountSelectionStateDto max_transfer_account_selection_state, MAXTransferContextDto.TransferAccountDto transfer_account) {
            Intrinsics.checkNotNullParameter(max_transfer_account_selection_state, "max_transfer_account_selection_state");
            return new Surrogate(max_transfer_account_selection_state, transfer_account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.max_transfer_account_selection_state == surrogate.max_transfer_account_selection_state && Intrinsics.areEqual(this.transfer_account, surrogate.transfer_account);
        }

        public int hashCode() {
            int iHashCode = this.max_transfer_account_selection_state.hashCode() * 31;
            MAXTransferContextDto.TransferAccountDto transferAccountDto = this.transfer_account;
            return iHashCode + (transferAccountDto == null ? 0 : transferAccountDto.hashCode());
        }

        public String toString() {
            return "Surrogate(max_transfer_account_selection_state=" + this.max_transfer_account_selection_state + ", transfer_account=" + this.transfer_account + ")";
        }

        /* compiled from: MAXTransferAccountSelectionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MAXTransferAccountSelectionContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MAXTransferAccountSelectionStateDto mAXTransferAccountSelectionStateDto, MAXTransferContextDto.TransferAccountDto transferAccountDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.max_transfer_account_selection_state = (i & 1) == 0 ? MAXTransferAccountSelectionStateDto.INSTANCE.getZeroValue() : mAXTransferAccountSelectionStateDto;
            if ((i & 2) == 0) {
                this.transfer_account = null;
            } else {
                this.transfer_account = transferAccountDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.max_transfer_account_selection_state != MAXTransferAccountSelectionStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MAXTransferAccountSelectionStateDto.Serializer.INSTANCE, self.max_transfer_account_selection_state);
            }
            MAXTransferContextDto.TransferAccountDto transferAccountDto = self.transfer_account;
            if (transferAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MAXTransferContextDto.TransferAccountDto.Serializer.INSTANCE, transferAccountDto);
            }
        }

        public Surrogate(MAXTransferAccountSelectionStateDto max_transfer_account_selection_state, MAXTransferContextDto.TransferAccountDto transferAccountDto) {
            Intrinsics.checkNotNullParameter(max_transfer_account_selection_state, "max_transfer_account_selection_state");
            this.max_transfer_account_selection_state = max_transfer_account_selection_state;
            this.transfer_account = transferAccountDto;
        }

        public final MAXTransferAccountSelectionStateDto getMax_transfer_account_selection_state() {
            return this.max_transfer_account_selection_state;
        }

        public /* synthetic */ Surrogate(MAXTransferAccountSelectionStateDto mAXTransferAccountSelectionStateDto, MAXTransferContextDto.TransferAccountDto transferAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MAXTransferAccountSelectionStateDto.INSTANCE.getZeroValue() : mAXTransferAccountSelectionStateDto, (i & 2) != 0 ? null : transferAccountDto);
        }

        public final MAXTransferContextDto.TransferAccountDto getTransfer_account() {
            return this.transfer_account;
        }
    }

    /* compiled from: MAXTransferAccountSelectionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MAXTransferAccountSelectionContextDto, MAXTransferAccountSelectionContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MAXTransferAccountSelectionContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MAXTransferAccountSelectionContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MAXTransferAccountSelectionContextDto> getBinaryBase64Serializer() {
            return (KSerializer) MAXTransferAccountSelectionContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MAXTransferAccountSelectionContext> getProtoAdapter() {
            return MAXTransferAccountSelectionContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MAXTransferAccountSelectionContextDto getZeroValue() {
            return MAXTransferAccountSelectionContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MAXTransferAccountSelectionContextDto fromProto(MAXTransferAccountSelectionContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MAXTransferAccountSelectionStateDto mAXTransferAccountSelectionStateDtoFromProto = MAXTransferAccountSelectionStateDto.INSTANCE.fromProto(proto.getMax_transfer_account_selection_state());
            MAXTransferContext.TransferAccount transfer_account = proto.getTransfer_account();
            return new MAXTransferAccountSelectionContextDto(new Surrogate(mAXTransferAccountSelectionStateDtoFromProto, transfer_account != null ? MAXTransferContextDto.TransferAccountDto.INSTANCE.fromProto(transfer_account) : null), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MAXTransferAccountSelectionContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MAXTransferAccountSelectionContextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MAXTransferAccountSelectionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED", "SOURCE", "SINK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MAXTransferAccountSelectionStateDto implements Dto2<MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MAXTransferAccountSelectionStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MAXTransferAccountSelectionStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MAXTransferAccountSelectionStateDto, MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState>> binaryBase64Serializer$delegate;
        public static final MAXTransferAccountSelectionStateDto MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED = new MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED("MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED", 0);
        public static final MAXTransferAccountSelectionStateDto SOURCE = new SOURCE("SOURCE", 1);
        public static final MAXTransferAccountSelectionStateDto SINK = new SINK("SINK", 2);

        private static final /* synthetic */ MAXTransferAccountSelectionStateDto[] $values() {
            return new MAXTransferAccountSelectionStateDto[]{MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED, SOURCE, SINK};
        }

        public /* synthetic */ MAXTransferAccountSelectionStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<MAXTransferAccountSelectionStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MAXTransferAccountSelectionStateDto(String str, int i) {
        }

        /* compiled from: MAXTransferAccountSelectionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto.MAXTransferAccountSelectionStateDto.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED extends MAXTransferAccountSelectionStateDto {
            MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState toProto() {
                return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED;
            }
        }

        static {
            MAXTransferAccountSelectionStateDto[] mAXTransferAccountSelectionStateDtoArr$values = $values();
            $VALUES = mAXTransferAccountSelectionStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(mAXTransferAccountSelectionStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferAccountSelectionContextDto.MAXTransferAccountSelectionStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: MAXTransferAccountSelectionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto.MAXTransferAccountSelectionStateDto.SOURCE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE extends MAXTransferAccountSelectionStateDto {
            SOURCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState toProto() {
                return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SOURCE;
            }
        }

        /* compiled from: MAXTransferAccountSelectionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto.MAXTransferAccountSelectionStateDto.SINK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SINK extends MAXTransferAccountSelectionStateDto {
            SINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState toProto() {
                return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SINK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: MAXTransferAccountSelectionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MAXTransferAccountSelectionStateDto, MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState> {

            /* compiled from: MAXTransferAccountSelectionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.values().length];
                    try {
                        iArr[MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SOURCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SINK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MAXTransferAccountSelectionStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MAXTransferAccountSelectionStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MAXTransferAccountSelectionStateDto> getBinaryBase64Serializer() {
                return (KSerializer) MAXTransferAccountSelectionStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState> getProtoAdapter() {
                return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MAXTransferAccountSelectionStateDto getZeroValue() {
                return MAXTransferAccountSelectionStateDto.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MAXTransferAccountSelectionStateDto fromProto(MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return MAXTransferAccountSelectionStateDto.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return MAXTransferAccountSelectionStateDto.SOURCE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return MAXTransferAccountSelectionStateDto.SINK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferAccountSelectionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MAXTransferAccountSelectionStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<MAXTransferAccountSelectionStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MAXTransferAccountSelectionStateDto, MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState", MAXTransferAccountSelectionStateDto.getEntries(), MAXTransferAccountSelectionStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public MAXTransferAccountSelectionStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (MAXTransferAccountSelectionStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MAXTransferAccountSelectionStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static MAXTransferAccountSelectionStateDto valueOf(String str) {
            return (MAXTransferAccountSelectionStateDto) Enum.valueOf(MAXTransferAccountSelectionStateDto.class, str);
        }

        public static MAXTransferAccountSelectionStateDto[] values() {
            return (MAXTransferAccountSelectionStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: MAXTransferAccountSelectionContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<MAXTransferAccountSelectionContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferAccountSelectionContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MAXTransferAccountSelectionContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MAXTransferAccountSelectionContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MAXTransferAccountSelectionContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: MAXTransferAccountSelectionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContextDto";
        }
    }
}
