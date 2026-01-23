package com.robinhood.shared.stepupverification.challenge.email;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailChallengeEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent;", "", "Error", "ShowDialog", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent$Error;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent$ShowDialog;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface EmailChallengeEvent {

    /* compiled from: EmailChallengeEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent$Error;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements EmailChallengeEvent {
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

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: EmailChallengeEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent$ShowDialog;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent;", "title", "Lcom/robinhood/utils/resource/StringResource;", CarResultComposable2.BODY, "proceedOnDismiss", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBody", "getProceedOnDismiss", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialog implements EmailChallengeEvent {
        public static final int $stable = StringResource.$stable;
        private final StringResource body;
        private final boolean proceedOnDismiss;
        private final StringResource title;

        public static /* synthetic */ ShowDialog copy$default(ShowDialog showDialog, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = showDialog.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = showDialog.body;
            }
            if ((i & 4) != 0) {
                z = showDialog.proceedOnDismiss;
            }
            return showDialog.copy(stringResource, stringResource2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getProceedOnDismiss() {
            return this.proceedOnDismiss;
        }

        public final ShowDialog copy(StringResource title, StringResource body, boolean proceedOnDismiss) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new ShowDialog(title, body, proceedOnDismiss);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowDialog)) {
                return false;
            }
            ShowDialog showDialog = (ShowDialog) other;
            return Intrinsics.areEqual(this.title, showDialog.title) && Intrinsics.areEqual(this.body, showDialog.body) && this.proceedOnDismiss == showDialog.proceedOnDismiss;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + Boolean.hashCode(this.proceedOnDismiss);
        }

        public String toString() {
            return "ShowDialog(title=" + this.title + ", body=" + this.body + ", proceedOnDismiss=" + this.proceedOnDismiss + ")";
        }

        public ShowDialog(StringResource title, StringResource body, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = title;
            this.body = body;
            this.proceedOnDismiss = z;
        }

        public /* synthetic */ ShowDialog(StringResource stringResource, StringResource stringResource2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, stringResource2, (i & 4) != 0 ? false : z);
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getBody() {
            return this.body;
        }

        public final boolean getProceedOnDismiss() {
            return this.proceedOnDismiss;
        }
    }
}
