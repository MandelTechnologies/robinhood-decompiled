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
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import com.robinhood.rosetta.eventlogging.AcatsInContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: AcatsInContextDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006345678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0017Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\tJ\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0014H\u0016J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Surrogate;)V", "skip_intro", "", "intro_shown", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "account_contains", "", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "reject_reason", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "from_retry", "source", "", "dtc_number", "is_using_plaid_linked_account", "(ZZLrosetta/account/BrokerageAccountTypeDto;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;ZLjava/lang/String;Ljava/lang/String;Z)V", "getSkip_intro", "()Z", "getIntro_shown", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getAccount_contains", "()Ljava/util/List;", "getReject_reason", "()Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "getFrom_retry", "getSource", "()Ljava/lang/String;", "getDtc_number", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "AccountContentsDto", "RejectReasonDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class AcatsInContextDto implements Dto3<AcatsInContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AcatsInContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AcatsInContextDto, AcatsInContext>> binaryBase64Serializer$delegate;
    private static final AcatsInContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AcatsInContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AcatsInContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getSkip_intro() {
        return this.surrogate.getSkip_intro();
    }

    public final boolean getIntro_shown() {
        return this.surrogate.getIntro_shown();
    }

    public final BrokerageAccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final java.util.List<AccountContentsDto> getAccount_contains() {
        return this.surrogate.getAccount_contains();
    }

    public final RejectReasonDto getReject_reason() {
        return this.surrogate.getReject_reason();
    }

    public final boolean getFrom_retry() {
        return this.surrogate.getFrom_retry();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getDtc_number() {
        return this.surrogate.getDtc_number();
    }

    public final boolean is_using_plaid_linked_account() {
        return this.surrogate.is_using_plaid_linked_account();
    }

    public /* synthetic */ AcatsInContextDto(boolean z, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, java.util.List list, RejectReasonDto rejectReasonDto, boolean z3, String str, String str2, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? RejectReasonDto.INSTANCE.getZeroValue() : rejectReasonDto, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? false : z4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcatsInContextDto(boolean z, boolean z2, BrokerageAccountTypeDto account_type, java.util.List<? extends AccountContentsDto> account_contains, RejectReasonDto reject_reason, boolean z3, String source, String dtc_number, boolean z4) {
        this(new Surrogate(z, z2, account_type, account_contains, reject_reason, z3, source, dtc_number, z4));
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_contains, "account_contains");
        Intrinsics.checkNotNullParameter(reject_reason, "reject_reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dtc_number, "dtc_number");
    }

    public static /* synthetic */ AcatsInContextDto copy$default(AcatsInContextDto acatsInContextDto, boolean z, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, java.util.List list, RejectReasonDto rejectReasonDto, boolean z3, String str, String str2, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acatsInContextDto.surrogate.getSkip_intro();
        }
        if ((i & 2) != 0) {
            z2 = acatsInContextDto.surrogate.getIntro_shown();
        }
        if ((i & 4) != 0) {
            brokerageAccountTypeDto = acatsInContextDto.surrogate.getAccount_type();
        }
        if ((i & 8) != 0) {
            list = acatsInContextDto.surrogate.getAccount_contains();
        }
        if ((i & 16) != 0) {
            rejectReasonDto = acatsInContextDto.surrogate.getReject_reason();
        }
        if ((i & 32) != 0) {
            z3 = acatsInContextDto.surrogate.getFrom_retry();
        }
        if ((i & 64) != 0) {
            str = acatsInContextDto.surrogate.getSource();
        }
        if ((i & 128) != 0) {
            str2 = acatsInContextDto.surrogate.getDtc_number();
        }
        if ((i & 256) != 0) {
            z4 = acatsInContextDto.surrogate.is_using_plaid_linked_account();
        }
        String str3 = str2;
        boolean z5 = z4;
        boolean z6 = z3;
        String str4 = str;
        RejectReasonDto rejectReasonDto2 = rejectReasonDto;
        BrokerageAccountTypeDto brokerageAccountTypeDto2 = brokerageAccountTypeDto;
        return acatsInContextDto.copy(z, z2, brokerageAccountTypeDto2, list, rejectReasonDto2, z6, str4, str3, z5);
    }

    public final AcatsInContextDto copy(boolean skip_intro, boolean intro_shown, BrokerageAccountTypeDto account_type, java.util.List<? extends AccountContentsDto> account_contains, RejectReasonDto reject_reason, boolean from_retry, String source, String dtc_number, boolean is_using_plaid_linked_account) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_contains, "account_contains");
        Intrinsics.checkNotNullParameter(reject_reason, "reject_reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dtc_number, "dtc_number");
        return new AcatsInContextDto(new Surrogate(skip_intro, intro_shown, account_type, account_contains, reject_reason, from_retry, source, dtc_number, is_using_plaid_linked_account));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AcatsInContext toProto() {
        boolean skip_intro = this.surrogate.getSkip_intro();
        boolean intro_shown = this.surrogate.getIntro_shown();
        BrokerageAccountType brokerageAccountType = (BrokerageAccountType) this.surrogate.getAccount_type().toProto();
        java.util.List<AccountContentsDto> account_contains = this.surrogate.getAccount_contains();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_contains, 10));
        Iterator<T> it = account_contains.iterator();
        while (it.hasNext()) {
            arrayList.add((AcatsInContext.AccountContents) ((AccountContentsDto) it.next()).toProto());
        }
        return new AcatsInContext(skip_intro, intro_shown, brokerageAccountType, arrayList, (AcatsInContext.RejectReason) this.surrogate.getReject_reason().toProto(), this.surrogate.getFrom_retry(), this.surrogate.getSource(), this.surrogate.getDtc_number(), this.surrogate.is_using_plaid_linked_account(), null, 512, null);
    }

    public String toString() {
        return "[AcatsInContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AcatsInContextDto) && Intrinsics.areEqual(((AcatsInContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: AcatsInContextDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002EFBg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012Bs\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003Ji\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0014HÖ\u0001J\t\u0010<\u001a\u00020\u000eHÖ\u0001J%\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0001¢\u0006\u0002\bDR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010+R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0019\u001a\u0004\b\u0010\u0010\u001b¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Surrogate;", "", "skip_intro", "", "intro_shown", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "account_contains", "", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "reject_reason", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "from_retry", "source", "", "dtc_number", "is_using_plaid_linked_account", "<init>", "(ZZLrosetta/account/BrokerageAccountTypeDto;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;ZLjava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZLrosetta/account/BrokerageAccountTypeDto;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;ZLjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSkip_intro$annotations", "()V", "getSkip_intro", "()Z", "getIntro_shown$annotations", "getIntro_shown", "getAccount_type$annotations", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getAccount_contains$annotations", "getAccount_contains", "()Ljava/util/List;", "getReject_reason$annotations", "getReject_reason", "()Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "getFrom_retry$annotations", "getFrom_retry", "getSource$annotations", "getSource", "()Ljava/lang/String;", "getDtc_number$annotations", "getDtc_number", "is_using_plaid_linked_account$annotations", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final java.util.List<AccountContentsDto> account_contains;
        private final BrokerageAccountTypeDto account_type;
        private final String dtc_number;
        private final boolean from_retry;
        private final boolean intro_shown;
        private final boolean is_using_plaid_linked_account;
        private final RejectReasonDto reject_reason;
        private final boolean skip_intro;
        private final String source;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.AcatsInContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInContextDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null};

        public Surrogate() {
            this(false, false, (BrokerageAccountTypeDto) null, (java.util.List) null, (RejectReasonDto) null, false, (String) null, (String) null, false, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AccountContentsDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, java.util.List list, RejectReasonDto rejectReasonDto, boolean z3, String str, String str2, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = surrogate.skip_intro;
            }
            if ((i & 2) != 0) {
                z2 = surrogate.intro_shown;
            }
            if ((i & 4) != 0) {
                brokerageAccountTypeDto = surrogate.account_type;
            }
            if ((i & 8) != 0) {
                list = surrogate.account_contains;
            }
            if ((i & 16) != 0) {
                rejectReasonDto = surrogate.reject_reason;
            }
            if ((i & 32) != 0) {
                z3 = surrogate.from_retry;
            }
            if ((i & 64) != 0) {
                str = surrogate.source;
            }
            if ((i & 128) != 0) {
                str2 = surrogate.dtc_number;
            }
            if ((i & 256) != 0) {
                z4 = surrogate.is_using_plaid_linked_account;
            }
            String str3 = str2;
            boolean z5 = z4;
            boolean z6 = z3;
            String str4 = str;
            RejectReasonDto rejectReasonDto2 = rejectReasonDto;
            BrokerageAccountTypeDto brokerageAccountTypeDto2 = brokerageAccountTypeDto;
            return surrogate.copy(z, z2, brokerageAccountTypeDto2, list, rejectReasonDto2, z6, str4, str3, z5);
        }

        @SerialName("accountContains")
        @JsonAnnotations2(names = {"account_contains"})
        public static /* synthetic */ void getAccount_contains$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("dtcNumber")
        @JsonAnnotations2(names = {"dtc_number"})
        public static /* synthetic */ void getDtc_number$annotations() {
        }

        @SerialName("fromRetry")
        @JsonAnnotations2(names = {"from_retry"})
        public static /* synthetic */ void getFrom_retry$annotations() {
        }

        @SerialName("introShown")
        @JsonAnnotations2(names = {"intro_shown"})
        public static /* synthetic */ void getIntro_shown$annotations() {
        }

        @SerialName("rejectReason")
        @JsonAnnotations2(names = {"reject_reason"})
        public static /* synthetic */ void getReject_reason$annotations() {
        }

        @SerialName("skipIntro")
        @JsonAnnotations2(names = {"skip_intro"})
        public static /* synthetic */ void getSkip_intro$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("isUsingPlaidLinkedAccount")
        @JsonAnnotations2(names = {"is_using_plaid_linked_account"})
        public static /* synthetic */ void is_using_plaid_linked_account$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSkip_intro() {
            return this.skip_intro;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIntro_shown() {
            return this.intro_shown;
        }

        /* renamed from: component3, reason: from getter */
        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final java.util.List<AccountContentsDto> component4() {
            return this.account_contains;
        }

        /* renamed from: component5, reason: from getter */
        public final RejectReasonDto getReject_reason() {
            return this.reject_reason;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getFrom_retry() {
            return this.from_retry;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDtc_number() {
            return this.dtc_number;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIs_using_plaid_linked_account() {
            return this.is_using_plaid_linked_account;
        }

        public final Surrogate copy(boolean skip_intro, boolean intro_shown, BrokerageAccountTypeDto account_type, java.util.List<? extends AccountContentsDto> account_contains, RejectReasonDto reject_reason, boolean from_retry, String source, String dtc_number, boolean is_using_plaid_linked_account) {
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(account_contains, "account_contains");
            Intrinsics.checkNotNullParameter(reject_reason, "reject_reason");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(dtc_number, "dtc_number");
            return new Surrogate(skip_intro, intro_shown, account_type, account_contains, reject_reason, from_retry, source, dtc_number, is_using_plaid_linked_account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.skip_intro == surrogate.skip_intro && this.intro_shown == surrogate.intro_shown && this.account_type == surrogate.account_type && Intrinsics.areEqual(this.account_contains, surrogate.account_contains) && this.reject_reason == surrogate.reject_reason && this.from_retry == surrogate.from_retry && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.dtc_number, surrogate.dtc_number) && this.is_using_plaid_linked_account == surrogate.is_using_plaid_linked_account;
        }

        public int hashCode() {
            return (((((((((((((((java.lang.Boolean.hashCode(this.skip_intro) * 31) + java.lang.Boolean.hashCode(this.intro_shown)) * 31) + this.account_type.hashCode()) * 31) + this.account_contains.hashCode()) * 31) + this.reject_reason.hashCode()) * 31) + java.lang.Boolean.hashCode(this.from_retry)) * 31) + this.source.hashCode()) * 31) + this.dtc_number.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_using_plaid_linked_account);
        }

        public String toString() {
            return "Surrogate(skip_intro=" + this.skip_intro + ", intro_shown=" + this.intro_shown + ", account_type=" + this.account_type + ", account_contains=" + this.account_contains + ", reject_reason=" + this.reject_reason + ", from_retry=" + this.from_retry + ", source=" + this.source + ", dtc_number=" + this.dtc_number + ", is_using_plaid_linked_account=" + this.is_using_plaid_linked_account + ")";
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AcatsInContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, java.util.List list, RejectReasonDto rejectReasonDto, boolean z3, String str, String str2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.skip_intro = false;
            } else {
                this.skip_intro = z;
            }
            if ((i & 2) == 0) {
                this.intro_shown = false;
            } else {
                this.intro_shown = z2;
            }
            if ((i & 4) == 0) {
                this.account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.account_type = brokerageAccountTypeDto;
            }
            if ((i & 8) == 0) {
                this.account_contains = CollectionsKt.emptyList();
            } else {
                this.account_contains = list;
            }
            if ((i & 16) == 0) {
                this.reject_reason = RejectReasonDto.INSTANCE.getZeroValue();
            } else {
                this.reject_reason = rejectReasonDto;
            }
            if ((i & 32) == 0) {
                this.from_retry = false;
            } else {
                this.from_retry = z3;
            }
            if ((i & 64) == 0) {
                this.source = "";
            } else {
                this.source = str;
            }
            if ((i & 128) == 0) {
                this.dtc_number = "";
            } else {
                this.dtc_number = str2;
            }
            if ((i & 256) == 0) {
                this.is_using_plaid_linked_account = false;
            } else {
                this.is_using_plaid_linked_account = z4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            boolean z = self.skip_intro;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.intro_shown;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            if (self.account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, BrokerageAccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (!Intrinsics.areEqual(self.account_contains, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.account_contains);
            }
            if (self.reject_reason != RejectReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, RejectReasonDto.Serializer.INSTANCE, self.reject_reason);
            }
            boolean z3 = self.from_retry;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 5, z3);
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 6, self.source);
            }
            if (!Intrinsics.areEqual(self.dtc_number, "")) {
                output.encodeStringElement(serialDesc, 7, self.dtc_number);
            }
            boolean z4 = self.is_using_plaid_linked_account;
            if (z4) {
                output.encodeBooleanElement(serialDesc, 8, z4);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(boolean z, boolean z2, BrokerageAccountTypeDto account_type, java.util.List<? extends AccountContentsDto> account_contains, RejectReasonDto reject_reason, boolean z3, String source, String dtc_number, boolean z4) {
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(account_contains, "account_contains");
            Intrinsics.checkNotNullParameter(reject_reason, "reject_reason");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(dtc_number, "dtc_number");
            this.skip_intro = z;
            this.intro_shown = z2;
            this.account_type = account_type;
            this.account_contains = account_contains;
            this.reject_reason = reject_reason;
            this.from_retry = z3;
            this.source = source;
            this.dtc_number = dtc_number;
            this.is_using_plaid_linked_account = z4;
        }

        public final boolean getSkip_intro() {
            return this.skip_intro;
        }

        public final boolean getIntro_shown() {
            return this.intro_shown;
        }

        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public /* synthetic */ Surrogate(boolean z, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, java.util.List list, RejectReasonDto rejectReasonDto, boolean z3, String str, String str2, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? RejectReasonDto.INSTANCE.getZeroValue() : rejectReasonDto, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? false : z4);
        }

        public final java.util.List<AccountContentsDto> getAccount_contains() {
            return this.account_contains;
        }

        public final RejectReasonDto getReject_reason() {
            return this.reject_reason;
        }

        public final boolean getFrom_retry() {
            return this.from_retry;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getDtc_number() {
            return this.dtc_number;
        }

        public final boolean is_using_plaid_linked_account() {
            return this.is_using_plaid_linked_account;
        }
    }

    /* compiled from: AcatsInContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AcatsInContextDto, AcatsInContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AcatsInContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AcatsInContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AcatsInContextDto> getBinaryBase64Serializer() {
            return (KSerializer) AcatsInContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AcatsInContext> getProtoAdapter() {
            return AcatsInContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AcatsInContextDto getZeroValue() {
            return AcatsInContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AcatsInContextDto fromProto(AcatsInContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean skip_intro = proto.getSkip_intro();
            boolean intro_shown = proto.getIntro_shown();
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getAccount_type());
            java.util.List<AcatsInContext.AccountContents> account_contains = proto.getAccount_contains();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_contains, 10));
            Iterator<T> it = account_contains.iterator();
            while (it.hasNext()) {
                arrayList.add(AccountContentsDto.INSTANCE.fromProto((AcatsInContext.AccountContents) it.next()));
            }
            return new AcatsInContextDto(new Surrogate(skip_intro, intro_shown, brokerageAccountTypeDtoFromProto, arrayList, RejectReasonDto.INSTANCE.fromProto(proto.getReject_reason()), proto.getFrom_retry(), proto.getSource(), proto.getDtc_number(), proto.getIs_using_plaid_linked_account()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AcatsInContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AcatsInContextDto(false, false, null, null, null, false, null, null, false, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AcatsInContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "MUTUAL_FUNDS", "BONDS", "MARGIN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AccountContentsDto implements Dto2<AcatsInContext.AccountContents>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountContentsDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AccountContentsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AccountContentsDto, AcatsInContext.AccountContents>> binaryBase64Serializer$delegate;
        public static final AccountContentsDto NONE = new NONE("NONE", 0);
        public static final AccountContentsDto MUTUAL_FUNDS = new MUTUAL_FUNDS("MUTUAL_FUNDS", 1);
        public static final AccountContentsDto BONDS = new BONDS("BONDS", 2);
        public static final AccountContentsDto MARGIN = new MARGIN("MARGIN", 3);

        private static final /* synthetic */ AccountContentsDto[] $values() {
            return new AccountContentsDto[]{NONE, MUTUAL_FUNDS, BONDS, MARGIN};
        }

        public /* synthetic */ AccountContentsDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AccountContentsDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.AccountContentsDto.NONE", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NONE extends AccountContentsDto {
            NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.AccountContents toProto() {
                return AcatsInContext.AccountContents.NONE;
            }
        }

        private AccountContentsDto(String str, int i) {
        }

        static {
            AccountContentsDto[] accountContentsDtoArr$values = $values();
            $VALUES = accountContentsDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountContentsDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AcatsInContextDto$AccountContentsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsInContextDto.AccountContentsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.AccountContentsDto.MUTUAL_FUNDS", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MUTUAL_FUNDS extends AccountContentsDto {
            MUTUAL_FUNDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.AccountContents toProto() {
                return AcatsInContext.AccountContents.MUTUAL_FUNDS;
            }
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.AccountContentsDto.BONDS", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BONDS extends AccountContentsDto {
            BONDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.AccountContents toProto() {
                return AcatsInContext.AccountContents.BONDS;
            }
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.AccountContentsDto.MARGIN", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARGIN extends AccountContentsDto {
            MARGIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.AccountContents toProto() {
                return AcatsInContext.AccountContents.MARGIN;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AccountContentsDto, AcatsInContext.AccountContents> {

            /* compiled from: AcatsInContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AcatsInContext.AccountContents.values().length];
                    try {
                        iArr[AcatsInContext.AccountContents.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AcatsInContext.AccountContents.MUTUAL_FUNDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AcatsInContext.AccountContents.BONDS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AcatsInContext.AccountContents.MARGIN.ordinal()] = 4;
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

            public final KSerializer<AccountContentsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountContentsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountContentsDto> getBinaryBase64Serializer() {
                return (KSerializer) AccountContentsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AcatsInContext.AccountContents> getProtoAdapter() {
                return AcatsInContext.AccountContents.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountContentsDto getZeroValue() {
                return AccountContentsDto.NONE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountContentsDto fromProto(AcatsInContext.AccountContents proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AccountContentsDto.NONE;
                }
                if (i == 2) {
                    return AccountContentsDto.MUTUAL_FUNDS;
                }
                if (i == 3) {
                    return AccountContentsDto.BONDS;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AccountContentsDto.MARGIN;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$AccountContentsDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AccountContentsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AccountContentsDto, AcatsInContext.AccountContents> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.AcatsInContext.AccountContents", AccountContentsDto.getEntries(), AccountContentsDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AccountContentsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AccountContentsDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AccountContentsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AccountContentsDto valueOf(String str) {
            return (AccountContentsDto) Enum.valueOf(AccountContentsDto.class, str);
        }

        public static AccountContentsDto[] values() {
            return (AccountContentsDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AcatsInContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_TITLE_MISMATCH", "INVALID_ACCOUNT_NUMBER", "UNSUPPORTED_ASSETS", "UNKNOWN", "NOT_REJECTED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RejectReasonDto implements Dto2<AcatsInContext.RejectReason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RejectReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RejectReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RejectReasonDto, AcatsInContext.RejectReason>> binaryBase64Serializer$delegate;
        public static final RejectReasonDto ACCOUNT_TITLE_MISMATCH = new ACCOUNT_TITLE_MISMATCH("ACCOUNT_TITLE_MISMATCH", 0);
        public static final RejectReasonDto INVALID_ACCOUNT_NUMBER = new INVALID_ACCOUNT_NUMBER("INVALID_ACCOUNT_NUMBER", 1);
        public static final RejectReasonDto UNSUPPORTED_ASSETS = new UNSUPPORTED_ASSETS("UNSUPPORTED_ASSETS", 2);
        public static final RejectReasonDto UNKNOWN = new UNKNOWN("UNKNOWN", 3);
        public static final RejectReasonDto NOT_REJECTED = new NOT_REJECTED("NOT_REJECTED", 4);

        private static final /* synthetic */ RejectReasonDto[] $values() {
            return new RejectReasonDto[]{ACCOUNT_TITLE_MISMATCH, INVALID_ACCOUNT_NUMBER, UNSUPPORTED_ASSETS, UNKNOWN, NOT_REJECTED};
        }

        public /* synthetic */ RejectReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RejectReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.RejectReasonDto.ACCOUNT_TITLE_MISMATCH", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_TITLE_MISMATCH extends RejectReasonDto {
            ACCOUNT_TITLE_MISMATCH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.RejectReason toProto() {
                return AcatsInContext.RejectReason.ACCOUNT_TITLE_MISMATCH;
            }
        }

        private RejectReasonDto(String str, int i) {
        }

        static {
            RejectReasonDto[] rejectReasonDtoArr$values = $values();
            $VALUES = rejectReasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(rejectReasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AcatsInContextDto$RejectReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsInContextDto.RejectReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.RejectReasonDto.INVALID_ACCOUNT_NUMBER", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVALID_ACCOUNT_NUMBER extends RejectReasonDto {
            INVALID_ACCOUNT_NUMBER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.RejectReason toProto() {
                return AcatsInContext.RejectReason.INVALID_ACCOUNT_NUMBER;
            }
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.RejectReasonDto.UNSUPPORTED_ASSETS", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSUPPORTED_ASSETS extends RejectReasonDto {
            UNSUPPORTED_ASSETS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.RejectReason toProto() {
                return AcatsInContext.RejectReason.UNSUPPORTED_ASSETS;
            }
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.RejectReasonDto.UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNKNOWN extends RejectReasonDto {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.RejectReason toProto() {
                return AcatsInContext.RejectReason.UNKNOWN;
            }
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AcatsInContextDto.RejectReasonDto.NOT_REJECTED", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOT_REJECTED extends RejectReasonDto {
            NOT_REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AcatsInContext.RejectReason toProto() {
                return AcatsInContext.RejectReason.NOT_REJECTED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RejectReasonDto, AcatsInContext.RejectReason> {

            /* compiled from: AcatsInContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AcatsInContext.RejectReason.values().length];
                    try {
                        iArr[AcatsInContext.RejectReason.ACCOUNT_TITLE_MISMATCH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AcatsInContext.RejectReason.INVALID_ACCOUNT_NUMBER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AcatsInContext.RejectReason.UNSUPPORTED_ASSETS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AcatsInContext.RejectReason.UNKNOWN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AcatsInContext.RejectReason.NOT_REJECTED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RejectReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RejectReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RejectReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) RejectReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AcatsInContext.RejectReason> getProtoAdapter() {
                return AcatsInContext.RejectReason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RejectReasonDto getZeroValue() {
                return RejectReasonDto.ACCOUNT_TITLE_MISMATCH;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RejectReasonDto fromProto(AcatsInContext.RejectReason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RejectReasonDto.ACCOUNT_TITLE_MISMATCH;
                }
                if (i == 2) {
                    return RejectReasonDto.INVALID_ACCOUNT_NUMBER;
                }
                if (i == 3) {
                    return RejectReasonDto.UNSUPPORTED_ASSETS;
                }
                if (i == 4) {
                    return RejectReasonDto.UNKNOWN;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return RejectReasonDto.NOT_REJECTED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AcatsInContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$RejectReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RejectReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RejectReasonDto, AcatsInContext.RejectReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.AcatsInContext.RejectReason", RejectReasonDto.getEntries(), RejectReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RejectReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RejectReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RejectReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RejectReasonDto valueOf(String str) {
            return (RejectReasonDto) Enum.valueOf(RejectReasonDto.class, str);
        }

        public static RejectReasonDto[] values() {
            return (RejectReasonDto[]) $VALUES.clone();
        }
    }

    /* compiled from: AcatsInContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AcatsInContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AcatsInContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AcatsInContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AcatsInContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AcatsInContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AcatsInContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AcatsInContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AcatsInContextDto";
        }
    }
}
