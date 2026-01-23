package com.robinhood.android.retirement.onboarding.outro.invest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementInvestEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent;", "", "Redirect", "Exit", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent$Exit;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent$Redirect;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementInvestEvent {

    /* compiled from: RetirementInvestEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent$Redirect;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent;", "uri", "", "<init>", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Redirect implements RetirementInvestEvent {
        public static final int $stable = 0;
        private final String uri;

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirect.uri;
            }
            return redirect.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final Redirect copy(String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Redirect(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Redirect) && Intrinsics.areEqual(this.uri, ((Redirect) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "Redirect(uri=" + this.uri + ")";
        }

        public Redirect(String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final String getUri() {
            return this.uri;
        }
    }

    /* compiled from: RetirementInvestEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent$Exit;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Exit implements RetirementInvestEvent {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        private Exit() {
        }
    }
}
