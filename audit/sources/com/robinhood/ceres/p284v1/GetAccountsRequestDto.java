package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.AccountClientTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GetAccountsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0010JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\fH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\fH\u0016J\b\u0010'\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetAccountsRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Surrogate;)V", "rhs_account_number", "", "cursor", "page_size", "", "client_type", "Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "account_number", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Ljava/lang/String;)V", "getRhs_account_number", "()Ljava/lang/String;", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "getClient_type", "()Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "getAccount_number", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Ljava/lang/String;)Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetAccountsRequestDto implements Dto3<GetAccountsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountsRequestDto, GetAccountsRequest>> binaryBase64Serializer$delegate;
    private static final GetAccountsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final String getCursor() {
        return this.surrogate.getCursor();
    }

    public final Integer getPage_size() {
        return this.surrogate.getPage_size();
    }

    public final AccountClientTypeDto getClient_type() {
        return this.surrogate.getClient_type();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public /* synthetic */ GetAccountsRequestDto(String str, String str2, Integer num, AccountClientTypeDto accountClientTypeDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : accountClientTypeDto, (i & 16) != 0 ? null : str3);
    }

    public GetAccountsRequestDto(String str, String str2, Integer num, AccountClientTypeDto accountClientTypeDto, String str3) {
        this(new Surrogate(str, str2, num, accountClientTypeDto, str3));
    }

    public static /* synthetic */ GetAccountsRequestDto copy$default(GetAccountsRequestDto getAccountsRequestDto, String str, String str2, Integer num, AccountClientTypeDto accountClientTypeDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountsRequestDto.surrogate.getRhs_account_number();
        }
        if ((i & 2) != 0) {
            str2 = getAccountsRequestDto.surrogate.getCursor();
        }
        if ((i & 4) != 0) {
            num = getAccountsRequestDto.surrogate.getPage_size();
        }
        if ((i & 8) != 0) {
            accountClientTypeDto = getAccountsRequestDto.surrogate.getClient_type();
        }
        if ((i & 16) != 0) {
            str3 = getAccountsRequestDto.surrogate.getAccount_number();
        }
        String str4 = str3;
        Integer num2 = num;
        return getAccountsRequestDto.copy(str, str2, num2, accountClientTypeDto, str4);
    }

    public final GetAccountsRequestDto copy(String rhs_account_number, String cursor, Integer page_size, AccountClientTypeDto client_type, String account_number) {
        return new GetAccountsRequestDto(new Surrogate(rhs_account_number, cursor, page_size, client_type, account_number));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAccountsRequest toProto() {
        String rhs_account_number = this.surrogate.getRhs_account_number();
        String cursor = this.surrogate.getCursor();
        Integer page_size = this.surrogate.getPage_size();
        AccountClientTypeDto client_type = this.surrogate.getClient_type();
        return new GetAccountsRequest(rhs_account_number, cursor, page_size, client_type != null ? (AccountClientType) client_type.toProto() : null, this.surrogate.getAccount_number(), null, 32, null);
    }

    public String toString() {
        return "[GetAccountsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountsRequestDto) && Intrinsics.areEqual(((GetAccountsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BR\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0019\b\u0002\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010$\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R/\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001c\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016¨\u00068"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Surrogate;", "", "rhs_account_number", "", "cursor", "page_size", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "client_type", "Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "account_number", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRhs_account_number$annotations", "()V", "getRhs_account_number", "()Ljava/lang/String;", "getCursor$annotations", "getCursor", "getPage_size$annotations", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClient_type$annotations", "getClient_type", "()Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "getAccount_number$annotations", "getAccount_number", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Ljava/lang/String;)Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Surrogate;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final AccountClientTypeDto client_type;
        private final String cursor;
        private final Integer page_size;
        private final String rhs_account_number;

        public Surrogate() {
            this((String) null, (String) null, (Integer) null, (AccountClientTypeDto) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Integer num, AccountClientTypeDto accountClientTypeDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.rhs_account_number;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.cursor;
            }
            if ((i & 4) != 0) {
                num = surrogate.page_size;
            }
            if ((i & 8) != 0) {
                accountClientTypeDto = surrogate.client_type;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.account_number;
            }
            String str4 = str3;
            Integer num2 = num;
            return surrogate.copy(str, str2, num2, accountClientTypeDto, str4);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("clientType")
        @JsonAnnotations2(names = {"client_type"})
        public static /* synthetic */ void getClient_type$annotations() {
        }

        @SerialName("cursor")
        @JsonAnnotations2(names = {"cursor"})
        public static /* synthetic */ void getCursor$annotations() {
        }

        @SerialName("pageSize")
        @JsonAnnotations2(names = {"page_size"})
        public static /* synthetic */ void getPage_size$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCursor() {
            return this.cursor;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPage_size() {
            return this.page_size;
        }

        /* renamed from: component4, reason: from getter */
        public final AccountClientTypeDto getClient_type() {
            return this.client_type;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        public final Surrogate copy(String rhs_account_number, String cursor, Integer page_size, AccountClientTypeDto client_type, String account_number) {
            return new Surrogate(rhs_account_number, cursor, page_size, client_type, account_number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.cursor, surrogate.cursor) && Intrinsics.areEqual(this.page_size, surrogate.page_size) && this.client_type == surrogate.client_type && Intrinsics.areEqual(this.account_number, surrogate.account_number);
        }

        public int hashCode() {
            String str = this.rhs_account_number;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cursor;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.page_size;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            AccountClientTypeDto accountClientTypeDto = this.client_type;
            int iHashCode4 = (iHashCode3 + (accountClientTypeDto == null ? 0 : accountClientTypeDto.hashCode())) * 31;
            String str3 = this.account_number;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(rhs_account_number=" + this.rhs_account_number + ", cursor=" + this.cursor + ", page_size=" + this.page_size + ", client_type=" + this.client_type + ", account_number=" + this.account_number + ")";
        }

        /* compiled from: GetAccountsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Integer num, AccountClientTypeDto accountClientTypeDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.rhs_account_number = null;
            } else {
                this.rhs_account_number = str;
            }
            if ((i & 2) == 0) {
                this.cursor = null;
            } else {
                this.cursor = str2;
            }
            if ((i & 4) == 0) {
                this.page_size = null;
            } else {
                this.page_size = num;
            }
            if ((i & 8) == 0) {
                this.client_type = null;
            } else {
                this.client_type = accountClientTypeDto;
            }
            if ((i & 16) == 0) {
                this.account_number = null;
            } else {
                this.account_number = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.rhs_account_number;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.cursor;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            Integer num = self.page_size;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            AccountClientTypeDto accountClientTypeDto = self.client_type;
            if (accountClientTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AccountClientTypeDto.Serializer.INSTANCE, accountClientTypeDto);
            }
            String str3 = self.account_number;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str3);
            }
        }

        public Surrogate(String str, String str2, Integer num, AccountClientTypeDto accountClientTypeDto, String str3) {
            this.rhs_account_number = str;
            this.cursor = str2;
            this.page_size = num;
            this.client_type = accountClientTypeDto;
            this.account_number = str3;
        }

        public /* synthetic */ Surrogate(String str, String str2, Integer num, AccountClientTypeDto accountClientTypeDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : accountClientTypeDto, (i & 16) != 0 ? null : str3);
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getCursor() {
            return this.cursor;
        }

        public final Integer getPage_size() {
            return this.page_size;
        }

        public final AccountClientTypeDto getClient_type() {
            return this.client_type;
        }

        public final String getAccount_number() {
            return this.account_number;
        }
    }

    /* compiled from: GetAccountsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "Lcom/robinhood/ceres/v1/GetAccountsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountsRequestDto, GetAccountsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountsRequest> getProtoAdapter() {
            return GetAccountsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountsRequestDto getZeroValue() {
            return GetAccountsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountsRequestDto fromProto(GetAccountsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String rhs_account_number = proto.getRhs_account_number();
            String cursor = proto.getCursor();
            Integer page_size = proto.getPage_size();
            AccountClientType client_type = proto.getClient_type();
            return new GetAccountsRequestDto(new Surrogate(rhs_account_number, cursor, page_size, client_type != null ? AccountClientTypeDto.INSTANCE.fromProto(client_type) : null, proto.getAccount_number()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetAccountsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAccountsRequestDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAccountsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetAccountsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAccountsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetAccountsRequestDto";
        }
    }
}
