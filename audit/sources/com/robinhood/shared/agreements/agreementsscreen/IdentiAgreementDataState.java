package com.robinhood.shared.agreements.agreementsscreen;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentiAgreementDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;", "", "agreementType", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "agreementWithContent", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "loadingError", "", "submitting", "", "<init>", "(Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Ljava/lang/Throwable;Z)V", "getAgreementType", "()Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "getAgreementWithContent", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getLoadingError", "()Ljava/lang/Throwable;", "getSubmitting", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Provider", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class IdentiAgreementDataState {
    private final IdentiAgreementType agreementType;
    private final UiAgreementWithContent agreementWithContent;
    private final Throwable loadingError;
    private final boolean submitting;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ IdentiAgreementDataState copy$default(IdentiAgreementDataState identiAgreementDataState, IdentiAgreementType identiAgreementType, UiAgreementWithContent uiAgreementWithContent, Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            identiAgreementType = identiAgreementDataState.agreementType;
        }
        if ((i & 2) != 0) {
            uiAgreementWithContent = identiAgreementDataState.agreementWithContent;
        }
        if ((i & 4) != 0) {
            th = identiAgreementDataState.loadingError;
        }
        if ((i & 8) != 0) {
            z = identiAgreementDataState.submitting;
        }
        return identiAgreementDataState.copy(identiAgreementType, uiAgreementWithContent, th, z);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentiAgreementType getAgreementType() {
        return this.agreementType;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAgreementWithContent getAgreementWithContent() {
        return this.agreementWithContent;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getLoadingError() {
        return this.loadingError;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSubmitting() {
        return this.submitting;
    }

    public final IdentiAgreementDataState copy(IdentiAgreementType agreementType, UiAgreementWithContent agreementWithContent, Throwable loadingError, boolean submitting) {
        Intrinsics.checkNotNullParameter(agreementType, "agreementType");
        return new IdentiAgreementDataState(agreementType, agreementWithContent, loadingError, submitting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentiAgreementDataState)) {
            return false;
        }
        IdentiAgreementDataState identiAgreementDataState = (IdentiAgreementDataState) other;
        return Intrinsics.areEqual(this.agreementType, identiAgreementDataState.agreementType) && Intrinsics.areEqual(this.agreementWithContent, identiAgreementDataState.agreementWithContent) && Intrinsics.areEqual(this.loadingError, identiAgreementDataState.loadingError) && this.submitting == identiAgreementDataState.submitting;
    }

    public int hashCode() {
        int iHashCode = this.agreementType.hashCode() * 31;
        UiAgreementWithContent uiAgreementWithContent = this.agreementWithContent;
        int iHashCode2 = (iHashCode + (uiAgreementWithContent == null ? 0 : uiAgreementWithContent.hashCode())) * 31;
        Throwable th = this.loadingError;
        return ((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31) + Boolean.hashCode(this.submitting);
    }

    public String toString() {
        return "IdentiAgreementDataState(agreementType=" + this.agreementType + ", agreementWithContent=" + this.agreementWithContent + ", loadingError=" + this.loadingError + ", submitting=" + this.submitting + ")";
    }

    public IdentiAgreementDataState(IdentiAgreementType agreementType, UiAgreementWithContent uiAgreementWithContent, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(agreementType, "agreementType");
        this.agreementType = agreementType;
        this.agreementWithContent = uiAgreementWithContent;
        this.loadingError = th;
        this.submitting = z;
    }

    public /* synthetic */ IdentiAgreementDataState(IdentiAgreementType identiAgreementType, UiAgreementWithContent uiAgreementWithContent, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identiAgreementType, (i & 2) != 0 ? null : uiAgreementWithContent, (i & 4) != 0 ? null : th, (i & 8) != 0 ? false : z);
    }

    public final IdentiAgreementType getAgreementType() {
        return this.agreementType;
    }

    public final UiAgreementWithContent getAgreementWithContent() {
        return this.agreementWithContent;
    }

    public final Throwable getLoadingError() {
        return this.loadingError;
    }

    public final boolean getSubmitting() {
        return this.submitting;
    }

    /* compiled from: IdentiAgreementDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState;", "<init>", "()V", "reduce", "dataState", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<IdentiAgreementDataState, IdentiAgreementViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public IdentiAgreementViewState reduce(IdentiAgreementDataState dataState) {
            StringResource stringResourceInvoke;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getAgreementWithContent() == null) {
                return dataState.getLoadingError() != null ? IdentiAgreementViewState.Error.INSTANCE : IdentiAgreementViewState.Loading.INSTANCE;
            }
            IdentiAgreementType agreementType = dataState.getAgreementType();
            if (agreementType instanceof IdentiAgreementType.ServerDriven) {
                String displayTitle = ((IdentiAgreementType.ServerDriven) dataState.getAgreementType()).getDisplayTitle();
                if (displayTitle == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(displayTitle)) == null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_empty, new Object[0]);
                }
            } else if (agreementType == IdentiAgreementType.ClientDriven.DRIP_INDIVIDUAL || agreementType == IdentiAgreementType.ClientDriven.DRIP_INDIVIDUAL_ACCOUNT_SCOPE) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_drip_individual, new Object[0]);
            } else if (agreementType == IdentiAgreementType.ClientDriven.DRIP_IRA_ROTH) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_drip_ira_roth, new Object[0]);
            } else if (agreementType == IdentiAgreementType.ClientDriven.DRIP_IRA_TRADITIONAL) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_drip_ira_traditional, new Object[0]);
            } else if (agreementType == IdentiAgreementType.ClientDriven.DRIP_JOINT_TENANCY_WITH_ROS) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_drip_joint_tenancy_with_ros, new Object[0]);
            } else if (agreementType == IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_equities_mobile_auto_send, new Object[0]);
            } else if (agreementType == IdentiAgreementType.ClientDriven.COPILOT_DIGEST) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_cortex_digest, new Object[0]);
            } else {
                if (agreementType != IdentiAgreementType.ClientDriven.CUSTODIAL_DRIP_AGREEMENT) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C37339R.string.agreement_title_drip_custodial, new Object[0]);
            }
            UiAgreementWithContent agreementWithContent = dataState.getAgreementWithContent();
            IdentiAgreementType agreementType2 = dataState.getAgreementType();
            StringResource stringResourceInvoke2 = null;
            if (agreementType2 instanceof IdentiAgreementType.ServerDriven) {
                String buttonDisclosure = ((IdentiAgreementType.ServerDriven) dataState.getAgreementType()).getButtonDisclosure();
                if (buttonDisclosure != null) {
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(buttonDisclosure);
                }
            } else if (agreementType2 == IdentiAgreementType.ClientDriven.COPILOT_DIGEST || agreementType2 == IdentiAgreementType.ClientDriven.DRIP_JOINT_TENANCY_WITH_ROS) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C37339R.string.disclosure_cortex_digest, new Object[0]);
            }
            return new IdentiAgreementViewState.Loaded(stringResourceInvoke, agreementWithContent, stringResourceInvoke2, dataState.getSubmitting());
        }
    }
}
