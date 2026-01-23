package com.truelayer.payments.core.domain.payments;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthorizationFlow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "", "actions", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow$FlowActions;", "(Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow$FlowActions;)V", "getActions", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow$FlowActions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "FlowActions", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AuthorizationFlow {
    private final FlowActions actions;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizationFlow() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthorizationFlow copy$default(AuthorizationFlow authorizationFlow, FlowActions flowActions, int i, Object obj) {
        if ((i & 1) != 0) {
            flowActions = authorizationFlow.actions;
        }
        return authorizationFlow.copy(flowActions);
    }

    /* renamed from: component1, reason: from getter */
    public final FlowActions getActions() {
        return this.actions;
    }

    public final AuthorizationFlow copy(FlowActions actions) {
        return new AuthorizationFlow(actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthorizationFlow) && Intrinsics.areEqual(this.actions, ((AuthorizationFlow) other).actions);
    }

    public int hashCode() {
        FlowActions flowActions = this.actions;
        if (flowActions == null) {
            return 0;
        }
        return flowActions.hashCode();
    }

    public String toString() {
        return "AuthorizationFlow(actions=" + this.actions + ")";
    }

    public AuthorizationFlow(FlowActions flowActions) {
        this.actions = flowActions;
    }

    public /* synthetic */ AuthorizationFlow(FlowActions flowActions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : flowActions);
    }

    public final FlowActions getActions() {
        return this.actions;
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow$FlowActions;", "", "next", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "(Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;)V", "getNext", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class FlowActions {
        private final AuthorizationFlow2 next;

        public static /* synthetic */ FlowActions copy$default(FlowActions flowActions, AuthorizationFlow2 authorizationFlow2, int i, Object obj) {
            if ((i & 1) != 0) {
                authorizationFlow2 = flowActions.next;
            }
            return flowActions.copy(authorizationFlow2);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthorizationFlow2 getNext() {
            return this.next;
        }

        public final FlowActions copy(AuthorizationFlow2 next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return new FlowActions(next);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FlowActions) && Intrinsics.areEqual(this.next, ((FlowActions) other).next);
        }

        public int hashCode() {
            return this.next.hashCode();
        }

        public String toString() {
            return "FlowActions(next=" + this.next + ")";
        }

        public FlowActions(AuthorizationFlow2 next) {
            Intrinsics.checkNotNullParameter(next, "next");
            this.next = next;
        }

        public final AuthorizationFlow2 getNext() {
            return this.next;
        }
    }
}
