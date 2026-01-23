package com.robinhood.android.event.history.p131ui.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventOrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0001YBë\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u000eHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u000eHÆ\u0003J\u009b\u0002\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u000eHÆ\u0001J\u0013\u0010T\u001a\u00020\u000e2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0011\u0010\u001d\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "displayLegs", "Lkotlinx/collections/immutable/PersistentList;", "", "eventName", "status", "timeInForce", "submitDate", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "showClosePriceInfoLink", "", "enteredNotionalAmount", "Lcom/robinhood/models/util/Money;", "filledQuantity", "filledDate", "filledNotionalLabel", "filledNotional", "totalCommissionLabel", "totalCommission", "adjustmentTitle", "adjustment", "breakdownNotional", "breakdownCommission", "showCancel", "cancelButtonText", "cancelInProgress", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/PersistentList;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/models/util/Money;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "getDisplayLegs", "()Lkotlinx/collections/immutable/PersistentList;", "getEventName", "()Ljava/lang/String;", "getStatus", "getTimeInForce", "getSubmitDate", "getPrice", "getShowClosePriceInfoLink", "()Z", "getEnteredNotionalAmount", "()Lcom/robinhood/models/util/Money;", "getFilledQuantity", "getFilledDate", "getFilledNotionalLabel", "getFilledNotional", "getTotalCommissionLabel", "getTotalCommission", "getAdjustmentTitle", "getAdjustment", "getBreakdownNotional", "getBreakdownCommission", "getShowCancel", "getCancelButtonText", "getCancelInProgress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventOrderDetailViewState {
    private final StringResource adjustment;
    private final StringResource adjustmentTitle;
    private final StringResource breakdownCommission;
    private final StringResource breakdownNotional;
    private final StringResource cancelButtonText;
    private final boolean cancelInProgress;
    private final StringResource description;
    private final ImmutableList3<String> displayLegs;
    private final Money enteredNotionalAmount;
    private final String eventName;
    private final StringResource filledDate;
    private final String filledNotional;
    private final StringResource filledNotionalLabel;
    private final StringResource filledQuantity;
    private final StringResource price;
    private final boolean showCancel;
    private final boolean showClosePriceInfoLink;
    private final StringResource status;
    private final StringResource submitDate;
    private final StringResource timeInForce;
    private final StringResource title;
    private final StringResource totalCommission;
    private final StringResource totalCommissionLabel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final EventOrderDetailViewState empty = new EventOrderDetailViewState(null, null, extensions2.persistentListOf(), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, false);

    public static /* synthetic */ EventOrderDetailViewState copy$default(EventOrderDetailViewState eventOrderDetailViewState, StringResource stringResource, StringResource stringResource2, ImmutableList3 immutableList3, String str, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, boolean z, Money money, StringResource stringResource7, StringResource stringResource8, StringResource stringResource9, String str2, StringResource stringResource10, StringResource stringResource11, StringResource stringResource12, StringResource stringResource13, StringResource stringResource14, StringResource stringResource15, boolean z2, StringResource stringResource16, boolean z3, int i, Object obj) {
        boolean z4;
        StringResource stringResource17;
        StringResource stringResource18 = (i & 1) != 0 ? eventOrderDetailViewState.title : stringResource;
        StringResource stringResource19 = (i & 2) != 0 ? eventOrderDetailViewState.description : stringResource2;
        ImmutableList3 immutableList32 = (i & 4) != 0 ? eventOrderDetailViewState.displayLegs : immutableList3;
        String str3 = (i & 8) != 0 ? eventOrderDetailViewState.eventName : str;
        StringResource stringResource20 = (i & 16) != 0 ? eventOrderDetailViewState.status : stringResource3;
        StringResource stringResource21 = (i & 32) != 0 ? eventOrderDetailViewState.timeInForce : stringResource4;
        StringResource stringResource22 = (i & 64) != 0 ? eventOrderDetailViewState.submitDate : stringResource5;
        StringResource stringResource23 = (i & 128) != 0 ? eventOrderDetailViewState.price : stringResource6;
        boolean z5 = (i & 256) != 0 ? eventOrderDetailViewState.showClosePriceInfoLink : z;
        Money money2 = (i & 512) != 0 ? eventOrderDetailViewState.enteredNotionalAmount : money;
        StringResource stringResource24 = (i & 1024) != 0 ? eventOrderDetailViewState.filledQuantity : stringResource7;
        StringResource stringResource25 = (i & 2048) != 0 ? eventOrderDetailViewState.filledDate : stringResource8;
        StringResource stringResource26 = (i & 4096) != 0 ? eventOrderDetailViewState.filledNotionalLabel : stringResource9;
        String str4 = (i & 8192) != 0 ? eventOrderDetailViewState.filledNotional : str2;
        StringResource stringResource27 = stringResource18;
        StringResource stringResource28 = (i & 16384) != 0 ? eventOrderDetailViewState.totalCommissionLabel : stringResource10;
        StringResource stringResource29 = (i & 32768) != 0 ? eventOrderDetailViewState.totalCommission : stringResource11;
        StringResource stringResource30 = (i & 65536) != 0 ? eventOrderDetailViewState.adjustmentTitle : stringResource12;
        StringResource stringResource31 = (i & 131072) != 0 ? eventOrderDetailViewState.adjustment : stringResource13;
        StringResource stringResource32 = (i & 262144) != 0 ? eventOrderDetailViewState.breakdownNotional : stringResource14;
        StringResource stringResource33 = (i & 524288) != 0 ? eventOrderDetailViewState.breakdownCommission : stringResource15;
        boolean z6 = (i & 1048576) != 0 ? eventOrderDetailViewState.showCancel : z2;
        StringResource stringResource34 = (i & 2097152) != 0 ? eventOrderDetailViewState.cancelButtonText : stringResource16;
        if ((i & 4194304) != 0) {
            stringResource17 = stringResource34;
            z4 = eventOrderDetailViewState.cancelInProgress;
        } else {
            z4 = z3;
            stringResource17 = stringResource34;
        }
        return eventOrderDetailViewState.copy(stringResource27, stringResource19, immutableList32, str3, stringResource20, stringResource21, stringResource22, stringResource23, z5, money2, stringResource24, stringResource25, stringResource26, str4, stringResource28, stringResource29, stringResource30, stringResource31, stringResource32, stringResource33, z6, stringResource17, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Money getEnteredNotionalAmount() {
        return this.enteredNotionalAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final StringResource getFilledQuantity() {
        return this.filledQuantity;
    }

    /* renamed from: component12, reason: from getter */
    public final StringResource getFilledDate() {
        return this.filledDate;
    }

    /* renamed from: component13, reason: from getter */
    public final StringResource getFilledNotionalLabel() {
        return this.filledNotionalLabel;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFilledNotional() {
        return this.filledNotional;
    }

    /* renamed from: component15, reason: from getter */
    public final StringResource getTotalCommissionLabel() {
        return this.totalCommissionLabel;
    }

    /* renamed from: component16, reason: from getter */
    public final StringResource getTotalCommission() {
        return this.totalCommission;
    }

    /* renamed from: component17, reason: from getter */
    public final StringResource getAdjustmentTitle() {
        return this.adjustmentTitle;
    }

    /* renamed from: component18, reason: from getter */
    public final StringResource getAdjustment() {
        return this.adjustment;
    }

    /* renamed from: component19, reason: from getter */
    public final StringResource getBreakdownNotional() {
        return this.breakdownNotional;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getDescription() {
        return this.description;
    }

    /* renamed from: component20, reason: from getter */
    public final StringResource getBreakdownCommission() {
        return this.breakdownCommission;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getShowCancel() {
        return this.showCancel;
    }

    /* renamed from: component22, reason: from getter */
    public final StringResource getCancelButtonText() {
        return this.cancelButtonText;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    public final ImmutableList3<String> component3() {
        return this.displayLegs;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getSubmitDate() {
        return this.submitDate;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getPrice() {
        return this.price;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowClosePriceInfoLink() {
        return this.showClosePriceInfoLink;
    }

    public final EventOrderDetailViewState copy(StringResource title, StringResource description, ImmutableList3<String> displayLegs, String eventName, StringResource status, StringResource timeInForce, StringResource submitDate, StringResource price, boolean showClosePriceInfoLink, Money enteredNotionalAmount, StringResource filledQuantity, StringResource filledDate, StringResource filledNotionalLabel, String filledNotional, StringResource totalCommissionLabel, StringResource totalCommission, StringResource adjustmentTitle, StringResource adjustment, StringResource breakdownNotional, StringResource breakdownCommission, boolean showCancel, StringResource cancelButtonText, boolean cancelInProgress) {
        Intrinsics.checkNotNullParameter(displayLegs, "displayLegs");
        return new EventOrderDetailViewState(title, description, displayLegs, eventName, status, timeInForce, submitDate, price, showClosePriceInfoLink, enteredNotionalAmount, filledQuantity, filledDate, filledNotionalLabel, filledNotional, totalCommissionLabel, totalCommission, adjustmentTitle, adjustment, breakdownNotional, breakdownCommission, showCancel, cancelButtonText, cancelInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventOrderDetailViewState)) {
            return false;
        }
        EventOrderDetailViewState eventOrderDetailViewState = (EventOrderDetailViewState) other;
        return Intrinsics.areEqual(this.title, eventOrderDetailViewState.title) && Intrinsics.areEqual(this.description, eventOrderDetailViewState.description) && Intrinsics.areEqual(this.displayLegs, eventOrderDetailViewState.displayLegs) && Intrinsics.areEqual(this.eventName, eventOrderDetailViewState.eventName) && Intrinsics.areEqual(this.status, eventOrderDetailViewState.status) && Intrinsics.areEqual(this.timeInForce, eventOrderDetailViewState.timeInForce) && Intrinsics.areEqual(this.submitDate, eventOrderDetailViewState.submitDate) && Intrinsics.areEqual(this.price, eventOrderDetailViewState.price) && this.showClosePriceInfoLink == eventOrderDetailViewState.showClosePriceInfoLink && Intrinsics.areEqual(this.enteredNotionalAmount, eventOrderDetailViewState.enteredNotionalAmount) && Intrinsics.areEqual(this.filledQuantity, eventOrderDetailViewState.filledQuantity) && Intrinsics.areEqual(this.filledDate, eventOrderDetailViewState.filledDate) && Intrinsics.areEqual(this.filledNotionalLabel, eventOrderDetailViewState.filledNotionalLabel) && Intrinsics.areEqual(this.filledNotional, eventOrderDetailViewState.filledNotional) && Intrinsics.areEqual(this.totalCommissionLabel, eventOrderDetailViewState.totalCommissionLabel) && Intrinsics.areEqual(this.totalCommission, eventOrderDetailViewState.totalCommission) && Intrinsics.areEqual(this.adjustmentTitle, eventOrderDetailViewState.adjustmentTitle) && Intrinsics.areEqual(this.adjustment, eventOrderDetailViewState.adjustment) && Intrinsics.areEqual(this.breakdownNotional, eventOrderDetailViewState.breakdownNotional) && Intrinsics.areEqual(this.breakdownCommission, eventOrderDetailViewState.breakdownCommission) && this.showCancel == eventOrderDetailViewState.showCancel && Intrinsics.areEqual(this.cancelButtonText, eventOrderDetailViewState.cancelButtonText) && this.cancelInProgress == eventOrderDetailViewState.cancelInProgress;
    }

    public int hashCode() {
        StringResource stringResource = this.title;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        StringResource stringResource2 = this.description;
        int iHashCode2 = (((iHashCode + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31) + this.displayLegs.hashCode()) * 31;
        String str = this.eventName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource3 = this.status;
        int iHashCode4 = (iHashCode3 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        StringResource stringResource4 = this.timeInForce;
        int iHashCode5 = (iHashCode4 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
        StringResource stringResource5 = this.submitDate;
        int iHashCode6 = (iHashCode5 + (stringResource5 == null ? 0 : stringResource5.hashCode())) * 31;
        StringResource stringResource6 = this.price;
        int iHashCode7 = (((iHashCode6 + (stringResource6 == null ? 0 : stringResource6.hashCode())) * 31) + Boolean.hashCode(this.showClosePriceInfoLink)) * 31;
        Money money = this.enteredNotionalAmount;
        int iHashCode8 = (iHashCode7 + (money == null ? 0 : money.hashCode())) * 31;
        StringResource stringResource7 = this.filledQuantity;
        int iHashCode9 = (iHashCode8 + (stringResource7 == null ? 0 : stringResource7.hashCode())) * 31;
        StringResource stringResource8 = this.filledDate;
        int iHashCode10 = (iHashCode9 + (stringResource8 == null ? 0 : stringResource8.hashCode())) * 31;
        StringResource stringResource9 = this.filledNotionalLabel;
        int iHashCode11 = (iHashCode10 + (stringResource9 == null ? 0 : stringResource9.hashCode())) * 31;
        String str2 = this.filledNotional;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StringResource stringResource10 = this.totalCommissionLabel;
        int iHashCode13 = (iHashCode12 + (stringResource10 == null ? 0 : stringResource10.hashCode())) * 31;
        StringResource stringResource11 = this.totalCommission;
        int iHashCode14 = (iHashCode13 + (stringResource11 == null ? 0 : stringResource11.hashCode())) * 31;
        StringResource stringResource12 = this.adjustmentTitle;
        int iHashCode15 = (iHashCode14 + (stringResource12 == null ? 0 : stringResource12.hashCode())) * 31;
        StringResource stringResource13 = this.adjustment;
        int iHashCode16 = (iHashCode15 + (stringResource13 == null ? 0 : stringResource13.hashCode())) * 31;
        StringResource stringResource14 = this.breakdownNotional;
        int iHashCode17 = (iHashCode16 + (stringResource14 == null ? 0 : stringResource14.hashCode())) * 31;
        StringResource stringResource15 = this.breakdownCommission;
        int iHashCode18 = (((iHashCode17 + (stringResource15 == null ? 0 : stringResource15.hashCode())) * 31) + Boolean.hashCode(this.showCancel)) * 31;
        StringResource stringResource16 = this.cancelButtonText;
        return ((iHashCode18 + (stringResource16 != null ? stringResource16.hashCode() : 0)) * 31) + Boolean.hashCode(this.cancelInProgress);
    }

    public String toString() {
        return "EventOrderDetailViewState(title=" + this.title + ", description=" + this.description + ", displayLegs=" + this.displayLegs + ", eventName=" + this.eventName + ", status=" + this.status + ", timeInForce=" + this.timeInForce + ", submitDate=" + this.submitDate + ", price=" + this.price + ", showClosePriceInfoLink=" + this.showClosePriceInfoLink + ", enteredNotionalAmount=" + this.enteredNotionalAmount + ", filledQuantity=" + this.filledQuantity + ", filledDate=" + this.filledDate + ", filledNotionalLabel=" + this.filledNotionalLabel + ", filledNotional=" + this.filledNotional + ", totalCommissionLabel=" + this.totalCommissionLabel + ", totalCommission=" + this.totalCommission + ", adjustmentTitle=" + this.adjustmentTitle + ", adjustment=" + this.adjustment + ", breakdownNotional=" + this.breakdownNotional + ", breakdownCommission=" + this.breakdownCommission + ", showCancel=" + this.showCancel + ", cancelButtonText=" + this.cancelButtonText + ", cancelInProgress=" + this.cancelInProgress + ")";
    }

    public EventOrderDetailViewState(StringResource stringResource, StringResource stringResource2, ImmutableList3<String> displayLegs, String str, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, boolean z, Money money, StringResource stringResource7, StringResource stringResource8, StringResource stringResource9, String str2, StringResource stringResource10, StringResource stringResource11, StringResource stringResource12, StringResource stringResource13, StringResource stringResource14, StringResource stringResource15, boolean z2, StringResource stringResource16, boolean z3) {
        Intrinsics.checkNotNullParameter(displayLegs, "displayLegs");
        this.title = stringResource;
        this.description = stringResource2;
        this.displayLegs = displayLegs;
        this.eventName = str;
        this.status = stringResource3;
        this.timeInForce = stringResource4;
        this.submitDate = stringResource5;
        this.price = stringResource6;
        this.showClosePriceInfoLink = z;
        this.enteredNotionalAmount = money;
        this.filledQuantity = stringResource7;
        this.filledDate = stringResource8;
        this.filledNotionalLabel = stringResource9;
        this.filledNotional = str2;
        this.totalCommissionLabel = stringResource10;
        this.totalCommission = stringResource11;
        this.adjustmentTitle = stringResource12;
        this.adjustment = stringResource13;
        this.breakdownNotional = stringResource14;
        this.breakdownCommission = stringResource15;
        this.showCancel = z2;
        this.cancelButtonText = stringResource16;
        this.cancelInProgress = z3;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getDescription() {
        return this.description;
    }

    public final ImmutableList3<String> getDisplayLegs() {
        return this.displayLegs;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final StringResource getStatus() {
        return this.status;
    }

    public final StringResource getTimeInForce() {
        return this.timeInForce;
    }

    public final StringResource getSubmitDate() {
        return this.submitDate;
    }

    public final StringResource getPrice() {
        return this.price;
    }

    public final boolean getShowClosePriceInfoLink() {
        return this.showClosePriceInfoLink;
    }

    public final Money getEnteredNotionalAmount() {
        return this.enteredNotionalAmount;
    }

    public final StringResource getFilledQuantity() {
        return this.filledQuantity;
    }

    public final StringResource getFilledDate() {
        return this.filledDate;
    }

    public final StringResource getFilledNotionalLabel() {
        return this.filledNotionalLabel;
    }

    public final String getFilledNotional() {
        return this.filledNotional;
    }

    public final StringResource getTotalCommissionLabel() {
        return this.totalCommissionLabel;
    }

    public final StringResource getTotalCommission() {
        return this.totalCommission;
    }

    public final StringResource getAdjustmentTitle() {
        return this.adjustmentTitle;
    }

    public final StringResource getAdjustment() {
        return this.adjustment;
    }

    public final StringResource getBreakdownNotional() {
        return this.breakdownNotional;
    }

    public final StringResource getBreakdownCommission() {
        return this.breakdownCommission;
    }

    public final boolean getShowCancel() {
        return this.showCancel;
    }

    public final StringResource getCancelButtonText() {
        return this.cancelButtonText;
    }

    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    /* compiled from: EventOrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState$Companion;", "", "<init>", "()V", "empty", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;", "getEmpty", "()Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EventOrderDetailViewState getEmpty() {
            return EventOrderDetailViewState.empty;
        }
    }
}
