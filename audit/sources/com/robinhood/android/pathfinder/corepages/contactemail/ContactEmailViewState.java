package com.robinhood.android.pathfinder.corepages.contactemail;

import com.robinhood.models.p355ui.pathfinder.contexts.OptionalFieldDescription;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ContactEmailViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0015\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0012\u0010\u000f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState;", "", "isSending", "", "()Z", "descriptionInput", "", "getDescriptionInput", "()Ljava/lang/String;", "optionalFieldInputs", "Lkotlinx/collections/immutable/ImmutableMap;", "getOptionalFieldInputs", "()Lkotlinx/collections/immutable/ImmutableMap;", "callToAction", "getCallToAction", "isContinueButtonEnabled", "optionalFields", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/pathfinder/contexts/OptionalFieldDescription;", "getOptionalFields", "()Lkotlinx/collections/immutable/ImmutableList;", "EmailRequired", "EmailNotRequired", "Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState$EmailNotRequired;", "Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState$EmailRequired;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface ContactEmailViewState {
    String getCallToAction();

    String getDescriptionInput();

    ImmutableMap<String, String> getOptionalFieldInputs();

    ImmutableList<OptionalFieldDescription> getOptionalFields();

    boolean isContinueButtonEnabled();

    boolean isSending();

    /* compiled from: ContactEmailViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jq\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState$EmailRequired;", "Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState;", "isSending", "", "descriptionInput", "", "optionalFieldInputs", "Lkotlinx/collections/immutable/ImmutableMap;", "callToAction", "isContinueButtonEnabled", "optionalFields", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/pathfinder/contexts/OptionalFieldDescription;", "emailInput", "emailErrorMessage", "Lcom/robinhood/models/serverdriven/db/RichText;", "<init>", "(ZLjava/lang/String;Lkotlinx/collections/immutable/ImmutableMap;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;)V", "()Z", "getDescriptionInput", "()Ljava/lang/String;", "getOptionalFieldInputs", "()Lkotlinx/collections/immutable/ImmutableMap;", "getCallToAction", "getOptionalFields", "()Lkotlinx/collections/immutable/ImmutableList;", "getEmailInput", "getEmailErrorMessage", "()Lcom/robinhood/models/serverdriven/db/RichText;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EmailRequired implements ContactEmailViewState {
        public static final int $stable = 8;
        private final String callToAction;
        private final String descriptionInput;
        private final RichText emailErrorMessage;
        private final String emailInput;
        private final boolean isContinueButtonEnabled;
        private final boolean isSending;
        private final ImmutableMap<String, String> optionalFieldInputs;
        private final ImmutableList<OptionalFieldDescription> optionalFields;

        public static /* synthetic */ EmailRequired copy$default(EmailRequired emailRequired, boolean z, String str, ImmutableMap immutableMap, String str2, boolean z2, ImmutableList immutableList, String str3, RichText richText, int i, Object obj) {
            if ((i & 1) != 0) {
                z = emailRequired.isSending;
            }
            if ((i & 2) != 0) {
                str = emailRequired.descriptionInput;
            }
            if ((i & 4) != 0) {
                immutableMap = emailRequired.optionalFieldInputs;
            }
            if ((i & 8) != 0) {
                str2 = emailRequired.callToAction;
            }
            if ((i & 16) != 0) {
                z2 = emailRequired.isContinueButtonEnabled;
            }
            if ((i & 32) != 0) {
                immutableList = emailRequired.optionalFields;
            }
            if ((i & 64) != 0) {
                str3 = emailRequired.emailInput;
            }
            if ((i & 128) != 0) {
                richText = emailRequired.emailErrorMessage;
            }
            String str4 = str3;
            RichText richText2 = richText;
            boolean z3 = z2;
            ImmutableList immutableList2 = immutableList;
            return emailRequired.copy(z, str, immutableMap, str2, z3, immutableList2, str4, richText2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSending() {
            return this.isSending;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescriptionInput() {
            return this.descriptionInput;
        }

        public final ImmutableMap<String, String> component3() {
            return this.optionalFieldInputs;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCallToAction() {
            return this.callToAction;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final ImmutableList<OptionalFieldDescription> component6() {
            return this.optionalFields;
        }

        /* renamed from: component7, reason: from getter */
        public final String getEmailInput() {
            return this.emailInput;
        }

        /* renamed from: component8, reason: from getter */
        public final RichText getEmailErrorMessage() {
            return this.emailErrorMessage;
        }

        public final EmailRequired copy(boolean isSending, String descriptionInput, ImmutableMap<String, String> optionalFieldInputs, String callToAction, boolean isContinueButtonEnabled, ImmutableList<OptionalFieldDescription> optionalFields, String emailInput, RichText emailErrorMessage) {
            Intrinsics.checkNotNullParameter(descriptionInput, "descriptionInput");
            Intrinsics.checkNotNullParameter(optionalFieldInputs, "optionalFieldInputs");
            Intrinsics.checkNotNullParameter(optionalFields, "optionalFields");
            return new EmailRequired(isSending, descriptionInput, optionalFieldInputs, callToAction, isContinueButtonEnabled, optionalFields, emailInput, emailErrorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmailRequired)) {
                return false;
            }
            EmailRequired emailRequired = (EmailRequired) other;
            return this.isSending == emailRequired.isSending && Intrinsics.areEqual(this.descriptionInput, emailRequired.descriptionInput) && Intrinsics.areEqual(this.optionalFieldInputs, emailRequired.optionalFieldInputs) && Intrinsics.areEqual(this.callToAction, emailRequired.callToAction) && this.isContinueButtonEnabled == emailRequired.isContinueButtonEnabled && Intrinsics.areEqual(this.optionalFields, emailRequired.optionalFields) && Intrinsics.areEqual(this.emailInput, emailRequired.emailInput) && Intrinsics.areEqual(this.emailErrorMessage, emailRequired.emailErrorMessage);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isSending) * 31) + this.descriptionInput.hashCode()) * 31) + this.optionalFieldInputs.hashCode()) * 31;
            String str = this.callToAction;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31) + this.optionalFields.hashCode()) * 31;
            String str2 = this.emailInput;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            RichText richText = this.emailErrorMessage;
            return iHashCode3 + (richText != null ? richText.hashCode() : 0);
        }

        public String toString() {
            return "EmailRequired(isSending=" + this.isSending + ", descriptionInput=" + this.descriptionInput + ", optionalFieldInputs=" + this.optionalFieldInputs + ", callToAction=" + this.callToAction + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", optionalFields=" + this.optionalFields + ", emailInput=" + this.emailInput + ", emailErrorMessage=" + this.emailErrorMessage + ")";
        }

        public EmailRequired(boolean z, String descriptionInput, ImmutableMap<String, String> optionalFieldInputs, String str, boolean z2, ImmutableList<OptionalFieldDescription> optionalFields, String str2, RichText richText) {
            Intrinsics.checkNotNullParameter(descriptionInput, "descriptionInput");
            Intrinsics.checkNotNullParameter(optionalFieldInputs, "optionalFieldInputs");
            Intrinsics.checkNotNullParameter(optionalFields, "optionalFields");
            this.isSending = z;
            this.descriptionInput = descriptionInput;
            this.optionalFieldInputs = optionalFieldInputs;
            this.callToAction = str;
            this.isContinueButtonEnabled = z2;
            this.optionalFields = optionalFields;
            this.emailInput = str2;
            this.emailErrorMessage = richText;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public boolean isSending() {
            return this.isSending;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public String getDescriptionInput() {
            return this.descriptionInput;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public ImmutableMap<String, String> getOptionalFieldInputs() {
            return this.optionalFieldInputs;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public String getCallToAction() {
            return this.callToAction;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public boolean isContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public ImmutableList<OptionalFieldDescription> getOptionalFields() {
            return this.optionalFields;
        }

        public final String getEmailInput() {
            return this.emailInput;
        }

        public final RichText getEmailErrorMessage() {
            return this.emailErrorMessage;
        }
    }

    /* compiled from: ContactEmailViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState$EmailNotRequired;", "Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState;", "isSending", "", "descriptionInput", "", "optionalFieldInputs", "Lkotlinx/collections/immutable/ImmutableMap;", "callToAction", "isContinueButtonEnabled", "optionalFields", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/pathfinder/contexts/OptionalFieldDescription;", "<init>", "(ZLjava/lang/String;Lkotlinx/collections/immutable/ImmutableMap;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;)V", "()Z", "getDescriptionInput", "()Ljava/lang/String;", "getOptionalFieldInputs", "()Lkotlinx/collections/immutable/ImmutableMap;", "getCallToAction", "getOptionalFields", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EmailNotRequired implements ContactEmailViewState {
        public static final int $stable = 8;
        private final String callToAction;
        private final String descriptionInput;
        private final boolean isContinueButtonEnabled;
        private final boolean isSending;
        private final ImmutableMap<String, String> optionalFieldInputs;
        private final ImmutableList<OptionalFieldDescription> optionalFields;

        public static /* synthetic */ EmailNotRequired copy$default(EmailNotRequired emailNotRequired, boolean z, String str, ImmutableMap immutableMap, String str2, boolean z2, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                z = emailNotRequired.isSending;
            }
            if ((i & 2) != 0) {
                str = emailNotRequired.descriptionInput;
            }
            if ((i & 4) != 0) {
                immutableMap = emailNotRequired.optionalFieldInputs;
            }
            if ((i & 8) != 0) {
                str2 = emailNotRequired.callToAction;
            }
            if ((i & 16) != 0) {
                z2 = emailNotRequired.isContinueButtonEnabled;
            }
            if ((i & 32) != 0) {
                immutableList = emailNotRequired.optionalFields;
            }
            boolean z3 = z2;
            ImmutableList immutableList2 = immutableList;
            return emailNotRequired.copy(z, str, immutableMap, str2, z3, immutableList2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSending() {
            return this.isSending;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescriptionInput() {
            return this.descriptionInput;
        }

        public final ImmutableMap<String, String> component3() {
            return this.optionalFieldInputs;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCallToAction() {
            return this.callToAction;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final ImmutableList<OptionalFieldDescription> component6() {
            return this.optionalFields;
        }

        public final EmailNotRequired copy(boolean isSending, String descriptionInput, ImmutableMap<String, String> optionalFieldInputs, String callToAction, boolean isContinueButtonEnabled, ImmutableList<OptionalFieldDescription> optionalFields) {
            Intrinsics.checkNotNullParameter(descriptionInput, "descriptionInput");
            Intrinsics.checkNotNullParameter(optionalFieldInputs, "optionalFieldInputs");
            Intrinsics.checkNotNullParameter(optionalFields, "optionalFields");
            return new EmailNotRequired(isSending, descriptionInput, optionalFieldInputs, callToAction, isContinueButtonEnabled, optionalFields);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmailNotRequired)) {
                return false;
            }
            EmailNotRequired emailNotRequired = (EmailNotRequired) other;
            return this.isSending == emailNotRequired.isSending && Intrinsics.areEqual(this.descriptionInput, emailNotRequired.descriptionInput) && Intrinsics.areEqual(this.optionalFieldInputs, emailNotRequired.optionalFieldInputs) && Intrinsics.areEqual(this.callToAction, emailNotRequired.callToAction) && this.isContinueButtonEnabled == emailNotRequired.isContinueButtonEnabled && Intrinsics.areEqual(this.optionalFields, emailNotRequired.optionalFields);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isSending) * 31) + this.descriptionInput.hashCode()) * 31) + this.optionalFieldInputs.hashCode()) * 31;
            String str = this.callToAction;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31) + this.optionalFields.hashCode();
        }

        public String toString() {
            return "EmailNotRequired(isSending=" + this.isSending + ", descriptionInput=" + this.descriptionInput + ", optionalFieldInputs=" + this.optionalFieldInputs + ", callToAction=" + this.callToAction + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", optionalFields=" + this.optionalFields + ")";
        }

        public EmailNotRequired(boolean z, String descriptionInput, ImmutableMap<String, String> optionalFieldInputs, String str, boolean z2, ImmutableList<OptionalFieldDescription> optionalFields) {
            Intrinsics.checkNotNullParameter(descriptionInput, "descriptionInput");
            Intrinsics.checkNotNullParameter(optionalFieldInputs, "optionalFieldInputs");
            Intrinsics.checkNotNullParameter(optionalFields, "optionalFields");
            this.isSending = z;
            this.descriptionInput = descriptionInput;
            this.optionalFieldInputs = optionalFieldInputs;
            this.callToAction = str;
            this.isContinueButtonEnabled = z2;
            this.optionalFields = optionalFields;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public boolean isSending() {
            return this.isSending;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public String getDescriptionInput() {
            return this.descriptionInput;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public ImmutableMap<String, String> getOptionalFieldInputs() {
            return this.optionalFieldInputs;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public String getCallToAction() {
            return this.callToAction;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public boolean isContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        @Override // com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState
        public ImmutableList<OptionalFieldDescription> getOptionalFields() {
            return this.optionalFields;
        }
    }
}
