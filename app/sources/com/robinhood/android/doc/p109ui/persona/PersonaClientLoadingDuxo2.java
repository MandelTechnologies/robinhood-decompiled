package com.robinhood.android.doc.p109ui.persona;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaClientLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent;", "", "<init>", "()V", "InquiryCreated", "Error", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent$Error;", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent$InquiryCreated;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.persona.PersonaClientLoadingEvent, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class PersonaClientLoadingDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ PersonaClientLoadingDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PersonaClientLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent$InquiryCreated;", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent;", "inquiryId", "", "requiresAuthentication", "", "personaLocale", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getInquiryId", "()Ljava/lang/String;", "getRequiresAuthentication", "()Z", "getPersonaLocale", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaClientLoadingEvent$InquiryCreated, reason: from toString */
    public static final /* data */ class InquiryCreated extends PersonaClientLoadingDuxo2 {
        public static final int $stable = 0;
        private final String inquiryId;
        private final String personaLocale;
        private final boolean requiresAuthentication;

        public static /* synthetic */ InquiryCreated copy$default(InquiryCreated inquiryCreated, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inquiryCreated.inquiryId;
            }
            if ((i & 2) != 0) {
                z = inquiryCreated.requiresAuthentication;
            }
            if ((i & 4) != 0) {
                str2 = inquiryCreated.personaLocale;
            }
            return inquiryCreated.copy(str, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRequiresAuthentication() {
            return this.requiresAuthentication;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPersonaLocale() {
            return this.personaLocale;
        }

        public final InquiryCreated copy(String inquiryId, boolean requiresAuthentication, String personaLocale) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return new InquiryCreated(inquiryId, requiresAuthentication, personaLocale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryCreated)) {
                return false;
            }
            InquiryCreated inquiryCreated = (InquiryCreated) other;
            return Intrinsics.areEqual(this.inquiryId, inquiryCreated.inquiryId) && this.requiresAuthentication == inquiryCreated.requiresAuthentication && Intrinsics.areEqual(this.personaLocale, inquiryCreated.personaLocale);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + Boolean.hashCode(this.requiresAuthentication)) * 31;
            String str = this.personaLocale;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InquiryCreated(inquiryId=" + this.inquiryId + ", requiresAuthentication=" + this.requiresAuthentication + ", personaLocale=" + this.personaLocale + ")";
        }

        public /* synthetic */ InquiryCreated(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? null : str2);
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final boolean getRequiresAuthentication() {
            return this.requiresAuthentication;
        }

        public final String getPersonaLocale() {
            return this.personaLocale;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InquiryCreated(String inquiryId, boolean z, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
            this.requiresAuthentication = z;
            this.personaLocale = str;
        }
    }

    private PersonaClientLoadingDuxo2() {
    }

    /* compiled from: PersonaClientLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent$Error;", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaClientLoadingEvent$Error */
    public static final /* data */ class Error extends PersonaClientLoadingDuxo2 {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 857486781;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }
}
