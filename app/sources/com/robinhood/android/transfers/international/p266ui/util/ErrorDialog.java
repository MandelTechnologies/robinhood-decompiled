package com.robinhood.android.transfers.international.p266ui.util;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorDialog.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "dismissAction", "Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog$DismissAction;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog$DismissAction;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "getDismissAction", "()Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog$DismissAction;", "id", "", "getId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "DismissAction", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ErrorDialog {
    public static final int DIALOG_ID_FINISH = 1;
    public static final int DIALOG_ID_NO_OP = 1;
    private final DismissAction dismissAction;
    private final StringResource message;
    private final StringResource title;
    public static final int $stable = StringResource.$stable;

    /* compiled from: ErrorDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DismissAction.values().length];
            try {
                iArr[DismissAction.FINISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ErrorDialog copy$default(ErrorDialog errorDialog, StringResource stringResource, StringResource stringResource2, DismissAction dismissAction, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = errorDialog.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = errorDialog.message;
        }
        if ((i & 4) != 0) {
            dismissAction = errorDialog.dismissAction;
        }
        return errorDialog.copy(stringResource, stringResource2, dismissAction);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final DismissAction getDismissAction() {
        return this.dismissAction;
    }

    public final ErrorDialog copy(StringResource title, StringResource message, DismissAction dismissAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorDialog(title, message, dismissAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDialog)) {
            return false;
        }
        ErrorDialog errorDialog = (ErrorDialog) other;
        return Intrinsics.areEqual(this.title, errorDialog.title) && Intrinsics.areEqual(this.message, errorDialog.message) && this.dismissAction == errorDialog.dismissAction;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.message.hashCode()) * 31;
        DismissAction dismissAction = this.dismissAction;
        return iHashCode + (dismissAction == null ? 0 : dismissAction.hashCode());
    }

    public String toString() {
        return "ErrorDialog(title=" + this.title + ", message=" + this.message + ", dismissAction=" + this.dismissAction + ")";
    }

    public ErrorDialog(StringResource title, StringResource message, DismissAction dismissAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.title = title;
        this.message = message;
        this.dismissAction = dismissAction;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getMessage() {
        return this.message;
    }

    public final DismissAction getDismissAction() {
        return this.dismissAction;
    }

    public final int getId() {
        DismissAction dismissAction = this.dismissAction;
        int i = dismissAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[dismissAction.ordinal()];
        if (i == -1 || i == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorDialog.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog$DismissAction;", "", "<init>", "(Ljava/lang/String;I)V", "FINISH", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DismissAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DismissAction[] $VALUES;
        public static final DismissAction FINISH = new DismissAction("FINISH", 0);

        private static final /* synthetic */ DismissAction[] $values() {
            return new DismissAction[]{FINISH};
        }

        public static EnumEntries<DismissAction> getEntries() {
            return $ENTRIES;
        }

        private DismissAction(String str, int i) {
        }

        static {
            DismissAction[] dismissActionArr$values = $values();
            $VALUES = dismissActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dismissActionArr$values);
        }

        public static DismissAction valueOf(String str) {
            return (DismissAction) Enum.valueOf(DismissAction.class, str);
        }

        public static DismissAction[] values() {
            return (DismissAction[]) $VALUES.clone();
        }
    }
}
