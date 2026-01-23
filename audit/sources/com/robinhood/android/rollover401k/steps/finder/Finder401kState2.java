package com.robinhood.android.rollover401k.steps.finder;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Finder401kState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent;", "", "<init>", "()V", "OpenPlaidForInstitution", "NavigateByFragmentKey", "Exit", "Error", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$Error;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$Exit;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$NavigateByFragmentKey;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$OpenPlaidForInstitution;", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsEvent, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class Finder401kState2 {
    public static final int $stable = 0;

    public /* synthetic */ Finder401kState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Finder401kState2() {
    }

    /* compiled from: Finder401kState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$OpenPlaidForInstitution;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent;", "linkToken", "", "<init>", "(Ljava/lang/String;)V", "getLinkToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsEvent$OpenPlaidForInstitution, reason: from toString */
    public static final /* data */ class OpenPlaidForInstitution extends Finder401kState2 {
        public static final int $stable = 0;
        private final String linkToken;

        public static /* synthetic */ OpenPlaidForInstitution copy$default(OpenPlaidForInstitution openPlaidForInstitution, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openPlaidForInstitution.linkToken;
            }
            return openPlaidForInstitution.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLinkToken() {
            return this.linkToken;
        }

        public final OpenPlaidForInstitution copy(String linkToken) {
            Intrinsics.checkNotNullParameter(linkToken, "linkToken");
            return new OpenPlaidForInstitution(linkToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenPlaidForInstitution) && Intrinsics.areEqual(this.linkToken, ((OpenPlaidForInstitution) other).linkToken);
        }

        public int hashCode() {
            return this.linkToken.hashCode();
        }

        public String toString() {
            return "OpenPlaidForInstitution(linkToken=" + this.linkToken + ")";
        }

        public final String getLinkToken() {
            return this.linkToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenPlaidForInstitution(String linkToken) {
            super(null);
            Intrinsics.checkNotNullParameter(linkToken, "linkToken");
            this.linkToken = linkToken;
        }
    }

    /* compiled from: Finder401kState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$NavigateByFragmentKey;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsEvent$NavigateByFragmentKey, reason: from toString */
    public static final /* data */ class NavigateByFragmentKey extends Finder401kState2 {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;

        public static /* synthetic */ NavigateByFragmentKey copy$default(NavigateByFragmentKey navigateByFragmentKey, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = navigateByFragmentKey.fragmentKey;
            }
            return navigateByFragmentKey.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final NavigateByFragmentKey copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new NavigateByFragmentKey(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateByFragmentKey) && Intrinsics.areEqual(this.fragmentKey, ((NavigateByFragmentKey) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "NavigateByFragmentKey(fragmentKey=" + this.fragmentKey + ")";
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateByFragmentKey(FragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }
    }

    /* compiled from: Finder401kState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$Exit;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsEvent$Exit */
    public static final class Exit extends Finder401kState2 {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        private Exit() {
            super(null);
        }
    }

    /* compiled from: Finder401kState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent$Error;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsEvent$Error, reason: from toString */
    public static final /* data */ class Error extends Finder401kState2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
