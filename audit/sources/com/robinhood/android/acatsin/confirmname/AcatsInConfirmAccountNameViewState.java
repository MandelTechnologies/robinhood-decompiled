package com.robinhood.android.acatsin.confirmname;

import android.graphics.Bitmap;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.acatsin.util.names.NamesOnAccount2;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInConfirmAccountNameViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003JK\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0001J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameViewState;", "", "rhsAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "namesOnAccount", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "contraBrokerLogo", "Landroid/graphics/Bitmap;", "isLoadingLogo", "", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;Landroid/graphics/Bitmap;ZLcom/robinhood/utils/Either;)V", "getRhsAccount", "()Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "getNamesOnAccount", "()Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "getContraBrokerLogo", "()Landroid/graphics/Bitmap;", "()Z", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "userFullNamesString", "getUserFullNamesString", "()Ljava/lang/String;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "nameMustMatchMessage", "getNameMustMatchMessage", "nameDoesntMatchButtonTitle", "getNameDoesntMatchButtonTitle", "isContinueLoading", "namesDontMatchEnabled", "getNamesDontMatchEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInConfirmAccountNameViewState {
    public static final int $stable = 8;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final Bitmap contraBrokerLogo;
    private final boolean isLoadingLogo;
    private final NamesOnAccount namesOnAccount;
    private final AvailableAccount rhsAccount;
    private final String userFullNamesString;

    public static /* synthetic */ AcatsInConfirmAccountNameViewState copy$default(AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState, AvailableAccount availableAccount, NamesOnAccount namesOnAccount, Bitmap bitmap, boolean z, Either either, int i, Object obj) {
        if ((i & 1) != 0) {
            availableAccount = acatsInConfirmAccountNameViewState.rhsAccount;
        }
        if ((i & 2) != 0) {
            namesOnAccount = acatsInConfirmAccountNameViewState.namesOnAccount;
        }
        if ((i & 4) != 0) {
            bitmap = acatsInConfirmAccountNameViewState.contraBrokerLogo;
        }
        if ((i & 8) != 0) {
            z = acatsInConfirmAccountNameViewState.isLoadingLogo;
        }
        if ((i & 16) != 0) {
            either = acatsInConfirmAccountNameViewState.brokerageOrDtcNumber;
        }
        Either either2 = either;
        Bitmap bitmap2 = bitmap;
        return acatsInConfirmAccountNameViewState.copy(availableAccount, namesOnAccount, bitmap2, z, either2);
    }

    /* renamed from: component1, reason: from getter */
    public final AvailableAccount getRhsAccount() {
        return this.rhsAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final NamesOnAccount getNamesOnAccount() {
        return this.namesOnAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getContraBrokerLogo() {
        return this.contraBrokerLogo;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoadingLogo() {
        return this.isLoadingLogo;
    }

    public final Either<ApiBrokerage, String> component5() {
        return this.brokerageOrDtcNumber;
    }

    public final AcatsInConfirmAccountNameViewState copy(AvailableAccount rhsAccount, NamesOnAccount namesOnAccount, Bitmap contraBrokerLogo, boolean isLoadingLogo, Either<ApiBrokerage, String> brokerageOrDtcNumber) {
        Intrinsics.checkNotNullParameter(rhsAccount, "rhsAccount");
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        return new AcatsInConfirmAccountNameViewState(rhsAccount, namesOnAccount, contraBrokerLogo, isLoadingLogo, brokerageOrDtcNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInConfirmAccountNameViewState)) {
            return false;
        }
        AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState = (AcatsInConfirmAccountNameViewState) other;
        return Intrinsics.areEqual(this.rhsAccount, acatsInConfirmAccountNameViewState.rhsAccount) && Intrinsics.areEqual(this.namesOnAccount, acatsInConfirmAccountNameViewState.namesOnAccount) && Intrinsics.areEqual(this.contraBrokerLogo, acatsInConfirmAccountNameViewState.contraBrokerLogo) && this.isLoadingLogo == acatsInConfirmAccountNameViewState.isLoadingLogo && Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInConfirmAccountNameViewState.brokerageOrDtcNumber);
    }

    public int hashCode() {
        int iHashCode = this.rhsAccount.hashCode() * 31;
        NamesOnAccount namesOnAccount = this.namesOnAccount;
        int iHashCode2 = (iHashCode + (namesOnAccount == null ? 0 : namesOnAccount.hashCode())) * 31;
        Bitmap bitmap = this.contraBrokerLogo;
        return ((((iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoadingLogo)) * 31) + this.brokerageOrDtcNumber.hashCode();
    }

    public String toString() {
        return "AcatsInConfirmAccountNameViewState(rhsAccount=" + this.rhsAccount + ", namesOnAccount=" + this.namesOnAccount + ", contraBrokerLogo=" + this.contraBrokerLogo + ", isLoadingLogo=" + this.isLoadingLogo + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ")";
    }

    public AcatsInConfirmAccountNameViewState(AvailableAccount rhsAccount, NamesOnAccount namesOnAccount, Bitmap bitmap, boolean z, Either<ApiBrokerage, String> brokerageOrDtcNumber) {
        List<NamesOnAccount2> allNames;
        Intrinsics.checkNotNullParameter(rhsAccount, "rhsAccount");
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        this.rhsAccount = rhsAccount;
        this.namesOnAccount = namesOnAccount;
        this.contraBrokerLogo = bitmap;
        this.isLoadingLogo = z;
        this.brokerageOrDtcNumber = brokerageOrDtcNumber;
        this.userFullNamesString = (namesOnAccount == null || (allNames = namesOnAccount.getAllNames()) == null) ? null : CollectionsKt.joinToString$default(allNames, "\n", null, null, 0, null, null, 62, null);
    }

    public /* synthetic */ AcatsInConfirmAccountNameViewState(AvailableAccount availableAccount, NamesOnAccount namesOnAccount, Bitmap bitmap, boolean z, Either either, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(availableAccount, (i & 2) != 0 ? null : namesOnAccount, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? false : z, either);
    }

    public final AvailableAccount getRhsAccount() {
        return this.rhsAccount;
    }

    public final NamesOnAccount getNamesOnAccount() {
        return this.namesOnAccount;
    }

    public final Bitmap getContraBrokerLogo() {
        return this.contraBrokerLogo;
    }

    public final boolean isLoadingLogo() {
        return this.isLoadingLogo;
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final String getUserFullNamesString() {
        return this.userFullNamesString;
    }

    public final StringResource getTitle() {
        if (this.rhsAccount.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
            return StringResource.INSTANCE.invoke(C7725R.string.confirm_account_names, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7725R.string.confirm_account_name, new Object[0]);
    }

    public final StringResource getNameMustMatchMessage() {
        if (this.rhsAccount.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
            return StringResource.INSTANCE.invoke(C7725R.string.account_name_must_match_message_joint, new Object[0]);
        }
        String name = Eithers.getName(this.brokerageOrDtcNumber);
        return StringResource.INSTANCE.invoke(C7725R.string.account_name_must_match_message, name + PlaceholderUtils.XXShortPlaceholderText + this.rhsAccount.getTitle());
    }

    public final StringResource getNameDoesntMatchButtonTitle() {
        if (this.rhsAccount.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
            return StringResource.INSTANCE.invoke(C7725R.string.these_names_dont_match, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7725R.string.my_name_doesnt_match, new Object[0]);
    }

    public final boolean isContinueLoading() {
        return this.namesOnAccount == null;
    }

    public final boolean getNamesDontMatchEnabled() {
        return this.namesOnAccount != null;
    }
}
