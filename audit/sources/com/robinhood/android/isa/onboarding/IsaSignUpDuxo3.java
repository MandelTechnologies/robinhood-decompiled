package com.robinhood.android.isa.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent;", "", "InfoSheet", "Onboarding", "Error", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent$Error;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent$InfoSheet;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent$Onboarding;", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpEvent, reason: use source file name */
/* loaded from: classes10.dex */
public interface IsaSignUpDuxo3 {

    /* compiled from: IsaSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent$InfoSheet;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpEvent$InfoSheet, reason: from toString */
    public static final /* data */ class InfoSheet implements IsaSignUpDuxo3 {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ InfoSheet copy$default(InfoSheet infoSheet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoSheet.id;
            }
            return infoSheet.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final InfoSheet copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new InfoSheet(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InfoSheet) && Intrinsics.areEqual(this.id, ((InfoSheet) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "InfoSheet(id=" + this.id + ")";
        }

        public InfoSheet(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: IsaSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent$Onboarding;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpEvent$Onboarding */
    public static final /* data */ class Onboarding implements IsaSignUpDuxo3 {
        public static final int $stable = 0;
        public static final Onboarding INSTANCE = new Onboarding();

        public boolean equals(Object other) {
            return this == other || (other instanceof Onboarding);
        }

        public int hashCode() {
            return 404553206;
        }

        public String toString() {
            return "Onboarding";
        }

        private Onboarding() {
        }
    }

    /* compiled from: IsaSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent$Error;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpEvent$Error */
    public static final /* data */ class Error implements IsaSignUpDuxo3 {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1136479565;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }
}
