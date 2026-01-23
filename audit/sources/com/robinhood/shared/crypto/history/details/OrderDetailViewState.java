package com.robinhood.shared.crypto.history.details;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00070123456Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bHÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ju\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState;", "T", "", "headerState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;", "viewInstrumentActionState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ViewInstrumentActionState;", "dataRowContents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DataRowContent;", "timelineRowContents", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$TimelineRowContent;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent;", "disclaimerText", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "buttonState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;", "<init>", "(Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ViewInstrumentActionState;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent;Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;)V", "getHeaderState", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;", "getViewInstrumentActionState", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ViewInstrumentActionState;", "getDataRowContents", "()Lkotlinx/collections/immutable/ImmutableList;", "getTimelineRowContents", "getBanner", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent;", "getDisclaimerText", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "getButtonState", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HeaderState", "ViewInstrumentActionState", "InfoBannerContent", "DataRowContent", "TimelineRowContent", "ButtonState", "DisclaimerTextContent", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderDetailViewState<T> {
    public static final int $stable = 8;
    private final InfoBannerContent banner;
    private final ButtonState buttonState;
    private final ImmutableList<DataRowContent<T>> dataRowContents;
    private final DisclaimerTextContent disclaimerText;
    private final HeaderState headerState;
    private final ImmutableList<TimelineRowContent<T>> timelineRowContents;
    private final ViewInstrumentActionState viewInstrumentActionState;

    public static /* synthetic */ OrderDetailViewState copy$default(OrderDetailViewState orderDetailViewState, HeaderState headerState, ViewInstrumentActionState viewInstrumentActionState, ImmutableList immutableList, ImmutableList immutableList2, InfoBannerContent infoBannerContent, DisclaimerTextContent disclaimerTextContent, ButtonState buttonState, int i, Object obj) {
        if ((i & 1) != 0) {
            headerState = orderDetailViewState.headerState;
        }
        if ((i & 2) != 0) {
            viewInstrumentActionState = orderDetailViewState.viewInstrumentActionState;
        }
        if ((i & 4) != 0) {
            immutableList = orderDetailViewState.dataRowContents;
        }
        if ((i & 8) != 0) {
            immutableList2 = orderDetailViewState.timelineRowContents;
        }
        if ((i & 16) != 0) {
            infoBannerContent = orderDetailViewState.banner;
        }
        if ((i & 32) != 0) {
            disclaimerTextContent = orderDetailViewState.disclaimerText;
        }
        if ((i & 64) != 0) {
            buttonState = orderDetailViewState.buttonState;
        }
        DisclaimerTextContent disclaimerTextContent2 = disclaimerTextContent;
        ButtonState buttonState2 = buttonState;
        InfoBannerContent infoBannerContent2 = infoBannerContent;
        ImmutableList immutableList3 = immutableList;
        return orderDetailViewState.copy(headerState, viewInstrumentActionState, immutableList3, immutableList2, infoBannerContent2, disclaimerTextContent2, buttonState2);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderState getHeaderState() {
        return this.headerState;
    }

    /* renamed from: component2, reason: from getter */
    public final ViewInstrumentActionState getViewInstrumentActionState() {
        return this.viewInstrumentActionState;
    }

    public final ImmutableList<DataRowContent<T>> component3() {
        return this.dataRowContents;
    }

    public final ImmutableList<TimelineRowContent<T>> component4() {
        return this.timelineRowContents;
    }

    /* renamed from: component5, reason: from getter */
    public final InfoBannerContent getBanner() {
        return this.banner;
    }

    /* renamed from: component6, reason: from getter */
    public final DisclaimerTextContent getDisclaimerText() {
        return this.disclaimerText;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonState getButtonState() {
        return this.buttonState;
    }

    public final OrderDetailViewState<T> copy(HeaderState headerState, ViewInstrumentActionState viewInstrumentActionState, ImmutableList<DataRowContent<T>> dataRowContents, ImmutableList<TimelineRowContent<T>> timelineRowContents, InfoBannerContent banner, DisclaimerTextContent disclaimerText, ButtonState buttonState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(dataRowContents, "dataRowContents");
        Intrinsics.checkNotNullParameter(timelineRowContents, "timelineRowContents");
        return new OrderDetailViewState<>(headerState, viewInstrumentActionState, dataRowContents, timelineRowContents, banner, disclaimerText, buttonState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailViewState)) {
            return false;
        }
        OrderDetailViewState orderDetailViewState = (OrderDetailViewState) other;
        return Intrinsics.areEqual(this.headerState, orderDetailViewState.headerState) && Intrinsics.areEqual(this.viewInstrumentActionState, orderDetailViewState.viewInstrumentActionState) && Intrinsics.areEqual(this.dataRowContents, orderDetailViewState.dataRowContents) && Intrinsics.areEqual(this.timelineRowContents, orderDetailViewState.timelineRowContents) && Intrinsics.areEqual(this.banner, orderDetailViewState.banner) && Intrinsics.areEqual(this.disclaimerText, orderDetailViewState.disclaimerText) && Intrinsics.areEqual(this.buttonState, orderDetailViewState.buttonState);
    }

    public int hashCode() {
        int iHashCode = this.headerState.hashCode() * 31;
        ViewInstrumentActionState viewInstrumentActionState = this.viewInstrumentActionState;
        int iHashCode2 = (((((iHashCode + (viewInstrumentActionState == null ? 0 : viewInstrumentActionState.hashCode())) * 31) + this.dataRowContents.hashCode()) * 31) + this.timelineRowContents.hashCode()) * 31;
        InfoBannerContent infoBannerContent = this.banner;
        int iHashCode3 = (iHashCode2 + (infoBannerContent == null ? 0 : infoBannerContent.hashCode())) * 31;
        DisclaimerTextContent disclaimerTextContent = this.disclaimerText;
        int iHashCode4 = (iHashCode3 + (disclaimerTextContent == null ? 0 : disclaimerTextContent.hashCode())) * 31;
        ButtonState buttonState = this.buttonState;
        return iHashCode4 + (buttonState != null ? buttonState.hashCode() : 0);
    }

    public String toString() {
        return "OrderDetailViewState(headerState=" + this.headerState + ", viewInstrumentActionState=" + this.viewInstrumentActionState + ", dataRowContents=" + this.dataRowContents + ", timelineRowContents=" + this.timelineRowContents + ", banner=" + this.banner + ", disclaimerText=" + this.disclaimerText + ", buttonState=" + this.buttonState + ")";
    }

    public OrderDetailViewState(HeaderState headerState, ViewInstrumentActionState viewInstrumentActionState, ImmutableList<DataRowContent<T>> dataRowContents, ImmutableList<TimelineRowContent<T>> timelineRowContents, InfoBannerContent infoBannerContent, DisclaimerTextContent disclaimerTextContent, ButtonState buttonState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(dataRowContents, "dataRowContents");
        Intrinsics.checkNotNullParameter(timelineRowContents, "timelineRowContents");
        this.headerState = headerState;
        this.viewInstrumentActionState = viewInstrumentActionState;
        this.dataRowContents = dataRowContents;
        this.timelineRowContents = timelineRowContents;
        this.banner = infoBannerContent;
        this.disclaimerText = disclaimerTextContent;
        this.buttonState = buttonState;
    }

    public final HeaderState getHeaderState() {
        return this.headerState;
    }

    public final ViewInstrumentActionState getViewInstrumentActionState() {
        return this.viewInstrumentActionState;
    }

    public final ImmutableList<DataRowContent<T>> getDataRowContents() {
        return this.dataRowContents;
    }

    public /* synthetic */ OrderDetailViewState(HeaderState headerState, ViewInstrumentActionState viewInstrumentActionState, ImmutableList immutableList, ImmutableList immutableList2, InfoBannerContent infoBannerContent, DisclaimerTextContent disclaimerTextContent, ButtonState buttonState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerState, viewInstrumentActionState, immutableList, (i & 8) != 0 ? extensions2.persistentListOf() : immutableList2, (i & 16) != 0 ? null : infoBannerContent, disclaimerTextContent, buttonState);
    }

    public final ImmutableList<TimelineRowContent<T>> getTimelineRowContents() {
        return this.timelineRowContents;
    }

    public final InfoBannerContent getBanner() {
        return this.banner;
    }

    public final DisclaimerTextContent getDisclaimerText() {
        return this.disclaimerText;
    }

    public final ButtonState getButtonState() {
        return this.buttonState;
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "isLoading", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeaderState {
        private static final HeaderState DEFAULT_LOADING_STATE;
        private final boolean isLoading;
        private final StringResource subtitle;
        private final StringResource title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = StringResource.$stable;

        public static /* synthetic */ HeaderState copy$default(HeaderState headerState, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = headerState.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = headerState.subtitle;
            }
            if ((i & 4) != 0) {
                z = headerState.isLoading;
            }
            return headerState.copy(stringResource, stringResource2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final HeaderState copy(StringResource title, StringResource subtitle, boolean isLoading) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new HeaderState(title, subtitle, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderState)) {
                return false;
            }
            HeaderState headerState = (HeaderState) other;
            return Intrinsics.areEqual(this.title, headerState.title) && Intrinsics.areEqual(this.subtitle, headerState.subtitle) && this.isLoading == headerState.isLoading;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "HeaderState(title=" + this.title + ", subtitle=" + this.subtitle + ", isLoading=" + this.isLoading + ")";
        }

        public HeaderState(StringResource title, StringResource subtitle, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
            this.isLoading = z;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState$Companion;", "", "<init>", "()V", "DEFAULT_LOADING_STATE", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;", "getDEFAULT_LOADING_STATE", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final HeaderState getDEFAULT_LOADING_STATE() {
                return HeaderState.DEFAULT_LOADING_STATE;
            }
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            DEFAULT_LOADING_STATE = new HeaderState(companion.invoke("******** *******"), companion.invoke("*******"), true);
        }
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ViewInstrumentActionState;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/UUID;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewInstrumentActionState {
        public static final int $stable = 8;
        private final UUID instrumentId;
        private final StringResource text;

        public static /* synthetic */ ViewInstrumentActionState copy$default(ViewInstrumentActionState viewInstrumentActionState, StringResource stringResource, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = viewInstrumentActionState.text;
            }
            if ((i & 2) != 0) {
                uuid = viewInstrumentActionState.instrumentId;
            }
            return viewInstrumentActionState.copy(stringResource, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final ViewInstrumentActionState copy(StringResource text, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new ViewInstrumentActionState(text, instrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewInstrumentActionState)) {
                return false;
            }
            ViewInstrumentActionState viewInstrumentActionState = (ViewInstrumentActionState) other;
            return Intrinsics.areEqual(this.text, viewInstrumentActionState.text) && Intrinsics.areEqual(this.instrumentId, viewInstrumentActionState.instrumentId);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.instrumentId.hashCode();
        }

        public String toString() {
            return "ViewInstrumentActionState(text=" + this.text + ", instrumentId=" + this.instrumentId + ")";
        }

        public ViewInstrumentActionState(StringResource text, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.text = text;
            this.instrumentId = instrumentId;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "ctaText", "position", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent$Position;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent$Position;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getCtaText", "getPosition", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent$Position;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Position", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InfoBannerContent {
        public static final int $stable = StringResource.$stable;
        private final StringResource ctaText;
        private final Position position;
        private final StringResource text;

        public static /* synthetic */ InfoBannerContent copy$default(InfoBannerContent infoBannerContent, StringResource stringResource, StringResource stringResource2, Position position, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = infoBannerContent.text;
            }
            if ((i & 2) != 0) {
                stringResource2 = infoBannerContent.ctaText;
            }
            if ((i & 4) != 0) {
                position = infoBannerContent.position;
            }
            return infoBannerContent.copy(stringResource, stringResource2, position);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component3, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        public final InfoBannerContent copy(StringResource text, StringResource ctaText, Position position) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(position, "position");
            return new InfoBannerContent(text, ctaText, position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBannerContent)) {
                return false;
            }
            InfoBannerContent infoBannerContent = (InfoBannerContent) other;
            return Intrinsics.areEqual(this.text, infoBannerContent.text) && Intrinsics.areEqual(this.ctaText, infoBannerContent.ctaText) && this.position == infoBannerContent.position;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            StringResource stringResource = this.ctaText;
            return ((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.position.hashCode();
        }

        public String toString() {
            return "InfoBannerContent(text=" + this.text + ", ctaText=" + this.ctaText + ", position=" + this.position + ")";
        }

        public InfoBannerContent(StringResource text, StringResource stringResource, Position position) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(position, "position");
            this.text = text;
            this.ctaText = stringResource;
            this.position = position;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final StringResource getCtaText() {
            return this.ctaText;
        }

        public /* synthetic */ InfoBannerContent(StringResource stringResource, StringResource stringResource2, Position position, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, (i & 2) != 0 ? null : stringResource2, (i & 4) != 0 ? Position.TOP : position);
        }

        public final Position getPosition() {
            return this.position;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent$Position;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Position {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;
            public static final Position TOP = new Position("TOP", 0);
            public static final Position BOTTOM = new Position("BOTTOM", 1);

            private static final /* synthetic */ Position[] $values() {
                return new Position[]{TOP, BOTTOM};
            }

            public static EnumEntries<Position> getEntries() {
                return $ENTRIES;
            }

            private Position(String str, int i) {
            }

            static {
                Position[] positionArr$values = $values();
                $VALUES = positionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(positionArr$values);
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u0018*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DataRowContent;", "T", "", "bentoDataRowState", "Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "tapAction", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;Ljava/lang/Object;)V", "getBentoDataRowState", "()Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "getTapAction", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;Ljava/lang/Object;)Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DataRowContent;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DataRowContent<T> {
        private final BentoDataRowState bentoDataRowState;
        private final T tapAction;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = BentoDataRowState.$stable;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataRowContent copy$default(DataRowContent dataRowContent, BentoDataRowState bentoDataRowState, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                bentoDataRowState = dataRowContent.bentoDataRowState;
            }
            if ((i & 2) != 0) {
                obj = dataRowContent.tapAction;
            }
            return dataRowContent.copy(bentoDataRowState, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoDataRowState getBentoDataRowState() {
            return this.bentoDataRowState;
        }

        public final T component2() {
            return this.tapAction;
        }

        public final DataRowContent<T> copy(BentoDataRowState bentoDataRowState, T tapAction) {
            Intrinsics.checkNotNullParameter(bentoDataRowState, "bentoDataRowState");
            return new DataRowContent<>(bentoDataRowState, tapAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataRowContent)) {
                return false;
            }
            DataRowContent dataRowContent = (DataRowContent) other;
            return Intrinsics.areEqual(this.bentoDataRowState, dataRowContent.bentoDataRowState) && Intrinsics.areEqual(this.tapAction, dataRowContent.tapAction);
        }

        public int hashCode() {
            int iHashCode = this.bentoDataRowState.hashCode() * 31;
            T t = this.tapAction;
            return iHashCode + (t == null ? 0 : t.hashCode());
        }

        public String toString() {
            return "DataRowContent(bentoDataRowState=" + this.bentoDataRowState + ", tapAction=" + this.tapAction + ")";
        }

        public DataRowContent(BentoDataRowState bentoDataRowState, T t) {
            Intrinsics.checkNotNullParameter(bentoDataRowState, "bentoDataRowState");
            this.bentoDataRowState = bentoDataRowState;
            this.tapAction = t;
        }

        public /* synthetic */ DataRowContent(BentoDataRowState bentoDataRowState, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bentoDataRowState, (i & 2) != 0 ? null : obj);
        }

        public final BentoDataRowState getBentoDataRowState() {
            return this.bentoDataRowState;
        }

        public final T getTapAction() {
            return this.tapAction;
        }

        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DataRowContent$Companion;", "", "<init>", "()V", "generateLoadingDataRow", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DataRowContent;", "T", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final <T> DataRowContent<T> generateLoadingDataRow() {
                int i = 2;
                DefaultConstructorMarker defaultConstructorMarker = null;
                return new DataRowContent<>(new BentoDataRowState(null, new AnnotatedString("*******", null, i, 0 == true ? 1 : 0), null, null, null, new AnnotatedString("**********", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), null, null, null, null, true, true, 989, null), defaultConstructorMarker, 2, defaultConstructorMarker);
            }
        }
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$TimelineRowContent;", "T", "", "timelineRowState", "Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;", "tapAction", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;Ljava/lang/Object;)V", "getTimelineRowState", "()Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;", "getTapAction", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;Ljava/lang/Object;)Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$TimelineRowContent;", "equals", "", "other", "hashCode", "", "toString", "", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TimelineRowContent<T> {
        public static final int $stable = BentoTimelineRowState.$stable;
        private final T tapAction;
        private final BentoTimelineRowState timelineRowState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimelineRowContent copy$default(TimelineRowContent timelineRowContent, BentoTimelineRowState bentoTimelineRowState, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                bentoTimelineRowState = timelineRowContent.timelineRowState;
            }
            if ((i & 2) != 0) {
                obj = timelineRowContent.tapAction;
            }
            return timelineRowContent.copy(bentoTimelineRowState, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoTimelineRowState getTimelineRowState() {
            return this.timelineRowState;
        }

        public final T component2() {
            return this.tapAction;
        }

        public final TimelineRowContent<T> copy(BentoTimelineRowState timelineRowState, T tapAction) {
            Intrinsics.checkNotNullParameter(timelineRowState, "timelineRowState");
            return new TimelineRowContent<>(timelineRowState, tapAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimelineRowContent)) {
                return false;
            }
            TimelineRowContent timelineRowContent = (TimelineRowContent) other;
            return Intrinsics.areEqual(this.timelineRowState, timelineRowContent.timelineRowState) && Intrinsics.areEqual(this.tapAction, timelineRowContent.tapAction);
        }

        public int hashCode() {
            int iHashCode = this.timelineRowState.hashCode() * 31;
            T t = this.tapAction;
            return iHashCode + (t == null ? 0 : t.hashCode());
        }

        public String toString() {
            return "TimelineRowContent(timelineRowState=" + this.timelineRowState + ", tapAction=" + this.tapAction + ")";
        }

        public TimelineRowContent(BentoTimelineRowState timelineRowState, T t) {
            Intrinsics.checkNotNullParameter(timelineRowState, "timelineRowState");
            this.timelineRowState = timelineRowState;
            this.tapAction = t;
        }

        public /* synthetic */ TimelineRowContent(BentoTimelineRowState bentoTimelineRowState, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bentoTimelineRowState, (i & 2) != 0 ? null : obj);
        }

        public final BentoTimelineRowState getTimelineRowState() {
            return this.timelineRowState;
        }

        public final T getTapAction() {
            return this.tapAction;
        }
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;", "", "<init>", "()V", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "visible", "", "getVisible", "()Z", "loading", "getLoading", "CancelButton", "CustomButton", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState$CancelButton;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState$CustomButton;", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ButtonState {
        public static final int $stable = 0;

        public /* synthetic */ ButtonState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean getLoading();

        public abstract StringResource getText();

        public abstract boolean getVisible();

        private ButtonState() {
        }

        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState$CancelButton;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;", "visible", "", "loading", "<init>", "(ZZ)V", "getVisible", "()Z", "getLoading", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CancelButton extends ButtonState {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final CancelButton GONE = new CancelButton(false, false);
            private static final CancelButton LOADING = new CancelButton(true, true);
            private static final CancelButton VISIBLE = new CancelButton(true, false);
            private final boolean loading;
            private final boolean visible;

            public static /* synthetic */ CancelButton copy$default(CancelButton cancelButton, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cancelButton.visible;
                }
                if ((i & 2) != 0) {
                    z2 = cancelButton.loading;
                }
                return cancelButton.copy(z, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getVisible() {
                return this.visible;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getLoading() {
                return this.loading;
            }

            public final CancelButton copy(boolean visible, boolean loading) {
                return new CancelButton(visible, loading);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CancelButton)) {
                    return false;
                }
                CancelButton cancelButton = (CancelButton) other;
                return this.visible == cancelButton.visible && this.loading == cancelButton.loading;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.visible) * 31) + Boolean.hashCode(this.loading);
            }

            public String toString() {
                return "CancelButton(visible=" + this.visible + ", loading=" + this.loading + ")";
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.ButtonState
            public boolean getVisible() {
                return this.visible;
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.ButtonState
            public boolean getLoading() {
                return this.loading;
            }

            public CancelButton(boolean z, boolean z2) {
                super(null);
                this.visible = z;
                this.loading = z2;
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.ButtonState
            public StringResource getText() {
                return StringResource.INSTANCE.invoke(C37704R.string.order_detail_cancel_action, new Object[0]);
            }

            /* compiled from: OrderDetailViewState.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState$CancelButton$Companion;", "", "<init>", "()V", "GONE", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState$CancelButton;", "getGONE", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState$CancelButton;", "LOADING", "getLOADING", "VISIBLE", "getVISIBLE", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final CancelButton getGONE() {
                    return CancelButton.GONE;
                }

                public final CancelButton getLOADING() {
                    return CancelButton.LOADING;
                }

                public final CancelButton getVISIBLE() {
                    return CancelButton.VISIBLE;
                }
            }
        }

        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState$CustomButton;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;", "text", "Lcom/robinhood/utils/resource/StringResource;", "visible", "", "loading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getVisible", "()Z", "getLoading", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CustomButton extends ButtonState {
            public static final int $stable = StringResource.$stable;
            private final boolean loading;
            private final StringResource text;
            private final boolean visible;

            public static /* synthetic */ CustomButton copy$default(CustomButton customButton, StringResource stringResource, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = customButton.text;
                }
                if ((i & 2) != 0) {
                    z = customButton.visible;
                }
                if ((i & 4) != 0) {
                    z2 = customButton.loading;
                }
                return customButton.copy(stringResource, z, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getVisible() {
                return this.visible;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getLoading() {
                return this.loading;
            }

            public final CustomButton copy(StringResource text, boolean visible, boolean loading) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new CustomButton(text, visible, loading);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomButton)) {
                    return false;
                }
                CustomButton customButton = (CustomButton) other;
                return Intrinsics.areEqual(this.text, customButton.text) && this.visible == customButton.visible && this.loading == customButton.loading;
            }

            public int hashCode() {
                return (((this.text.hashCode() * 31) + Boolean.hashCode(this.visible)) * 31) + Boolean.hashCode(this.loading);
            }

            public String toString() {
                return "CustomButton(text=" + this.text + ", visible=" + this.visible + ", loading=" + this.loading + ")";
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.ButtonState
            public StringResource getText() {
                return this.text;
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.ButtonState
            public boolean getVisible() {
                return this.visible;
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.ButtonState
            public boolean getLoading() {
                return this.loading;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomButton(StringResource text, boolean z, boolean z2) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.visible = z;
                this.loading = z2;
            }
        }
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "Text", "TextWithLink", "Loading", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent$Loading;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent$Text;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent$TextWithLink;", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DisclaimerTextContent {
        public static final int $stable = StringResource.$stable;
        private final StringResource text;

        public /* synthetic */ DisclaimerTextContent(StringResource stringResource, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource);
        }

        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent$Text;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Text extends DisclaimerTextContent {
            public static final int $stable = StringResource.$stable;
            private final StringResource text;

            public static /* synthetic */ Text copy$default(Text text, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = text.text;
                }
                return text.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getText() {
                return this.text;
            }

            public final Text copy(StringResource text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Text(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.areEqual(this.text, ((Text) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Text(text=" + this.text + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(StringResource text) {
                super(text, null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.DisclaimerTextContent
            public StringResource getText() {
                return this.text;
            }
        }

        private DisclaimerTextContent(StringResource stringResource) {
            this.text = stringResource;
        }

        public StringResource getText() {
            return this.text;
        }

        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent$TextWithLink;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "text", "Lcom/robinhood/utils/resource/StringResource;", "linkText", "link", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getLinkText", "getLink", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextWithLink extends DisclaimerTextContent {
            public static final int $stable = StringResource.$stable;
            private final StringResource link;
            private final StringResource linkText;
            private final StringResource text;

            public static /* synthetic */ TextWithLink copy$default(TextWithLink textWithLink, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = textWithLink.text;
                }
                if ((i & 2) != 0) {
                    stringResource2 = textWithLink.linkText;
                }
                if ((i & 4) != 0) {
                    stringResource3 = textWithLink.link;
                }
                return textWithLink.copy(stringResource, stringResource2, stringResource3);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getLinkText() {
                return this.linkText;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getLink() {
                return this.link;
            }

            public final TextWithLink copy(StringResource text, StringResource linkText, StringResource link) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(linkText, "linkText");
                Intrinsics.checkNotNullParameter(link, "link");
                return new TextWithLink(text, linkText, link);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextWithLink)) {
                    return false;
                }
                TextWithLink textWithLink = (TextWithLink) other;
                return Intrinsics.areEqual(this.text, textWithLink.text) && Intrinsics.areEqual(this.linkText, textWithLink.linkText) && Intrinsics.areEqual(this.link, textWithLink.link);
            }

            public int hashCode() {
                return (((this.text.hashCode() * 31) + this.linkText.hashCode()) * 31) + this.link.hashCode();
            }

            public String toString() {
                return "TextWithLink(text=" + this.text + ", linkText=" + this.linkText + ", link=" + this.link + ")";
            }

            @Override // com.robinhood.shared.crypto.history.details.OrderDetailViewState.DisclaimerTextContent
            public StringResource getText() {
                return this.text;
            }

            public final StringResource getLinkText() {
                return this.linkText;
            }

            public final StringResource getLink() {
                return this.link;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextWithLink(StringResource text, StringResource linkText, StringResource link) {
                super(text, null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(linkText, "linkText");
                Intrinsics.checkNotNullParameter(link, "link");
                this.text = text;
                this.linkText = linkText;
                this.link = link;
            }
        }

        /* compiled from: OrderDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent$Loading;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends DisclaimerTextContent {
            public static final Loading INSTANCE = new Loading();
            public static final int $stable = StringResource.$stable;

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1000198947;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(StringResource.INSTANCE.invoke(""), null);
            }
        }
    }
}
