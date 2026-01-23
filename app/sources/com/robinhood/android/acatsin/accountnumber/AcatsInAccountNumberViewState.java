package com.robinhood.android.acatsin.accountnumber;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInAccountNumberViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001bJ\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010$\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberViewState;", "", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "contraBrokerageLogo", "Landroid/graphics/Bitmap;", "isButtonLoading", "", "subtitleText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/Either;Landroid/graphics/Bitmap;ZLcom/robinhood/utils/resource/StringResource;)V", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getContraBrokerageLogo", "()Landroid/graphics/Bitmap;", "()Z", "getSubtitleText", "()Lcom/robinhood/utils/resource/StringResource;", "brokerName", "getBrokerName", "()Ljava/lang/String;", "getAccountNumberHint", "", "resource", "Landroid/content/res/Resources;", "getValidationHint", "resources", "findAccountNumberContentId", "getFindAccountNumberContentId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInAccountNumberViewState {
    public static final int $stable = 8;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final Bitmap contraBrokerageLogo;
    private final String findAccountNumberContentId;
    private final boolean isButtonLoading;
    private final StringResource subtitleText;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcatsInAccountNumberViewState copy$default(AcatsInAccountNumberViewState acatsInAccountNumberViewState, Either either, Bitmap bitmap, boolean z, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            either = acatsInAccountNumberViewState.brokerageOrDtcNumber;
        }
        if ((i & 2) != 0) {
            bitmap = acatsInAccountNumberViewState.contraBrokerageLogo;
        }
        if ((i & 4) != 0) {
            z = acatsInAccountNumberViewState.isButtonLoading;
        }
        if ((i & 8) != 0) {
            stringResource = acatsInAccountNumberViewState.subtitleText;
        }
        return acatsInAccountNumberViewState.copy(either, bitmap, z, stringResource);
    }

    public final Either<ApiBrokerage, String> component1() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Bitmap getContraBrokerageLogo() {
        return this.contraBrokerageLogo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsButtonLoading() {
        return this.isButtonLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    public final AcatsInAccountNumberViewState copy(Either<ApiBrokerage, String> brokerageOrDtcNumber, Bitmap contraBrokerageLogo, boolean isButtonLoading, StringResource subtitleText) {
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        return new AcatsInAccountNumberViewState(brokerageOrDtcNumber, contraBrokerageLogo, isButtonLoading, subtitleText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInAccountNumberViewState)) {
            return false;
        }
        AcatsInAccountNumberViewState acatsInAccountNumberViewState = (AcatsInAccountNumberViewState) other;
        return Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInAccountNumberViewState.brokerageOrDtcNumber) && Intrinsics.areEqual(this.contraBrokerageLogo, acatsInAccountNumberViewState.contraBrokerageLogo) && this.isButtonLoading == acatsInAccountNumberViewState.isButtonLoading && Intrinsics.areEqual(this.subtitleText, acatsInAccountNumberViewState.subtitleText);
    }

    public int hashCode() {
        int iHashCode = this.brokerageOrDtcNumber.hashCode() * 31;
        Bitmap bitmap = this.contraBrokerageLogo;
        int iHashCode2 = (((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.isButtonLoading)) * 31;
        StringResource stringResource = this.subtitleText;
        return iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "AcatsInAccountNumberViewState(brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", contraBrokerageLogo=" + this.contraBrokerageLogo + ", isButtonLoading=" + this.isButtonLoading + ", subtitleText=" + this.subtitleText + ")";
    }

    public AcatsInAccountNumberViewState(Either<ApiBrokerage, String> brokerageOrDtcNumber, Bitmap bitmap, boolean z, StringResource stringResource) {
        String find_account_contentful_id;
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        this.brokerageOrDtcNumber = brokerageOrDtcNumber;
        this.contraBrokerageLogo = bitmap;
        this.isButtonLoading = z;
        this.subtitleText = stringResource;
        if (!(brokerageOrDtcNumber instanceof Either.Left)) {
            if (!(brokerageOrDtcNumber instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            find_account_contentful_id = null;
        } else {
            find_account_contentful_id = ((ApiBrokerage) ((Either.Left) brokerageOrDtcNumber).getValue()).getFind_account_contentful_id();
        }
        this.findAccountNumberContentId = find_account_contentful_id;
    }

    public /* synthetic */ AcatsInAccountNumberViewState(Either either, Bitmap bitmap, boolean z, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(either, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? false : z, stringResource);
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final Bitmap getContraBrokerageLogo() {
        return this.contraBrokerageLogo;
    }

    public final boolean isButtonLoading() {
        return this.isButtonLoading;
    }

    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    public final String getBrokerName() {
        return Eithers.getName(this.brokerageOrDtcNumber);
    }

    public final CharSequence getAccountNumberHint(Resources resource) {
        String account_number_placeholder;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        if (either instanceof Either.Left) {
            account_number_placeholder = ((ApiBrokerage) ((Either.Left) either).getValue()).getAccount_number_placeholder();
        } else {
            if (!(either instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            account_number_placeholder = null;
        }
        return account_number_placeholder != null ? account_number_placeholder : StringResource.INSTANCE.invoke(C7686R.string.acats_account_number_hint, new Object[0]).getText(resource);
    }

    public final CharSequence getValidationHint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        if (!(either instanceof Either.Left)) {
            if (!(either instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return resources.getString(C7686R.string.acats_account_number_validation_hint_manual);
        }
        return ((ApiBrokerage) ((Either.Left) either).getValue()).getAccount_number_validation_hint();
    }

    public final String getFindAccountNumberContentId() {
        return this.findAccountNumberContentId;
    }
}
