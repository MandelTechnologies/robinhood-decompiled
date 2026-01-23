package com.robinhood.android.settings.settings.account.trustedcontact;

import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.models.api.identi.ApiTrustedContact;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TrustedContactUpdateViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent;", "", "<init>", "()V", "SetInputs", "SuccessfulSubmission", "Error", "ConfirmDiscard", "PopBack", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$ConfirmDiscard;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$Error;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$PopBack;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$SetInputs;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$SuccessfulSubmission;", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateEvent, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class TrustedContactUpdateViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ TrustedContactUpdateViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: TrustedContactUpdateViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$SetInputs;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent;", "model", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "<init>", "(Lcom/robinhood/models/api/identi/ApiTrustedContact;)V", "getModel", "()Lcom/robinhood/models/api/identi/ApiTrustedContact;", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "getInternationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "phoneNumberWithoutInternationalInfo", "", "getPhoneNumberWithoutInternationalInfo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateEvent$SetInputs, reason: from toString */
    public static final /* data */ class SetInputs extends TrustedContactUpdateViewState2 {
        public static final int $stable = 8;
        private final InternationalInfo internationalInfo;
        private final ApiTrustedContact model;

        public static /* synthetic */ SetInputs copy$default(SetInputs setInputs, ApiTrustedContact apiTrustedContact, int i, Object obj) {
            if ((i & 1) != 0) {
                apiTrustedContact = setInputs.model;
            }
            return setInputs.copy(apiTrustedContact);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiTrustedContact getModel() {
            return this.model;
        }

        public final SetInputs copy(ApiTrustedContact model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new SetInputs(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetInputs) && Intrinsics.areEqual(this.model, ((SetInputs) other).model);
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        public String toString() {
            return "SetInputs(model=" + this.model + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetInputs(ApiTrustedContact model) {
            super(null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
            InternationalInfo internationalInfo = (InternationalInfo) CollectionsKt.firstOrNull((List) InternationalInfo.INSTANCE.determineInfoFromPhoneNumber(model.getPhone_number()));
            this.internationalInfo = internationalInfo == null ? TrustedContactUpdateViewState3.getUsInfo() : internationalInfo;
        }

        public final ApiTrustedContact getModel() {
            return this.model;
        }

        public final InternationalInfo getInternationalInfo() {
            return this.internationalInfo;
        }

        public final String getPhoneNumberWithoutInternationalInfo() throws IOException {
            return StringsKt.replaceFirst$default(TrustedContactUpdateViewState3.stripNumberToDigits(this.model.getPhone_number()), TrustedContactUpdateViewState3.stripNumberToDigits(this.internationalInfo.getDisplayCountryPhoneCode()), "", false, 4, null);
        }
    }

    private TrustedContactUpdateViewState2() {
    }

    /* compiled from: TrustedContactUpdateViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$SuccessfulSubmission;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent;", "trustedContact", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "<init>", "(Lcom/robinhood/models/api/identi/ApiTrustedContact;)V", "getTrustedContact", "()Lcom/robinhood/models/api/identi/ApiTrustedContact;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateEvent$SuccessfulSubmission, reason: from toString */
    public static final /* data */ class SuccessfulSubmission extends TrustedContactUpdateViewState2 {
        public static final int $stable = 8;
        private final ApiTrustedContact trustedContact;

        public static /* synthetic */ SuccessfulSubmission copy$default(SuccessfulSubmission successfulSubmission, ApiTrustedContact apiTrustedContact, int i, Object obj) {
            if ((i & 1) != 0) {
                apiTrustedContact = successfulSubmission.trustedContact;
            }
            return successfulSubmission.copy(apiTrustedContact);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiTrustedContact getTrustedContact() {
            return this.trustedContact;
        }

        public final SuccessfulSubmission copy(ApiTrustedContact trustedContact) {
            Intrinsics.checkNotNullParameter(trustedContact, "trustedContact");
            return new SuccessfulSubmission(trustedContact);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SuccessfulSubmission) && Intrinsics.areEqual(this.trustedContact, ((SuccessfulSubmission) other).trustedContact);
        }

        public int hashCode() {
            return this.trustedContact.hashCode();
        }

        public String toString() {
            return "SuccessfulSubmission(trustedContact=" + this.trustedContact + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessfulSubmission(ApiTrustedContact trustedContact) {
            super(null);
            Intrinsics.checkNotNullParameter(trustedContact, "trustedContact");
            this.trustedContact = trustedContact;
        }

        public final ApiTrustedContact getTrustedContact() {
            return this.trustedContact;
        }
    }

    /* compiled from: TrustedContactUpdateViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$Error;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateEvent$Error, reason: from toString */
    public static final /* data */ class Error extends TrustedContactUpdateViewState2 {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: TrustedContactUpdateViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$ConfirmDiscard;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateEvent$ConfirmDiscard */
    public static final class ConfirmDiscard extends TrustedContactUpdateViewState2 {
        public static final int $stable = 0;
        public static final ConfirmDiscard INSTANCE = new ConfirmDiscard();

        private ConfirmDiscard() {
            super(null);
        }
    }

    /* compiled from: TrustedContactUpdateViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$PopBack;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateEvent$PopBack */
    public static final class PopBack extends TrustedContactUpdateViewState2 {
        public static final int $stable = 0;
        public static final PopBack INSTANCE = new PopBack();

        private PopBack() {
            super(null);
        }
    }
}
