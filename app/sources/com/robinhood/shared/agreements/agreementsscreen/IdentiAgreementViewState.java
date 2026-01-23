package com.robinhood.shared.agreements.agreementsscreen;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentiAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState;", "", "agreementTitleRes", "Lcom/robinhood/utils/resource/StringResource;", "getAgreementTitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "showTopBarProgressIndicator", "", "getShowTopBarProgressIndicator", "()Z", "Loading", "Error", "Loaded", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState$Error;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState$Loaded;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState$Loading;", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IdentiAgreementViewState {
    StringResource getAgreementTitleRes();

    boolean getShowTopBarProgressIndicator();

    /* compiled from: IdentiAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState$Loading;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements IdentiAgreementViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 982161969;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }

        @Override // com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState
        public StringResource getAgreementTitleRes() {
            return DefaultImpls.getAgreementTitleRes(this);
        }

        @Override // com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState
        public boolean getShowTopBarProgressIndicator() {
            return DefaultImpls.getShowTopBarProgressIndicator(this);
        }
    }

    /* compiled from: IdentiAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState$Error;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements IdentiAgreementViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -103660483;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }

        @Override // com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState
        public StringResource getAgreementTitleRes() {
            return DefaultImpls.getAgreementTitleRes(this);
        }

        @Override // com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState
        public boolean getShowTopBarProgressIndicator() {
            return DefaultImpls.getShowTopBarProgressIndicator(this);
        }
    }

    /* compiled from: IdentiAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState$Loaded;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState;", "agreementTitleRes", "Lcom/robinhood/utils/resource/StringResource;", "agreementWithContent", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "buttonDisclosureRes", "submitting", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Lcom/robinhood/utils/resource/StringResource;Z)V", "getAgreementTitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "getAgreementWithContent", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getButtonDisclosureRes", "getSubmitting", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements IdentiAgreementViewState {
        public static final int $stable = 8;
        private final StringResource agreementTitleRes;
        private final UiAgreementWithContent agreementWithContent;
        private final StringResource buttonDisclosureRes;
        private final boolean submitting;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, UiAgreementWithContent uiAgreementWithContent, StringResource stringResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.agreementTitleRes;
            }
            if ((i & 2) != 0) {
                uiAgreementWithContent = loaded.agreementWithContent;
            }
            if ((i & 4) != 0) {
                stringResource2 = loaded.buttonDisclosureRes;
            }
            if ((i & 8) != 0) {
                z = loaded.submitting;
            }
            return loaded.copy(stringResource, uiAgreementWithContent, stringResource2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getAgreementTitleRes() {
            return this.agreementTitleRes;
        }

        /* renamed from: component2, reason: from getter */
        public final UiAgreementWithContent getAgreementWithContent() {
            return this.agreementWithContent;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getButtonDisclosureRes() {
            return this.buttonDisclosureRes;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSubmitting() {
            return this.submitting;
        }

        public final Loaded copy(StringResource agreementTitleRes, UiAgreementWithContent agreementWithContent, StringResource buttonDisclosureRes, boolean submitting) {
            Intrinsics.checkNotNullParameter(agreementTitleRes, "agreementTitleRes");
            Intrinsics.checkNotNullParameter(agreementWithContent, "agreementWithContent");
            return new Loaded(agreementTitleRes, agreementWithContent, buttonDisclosureRes, submitting);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.agreementTitleRes, loaded.agreementTitleRes) && Intrinsics.areEqual(this.agreementWithContent, loaded.agreementWithContent) && Intrinsics.areEqual(this.buttonDisclosureRes, loaded.buttonDisclosureRes) && this.submitting == loaded.submitting;
        }

        public int hashCode() {
            int iHashCode = ((this.agreementTitleRes.hashCode() * 31) + this.agreementWithContent.hashCode()) * 31;
            StringResource stringResource = this.buttonDisclosureRes;
            return ((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.submitting);
        }

        public String toString() {
            return "Loaded(agreementTitleRes=" + this.agreementTitleRes + ", agreementWithContent=" + this.agreementWithContent + ", buttonDisclosureRes=" + this.buttonDisclosureRes + ", submitting=" + this.submitting + ")";
        }

        public Loaded(StringResource agreementTitleRes, UiAgreementWithContent agreementWithContent, StringResource stringResource, boolean z) {
            Intrinsics.checkNotNullParameter(agreementTitleRes, "agreementTitleRes");
            Intrinsics.checkNotNullParameter(agreementWithContent, "agreementWithContent");
            this.agreementTitleRes = agreementTitleRes;
            this.agreementWithContent = agreementWithContent;
            this.buttonDisclosureRes = stringResource;
            this.submitting = z;
        }

        @Override // com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState
        public boolean getShowTopBarProgressIndicator() {
            return DefaultImpls.getShowTopBarProgressIndicator(this);
        }

        @Override // com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementViewState
        public StringResource getAgreementTitleRes() {
            return this.agreementTitleRes;
        }

        public final UiAgreementWithContent getAgreementWithContent() {
            return this.agreementWithContent;
        }

        public final StringResource getButtonDisclosureRes() {
            return this.buttonDisclosureRes;
        }

        public final boolean getSubmitting() {
            return this.submitting;
        }
    }

    /* compiled from: IdentiAgreementViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static StringResource getAgreementTitleRes(IdentiAgreementViewState identiAgreementViewState) {
            return StringResource.INSTANCE.invoke(C37339R.string.agreement_title_empty, new Object[0]);
        }

        public static boolean getShowTopBarProgressIndicator(IdentiAgreementViewState identiAgreementViewState) {
            if (identiAgreementViewState instanceof Loaded) {
                return ((Loaded) identiAgreementViewState).getSubmitting();
            }
            if (Intrinsics.areEqual(identiAgreementViewState, Error.INSTANCE) || Intrinsics.areEqual(identiAgreementViewState, Loading.INSTANCE)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
