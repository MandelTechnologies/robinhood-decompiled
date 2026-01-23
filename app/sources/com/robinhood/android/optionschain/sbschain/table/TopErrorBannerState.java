package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;", "", "message", "", "actionText", "action", "Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerAction;", "type", "Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerAction;Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;)V", "getMessage", "()Ljava/lang/String;", "getActionText", "getAction", "()Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerAction;", "getType", "()Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TopErrorBannerState {
    public static final int $stable = 0;
    private final TopErrorBannerAction action;
    private final String actionText;
    private final String message;
    private final TopBannerErrorType type;

    public static /* synthetic */ TopErrorBannerState copy$default(TopErrorBannerState topErrorBannerState, String str, String str2, TopErrorBannerAction topErrorBannerAction, TopBannerErrorType topBannerErrorType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topErrorBannerState.message;
        }
        if ((i & 2) != 0) {
            str2 = topErrorBannerState.actionText;
        }
        if ((i & 4) != 0) {
            topErrorBannerAction = topErrorBannerState.action;
        }
        if ((i & 8) != 0) {
            topBannerErrorType = topErrorBannerState.type;
        }
        return topErrorBannerState.copy(str, str2, topErrorBannerAction, topBannerErrorType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    /* renamed from: component3, reason: from getter */
    public final TopErrorBannerAction getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final TopBannerErrorType getType() {
        return this.type;
    }

    public final TopErrorBannerState copy(String message, String actionText, TopErrorBannerAction action, TopBannerErrorType type2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new TopErrorBannerState(message, actionText, action, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopErrorBannerState)) {
            return false;
        }
        TopErrorBannerState topErrorBannerState = (TopErrorBannerState) other;
        return Intrinsics.areEqual(this.message, topErrorBannerState.message) && Intrinsics.areEqual(this.actionText, topErrorBannerState.actionText) && this.action == topErrorBannerState.action && this.type == topErrorBannerState.type;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        String str = this.actionText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TopErrorBannerAction topErrorBannerAction = this.action;
        return ((iHashCode2 + (topErrorBannerAction != null ? topErrorBannerAction.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "TopErrorBannerState(message=" + this.message + ", actionText=" + this.actionText + ", action=" + this.action + ", type=" + this.type + ")";
    }

    public TopErrorBannerState(String message, String str, TopErrorBannerAction topErrorBannerAction, TopBannerErrorType type2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.message = message;
        this.actionText = str;
        this.action = topErrorBannerAction;
        this.type = type2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final TopErrorBannerAction getAction() {
        return this.action;
    }

    public final TopBannerErrorType getType() {
        return this.type;
    }
}
