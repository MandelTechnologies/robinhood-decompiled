package com.robinhood.shared.security.workflow;

import com.robinhood.models.workflow.p358ui.UiWorkflowStatus;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowEvent;", "", "Replace", "Exit", "Error", "Lcom/robinhood/shared/security/workflow/WorkflowEvent$Error;", "Lcom/robinhood/shared/security/workflow/WorkflowEvent$Exit;", "Lcom/robinhood/shared/security/workflow/WorkflowEvent$Replace;", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface WorkflowEvent {

    /* compiled from: WorkflowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowEvent$Replace;", "Lcom/robinhood/shared/security/workflow/WorkflowEvent;", "screen", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "animate", "", "<init>", "(Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;Z)V", "getScreen", "()Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "getAnimate", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Replace implements WorkflowEvent {
        public static final int $stable = 8;
        private final boolean animate;
        private final UiWorkflowScreen screen;

        public static /* synthetic */ Replace copy$default(Replace replace, UiWorkflowScreen uiWorkflowScreen, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiWorkflowScreen = replace.screen;
            }
            if ((i & 2) != 0) {
                z = replace.animate;
            }
            return replace.copy(uiWorkflowScreen, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiWorkflowScreen getScreen() {
            return this.screen;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAnimate() {
            return this.animate;
        }

        public final Replace copy(UiWorkflowScreen screen, boolean animate) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new Replace(screen, animate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Replace)) {
                return false;
            }
            Replace replace = (Replace) other;
            return Intrinsics.areEqual(this.screen, replace.screen) && this.animate == replace.animate;
        }

        public int hashCode() {
            return (this.screen.hashCode() * 31) + Boolean.hashCode(this.animate);
        }

        public String toString() {
            return "Replace(screen=" + this.screen + ", animate=" + this.animate + ")";
        }

        public Replace(UiWorkflowScreen screen, boolean z) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.screen = screen;
            this.animate = z;
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        public final UiWorkflowScreen getScreen() {
            return this.screen;
        }
    }

    /* compiled from: WorkflowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowEvent$Exit;", "Lcom/robinhood/shared/security/workflow/WorkflowEvent;", "status", "Lcom/robinhood/models/workflow/ui/UiWorkflowStatus;", "<init>", "(Lcom/robinhood/models/workflow/ui/UiWorkflowStatus;)V", "getStatus", "()Lcom/robinhood/models/workflow/ui/UiWorkflowStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Exit implements WorkflowEvent {
        public static final int $stable = 0;
        private final UiWorkflowStatus status;

        public static /* synthetic */ Exit copy$default(Exit exit, UiWorkflowStatus uiWorkflowStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                uiWorkflowStatus = exit.status;
            }
            return exit.copy(uiWorkflowStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final UiWorkflowStatus getStatus() {
            return this.status;
        }

        public final Exit copy(UiWorkflowStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new Exit(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Exit) && this.status == ((Exit) other).status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "Exit(status=" + this.status + ")";
        }

        public Exit(UiWorkflowStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        public final UiWorkflowStatus getStatus() {
            return this.status;
        }
    }

    /* compiled from: WorkflowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowEvent$Error;", "Lcom/robinhood/shared/security/workflow/WorkflowEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements WorkflowEvent {
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
}
