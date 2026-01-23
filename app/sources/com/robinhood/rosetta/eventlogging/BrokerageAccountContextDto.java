package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: BrokerageAccountContextDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00066789:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0017Jd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020\u000bH\u0016J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020/H\u0016J\b\u00105\u001a\u00020/H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b'\u0010$¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Surrogate;)V", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "account_number", "", "management_type", "Lrosetta/account/ManagementTypeDto;", "account_state", "is_original", "", "is_default", "masked_account_number", "original_wrapper", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto;", "default_wrapper", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto;", "(Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;ZZLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto;Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto;)V", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getAccount_number", "()Ljava/lang/String;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getAccount_state", "()Z", "getMasked_account_number", "getOriginal_wrapper", "()Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto;", "is_original_account", "()Ljava/lang/Boolean;", "getDefault_wrapper", "()Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto;", "is_default_account", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OriginalWrapperDto", "DefaultWrapperDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class BrokerageAccountContextDto implements Dto3<BrokerageAccountContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BrokerageAccountContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BrokerageAccountContextDto, BrokerageAccountContext>> binaryBase64Serializer$delegate;
    private static final BrokerageAccountContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BrokerageAccountContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BrokerageAccountContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BrokerageAccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final ManagementTypeDto getManagement_type() {
        return this.surrogate.getManagement_type();
    }

    public final String getAccount_state() {
        return this.surrogate.getAccount_state();
    }

    public final boolean is_original() {
        return this.surrogate.is_original();
    }

    public final boolean is_default() {
        return this.surrogate.is_default();
    }

    public final String getMasked_account_number() {
        return this.surrogate.getMasked_account_number();
    }

    public final OriginalWrapperDto getOriginal_wrapper() {
        if (this.surrogate.is_original_account() != null) {
            return new OriginalWrapperDto.IsOriginalAccount(this.surrogate.is_original_account().booleanValue());
        }
        return null;
    }

    public final java.lang.Boolean is_original_account() {
        return this.surrogate.is_original_account();
    }

    public final DefaultWrapperDto getDefault_wrapper() {
        if (this.surrogate.is_default_account() != null) {
            return new DefaultWrapperDto.IsDefaultAccount(this.surrogate.is_default_account().booleanValue());
        }
        return null;
    }

    public final java.lang.Boolean is_default_account() {
        return this.surrogate.is_default_account();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BrokerageAccountContextDto(rosetta.account.BrokerageAccountTypeDto r3, java.lang.String r4, rosetta.account.ManagementTypeDto r5, java.lang.String r6, boolean r7, boolean r8, java.lang.String r9, com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto.OriginalWrapperDto r10, com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto.DefaultWrapperDto r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r2 = this;
            r13 = r12 & 1
            if (r13 == 0) goto La
            rosetta.account.BrokerageAccountTypeDto$Companion r3 = rosetta.account.BrokerageAccountTypeDto.INSTANCE
            rosetta.account.BrokerageAccountTypeDto r3 = r3.getZeroValue()
        La:
            r13 = r12 & 2
            java.lang.String r0 = ""
            if (r13 == 0) goto L11
            r4 = r0
        L11:
            r13 = r12 & 4
            if (r13 == 0) goto L1b
            rosetta.account.ManagementTypeDto$Companion r5 = rosetta.account.ManagementTypeDto.INSTANCE
            rosetta.account.ManagementTypeDto r5 = r5.getZeroValue()
        L1b:
            r13 = r12 & 8
            if (r13 == 0) goto L20
            r6 = r0
        L20:
            r13 = r12 & 16
            r1 = 0
            if (r13 == 0) goto L26
            r7 = r1
        L26:
            r13 = r12 & 32
            if (r13 == 0) goto L2b
            r8 = r1
        L2b:
            r13 = r12 & 64
            if (r13 == 0) goto L30
            r9 = r0
        L30:
            r13 = r12 & 128(0x80, float:1.794E-43)
            r0 = 0
            if (r13 == 0) goto L36
            r10 = r0
        L36:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L45
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L4f
        L45:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L4f:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto.<init>(rosetta.account.BrokerageAccountTypeDto, java.lang.String, rosetta.account.ManagementTypeDto, java.lang.String, boolean, boolean, java.lang.String, com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto$OriginalWrapperDto, com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto$DefaultWrapperDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrokerageAccountContextDto(BrokerageAccountTypeDto account_type, String account_number, ManagementTypeDto management_type, String account_state, boolean z, boolean z2, String masked_account_number, OriginalWrapperDto originalWrapperDto, DefaultWrapperDto defaultWrapperDto) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(account_state, "account_state");
        Intrinsics.checkNotNullParameter(masked_account_number, "masked_account_number");
        OriginalWrapperDto.IsOriginalAccount isOriginalAccount = originalWrapperDto instanceof OriginalWrapperDto.IsOriginalAccount ? (OriginalWrapperDto.IsOriginalAccount) originalWrapperDto : null;
        java.lang.Boolean boolValueOf = isOriginalAccount != null ? java.lang.Boolean.valueOf(isOriginalAccount.getValue()) : null;
        DefaultWrapperDto.IsDefaultAccount isDefaultAccount = defaultWrapperDto instanceof DefaultWrapperDto.IsDefaultAccount ? (DefaultWrapperDto.IsDefaultAccount) defaultWrapperDto : null;
        this(new Surrogate(account_type, account_number, management_type, account_state, z, z2, masked_account_number, boolValueOf, isDefaultAccount != null ? java.lang.Boolean.valueOf(isDefaultAccount.getValue()) : null));
    }

    public static /* synthetic */ BrokerageAccountContextDto copy$default(BrokerageAccountContextDto brokerageAccountContextDto, BrokerageAccountTypeDto brokerageAccountTypeDto, String str, ManagementTypeDto managementTypeDto, String str2, boolean z, boolean z2, String str3, OriginalWrapperDto originalWrapperDto, DefaultWrapperDto defaultWrapperDto, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountTypeDto = brokerageAccountContextDto.surrogate.getAccount_type();
        }
        if ((i & 2) != 0) {
            str = brokerageAccountContextDto.surrogate.getAccount_number();
        }
        if ((i & 4) != 0) {
            managementTypeDto = brokerageAccountContextDto.surrogate.getManagement_type();
        }
        if ((i & 8) != 0) {
            str2 = brokerageAccountContextDto.surrogate.getAccount_state();
        }
        if ((i & 16) != 0) {
            z = brokerageAccountContextDto.surrogate.is_original();
        }
        if ((i & 32) != 0) {
            z2 = brokerageAccountContextDto.surrogate.is_default();
        }
        if ((i & 64) != 0) {
            str3 = brokerageAccountContextDto.surrogate.getMasked_account_number();
        }
        if ((i & 128) != 0) {
            originalWrapperDto = brokerageAccountContextDto.getOriginal_wrapper();
        }
        if ((i & 256) != 0) {
            defaultWrapperDto = brokerageAccountContextDto.getDefault_wrapper();
        }
        OriginalWrapperDto originalWrapperDto2 = originalWrapperDto;
        DefaultWrapperDto defaultWrapperDto2 = defaultWrapperDto;
        boolean z3 = z2;
        String str4 = str3;
        boolean z4 = z;
        ManagementTypeDto managementTypeDto2 = managementTypeDto;
        return brokerageAccountContextDto.copy(brokerageAccountTypeDto, str, managementTypeDto2, str2, z4, z3, str4, originalWrapperDto2, defaultWrapperDto2);
    }

    public final BrokerageAccountContextDto copy(BrokerageAccountTypeDto account_type, String account_number, ManagementTypeDto management_type, String account_state, boolean is_original, boolean is_default, String masked_account_number, OriginalWrapperDto original_wrapper, DefaultWrapperDto default_wrapper) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(account_state, "account_state");
        Intrinsics.checkNotNullParameter(masked_account_number, "masked_account_number");
        OriginalWrapperDto.IsOriginalAccount isOriginalAccount = original_wrapper instanceof OriginalWrapperDto.IsOriginalAccount ? (OriginalWrapperDto.IsOriginalAccount) original_wrapper : null;
        java.lang.Boolean boolValueOf = isOriginalAccount != null ? java.lang.Boolean.valueOf(isOriginalAccount.getValue()) : null;
        DefaultWrapperDto.IsDefaultAccount isDefaultAccount = default_wrapper instanceof DefaultWrapperDto.IsDefaultAccount ? (DefaultWrapperDto.IsDefaultAccount) default_wrapper : null;
        return new BrokerageAccountContextDto(new Surrogate(account_type, account_number, management_type, account_state, is_original, is_default, masked_account_number, boolValueOf, isDefaultAccount != null ? java.lang.Boolean.valueOf(isDefaultAccount.getValue()) : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BrokerageAccountContext toProto() {
        return new BrokerageAccountContext((BrokerageAccountType) this.surrogate.getAccount_type().toProto(), this.surrogate.getAccount_number(), (ManagementType) this.surrogate.getManagement_type().toProto(), this.surrogate.getAccount_state(), this.surrogate.is_original(), this.surrogate.is_default(), this.surrogate.is_original_account(), this.surrogate.is_default_account(), this.surrogate.getMasked_account_number(), null, 512, null);
    }

    public String toString() {
        return "[BrokerageAccountContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BrokerageAccountContextDto) && Intrinsics.areEqual(((BrokerageAccountContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: BrokerageAccountContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002BCBe\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(Jl\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0012HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001J%\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001cR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b\t\u0010#R\u001c\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b\u000b\u0010#R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u001cR \u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b'\u0010\u0017\u001a\u0004\b\r\u0010(R \u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b*\u0010\u0017\u001a\u0004\b\u000e\u0010(¨\u0006D"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Surrogate;", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "account_number", "", "management_type", "Lrosetta/account/ManagementTypeDto;", "account_state", "is_original", "", "is_default", "masked_account_number", "is_original_account", "is_default_account", "<init>", "(Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_type$annotations", "()V", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getAccount_number$annotations", "getAccount_number", "()Ljava/lang/String;", "getManagement_type$annotations", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getAccount_state$annotations", "getAccount_state", "is_original$annotations", "()Z", "is_default$annotations", "getMasked_account_number$annotations", "getMasked_account_number", "is_original_account$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "is_default_account$annotations", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final String account_state;
        private final BrokerageAccountTypeDto account_type;
        private final boolean is_default;
        private final java.lang.Boolean is_default_account;
        private final boolean is_original;
        private final java.lang.Boolean is_original_account;
        private final ManagementTypeDto management_type;
        private final String masked_account_number;

        public Surrogate() {
            this((BrokerageAccountTypeDto) null, (String) null, (ManagementTypeDto) null, (String) null, false, false, (String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BrokerageAccountTypeDto brokerageAccountTypeDto, String str, ManagementTypeDto managementTypeDto, String str2, boolean z, boolean z2, String str3, java.lang.Boolean bool, java.lang.Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountTypeDto = surrogate.account_type;
            }
            if ((i & 2) != 0) {
                str = surrogate.account_number;
            }
            if ((i & 4) != 0) {
                managementTypeDto = surrogate.management_type;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.account_state;
            }
            if ((i & 16) != 0) {
                z = surrogate.is_original;
            }
            if ((i & 32) != 0) {
                z2 = surrogate.is_default;
            }
            if ((i & 64) != 0) {
                str3 = surrogate.masked_account_number;
            }
            if ((i & 128) != 0) {
                bool = surrogate.is_original_account;
            }
            if ((i & 256) != 0) {
                bool2 = surrogate.is_default_account;
            }
            java.lang.Boolean bool3 = bool;
            java.lang.Boolean bool4 = bool2;
            boolean z3 = z2;
            String str4 = str3;
            boolean z4 = z;
            ManagementTypeDto managementTypeDto2 = managementTypeDto;
            return surrogate.copy(brokerageAccountTypeDto, str, managementTypeDto2, str2, z4, z3, str4, bool3, bool4);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("accountState")
        @JsonAnnotations2(names = {"account_state"})
        public static /* synthetic */ void getAccount_state$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("managementType")
        @JsonAnnotations2(names = {"management_type"})
        public static /* synthetic */ void getManagement_type$annotations() {
        }

        @SerialName("maskedAccountNumber")
        @JsonAnnotations2(names = {"masked_account_number"})
        public static /* synthetic */ void getMasked_account_number$annotations() {
        }

        @SerialName("isDefault")
        @JsonAnnotations2(names = {"is_default"})
        public static /* synthetic */ void is_default$annotations() {
        }

        @SerialName("isDefaultAccount")
        @JsonAnnotations2(names = {"is_default_account"})
        public static /* synthetic */ void is_default_account$annotations() {
        }

        @SerialName("isOriginal")
        @JsonAnnotations2(names = {"is_original"})
        public static /* synthetic */ void is_original$annotations() {
        }

        @SerialName("isOriginalAccount")
        @JsonAnnotations2(names = {"is_original_account"})
        public static /* synthetic */ void is_original_account$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component3, reason: from getter */
        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccount_state() {
            return this.account_state;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIs_original() {
            return this.is_original;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIs_default() {
            return this.is_default;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMasked_account_number() {
            return this.masked_account_number;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Boolean getIs_original_account() {
            return this.is_original_account;
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Boolean getIs_default_account() {
            return this.is_default_account;
        }

        public final Surrogate copy(BrokerageAccountTypeDto account_type, String account_number, ManagementTypeDto management_type, String account_state, boolean is_original, boolean is_default, String masked_account_number, java.lang.Boolean is_original_account, java.lang.Boolean is_default_account) {
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(account_state, "account_state");
            Intrinsics.checkNotNullParameter(masked_account_number, "masked_account_number");
            return new Surrogate(account_type, account_number, management_type, account_state, is_original, is_default, masked_account_number, is_original_account, is_default_account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.account_type == surrogate.account_type && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.management_type == surrogate.management_type && Intrinsics.areEqual(this.account_state, surrogate.account_state) && this.is_original == surrogate.is_original && this.is_default == surrogate.is_default && Intrinsics.areEqual(this.masked_account_number, surrogate.masked_account_number) && Intrinsics.areEqual(this.is_original_account, surrogate.is_original_account) && Intrinsics.areEqual(this.is_default_account, surrogate.is_default_account);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.account_type.hashCode() * 31) + this.account_number.hashCode()) * 31) + this.management_type.hashCode()) * 31) + this.account_state.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_original)) * 31) + java.lang.Boolean.hashCode(this.is_default)) * 31) + this.masked_account_number.hashCode()) * 31;
            java.lang.Boolean bool = this.is_original_account;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            java.lang.Boolean bool2 = this.is_default_account;
            return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_type=" + this.account_type + ", account_number=" + this.account_number + ", management_type=" + this.management_type + ", account_state=" + this.account_state + ", is_original=" + this.is_original + ", is_default=" + this.is_default + ", masked_account_number=" + this.masked_account_number + ", is_original_account=" + this.is_original_account + ", is_default_account=" + this.is_default_account + ")";
        }

        /* compiled from: BrokerageAccountContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BrokerageAccountContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BrokerageAccountTypeDto brokerageAccountTypeDto, String str, ManagementTypeDto managementTypeDto, String str2, boolean z, boolean z2, String str3, java.lang.Boolean bool, java.lang.Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_type = (i & 1) == 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto;
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 4) == 0) {
                this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.management_type = managementTypeDto;
            }
            if ((i & 8) == 0) {
                this.account_state = "";
            } else {
                this.account_state = str2;
            }
            if ((i & 16) == 0) {
                this.is_original = false;
            } else {
                this.is_original = z;
            }
            if ((i & 32) == 0) {
                this.is_default = false;
            } else {
                this.is_default = z2;
            }
            if ((i & 64) == 0) {
                this.masked_account_number = "";
            } else {
                this.masked_account_number = str3;
            }
            if ((i & 128) == 0) {
                this.is_original_account = null;
            } else {
                this.is_original_account = bool;
            }
            if ((i & 256) == 0) {
                this.is_default_account = null;
            } else {
                this.is_default_account = bool2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, BrokerageAccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
            }
            if (!Intrinsics.areEqual(self.account_state, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_state);
            }
            boolean z = self.is_original;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            boolean z2 = self.is_default;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 5, z2);
            }
            if (!Intrinsics.areEqual(self.masked_account_number, "")) {
                output.encodeStringElement(serialDesc, 6, self.masked_account_number);
            }
            java.lang.Boolean bool = self.is_original_account;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, bool);
            }
            java.lang.Boolean bool2 = self.is_default_account;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, bool2);
            }
        }

        public Surrogate(BrokerageAccountTypeDto account_type, String account_number, ManagementTypeDto management_type, String account_state, boolean z, boolean z2, String masked_account_number, java.lang.Boolean bool, java.lang.Boolean bool2) {
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(account_state, "account_state");
            Intrinsics.checkNotNullParameter(masked_account_number, "masked_account_number");
            this.account_type = account_type;
            this.account_number = account_number;
            this.management_type = management_type;
            this.account_state = account_state;
            this.is_original = z;
            this.is_default = z2;
            this.masked_account_number = masked_account_number;
            this.is_original_account = bool;
            this.is_default_account = bool2;
        }

        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(rosetta.account.BrokerageAccountTypeDto r3, java.lang.String r4, rosetta.account.ManagementTypeDto r5, java.lang.String r6, boolean r7, boolean r8, java.lang.String r9, java.lang.Boolean r10, java.lang.Boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r2 = this;
                r13 = r12 & 1
                if (r13 == 0) goto La
                rosetta.account.BrokerageAccountTypeDto$Companion r3 = rosetta.account.BrokerageAccountTypeDto.INSTANCE
                rosetta.account.BrokerageAccountTypeDto r3 = r3.getZeroValue()
            La:
                r13 = r12 & 2
                java.lang.String r0 = ""
                if (r13 == 0) goto L11
                r4 = r0
            L11:
                r13 = r12 & 4
                if (r13 == 0) goto L1b
                rosetta.account.ManagementTypeDto$Companion r5 = rosetta.account.ManagementTypeDto.INSTANCE
                rosetta.account.ManagementTypeDto r5 = r5.getZeroValue()
            L1b:
                r13 = r12 & 8
                if (r13 == 0) goto L20
                r6 = r0
            L20:
                r13 = r12 & 16
                r1 = 0
                if (r13 == 0) goto L26
                r7 = r1
            L26:
                r13 = r12 & 32
                if (r13 == 0) goto L2b
                r8 = r1
            L2b:
                r13 = r12 & 64
                if (r13 == 0) goto L30
                r9 = r0
            L30:
                r13 = r12 & 128(0x80, float:1.794E-43)
                r0 = 0
                if (r13 == 0) goto L36
                r10 = r0
            L36:
                r12 = r12 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L45
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L4f
            L45:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L4f:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto.Surrogate.<init>(rosetta.account.BrokerageAccountTypeDto, java.lang.String, rosetta.account.ManagementTypeDto, java.lang.String, boolean, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        public final String getAccount_state() {
            return this.account_state;
        }

        public final boolean is_original() {
            return this.is_original;
        }

        public final boolean is_default() {
            return this.is_default;
        }

        public final String getMasked_account_number() {
            return this.masked_account_number;
        }

        public final java.lang.Boolean is_original_account() {
            return this.is_original_account;
        }

        public final java.lang.Boolean is_default_account() {
            return this.is_default_account;
        }
    }

    /* compiled from: BrokerageAccountContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<BrokerageAccountContextDto, BrokerageAccountContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BrokerageAccountContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BrokerageAccountContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BrokerageAccountContextDto> getBinaryBase64Serializer() {
            return (KSerializer) BrokerageAccountContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BrokerageAccountContext> getProtoAdapter() {
            return BrokerageAccountContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BrokerageAccountContextDto getZeroValue() {
            return BrokerageAccountContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BrokerageAccountContextDto fromProto(BrokerageAccountContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BrokerageAccountContextDto(new Surrogate(BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getAccount_type()), proto.getAccount_number(), ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type()), proto.getAccount_state(), proto.getIs_original(), proto.getIs_default(), proto.getMasked_account_number(), proto.getIs_original_account(), proto.getIs_default_account()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrokerageAccountContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BrokerageAccountContextDto(null, null, null, null, false, false, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BrokerageAccountContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "IsOriginalAccount", "Companion", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto$IsOriginalAccount;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static abstract class OriginalWrapperDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ OriginalWrapperDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OriginalWrapperDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: BrokerageAccountContextDto.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto$IsOriginalAccount;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IsOriginalAccount extends OriginalWrapperDto {
            private final boolean value;

            public static /* synthetic */ IsOriginalAccount copy$default(IsOriginalAccount isOriginalAccount, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = isOriginalAccount.value;
                }
                return isOriginalAccount.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final IsOriginalAccount copy(boolean value) {
                return new IsOriginalAccount(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IsOriginalAccount) && this.value == ((IsOriginalAccount) other).value;
            }

            public int hashCode() {
                return java.lang.Boolean.hashCode(this.value);
            }

            public String toString() {
                return "IsOriginalAccount(value=" + this.value + ")";
            }

            public final boolean getValue() {
                return this.value;
            }

            public IsOriginalAccount(boolean z) {
                super(null);
                this.value = z;
            }
        }

        /* compiled from: BrokerageAccountContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$OriginalWrapperDto;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<OriginalWrapperDto, BrokerageAccountContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BrokerageAccountContext> getProtoAdapter() {
                return BrokerageAccountContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OriginalWrapperDto fromProto(BrokerageAccountContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getIs_original_account() != null) {
                    return new IsOriginalAccount(proto.getIs_original_account().booleanValue());
                }
                return null;
            }
        }
    }

    /* compiled from: BrokerageAccountContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "IsDefaultAccount", "Companion", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto$IsDefaultAccount;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static abstract class DefaultWrapperDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DefaultWrapperDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DefaultWrapperDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: BrokerageAccountContextDto.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto$IsDefaultAccount;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IsDefaultAccount extends DefaultWrapperDto {
            private final boolean value;

            public static /* synthetic */ IsDefaultAccount copy$default(IsDefaultAccount isDefaultAccount, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = isDefaultAccount.value;
                }
                return isDefaultAccount.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final IsDefaultAccount copy(boolean value) {
                return new IsDefaultAccount(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IsDefaultAccount) && this.value == ((IsDefaultAccount) other).value;
            }

            public int hashCode() {
                return java.lang.Boolean.hashCode(this.value);
            }

            public String toString() {
                return "IsDefaultAccount(value=" + this.value + ")";
            }

            public final boolean getValue() {
                return this.value;
            }

            public IsDefaultAccount(boolean z) {
                super(null);
                this.value = z;
            }
        }

        /* compiled from: BrokerageAccountContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$DefaultWrapperDto;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DefaultWrapperDto, BrokerageAccountContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BrokerageAccountContext> getProtoAdapter() {
                return BrokerageAccountContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DefaultWrapperDto fromProto(BrokerageAccountContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getIs_default_account() != null) {
                    return new IsDefaultAccount(proto.getIs_default_account().booleanValue());
                }
                return null;
            }
        }
    }

    /* compiled from: BrokerageAccountContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<BrokerageAccountContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.BrokerageAccountContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BrokerageAccountContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BrokerageAccountContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BrokerageAccountContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BrokerageAccountContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.BrokerageAccountContextDto";
        }
    }
}
