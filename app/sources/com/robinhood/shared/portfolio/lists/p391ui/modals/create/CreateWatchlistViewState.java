package com.robinhood.shared.portfolio.lists.p391ui.modals.create;

import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistDuxo6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateWatchlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;", "", "listName", "", "iconEmoji", "isEmojiPickerVisible", "", "errorMessage", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "creatingWatchlistState", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoTextInputs$Message;Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;)V", "getListName", "()Ljava/lang/String;", "getIconEmoji", "()Z", "getErrorMessage", "()Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "getCreatingWatchlistState", "()Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CreateWatchlistViewState {
    public static final int $stable = BentoTextInput8.Message.$stable;
    private final CreateWatchlistDuxo6 creatingWatchlistState;
    private final BentoTextInput8.Message errorMessage;
    private final String iconEmoji;
    private final boolean isEmojiPickerVisible;
    private final String listName;

    public CreateWatchlistViewState() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ CreateWatchlistViewState copy$default(CreateWatchlistViewState createWatchlistViewState, String str, String str2, boolean z, BentoTextInput8.Message message, CreateWatchlistDuxo6 createWatchlistDuxo6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createWatchlistViewState.listName;
        }
        if ((i & 2) != 0) {
            str2 = createWatchlistViewState.iconEmoji;
        }
        if ((i & 4) != 0) {
            z = createWatchlistViewState.isEmojiPickerVisible;
        }
        if ((i & 8) != 0) {
            message = createWatchlistViewState.errorMessage;
        }
        if ((i & 16) != 0) {
            createWatchlistDuxo6 = createWatchlistViewState.creatingWatchlistState;
        }
        CreateWatchlistDuxo6 createWatchlistDuxo62 = createWatchlistDuxo6;
        boolean z2 = z;
        return createWatchlistViewState.copy(str, str2, z2, message, createWatchlistDuxo62);
    }

    /* renamed from: component1, reason: from getter */
    public final String getListName() {
        return this.listName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconEmoji() {
        return this.iconEmoji;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEmojiPickerVisible() {
        return this.isEmojiPickerVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoTextInput8.Message getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final CreateWatchlistDuxo6 getCreatingWatchlistState() {
        return this.creatingWatchlistState;
    }

    public final CreateWatchlistViewState copy(String listName, String iconEmoji, boolean isEmojiPickerVisible, BentoTextInput8.Message errorMessage, CreateWatchlistDuxo6 creatingWatchlistState) {
        Intrinsics.checkNotNullParameter(listName, "listName");
        Intrinsics.checkNotNullParameter(iconEmoji, "iconEmoji");
        Intrinsics.checkNotNullParameter(creatingWatchlistState, "creatingWatchlistState");
        return new CreateWatchlistViewState(listName, iconEmoji, isEmojiPickerVisible, errorMessage, creatingWatchlistState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateWatchlistViewState)) {
            return false;
        }
        CreateWatchlistViewState createWatchlistViewState = (CreateWatchlistViewState) other;
        return Intrinsics.areEqual(this.listName, createWatchlistViewState.listName) && Intrinsics.areEqual(this.iconEmoji, createWatchlistViewState.iconEmoji) && this.isEmojiPickerVisible == createWatchlistViewState.isEmojiPickerVisible && Intrinsics.areEqual(this.errorMessage, createWatchlistViewState.errorMessage) && Intrinsics.areEqual(this.creatingWatchlistState, createWatchlistViewState.creatingWatchlistState);
    }

    public int hashCode() {
        int iHashCode = ((((this.listName.hashCode() * 31) + this.iconEmoji.hashCode()) * 31) + Boolean.hashCode(this.isEmojiPickerVisible)) * 31;
        BentoTextInput8.Message message = this.errorMessage;
        return ((iHashCode + (message == null ? 0 : message.hashCode())) * 31) + this.creatingWatchlistState.hashCode();
    }

    public String toString() {
        return "CreateWatchlistViewState(listName=" + this.listName + ", iconEmoji=" + this.iconEmoji + ", isEmojiPickerVisible=" + this.isEmojiPickerVisible + ", errorMessage=" + this.errorMessage + ", creatingWatchlistState=" + this.creatingWatchlistState + ")";
    }

    public CreateWatchlistViewState(String listName, String iconEmoji, boolean z, BentoTextInput8.Message message, CreateWatchlistDuxo6 creatingWatchlistState) {
        Intrinsics.checkNotNullParameter(listName, "listName");
        Intrinsics.checkNotNullParameter(iconEmoji, "iconEmoji");
        Intrinsics.checkNotNullParameter(creatingWatchlistState, "creatingWatchlistState");
        this.listName = listName;
        this.iconEmoji = iconEmoji;
        this.isEmojiPickerVisible = z;
        this.errorMessage = message;
        this.creatingWatchlistState = creatingWatchlistState;
    }

    public /* synthetic */ CreateWatchlistViewState(String str, String str2, boolean z, BentoTextInput8.Message message, CreateWatchlistDuxo6 createWatchlistDuxo6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ScreenersStore.DefaultEmoji : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : message, (i & 16) != 0 ? CreateWatchlistDuxo6.NotStarted.INSTANCE : createWatchlistDuxo6);
    }

    public final String getListName() {
        return this.listName;
    }

    public final String getIconEmoji() {
        return this.iconEmoji;
    }

    public final boolean isEmojiPickerVisible() {
        return this.isEmojiPickerVisible;
    }

    public final BentoTextInput8.Message getErrorMessage() {
        return this.errorMessage;
    }

    public final CreateWatchlistDuxo6 getCreatingWatchlistState() {
        return this.creatingWatchlistState;
    }
}
