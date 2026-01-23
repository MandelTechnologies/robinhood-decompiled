package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.PositionMovement;
import com.robinhood.ceres.p284v1.PositionMovementDto;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.utils.buildconfig.BuildFlavors;
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

/* compiled from: PositionMovementDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0012JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\u0013\u0010 \u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u00060"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/PositionMovement;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/PositionMovementDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/PositionMovementDto$Surrogate;)V", "asset_class", "Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "instrument_id", "", "quantity", BuildFlavors.EXTERNAL, "", "lot_price", "symbol", "contract_multiplier", "(Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset_class", "()Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "getInstrument_id", "()Ljava/lang/String;", "getQuantity", "getExternal", "()Z", "getLot_price", "getSymbol", "getContract_multiplier", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "AssetClassDto", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class PositionMovementDto implements Dto3<PositionMovement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PositionMovementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PositionMovementDto, PositionMovement>> binaryBase64Serializer$delegate;
    private static final PositionMovementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PositionMovementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PositionMovementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AssetClassDto getAsset_class() {
        return this.surrogate.getAsset_class();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final boolean getExternal() {
        return this.surrogate.getExternal();
    }

    public final String getLot_price() {
        return this.surrogate.getLot_price();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getContract_multiplier() {
        return this.surrogate.getContract_multiplier();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PositionMovementDto(com.robinhood.ceres.v1.PositionMovementDto.AssetClassDto r2, java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            com.robinhood.ceres.v1.PositionMovementDto$AssetClassDto$Companion r2 = com.robinhood.ceres.v1.PositionMovementDto.AssetClassDto.INSTANCE
            com.robinhood.ceres.v1.PositionMovementDto$AssetClassDto r2 = r2.getZeroValue()
        La:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L11
            r3 = r0
        L11:
            r10 = r9 & 4
            if (r10 == 0) goto L16
            r4 = r0
        L16:
            r10 = r9 & 8
            if (r10 == 0) goto L1b
            r5 = 0
        L1b:
            r10 = r9 & 16
            if (r10 == 0) goto L20
            r6 = r0
        L20:
            r10 = r9 & 32
            if (r10 == 0) goto L25
            r7 = r0
        L25:
            r9 = r9 & 64
            if (r9 == 0) goto L32
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3a
        L32:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.PositionMovementDto.<init>(com.robinhood.ceres.v1.PositionMovementDto$AssetClassDto, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PositionMovementDto(AssetClassDto asset_class, String instrument_id, String quantity, boolean z, String lot_price, String symbol, String contract_multiplier) {
        this(new Surrogate(asset_class, instrument_id, quantity, z, lot_price, symbol, contract_multiplier));
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(lot_price, "lot_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(contract_multiplier, "contract_multiplier");
    }

    public static /* synthetic */ PositionMovementDto copy$default(PositionMovementDto positionMovementDto, AssetClassDto assetClassDto, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            assetClassDto = positionMovementDto.surrogate.getAsset_class();
        }
        if ((i & 2) != 0) {
            str = positionMovementDto.surrogate.getInstrument_id();
        }
        if ((i & 4) != 0) {
            str2 = positionMovementDto.surrogate.getQuantity();
        }
        if ((i & 8) != 0) {
            z = positionMovementDto.surrogate.getExternal();
        }
        if ((i & 16) != 0) {
            str3 = positionMovementDto.surrogate.getLot_price();
        }
        if ((i & 32) != 0) {
            str4 = positionMovementDto.surrogate.getSymbol();
        }
        if ((i & 64) != 0) {
            str5 = positionMovementDto.surrogate.getContract_multiplier();
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str2;
        return positionMovementDto.copy(assetClassDto, str, str9, z, str8, str6, str7);
    }

    public final PositionMovementDto copy(AssetClassDto asset_class, String instrument_id, String quantity, boolean external, String lot_price, String symbol, String contract_multiplier) {
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(lot_price, "lot_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(contract_multiplier, "contract_multiplier");
        return new PositionMovementDto(new Surrogate(asset_class, instrument_id, quantity, external, lot_price, symbol, contract_multiplier));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PositionMovement toProto() {
        return new PositionMovement((PositionMovement.AssetClass) this.surrogate.getAsset_class().toProto(), this.surrogate.getInstrument_id(), this.surrogate.getQuantity(), this.surrogate.getExternal(), this.surrogate.getLot_price(), this.surrogate.getSymbol(), this.surrogate.getContract_multiplier(), null, 128, null);
    }

    public String toString() {
        return "[PositionMovementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PositionMovementDto) && Intrinsics.areEqual(((PositionMovementDto) other).surrogate, this.surrogate);
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
    /* compiled from: PositionMovementDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u000fHÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0019R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0019¨\u0006;"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$Surrogate;", "", "asset_class", "Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "instrument_id", "", "quantity", BuildFlavors.EXTERNAL, "", "lot_price", "symbol", "contract_multiplier", "<init>", "(Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAsset_class$annotations", "()V", "getAsset_class", "()Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "getInstrument_id$annotations", "getInstrument_id", "()Ljava/lang/String;", "getQuantity$annotations", "getQuantity", "getExternal$annotations", "getExternal", "()Z", "getLot_price$annotations", "getLot_price", "getSymbol$annotations", "getSymbol", "getContract_multiplier$annotations", "getContract_multiplier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AssetClassDto asset_class;
        private final String contract_multiplier;
        private final boolean external;
        private final String instrument_id;
        private final String lot_price;
        private final String quantity;
        private final String symbol;

        public Surrogate() {
            this((AssetClassDto) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, AssetClassDto assetClassDto, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                assetClassDto = surrogate.asset_class;
            }
            if ((i & 2) != 0) {
                str = surrogate.instrument_id;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.quantity;
            }
            if ((i & 8) != 0) {
                z = surrogate.external;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.lot_price;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.symbol;
            }
            if ((i & 64) != 0) {
                str5 = surrogate.contract_multiplier;
            }
            String str6 = str4;
            String str7 = str5;
            String str8 = str3;
            String str9 = str2;
            return surrogate.copy(assetClassDto, str, str9, z, str8, str6, str7);
        }

        @SerialName("assetClass")
        @JsonAnnotations2(names = {"asset_class"})
        public static /* synthetic */ void getAsset_class$annotations() {
        }

        @SerialName("contractMultiplier")
        @JsonAnnotations2(names = {"contract_multiplier"})
        public static /* synthetic */ void getContract_multiplier$annotations() {
        }

        @SerialName(BuildFlavors.EXTERNAL)
        @JsonAnnotations2(names = {BuildFlavors.EXTERNAL})
        public static /* synthetic */ void getExternal$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("lotPrice")
        @JsonAnnotations2(names = {"lot_price"})
        public static /* synthetic */ void getLot_price$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final AssetClassDto getAsset_class() {
            return this.asset_class;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getExternal() {
            return this.external;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLot_price() {
            return this.lot_price;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component7, reason: from getter */
        public final String getContract_multiplier() {
            return this.contract_multiplier;
        }

        public final Surrogate copy(AssetClassDto asset_class, String instrument_id, String quantity, boolean external, String lot_price, String symbol, String contract_multiplier) {
            Intrinsics.checkNotNullParameter(asset_class, "asset_class");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(lot_price, "lot_price");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(contract_multiplier, "contract_multiplier");
            return new Surrogate(asset_class, instrument_id, quantity, external, lot_price, symbol, contract_multiplier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.asset_class == surrogate.asset_class && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.external == surrogate.external && Intrinsics.areEqual(this.lot_price, surrogate.lot_price) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.contract_multiplier, surrogate.contract_multiplier);
        }

        public int hashCode() {
            return (((((((((((this.asset_class.hashCode() * 31) + this.instrument_id.hashCode()) * 31) + this.quantity.hashCode()) * 31) + Boolean.hashCode(this.external)) * 31) + this.lot_price.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.contract_multiplier.hashCode();
        }

        public String toString() {
            return "Surrogate(asset_class=" + this.asset_class + ", instrument_id=" + this.instrument_id + ", quantity=" + this.quantity + ", external=" + this.external + ", lot_price=" + this.lot_price + ", symbol=" + this.symbol + ", contract_multiplier=" + this.contract_multiplier + ")";
        }

        /* compiled from: PositionMovementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/PositionMovementDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PositionMovementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AssetClassDto assetClassDto, String str, String str2, boolean z, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            this.asset_class = (i & 1) == 0 ? AssetClassDto.INSTANCE.getZeroValue() : assetClassDto;
            if ((i & 2) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 4) == 0) {
                this.quantity = "";
            } else {
                this.quantity = str2;
            }
            if ((i & 8) == 0) {
                this.external = false;
            } else {
                this.external = z;
            }
            if ((i & 16) == 0) {
                this.lot_price = "";
            } else {
                this.lot_price = str3;
            }
            if ((i & 32) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str4;
            }
            if ((i & 64) == 0) {
                this.contract_multiplier = "";
            } else {
                this.contract_multiplier = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.asset_class != AssetClassDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AssetClassDto.Serializer.INSTANCE, self.asset_class);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.quantity, "")) {
                output.encodeStringElement(serialDesc, 2, self.quantity);
            }
            boolean z = self.external;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            if (!Intrinsics.areEqual(self.lot_price, "")) {
                output.encodeStringElement(serialDesc, 4, self.lot_price);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 5, self.symbol);
            }
            if (Intrinsics.areEqual(self.contract_multiplier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.contract_multiplier);
        }

        public Surrogate(AssetClassDto asset_class, String instrument_id, String quantity, boolean z, String lot_price, String symbol, String contract_multiplier) {
            Intrinsics.checkNotNullParameter(asset_class, "asset_class");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(lot_price, "lot_price");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(contract_multiplier, "contract_multiplier");
            this.asset_class = asset_class;
            this.instrument_id = instrument_id;
            this.quantity = quantity;
            this.external = z;
            this.lot_price = lot_price;
            this.symbol = symbol;
            this.contract_multiplier = contract_multiplier;
        }

        public final AssetClassDto getAsset_class() {
            return this.asset_class;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.ceres.v1.PositionMovementDto.AssetClassDto r2, java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                com.robinhood.ceres.v1.PositionMovementDto$AssetClassDto$Companion r2 = com.robinhood.ceres.v1.PositionMovementDto.AssetClassDto.INSTANCE
                com.robinhood.ceres.v1.PositionMovementDto$AssetClassDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                java.lang.String r0 = ""
                if (r10 == 0) goto L11
                r3 = r0
            L11:
                r10 = r9 & 4
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                if (r10 == 0) goto L1b
                r5 = 0
            L1b:
                r10 = r9 & 16
                if (r10 == 0) goto L20
                r6 = r0
            L20:
                r10 = r9 & 32
                if (r10 == 0) goto L25
                r7 = r0
            L25:
                r9 = r9 & 64
                if (r9 == 0) goto L32
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3a
            L32:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.PositionMovementDto.Surrogate.<init>(com.robinhood.ceres.v1.PositionMovementDto$AssetClassDto, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final boolean getExternal() {
            return this.external;
        }

        public final String getLot_price() {
            return this.lot_price;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getContract_multiplier() {
            return this.contract_multiplier;
        }
    }

    /* compiled from: PositionMovementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/PositionMovementDto;", "Lcom/robinhood/ceres/v1/PositionMovement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/PositionMovementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PositionMovementDto, PositionMovement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PositionMovementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionMovementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionMovementDto> getBinaryBase64Serializer() {
            return (KSerializer) PositionMovementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PositionMovement> getProtoAdapter() {
            return PositionMovement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionMovementDto getZeroValue() {
            return PositionMovementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionMovementDto fromProto(PositionMovement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PositionMovementDto(new Surrogate(AssetClassDto.INSTANCE.fromProto(proto.getAsset_class()), proto.getInstrument_id(), proto.getQuantity(), proto.getExternal(), proto.getLot_price(), proto.getSymbol(), proto.getContract_multiplier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.PositionMovementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionMovementDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PositionMovementDto(null, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PositionMovementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET_CLASS_UNSPECIFIED", "ASSET_CLASS_OUTRIGHT_FUTURES", "ASSET_CLASS_EVENT_CONTRACT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AssetClassDto implements Dto2<PositionMovement.AssetClass>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetClassDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AssetClassDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AssetClassDto, PositionMovement.AssetClass>> binaryBase64Serializer$delegate;
        public static final AssetClassDto ASSET_CLASS_UNSPECIFIED = new ASSET_CLASS_UNSPECIFIED("ASSET_CLASS_UNSPECIFIED", 0);
        public static final AssetClassDto ASSET_CLASS_OUTRIGHT_FUTURES = new ASSET_CLASS_OUTRIGHT_FUTURES("ASSET_CLASS_OUTRIGHT_FUTURES", 1);
        public static final AssetClassDto ASSET_CLASS_EVENT_CONTRACT = new ASSET_CLASS_EVENT_CONTRACT("ASSET_CLASS_EVENT_CONTRACT", 2);

        private static final /* synthetic */ AssetClassDto[] $values() {
            return new AssetClassDto[]{ASSET_CLASS_UNSPECIFIED, ASSET_CLASS_OUTRIGHT_FUTURES, ASSET_CLASS_EVENT_CONTRACT};
        }

        public /* synthetic */ AssetClassDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AssetClassDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PositionMovementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/PositionMovementDto.AssetClassDto.ASSET_CLASS_UNSPECIFIED", "Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "toProto", "Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_CLASS_UNSPECIFIED extends AssetClassDto {
            ASSET_CLASS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PositionMovement.AssetClass toProto() {
                return PositionMovement.AssetClass.ASSET_CLASS_UNSPECIFIED;
            }
        }

        private AssetClassDto(String str, int i) {
        }

        static {
            AssetClassDto[] assetClassDtoArr$values = $values();
            $VALUES = assetClassDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetClassDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.PositionMovementDto$AssetClassDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionMovementDto.AssetClassDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PositionMovementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/PositionMovementDto.AssetClassDto.ASSET_CLASS_OUTRIGHT_FUTURES", "Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "toProto", "Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_CLASS_OUTRIGHT_FUTURES extends AssetClassDto {
            ASSET_CLASS_OUTRIGHT_FUTURES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PositionMovement.AssetClass toProto() {
                return PositionMovement.AssetClass.ASSET_CLASS_OUTRIGHT_FUTURES;
            }
        }

        /* compiled from: PositionMovementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/PositionMovementDto.AssetClassDto.ASSET_CLASS_EVENT_CONTRACT", "Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "toProto", "Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_CLASS_EVENT_CONTRACT extends AssetClassDto {
            ASSET_CLASS_EVENT_CONTRACT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PositionMovement.AssetClass toProto() {
                return PositionMovement.AssetClass.ASSET_CLASS_EVENT_CONTRACT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PositionMovementDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AssetClassDto, PositionMovement.AssetClass> {

            /* compiled from: PositionMovementDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PositionMovement.AssetClass.values().length];
                    try {
                        iArr[PositionMovement.AssetClass.ASSET_CLASS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PositionMovement.AssetClass.ASSET_CLASS_OUTRIGHT_FUTURES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PositionMovement.AssetClass.ASSET_CLASS_EVENT_CONTRACT.ordinal()] = 3;
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

            public final KSerializer<AssetClassDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AssetClassDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AssetClassDto> getBinaryBase64Serializer() {
                return (KSerializer) AssetClassDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PositionMovement.AssetClass> getProtoAdapter() {
                return PositionMovement.AssetClass.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AssetClassDto getZeroValue() {
                return AssetClassDto.ASSET_CLASS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AssetClassDto fromProto(PositionMovement.AssetClass proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AssetClassDto.ASSET_CLASS_UNSPECIFIED;
                }
                if (i == 2) {
                    return AssetClassDto.ASSET_CLASS_OUTRIGHT_FUTURES;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return AssetClassDto.ASSET_CLASS_EVENT_CONTRACT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PositionMovementDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/PositionMovementDto$AssetClassDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AssetClassDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AssetClassDto, PositionMovement.AssetClass> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.service.PositionMovement.AssetClass", AssetClassDto.getEntries(), AssetClassDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AssetClassDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AssetClassDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AssetClassDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AssetClassDto valueOf(String str) {
            return (AssetClassDto) Enum.valueOf(AssetClassDto.class, str);
        }

        public static AssetClassDto[] values() {
            return (AssetClassDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PositionMovementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/PositionMovementDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/PositionMovementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PositionMovementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.PositionMovement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PositionMovementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PositionMovementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PositionMovementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PositionMovementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.PositionMovementDto";
        }
    }
}
