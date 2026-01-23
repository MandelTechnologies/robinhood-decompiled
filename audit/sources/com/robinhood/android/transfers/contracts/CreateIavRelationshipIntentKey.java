package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateIavRelationshipIntentKey.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J]\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/CreateIavRelationshipIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "source", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "recommendedTransfersAmount", "Ljava/math/BigDecimal;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "isFromRhfOnboarding", "", "useAchromaticOverlay", "paymentLinkingContext", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/shared/transfers/contracts/context/IavSource;Lcom/robinhood/models/db/TransferDirection;Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;ZZLcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;Lcom/robinhood/models/api/ColorTheme;)V", "getSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getRecommendedTransfersAmount", "()Ljava/math/BigDecimal;", "getTransferAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "()Z", "getUseAchromaticOverlay", "getPaymentLinkingContext", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CreateIavRelationshipIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CreateIavRelationshipIntentKey> CREATOR = new Creator();
    private final TransferDirection direction;
    private final boolean isFromRhfOnboarding;
    private final PaymentLinkingContext paymentLinkingContext;
    private final BigDecimal recommendedTransfersAmount;
    private final IavSource source;
    private final ColorTheme theme;
    private final ApiTransferAccount.TransferAccountType transferAccountType;
    private final boolean useAchromaticOverlay;

    /* compiled from: CreateIavRelationshipIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<CreateIavRelationshipIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateIavRelationshipIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IavSource iavSourceValueOf = IavSource.valueOf(parcel.readString());
            TransferDirection transferDirectionValueOf = TransferDirection.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            ApiTransferAccount.TransferAccountType transferAccountTypeValueOf = ApiTransferAccount.TransferAccountType.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new CreateIavRelationshipIntentKey(iavSourceValueOf, transferDirectionValueOf, bigDecimal, transferAccountTypeValueOf, z2, parcel.readInt() == 0 ? z : true, (PaymentLinkingContext) parcel.readSerializable(), ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateIavRelationshipIntentKey[] newArray(int i) {
            return new CreateIavRelationshipIntentKey[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source) {
        this(source, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source, TransferDirection direction) {
        this(source, direction, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source, TransferDirection direction, BigDecimal bigDecimal) {
        this(source, direction, bigDecimal, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source, TransferDirection direction, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType) {
        this(source, direction, bigDecimal, transferAccountType, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source, TransferDirection direction, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, boolean z) {
        this(source, direction, bigDecimal, transferAccountType, z, false, null, null, 224, null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source, TransferDirection direction, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, boolean z, boolean z2) {
        this(source, direction, bigDecimal, transferAccountType, z, z2, null, null, 192, null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source, TransferDirection direction, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, boolean z, boolean z2, PaymentLinkingContext paymentLinkingContext) {
        this(source, direction, bigDecimal, transferAccountType, z, z2, paymentLinkingContext, null, 128, null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
    }

    public static /* synthetic */ CreateIavRelationshipIntentKey copy$default(CreateIavRelationshipIntentKey createIavRelationshipIntentKey, IavSource iavSource, TransferDirection transferDirection, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, boolean z, boolean z2, PaymentLinkingContext paymentLinkingContext, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            iavSource = createIavRelationshipIntentKey.source;
        }
        if ((i & 2) != 0) {
            transferDirection = createIavRelationshipIntentKey.direction;
        }
        if ((i & 4) != 0) {
            bigDecimal = createIavRelationshipIntentKey.recommendedTransfersAmount;
        }
        if ((i & 8) != 0) {
            transferAccountType = createIavRelationshipIntentKey.transferAccountType;
        }
        if ((i & 16) != 0) {
            z = createIavRelationshipIntentKey.isFromRhfOnboarding;
        }
        if ((i & 32) != 0) {
            z2 = createIavRelationshipIntentKey.useAchromaticOverlay;
        }
        if ((i & 64) != 0) {
            paymentLinkingContext = createIavRelationshipIntentKey.paymentLinkingContext;
        }
        if ((i & 128) != 0) {
            colorTheme = createIavRelationshipIntentKey.theme;
        }
        PaymentLinkingContext paymentLinkingContext2 = paymentLinkingContext;
        ColorTheme colorTheme2 = colorTheme;
        boolean z3 = z;
        boolean z4 = z2;
        return createIavRelationshipIntentKey.copy(iavSource, transferDirection, bigDecimal, transferAccountType, z3, z4, paymentLinkingContext2, colorTheme2);
    }

    /* renamed from: component1, reason: from getter */
    public final IavSource getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getRecommendedTransfersAmount() {
        return this.recommendedTransfersAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
        return this.transferAccountType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUseAchromaticOverlay() {
        return this.useAchromaticOverlay;
    }

    /* renamed from: component7, reason: from getter */
    public final PaymentLinkingContext getPaymentLinkingContext() {
        return this.paymentLinkingContext;
    }

    /* renamed from: component8, reason: from getter */
    public final ColorTheme getTheme() {
        return this.theme;
    }

    public final CreateIavRelationshipIntentKey copy(IavSource source, TransferDirection direction, BigDecimal recommendedTransfersAmount, ApiTransferAccount.TransferAccountType transferAccountType, boolean isFromRhfOnboarding, boolean useAchromaticOverlay, PaymentLinkingContext paymentLinkingContext, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new CreateIavRelationshipIntentKey(source, direction, recommendedTransfersAmount, transferAccountType, isFromRhfOnboarding, useAchromaticOverlay, paymentLinkingContext, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateIavRelationshipIntentKey)) {
            return false;
        }
        CreateIavRelationshipIntentKey createIavRelationshipIntentKey = (CreateIavRelationshipIntentKey) other;
        return this.source == createIavRelationshipIntentKey.source && this.direction == createIavRelationshipIntentKey.direction && Intrinsics.areEqual(this.recommendedTransfersAmount, createIavRelationshipIntentKey.recommendedTransfersAmount) && this.transferAccountType == createIavRelationshipIntentKey.transferAccountType && this.isFromRhfOnboarding == createIavRelationshipIntentKey.isFromRhfOnboarding && this.useAchromaticOverlay == createIavRelationshipIntentKey.useAchromaticOverlay && Intrinsics.areEqual(this.paymentLinkingContext, createIavRelationshipIntentKey.paymentLinkingContext) && this.theme == createIavRelationshipIntentKey.theme;
    }

    public int hashCode() {
        int iHashCode = ((this.source.hashCode() * 31) + this.direction.hashCode()) * 31;
        BigDecimal bigDecimal = this.recommendedTransfersAmount;
        int iHashCode2 = (((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.transferAccountType.hashCode()) * 31) + Boolean.hashCode(this.isFromRhfOnboarding)) * 31) + Boolean.hashCode(this.useAchromaticOverlay)) * 31;
        PaymentLinkingContext paymentLinkingContext = this.paymentLinkingContext;
        return ((iHashCode2 + (paymentLinkingContext != null ? paymentLinkingContext.hashCode() : 0)) * 31) + this.theme.hashCode();
    }

    public String toString() {
        return "CreateIavRelationshipIntentKey(source=" + this.source + ", direction=" + this.direction + ", recommendedTransfersAmount=" + this.recommendedTransfersAmount + ", transferAccountType=" + this.transferAccountType + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ", useAchromaticOverlay=" + this.useAchromaticOverlay + ", paymentLinkingContext=" + this.paymentLinkingContext + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source.name());
        dest.writeString(this.direction.name());
        dest.writeSerializable(this.recommendedTransfersAmount);
        dest.writeString(this.transferAccountType.name());
        dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        dest.writeInt(this.useAchromaticOverlay ? 1 : 0);
        dest.writeSerializable(this.paymentLinkingContext);
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    @JvmOverloads
    public CreateIavRelationshipIntentKey(IavSource source, TransferDirection direction, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, boolean z, boolean z2, PaymentLinkingContext paymentLinkingContext, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.source = source;
        this.direction = direction;
        this.recommendedTransfersAmount = bigDecimal;
        this.transferAccountType = transferAccountType;
        this.isFromRhfOnboarding = z;
        this.useAchromaticOverlay = z2;
        this.paymentLinkingContext = paymentLinkingContext;
        this.theme = theme;
    }

    public final IavSource getSource() {
        return this.source;
    }

    public /* synthetic */ CreateIavRelationshipIntentKey(IavSource iavSource, TransferDirection transferDirection, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, boolean z, boolean z2, PaymentLinkingContext paymentLinkingContext, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iavSource, (i & 2) != 0 ? TransferDirection.DEPOSIT : transferDirection, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? ApiTransferAccount.TransferAccountType.RHS : transferAccountType, (i & 16) != 0 ? false : z, (i & 32) == 0 ? z2 : false, (i & 64) == 0 ? paymentLinkingContext : null, (i & 128) != 0 ? ColorTheme.DEFAULT : colorTheme);
    }

    public final TransferDirection getDirection() {
        return this.direction;
    }

    public final BigDecimal getRecommendedTransfersAmount() {
        return this.recommendedTransfersAmount;
    }

    public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
        return this.transferAccountType;
    }

    public final boolean isFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    public final boolean getUseAchromaticOverlay() {
        return this.useAchromaticOverlay;
    }

    public final PaymentLinkingContext getPaymentLinkingContext() {
        return this.paymentLinkingContext;
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }
}
