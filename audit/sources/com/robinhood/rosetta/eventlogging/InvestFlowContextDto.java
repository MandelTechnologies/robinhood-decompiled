package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.rosetta.eventlogging.InvestFlowContextDto;
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

/* compiled from: InvestFlowContextDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007*+,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Surrogate;)V", "allocation", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "status", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "", "source", "(Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;Ljava/lang/String;Ljava/lang/String;)V", "getAllocation", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "getAccount_type", "()Ljava/lang/String;", "getSource", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "AllocationDto", "OrderStatusDto", "EntryPointDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class InvestFlowContextDto implements Dto3<InvestFlowContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestFlowContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestFlowContextDto, InvestFlowContext>> binaryBase64Serializer$delegate;
    private static final InvestFlowContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestFlowContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestFlowContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AllocationDto getAllocation() {
        return this.surrogate.getAllocation();
    }

    public final OrderStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final String getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestFlowContextDto(com.robinhood.rosetta.eventlogging.InvestFlowContextDto.AllocationDto r2, com.robinhood.rosetta.eventlogging.InvestFlowContextDto.OrderStatusDto r3, com.robinhood.rosetta.eventlogging.InvestFlowContextDto.EntryPointDto r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto La
            com.robinhood.rosetta.eventlogging.InvestFlowContextDto$AllocationDto$Companion r2 = com.robinhood.rosetta.eventlogging.InvestFlowContextDto.AllocationDto.INSTANCE
            com.robinhood.rosetta.eventlogging.InvestFlowContextDto$AllocationDto r2 = r2.getZeroValue()
        La:
            r8 = r7 & 2
            if (r8 == 0) goto L14
            com.robinhood.rosetta.eventlogging.InvestFlowContextDto$OrderStatusDto$Companion r3 = com.robinhood.rosetta.eventlogging.InvestFlowContextDto.OrderStatusDto.INSTANCE
            com.robinhood.rosetta.eventlogging.InvestFlowContextDto$OrderStatusDto r3 = r3.getZeroValue()
        L14:
            r8 = r7 & 4
            if (r8 == 0) goto L1e
            com.robinhood.rosetta.eventlogging.InvestFlowContextDto$EntryPointDto$Companion r4 = com.robinhood.rosetta.eventlogging.InvestFlowContextDto.EntryPointDto.INSTANCE
            com.robinhood.rosetta.eventlogging.InvestFlowContextDto$EntryPointDto r4 = r4.getZeroValue()
        L1e:
            r8 = r7 & 8
            java.lang.String r0 = ""
            if (r8 == 0) goto L25
            r5 = r0
        L25:
            r7 = r7 & 16
            if (r7 == 0) goto L30
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L36
        L30:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L36:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.InvestFlowContextDto.<init>(com.robinhood.rosetta.eventlogging.InvestFlowContextDto$AllocationDto, com.robinhood.rosetta.eventlogging.InvestFlowContextDto$OrderStatusDto, com.robinhood.rosetta.eventlogging.InvestFlowContextDto$EntryPointDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestFlowContextDto(AllocationDto allocation, OrderStatusDto status, EntryPointDto entry_point, String account_type, String source) {
        this(new Surrogate(allocation, status, entry_point, account_type, source));
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public static /* synthetic */ InvestFlowContextDto copy$default(InvestFlowContextDto investFlowContextDto, AllocationDto allocationDto, OrderStatusDto orderStatusDto, EntryPointDto entryPointDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            allocationDto = investFlowContextDto.surrogate.getAllocation();
        }
        if ((i & 2) != 0) {
            orderStatusDto = investFlowContextDto.surrogate.getStatus();
        }
        if ((i & 4) != 0) {
            entryPointDto = investFlowContextDto.surrogate.getEntry_point();
        }
        if ((i & 8) != 0) {
            str = investFlowContextDto.surrogate.getAccount_type();
        }
        if ((i & 16) != 0) {
            str2 = investFlowContextDto.surrogate.getSource();
        }
        String str3 = str2;
        EntryPointDto entryPointDto2 = entryPointDto;
        return investFlowContextDto.copy(allocationDto, orderStatusDto, entryPointDto2, str, str3);
    }

    public final InvestFlowContextDto copy(AllocationDto allocation, OrderStatusDto status, EntryPointDto entry_point, String account_type, String source) {
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(source, "source");
        return new InvestFlowContextDto(new Surrogate(allocation, status, entry_point, account_type, source));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InvestFlowContext toProto() {
        return new InvestFlowContext((InvestFlowContext.Allocation) this.surrogate.getAllocation().toProto(), (InvestFlowContext.OrderStatus) this.surrogate.getStatus().toProto(), (InvestFlowContext.EntryPoint) this.surrogate.getEntry_point().toProto(), this.surrogate.getAccount_type(), this.surrogate.getSource(), null, 32, null);
    }

    public String toString() {
        return "[InvestFlowContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestFlowContextDto) && Intrinsics.areEqual(((InvestFlowContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestFlowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J;\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u001e¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Surrogate;", "", "allocation", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "status", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "", "source", "<init>", "(Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAllocation$annotations", "()V", "getAllocation", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "getStatus$annotations", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "getEntry_point$annotations", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "getAccount_type$annotations", "getAccount_type", "()Ljava/lang/String;", "getSource$annotations", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_type;
        private final AllocationDto allocation;
        private final EntryPointDto entry_point;
        private final String source;
        private final OrderStatusDto status;

        public Surrogate() {
            this((AllocationDto) null, (OrderStatusDto) null, (EntryPointDto) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, AllocationDto allocationDto, OrderStatusDto orderStatusDto, EntryPointDto entryPointDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                allocationDto = surrogate.allocation;
            }
            if ((i & 2) != 0) {
                orderStatusDto = surrogate.status;
            }
            if ((i & 4) != 0) {
                entryPointDto = surrogate.entry_point;
            }
            if ((i & 8) != 0) {
                str = surrogate.account_type;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.source;
            }
            String str3 = str2;
            EntryPointDto entryPointDto2 = entryPointDto;
            return surrogate.copy(allocationDto, orderStatusDto, entryPointDto2, str, str3);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("allocation")
        @JsonAnnotations2(names = {"allocation"})
        public static /* synthetic */ void getAllocation$annotations() {
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final AllocationDto getAllocation() {
            return this.allocation;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Surrogate copy(AllocationDto allocation, OrderStatusDto status, EntryPointDto entry_point, String account_type, String source) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Surrogate(allocation, status, entry_point, account_type, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.allocation == surrogate.allocation && this.status == surrogate.status && this.entry_point == surrogate.entry_point && Intrinsics.areEqual(this.account_type, surrogate.account_type) && Intrinsics.areEqual(this.source, surrogate.source);
        }

        public int hashCode() {
            return (((((((this.allocation.hashCode() * 31) + this.status.hashCode()) * 31) + this.entry_point.hashCode()) * 31) + this.account_type.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Surrogate(allocation=" + this.allocation + ", status=" + this.status + ", entry_point=" + this.entry_point + ", account_type=" + this.account_type + ", source=" + this.source + ")";
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestFlowContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AllocationDto allocationDto, OrderStatusDto orderStatusDto, EntryPointDto entryPointDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.allocation = (i & 1) == 0 ? AllocationDto.INSTANCE.getZeroValue() : allocationDto;
            if ((i & 2) == 0) {
                this.status = OrderStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = orderStatusDto;
            }
            if ((i & 4) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
            if ((i & 8) == 0) {
                this.account_type = "";
            } else {
                this.account_type = str;
            }
            if ((i & 16) == 0) {
                this.source = "";
            } else {
                this.source = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.allocation != AllocationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AllocationDto.Serializer.INSTANCE, self.allocation);
            }
            if (self.status != OrderStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderStatusDto.Serializer.INSTANCE, self.status);
            }
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            if (!Intrinsics.areEqual(self.account_type, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_type);
            }
            if (Intrinsics.areEqual(self.source, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.source);
        }

        public Surrogate(AllocationDto allocation, OrderStatusDto status, EntryPointDto entry_point, String account_type, String source) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(source, "source");
            this.allocation = allocation;
            this.status = status;
            this.entry_point = entry_point;
            this.account_type = account_type;
            this.source = source;
        }

        public final AllocationDto getAllocation() {
            return this.allocation;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.InvestFlowContextDto.AllocationDto r2, com.robinhood.rosetta.eventlogging.InvestFlowContextDto.OrderStatusDto r3, com.robinhood.rosetta.eventlogging.InvestFlowContextDto.EntryPointDto r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                com.robinhood.rosetta.eventlogging.InvestFlowContextDto$AllocationDto$Companion r2 = com.robinhood.rosetta.eventlogging.InvestFlowContextDto.AllocationDto.INSTANCE
                com.robinhood.rosetta.eventlogging.InvestFlowContextDto$AllocationDto r2 = r2.getZeroValue()
            La:
                r8 = r7 & 2
                if (r8 == 0) goto L14
                com.robinhood.rosetta.eventlogging.InvestFlowContextDto$OrderStatusDto$Companion r3 = com.robinhood.rosetta.eventlogging.InvestFlowContextDto.OrderStatusDto.INSTANCE
                com.robinhood.rosetta.eventlogging.InvestFlowContextDto$OrderStatusDto r3 = r3.getZeroValue()
            L14:
                r8 = r7 & 4
                if (r8 == 0) goto L1e
                com.robinhood.rosetta.eventlogging.InvestFlowContextDto$EntryPointDto$Companion r4 = com.robinhood.rosetta.eventlogging.InvestFlowContextDto.EntryPointDto.INSTANCE
                com.robinhood.rosetta.eventlogging.InvestFlowContextDto$EntryPointDto r4 = r4.getZeroValue()
            L1e:
                r8 = r7 & 8
                java.lang.String r0 = ""
                if (r8 == 0) goto L25
                r5 = r0
            L25:
                r7 = r7 & 16
                if (r7 == 0) goto L30
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L36
            L30:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L36:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.InvestFlowContextDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.InvestFlowContextDto$AllocationDto, com.robinhood.rosetta.eventlogging.InvestFlowContextDto$OrderStatusDto, com.robinhood.rosetta.eventlogging.InvestFlowContextDto$EntryPointDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final OrderStatusDto getStatus() {
            return this.status;
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final String getAccount_type() {
            return this.account_type;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: InvestFlowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<InvestFlowContextDto, InvestFlowContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestFlowContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestFlowContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestFlowContextDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestFlowContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestFlowContext> getProtoAdapter() {
            return InvestFlowContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestFlowContextDto getZeroValue() {
            return InvestFlowContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestFlowContextDto fromProto(InvestFlowContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new InvestFlowContextDto(new Surrogate(AllocationDto.INSTANCE.fromProto(proto.getAllocation()), OrderStatusDto.INSTANCE.fromProto(proto.getStatus()), EntryPointDto.INSTANCE.fromProto(proto.getEntry_point()), proto.getAccount_type(), proto.getSource()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InvestFlowContextDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AllocationDto implements Dto2<InvestFlowContext.Allocation>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AllocationDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AllocationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AllocationDto, InvestFlowContext.Allocation>> binaryBase64Serializer$delegate;
        public static final AllocationDto DEFAULT = new DEFAULT("DEFAULT", 0);
        public static final AllocationDto CUSTOM = new CUSTOM("CUSTOM", 1);

        private static final /* synthetic */ AllocationDto[] $values() {
            return new AllocationDto[]{DEFAULT, CUSTOM};
        }

        public /* synthetic */ AllocationDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AllocationDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.AllocationDto.DEFAULT", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEFAULT extends AllocationDto {
            DEFAULT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.Allocation toProto() {
                return InvestFlowContext.Allocation.DEFAULT;
            }
        }

        private AllocationDto(String str, int i) {
        }

        static {
            AllocationDto[] allocationDtoArr$values = $values();
            $VALUES = allocationDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(allocationDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContextDto$AllocationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowContextDto.AllocationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.AllocationDto.CUSTOM", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CUSTOM extends AllocationDto {
            CUSTOM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.Allocation toProto() {
                return InvestFlowContext.Allocation.CUSTOM;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AllocationDto, InvestFlowContext.Allocation> {

            /* compiled from: InvestFlowContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InvestFlowContext.Allocation.values().length];
                    try {
                        iArr[InvestFlowContext.Allocation.DEFAULT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InvestFlowContext.Allocation.CUSTOM.ordinal()] = 2;
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

            public final KSerializer<AllocationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AllocationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AllocationDto> getBinaryBase64Serializer() {
                return (KSerializer) AllocationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<InvestFlowContext.Allocation> getProtoAdapter() {
                return InvestFlowContext.Allocation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AllocationDto getZeroValue() {
                return AllocationDto.DEFAULT;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AllocationDto fromProto(InvestFlowContext.Allocation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AllocationDto.DEFAULT;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return AllocationDto.CUSTOM;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$AllocationDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AllocationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AllocationDto, InvestFlowContext.Allocation> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.InvestFlowContext.Allocation", AllocationDto.getEntries(), AllocationDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AllocationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AllocationDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AllocationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AllocationDto valueOf(String str) {
            return (AllocationDto) Enum.valueOf(AllocationDto.class, str);
        }

        public static AllocationDto[] values() {
            return (AllocationDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PARTIALLY_FAILED", "FAILED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderStatusDto implements Dto2<InvestFlowContext.OrderStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderStatusDto, InvestFlowContext.OrderStatus>> binaryBase64Serializer$delegate;
        public static final OrderStatusDto SUCCESS = new SUCCESS("SUCCESS", 0);
        public static final OrderStatusDto PARTIALLY_FAILED = new PARTIALLY_FAILED("PARTIALLY_FAILED", 1);
        public static final OrderStatusDto FAILED = new FAILED("FAILED", 2);

        private static final /* synthetic */ OrderStatusDto[] $values() {
            return new OrderStatusDto[]{SUCCESS, PARTIALLY_FAILED, FAILED};
        }

        public /* synthetic */ OrderStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.OrderStatusDto.SUCCESS", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUCCESS extends OrderStatusDto {
            SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.OrderStatus toProto() {
                return InvestFlowContext.OrderStatus.SUCCESS;
            }
        }

        private OrderStatusDto(String str, int i) {
        }

        static {
            OrderStatusDto[] orderStatusDtoArr$values = $values();
            $VALUES = orderStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContextDto$OrderStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowContextDto.OrderStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.OrderStatusDto.PARTIALLY_FAILED", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PARTIALLY_FAILED extends OrderStatusDto {
            PARTIALLY_FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.OrderStatus toProto() {
                return InvestFlowContext.OrderStatus.PARTIALLY_FAILED;
            }
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.OrderStatusDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends OrderStatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.OrderStatus toProto() {
                return InvestFlowContext.OrderStatus.FAILED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderStatusDto, InvestFlowContext.OrderStatus> {

            /* compiled from: InvestFlowContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InvestFlowContext.OrderStatus.values().length];
                    try {
                        iArr[InvestFlowContext.OrderStatus.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InvestFlowContext.OrderStatus.PARTIALLY_FAILED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[InvestFlowContext.OrderStatus.FAILED.ordinal()] = 3;
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

            public final KSerializer<OrderStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<InvestFlowContext.OrderStatus> getProtoAdapter() {
                return InvestFlowContext.OrderStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderStatusDto getZeroValue() {
                return OrderStatusDto.SUCCESS;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderStatusDto fromProto(InvestFlowContext.OrderStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderStatusDto.SUCCESS;
                }
                if (i == 2) {
                    return OrderStatusDto.PARTIALLY_FAILED;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderStatusDto.FAILED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$OrderStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderStatusDto, InvestFlowContext.OrderStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.InvestFlowContext.OrderStatus", OrderStatusDto.getEntries(), OrderStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderStatusDto valueOf(String str) {
            return (OrderStatusDto) Enum.valueOf(OrderStatusDto.class, str);
        }

        public static OrderStatusDto[] values() {
            return (OrderStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INVEST_FLOW_ENTRY_POINT_UNSPECIFIED", "RET_ONBOARDING_CONGRATS_SCREEN", "RET_POST_ONBOARDING_PANEL", "RET_POST_RECS_NEW_RECURRING", "RET_POST_RECS_UPSELL_RECURRING", "BB_DISCOVERY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<InvestFlowContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, InvestFlowContext.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto INVEST_FLOW_ENTRY_POINT_UNSPECIFIED = new INVEST_FLOW_ENTRY_POINT_UNSPECIFIED("INVEST_FLOW_ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto RET_ONBOARDING_CONGRATS_SCREEN = new RET_ONBOARDING_CONGRATS_SCREEN("RET_ONBOARDING_CONGRATS_SCREEN", 1);
        public static final EntryPointDto RET_POST_ONBOARDING_PANEL = new RET_POST_ONBOARDING_PANEL("RET_POST_ONBOARDING_PANEL", 2);
        public static final EntryPointDto RET_POST_RECS_NEW_RECURRING = new RET_POST_RECS_NEW_RECURRING("RET_POST_RECS_NEW_RECURRING", 3);
        public static final EntryPointDto RET_POST_RECS_UPSELL_RECURRING = new RET_POST_RECS_UPSELL_RECURRING("RET_POST_RECS_UPSELL_RECURRING", 4);
        public static final EntryPointDto BB_DISCOVERY = new BB_DISCOVERY("BB_DISCOVERY", 5);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{INVEST_FLOW_ENTRY_POINT_UNSPECIFIED, RET_ONBOARDING_CONGRATS_SCREEN, RET_POST_ONBOARDING_PANEL, RET_POST_RECS_NEW_RECURRING, RET_POST_RECS_UPSELL_RECURRING, BB_DISCOVERY};
        }

        public /* synthetic */ EntryPointDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntryPointDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.EntryPointDto.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVEST_FLOW_ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            INVEST_FLOW_ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.EntryPoint toProto() {
                return InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED;
            }
        }

        private EntryPointDto(String str, int i) {
        }

        static {
            EntryPointDto[] entryPointDtoArr$values = $values();
            $VALUES = entryPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.EntryPointDto.RET_ONBOARDING_CONGRATS_SCREEN", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RET_ONBOARDING_CONGRATS_SCREEN extends EntryPointDto {
            RET_ONBOARDING_CONGRATS_SCREEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.EntryPoint toProto() {
                return InvestFlowContext.EntryPoint.RET_ONBOARDING_CONGRATS_SCREEN;
            }
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.EntryPointDto.RET_POST_ONBOARDING_PANEL", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RET_POST_ONBOARDING_PANEL extends EntryPointDto {
            RET_POST_ONBOARDING_PANEL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.EntryPoint toProto() {
                return InvestFlowContext.EntryPoint.RET_POST_ONBOARDING_PANEL;
            }
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.EntryPointDto.RET_POST_RECS_NEW_RECURRING", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RET_POST_RECS_NEW_RECURRING extends EntryPointDto {
            RET_POST_RECS_NEW_RECURRING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.EntryPoint toProto() {
                return InvestFlowContext.EntryPoint.RET_POST_RECS_NEW_RECURRING;
            }
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.EntryPointDto.RET_POST_RECS_UPSELL_RECURRING", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RET_POST_RECS_UPSELL_RECURRING extends EntryPointDto {
            RET_POST_RECS_UPSELL_RECURRING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.EntryPoint toProto() {
                return InvestFlowContext.EntryPoint.RET_POST_RECS_UPSELL_RECURRING;
            }
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestFlowContextDto.EntryPointDto.BB_DISCOVERY", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BB_DISCOVERY extends EntryPointDto {
            BB_DISCOVERY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestFlowContext.EntryPoint toProto() {
                return InvestFlowContext.EntryPoint.BB_DISCOVERY;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, InvestFlowContext.EntryPoint> {

            /* compiled from: InvestFlowContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InvestFlowContext.EntryPoint.values().length];
                    try {
                        iArr[InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InvestFlowContext.EntryPoint.RET_ONBOARDING_CONGRATS_SCREEN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[InvestFlowContext.EntryPoint.RET_POST_ONBOARDING_PANEL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[InvestFlowContext.EntryPoint.RET_POST_RECS_NEW_RECURRING.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[InvestFlowContext.EntryPoint.RET_POST_RECS_UPSELL_RECURRING.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[InvestFlowContext.EntryPoint.BB_DISCOVERY.ordinal()] = 6;
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

            public final KSerializer<EntryPointDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getBinaryBase64Serializer() {
                return (KSerializer) EntryPointDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<InvestFlowContext.EntryPoint> getProtoAdapter() {
                return InvestFlowContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(InvestFlowContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntryPointDto.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED;
                    case 2:
                        return EntryPointDto.RET_ONBOARDING_CONGRATS_SCREEN;
                    case 3:
                        return EntryPointDto.RET_POST_ONBOARDING_PANEL;
                    case 4:
                        return EntryPointDto.RET_POST_RECS_NEW_RECURRING;
                    case 5:
                        return EntryPointDto.RET_POST_RECS_UPSELL_RECURRING;
                    case 6:
                        return EntryPointDto.BB_DISCOVERY;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: InvestFlowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, InvestFlowContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.InvestFlowContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntryPointDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntryPointDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntryPointDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntryPointDto valueOf(String str) {
            return (EntryPointDto) Enum.valueOf(EntryPointDto.class, str);
        }

        public static EntryPointDto[] values() {
            return (EntryPointDto[]) $VALUES.clone();
        }
    }

    /* compiled from: InvestFlowContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<InvestFlowContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.InvestFlowContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestFlowContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestFlowContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestFlowContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestFlowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.InvestFlowContextDto";
        }
    }
}
