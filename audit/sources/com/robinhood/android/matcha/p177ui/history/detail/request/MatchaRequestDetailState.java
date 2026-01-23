package com.robinhood.android.matcha.p177ui.history.detail.request;

import com.robinhood.android.models.matcha.api.MatchaTransferRole;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaRequestDetailState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÂ\u0003JE\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState;", "", "matchaRequest", "Lcom/robinhood/models/db/matcha/MatchaRequest;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "requestActionComplete", "Lcom/robinhood/utils/resource/StringResource;", "loadingButtonType", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState$ButtonType;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaRequest;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState$ButtonType;)V", "getMatchaRequest", "()Lcom/robinhood/models/db/matcha/MatchaRequest;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "getRequestActionComplete", "requestState", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState;", "getRequestState", "()Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState;", "isFullscreenLoading", "", "()Z", "isActionInFlight", "isPrimaryButtonLoading", "isSecondaryButtonLoading", "isButtonBarVisible", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "ButtonType", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaRequestDetailState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isActionInFlight;
    private final boolean isFullscreenLoading;
    private final boolean isPrimaryButtonLoading;
    private final boolean isSecondaryButtonLoading;
    private final ButtonType loadingButtonType;
    private final MatchaRequest matchaRequest;
    private final UiEvent<StringResource> requestActionComplete;
    private final MatchaRequestDetailState4 requestState;

    /* compiled from: MatchaRequestDetailState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaTransferRole.values().length];
            try {
                iArr[MatchaTransferRole.SENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaTransferRole.RECEIVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchaTransferRole.SENDER_OR_RECEIVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MatchaRequestDetailState() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: component4, reason: from getter */
    private final ButtonType getLoadingButtonType() {
        return this.loadingButtonType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchaRequestDetailState copy$default(MatchaRequestDetailState matchaRequestDetailState, MatchaRequest matchaRequest, UiEvent uiEvent, UiEvent uiEvent2, ButtonType buttonType, int i, Object obj) {
        if ((i & 1) != 0) {
            matchaRequest = matchaRequestDetailState.matchaRequest;
        }
        if ((i & 2) != 0) {
            uiEvent = matchaRequestDetailState.errorEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = matchaRequestDetailState.requestActionComplete;
        }
        if ((i & 8) != 0) {
            buttonType = matchaRequestDetailState.loadingButtonType;
        }
        return matchaRequestDetailState.copy(matchaRequest, uiEvent, uiEvent2, buttonType);
    }

    /* renamed from: component1, reason: from getter */
    public final MatchaRequest getMatchaRequest() {
        return this.matchaRequest;
    }

    public final UiEvent<Throwable> component2() {
        return this.errorEvent;
    }

    public final UiEvent<StringResource> component3() {
        return this.requestActionComplete;
    }

    public final MatchaRequestDetailState copy(MatchaRequest matchaRequest, UiEvent<Throwable> errorEvent, UiEvent<StringResource> requestActionComplete, ButtonType loadingButtonType) {
        return new MatchaRequestDetailState(matchaRequest, errorEvent, requestActionComplete, loadingButtonType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaRequestDetailState)) {
            return false;
        }
        MatchaRequestDetailState matchaRequestDetailState = (MatchaRequestDetailState) other;
        return Intrinsics.areEqual(this.matchaRequest, matchaRequestDetailState.matchaRequest) && Intrinsics.areEqual(this.errorEvent, matchaRequestDetailState.errorEvent) && Intrinsics.areEqual(this.requestActionComplete, matchaRequestDetailState.requestActionComplete) && this.loadingButtonType == matchaRequestDetailState.loadingButtonType;
    }

    public int hashCode() {
        MatchaRequest matchaRequest = this.matchaRequest;
        int iHashCode = (matchaRequest == null ? 0 : matchaRequest.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<StringResource> uiEvent2 = this.requestActionComplete;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        ButtonType buttonType = this.loadingButtonType;
        return iHashCode3 + (buttonType != null ? buttonType.hashCode() : 0);
    }

    public String toString() {
        return "MatchaRequestDetailState(matchaRequest=" + this.matchaRequest + ", errorEvent=" + this.errorEvent + ", requestActionComplete=" + this.requestActionComplete + ", loadingButtonType=" + this.loadingButtonType + ")";
    }

    public MatchaRequestDetailState(MatchaRequest matchaRequest, UiEvent<Throwable> uiEvent, UiEvent<StringResource> uiEvent2, ButtonType buttonType) {
        MatchaRequestDetailState4 matchaRequestDetailState5;
        this.matchaRequest = matchaRequest;
        this.errorEvent = uiEvent;
        this.requestActionComplete = uiEvent2;
        this.loadingButtonType = buttonType;
        if (matchaRequest != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[matchaRequest.getRole().ordinal()];
            if (i == 1) {
                matchaRequestDetailState5 = new MatchaRequestDetailState5(matchaRequest);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        throw new IllegalStateException("Unexpected");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                matchaRequestDetailState5 = new MatchaRequestDetailState3(matchaRequest);
            }
        } else {
            matchaRequestDetailState5 = null;
        }
        this.requestState = matchaRequestDetailState5;
        this.isFullscreenLoading = matchaRequest == null;
        this.isActionInFlight = buttonType != null;
        this.isPrimaryButtonLoading = buttonType == ButtonType.PRIMARY;
        this.isSecondaryButtonLoading = buttonType == ButtonType.SECONDARY;
    }

    public /* synthetic */ MatchaRequestDetailState(MatchaRequest matchaRequest, UiEvent uiEvent, UiEvent uiEvent2, ButtonType buttonType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : matchaRequest, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2, (i & 8) != 0 ? null : buttonType);
    }

    public final MatchaRequest getMatchaRequest() {
        return this.matchaRequest;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final UiEvent<StringResource> getRequestActionComplete() {
        return this.requestActionComplete;
    }

    public final MatchaRequestDetailState4 getRequestState() {
        return this.requestState;
    }

    /* renamed from: isFullscreenLoading, reason: from getter */
    public final boolean getIsFullscreenLoading() {
        return this.isFullscreenLoading;
    }

    /* renamed from: isActionInFlight, reason: from getter */
    public final boolean getIsActionInFlight() {
        return this.isActionInFlight;
    }

    /* renamed from: isPrimaryButtonLoading, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    /* renamed from: isSecondaryButtonLoading, reason: from getter */
    public final boolean getIsSecondaryButtonLoading() {
        return this.isSecondaryButtonLoading;
    }

    public final boolean isButtonBarVisible() {
        MatchaRequestDetailState4 matchaRequestDetailState4 = this.requestState;
        if (matchaRequestDetailState4 != null) {
            return (matchaRequestDetailState4.getPrimaryAction() == null && matchaRequestDetailState4.getSecondaryAction() == null) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MatchaRequestDetailState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType PRIMARY = new ButtonType("PRIMARY", 0);
        public static final ButtonType SECONDARY = new ButtonType("SECONDARY", 1);

        private static final /* synthetic */ ButtonType[] $values() {
            return new ButtonType[]{PRIMARY, SECONDARY};
        }

        public static EnumEntries<ButtonType> getEntries() {
            return $ENTRIES;
        }

        private ButtonType(String str, int i) {
        }

        static {
            ButtonType[] buttonTypeArr$values = $values();
            $VALUES = buttonTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonTypeArr$values);
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }
}
