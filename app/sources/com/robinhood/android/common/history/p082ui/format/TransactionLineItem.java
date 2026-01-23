package com.robinhood.android.common.history.p082ui.format;

import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionLineItem.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jh\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "", "title", "", ErrorResponse.DETAIL, "description", "iconResId", "", "isNegativeItem", "", "dialogContent", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem$DialogContent;", "detailIconResId", "detailIconTint", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;ZLcom/robinhood/android/common/history/ui/format/TransactionLineItem$DialogContent;Ljava/lang/Integer;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;)V", "getTitle", "()Ljava/lang/CharSequence;", "getDetail", "getDescription", "getIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getDialogContent", "()Lcom/robinhood/android/common/history/ui/format/TransactionLineItem$DialogContent;", "getDetailIconResId", "getDetailIconTint", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;ZLcom/robinhood/android/common/history/ui/format/TransactionLineItem$DialogContent;Ljava/lang/Integer;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;)Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "equals", "other", "hashCode", "toString", "", "DialogContent", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TransactionLineItem {
    public static final int $stable = 8;
    private final CharSequence description;
    private final CharSequence detail;
    private final Integer detailIconResId;
    private final TransactionSummary.Tint detailIconTint;
    private final DialogContent dialogContent;
    private final Integer iconResId;
    private final boolean isNegativeItem;
    private final CharSequence title;

    public static /* synthetic */ TransactionLineItem copy$default(TransactionLineItem transactionLineItem, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, boolean z, DialogContent dialogContent, Integer num2, TransactionSummary.Tint tint, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = transactionLineItem.title;
        }
        if ((i & 2) != 0) {
            charSequence2 = transactionLineItem.detail;
        }
        if ((i & 4) != 0) {
            charSequence3 = transactionLineItem.description;
        }
        if ((i & 8) != 0) {
            num = transactionLineItem.iconResId;
        }
        if ((i & 16) != 0) {
            z = transactionLineItem.isNegativeItem;
        }
        if ((i & 32) != 0) {
            dialogContent = transactionLineItem.dialogContent;
        }
        if ((i & 64) != 0) {
            num2 = transactionLineItem.detailIconResId;
        }
        if ((i & 128) != 0) {
            tint = transactionLineItem.detailIconTint;
        }
        Integer num3 = num2;
        TransactionSummary.Tint tint2 = tint;
        boolean z2 = z;
        DialogContent dialogContent2 = dialogContent;
        return transactionLineItem.copy(charSequence, charSequence2, charSequence3, num, z2, dialogContent2, num3, tint2);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getDetail() {
        return this.detail;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getIconResId() {
        return this.iconResId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNegativeItem() {
        return this.isNegativeItem;
    }

    /* renamed from: component6, reason: from getter */
    public final DialogContent getDialogContent() {
        return this.dialogContent;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getDetailIconResId() {
        return this.detailIconResId;
    }

    /* renamed from: component8, reason: from getter */
    public final TransactionSummary.Tint getDetailIconTint() {
        return this.detailIconTint;
    }

    public final TransactionLineItem copy(CharSequence title, CharSequence detail, CharSequence description, Integer iconResId, boolean isNegativeItem, DialogContent dialogContent, Integer detailIconResId, TransactionSummary.Tint detailIconTint) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new TransactionLineItem(title, detail, description, iconResId, isNegativeItem, dialogContent, detailIconResId, detailIconTint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionLineItem)) {
            return false;
        }
        TransactionLineItem transactionLineItem = (TransactionLineItem) other;
        return Intrinsics.areEqual(this.title, transactionLineItem.title) && Intrinsics.areEqual(this.detail, transactionLineItem.detail) && Intrinsics.areEqual(this.description, transactionLineItem.description) && Intrinsics.areEqual(this.iconResId, transactionLineItem.iconResId) && this.isNegativeItem == transactionLineItem.isNegativeItem && Intrinsics.areEqual(this.dialogContent, transactionLineItem.dialogContent) && Intrinsics.areEqual(this.detailIconResId, transactionLineItem.detailIconResId) && this.detailIconTint == transactionLineItem.detailIconTint;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.detail.hashCode()) * 31;
        CharSequence charSequence = this.description;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Integer num = this.iconResId;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isNegativeItem)) * 31;
        DialogContent dialogContent = this.dialogContent;
        int iHashCode4 = (iHashCode3 + (dialogContent == null ? 0 : dialogContent.hashCode())) * 31;
        Integer num2 = this.detailIconResId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        TransactionSummary.Tint tint = this.detailIconTint;
        return iHashCode5 + (tint != null ? tint.hashCode() : 0);
    }

    public String toString() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.detail;
        CharSequence charSequence3 = this.description;
        return "TransactionLineItem(title=" + ((Object) charSequence) + ", detail=" + ((Object) charSequence2) + ", description=" + ((Object) charSequence3) + ", iconResId=" + this.iconResId + ", isNegativeItem=" + this.isNegativeItem + ", dialogContent=" + this.dialogContent + ", detailIconResId=" + this.detailIconResId + ", detailIconTint=" + this.detailIconTint + ")";
    }

    public TransactionLineItem(CharSequence title, CharSequence detail, CharSequence charSequence, Integer num, boolean z, DialogContent dialogContent, Integer num2, TransactionSummary.Tint tint) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.title = title;
        this.detail = detail;
        this.description = charSequence;
        this.iconResId = num;
        this.isNegativeItem = z;
        this.dialogContent = dialogContent;
        this.detailIconResId = num2;
        this.detailIconTint = tint;
    }

    public /* synthetic */ TransactionLineItem(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, boolean z, DialogContent dialogContent, Integer num2, TransactionSummary.Tint tint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : dialogContent, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : tint);
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getDetail() {
        return this.detail;
    }

    public final CharSequence getDescription() {
        return this.description;
    }

    public final Integer getIconResId() {
        return this.iconResId;
    }

    public final boolean isNegativeItem() {
        return this.isNegativeItem;
    }

    public final DialogContent getDialogContent() {
        return this.dialogContent;
    }

    public final Integer getDetailIconResId() {
        return this.detailIconResId;
    }

    public final TransactionSummary.Tint getDetailIconTint() {
        return this.detailIconTint;
    }

    /* compiled from: TransactionLineItem.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionLineItem$DialogContent;", "", "title", "", "message", "", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "()Ljava/lang/CharSequence;", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogContent {
        public static final int $stable = 8;
        private final UserInteractionEventData.Action loggingAction;
        private final CharSequence message;
        private final String title;

        public static /* synthetic */ DialogContent copy$default(DialogContent dialogContent, String str, CharSequence charSequence, UserInteractionEventData.Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dialogContent.title;
            }
            if ((i & 2) != 0) {
                charSequence = dialogContent.message;
            }
            if ((i & 4) != 0) {
                action = dialogContent.loggingAction;
            }
            return dialogContent.copy(str, charSequence, action);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final UserInteractionEventData.Action getLoggingAction() {
            return this.loggingAction;
        }

        public final DialogContent copy(String title, CharSequence message, UserInteractionEventData.Action loggingAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            return new DialogContent(title, message, loggingAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogContent)) {
                return false;
            }
            DialogContent dialogContent = (DialogContent) other;
            return Intrinsics.areEqual(this.title, dialogContent.title) && Intrinsics.areEqual(this.message, dialogContent.message) && this.loggingAction == dialogContent.loggingAction;
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.message.hashCode()) * 31;
            UserInteractionEventData.Action action = this.loggingAction;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        public String toString() {
            String str = this.title;
            CharSequence charSequence = this.message;
            return "DialogContent(title=" + str + ", message=" + ((Object) charSequence) + ", loggingAction=" + this.loggingAction + ")";
        }

        public DialogContent(String title, CharSequence message, UserInteractionEventData.Action action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.title = title;
            this.message = message;
            this.loggingAction = action;
        }

        public /* synthetic */ DialogContent(String str, CharSequence charSequence, UserInteractionEventData.Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, charSequence, (i & 4) != 0 ? null : action);
        }

        public final String getTitle() {
            return this.title;
        }

        public final CharSequence getMessage() {
            return this.message;
        }

        public final UserInteractionEventData.Action getLoggingAction() {
            return this.loggingAction;
        }
    }
}
