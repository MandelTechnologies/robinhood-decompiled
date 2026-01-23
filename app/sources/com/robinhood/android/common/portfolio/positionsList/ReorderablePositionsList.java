package com.robinhood.android.common.portfolio.positionsList;

import com.robinhood.android.common.portfolio.position.DisplayPositionListItem;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.AssetHomeAssetType;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ReorderablePositionsList.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "", "Loading", "Empty", "Ready", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Empty;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Loading;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListState, reason: use source file name */
/* loaded from: classes2.dex */
public interface ReorderablePositionsList {

    /* compiled from: ReorderablePositionsList.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Loading;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListState$Loading */
    public static final /* data */ class Loading implements ReorderablePositionsList {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1007400942;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ReorderablePositionsList.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Empty;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", Footer.f10637type, "shouldHeaderShimmer", "", "onAssetHomeOpened", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;ZLkotlin/jvm/functions/Function1;)V", "getHeader", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getFooter", "getShouldHeaderShimmer", "()Z", "getOnAssetHomeOpened", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListState$Empty, reason: from toString */
    public static final /* data */ class Empty implements ReorderablePositionsList {
        public static final int $stable = 0;
        private final UIComponent<AccountPositionAction> footer;
        private final UIComponent<AccountPositionAction> header;
        private final Function1<AssetHomeAssetType, Unit> onAssetHomeOpened;
        private final boolean shouldHeaderShimmer;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Empty copy$default(Empty empty, UIComponent uIComponent, UIComponent uIComponent2, boolean z, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                uIComponent = empty.header;
            }
            if ((i & 2) != 0) {
                uIComponent2 = empty.footer;
            }
            if ((i & 4) != 0) {
                z = empty.shouldHeaderShimmer;
            }
            if ((i & 8) != 0) {
                function1 = empty.onAssetHomeOpened;
            }
            return empty.copy(uIComponent, uIComponent2, z, function1);
        }

        public final UIComponent<AccountPositionAction> component1() {
            return this.header;
        }

        public final UIComponent<AccountPositionAction> component2() {
            return this.footer;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldHeaderShimmer() {
            return this.shouldHeaderShimmer;
        }

        public final Function1<AssetHomeAssetType, Unit> component4() {
            return this.onAssetHomeOpened;
        }

        public final Empty copy(UIComponent<? extends AccountPositionAction> header, UIComponent<? extends AccountPositionAction> footer, boolean shouldHeaderShimmer, Function1<? super AssetHomeAssetType, Unit> onAssetHomeOpened) {
            Intrinsics.checkNotNullParameter(onAssetHomeOpened, "onAssetHomeOpened");
            return new Empty(header, footer, shouldHeaderShimmer, onAssetHomeOpened);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return Intrinsics.areEqual(this.header, empty.header) && Intrinsics.areEqual(this.footer, empty.footer) && this.shouldHeaderShimmer == empty.shouldHeaderShimmer && Intrinsics.areEqual(this.onAssetHomeOpened, empty.onAssetHomeOpened);
        }

        public int hashCode() {
            UIComponent<AccountPositionAction> uIComponent = this.header;
            int iHashCode = (uIComponent == null ? 0 : uIComponent.hashCode()) * 31;
            UIComponent<AccountPositionAction> uIComponent2 = this.footer;
            return ((((iHashCode + (uIComponent2 != null ? uIComponent2.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldHeaderShimmer)) * 31) + this.onAssetHomeOpened.hashCode();
        }

        public String toString() {
            return "Empty(header=" + this.header + ", footer=" + this.footer + ", shouldHeaderShimmer=" + this.shouldHeaderShimmer + ", onAssetHomeOpened=" + this.onAssetHomeOpened + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Empty(UIComponent<? extends AccountPositionAction> uIComponent, UIComponent<? extends AccountPositionAction> uIComponent2, boolean z, Function1<? super AssetHomeAssetType, Unit> onAssetHomeOpened) {
            Intrinsics.checkNotNullParameter(onAssetHomeOpened, "onAssetHomeOpened");
            this.header = uIComponent;
            this.footer = uIComponent2;
            this.shouldHeaderShimmer = z;
            this.onAssetHomeOpened = onAssetHomeOpened;
        }

        public final UIComponent<AccountPositionAction> getHeader() {
            return this.header;
        }

        public final UIComponent<AccountPositionAction> getFooter() {
            return this.footer;
        }

        public final boolean getShouldHeaderShimmer() {
            return this.shouldHeaderShimmer;
        }

        public final Function1<AssetHomeAssetType, Unit> getOnAssetHomeOpened() {
            return this.onAssetHomeOpened;
        }
    }

    /* compiled from: ReorderablePositionsList.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0017\u0018R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", "getHeader", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", Footer.f10637type, "getFooter", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "shouldHeaderShimmer", "", "getShouldHeaderShimmer", "()Z", "onAssetHomeOpened", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;", "", "getOnAssetHomeOpened", "()Lkotlin/jvm/functions/Function1;", "Reorderable", "FixedOrder", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready$FixedOrder;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready$Reorderable;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListState$Ready */
    public interface Ready extends ReorderablePositionsList {
        UIComponent<AccountPositionAction> getFooter();

        UIComponent<AccountPositionAction> getHeader();

        Function1<AssetHomeAssetType, Unit> getOnAssetHomeOpened();

        PositionsLocation getPositionsLocation();

        boolean getShouldHeaderShimmer();

        /* compiled from: ReorderablePositionsList.kt */
        @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\u0015\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016HÆ\u0003J\u0097\u0001\u00104\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016HÆ\u0001J\u0013\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready$Reorderable;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", Footer.f10637type, "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "shouldHeaderShimmer", "", "onAssetHomeOpened", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "reorderableListState", "Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "reorderPending", "animateItemPlacement", "onSortOptionsFragmentShown", "Lkotlin/Function0;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;ZLkotlin/jvm/functions/Function1;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/utils/compose/reorderable/ReorderableListState;ZZLkotlin/jvm/functions/Function0;)V", "getHeader", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getFooter", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "getShouldHeaderShimmer", "()Z", "getOnAssetHomeOpened", "()Lkotlin/jvm/functions/Function1;", "getPositionInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getReorderableListState", "()Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "getReorderPending", "getAnimateItemPlacement", "getOnSortOptionsFragmentShown", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListState$Ready$Reorderable, reason: from toString */
        public static final /* data */ class Reorderable implements Ready {
            public static final int $stable = 0;
            private final boolean animateItemPlacement;
            private final UIComponent<AccountPositionAction> footer;
            private final UIComponent<AccountPositionAction> header;
            private final Function1<AssetHomeAssetType, Unit> onAssetHomeOpened;
            private final Function0<Unit> onSortOptionsFragmentShown;
            private final PositionInstrumentType positionInstrumentType;
            private final PositionsLocation positionsLocation;
            private final boolean reorderPending;
            private final ReorderableListState<DisplayPositionListItem> reorderableListState;
            private final boolean shouldHeaderShimmer;

            public static /* synthetic */ Reorderable copy$default(Reorderable reorderable, UIComponent uIComponent, UIComponent uIComponent2, PositionsLocation positionsLocation, boolean z, Function1 function1, PositionInstrumentType positionInstrumentType, ReorderableListState reorderableListState, boolean z2, boolean z3, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    uIComponent = reorderable.header;
                }
                if ((i & 2) != 0) {
                    uIComponent2 = reorderable.footer;
                }
                if ((i & 4) != 0) {
                    positionsLocation = reorderable.positionsLocation;
                }
                if ((i & 8) != 0) {
                    z = reorderable.shouldHeaderShimmer;
                }
                if ((i & 16) != 0) {
                    function1 = reorderable.onAssetHomeOpened;
                }
                if ((i & 32) != 0) {
                    positionInstrumentType = reorderable.positionInstrumentType;
                }
                if ((i & 64) != 0) {
                    reorderableListState = reorderable.reorderableListState;
                }
                if ((i & 128) != 0) {
                    z2 = reorderable.reorderPending;
                }
                if ((i & 256) != 0) {
                    z3 = reorderable.animateItemPlacement;
                }
                if ((i & 512) != 0) {
                    function0 = reorderable.onSortOptionsFragmentShown;
                }
                boolean z4 = z3;
                Function0 function02 = function0;
                ReorderableListState reorderableListState2 = reorderableListState;
                boolean z5 = z2;
                Function1 function12 = function1;
                PositionInstrumentType positionInstrumentType2 = positionInstrumentType;
                return reorderable.copy(uIComponent, uIComponent2, positionsLocation, z, function12, positionInstrumentType2, reorderableListState2, z5, z4, function02);
            }

            public final UIComponent<AccountPositionAction> component1() {
                return this.header;
            }

            public final Function0<Unit> component10() {
                return this.onSortOptionsFragmentShown;
            }

            public final UIComponent<AccountPositionAction> component2() {
                return this.footer;
            }

            /* renamed from: component3, reason: from getter */
            public final PositionsLocation getPositionsLocation() {
                return this.positionsLocation;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShouldHeaderShimmer() {
                return this.shouldHeaderShimmer;
            }

            public final Function1<AssetHomeAssetType, Unit> component5() {
                return this.onAssetHomeOpened;
            }

            /* renamed from: component6, reason: from getter */
            public final PositionInstrumentType getPositionInstrumentType() {
                return this.positionInstrumentType;
            }

            public final ReorderableListState<DisplayPositionListItem> component7() {
                return this.reorderableListState;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getReorderPending() {
                return this.reorderPending;
            }

            /* renamed from: component9, reason: from getter */
            public final boolean getAnimateItemPlacement() {
                return this.animateItemPlacement;
            }

            public final Reorderable copy(UIComponent<? extends AccountPositionAction> header, UIComponent<? extends AccountPositionAction> footer, PositionsLocation positionsLocation, boolean shouldHeaderShimmer, Function1<? super AssetHomeAssetType, Unit> onAssetHomeOpened, PositionInstrumentType positionInstrumentType, ReorderableListState<DisplayPositionListItem> reorderableListState, boolean reorderPending, boolean animateItemPlacement, Function0<Unit> onSortOptionsFragmentShown) {
                Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
                Intrinsics.checkNotNullParameter(onAssetHomeOpened, "onAssetHomeOpened");
                Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
                Intrinsics.checkNotNullParameter(reorderableListState, "reorderableListState");
                return new Reorderable(header, footer, positionsLocation, shouldHeaderShimmer, onAssetHomeOpened, positionInstrumentType, reorderableListState, reorderPending, animateItemPlacement, onSortOptionsFragmentShown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Reorderable)) {
                    return false;
                }
                Reorderable reorderable = (Reorderable) other;
                return Intrinsics.areEqual(this.header, reorderable.header) && Intrinsics.areEqual(this.footer, reorderable.footer) && this.positionsLocation == reorderable.positionsLocation && this.shouldHeaderShimmer == reorderable.shouldHeaderShimmer && Intrinsics.areEqual(this.onAssetHomeOpened, reorderable.onAssetHomeOpened) && this.positionInstrumentType == reorderable.positionInstrumentType && Intrinsics.areEqual(this.reorderableListState, reorderable.reorderableListState) && this.reorderPending == reorderable.reorderPending && this.animateItemPlacement == reorderable.animateItemPlacement && Intrinsics.areEqual(this.onSortOptionsFragmentShown, reorderable.onSortOptionsFragmentShown);
            }

            public int hashCode() {
                UIComponent<AccountPositionAction> uIComponent = this.header;
                int iHashCode = (uIComponent == null ? 0 : uIComponent.hashCode()) * 31;
                UIComponent<AccountPositionAction> uIComponent2 = this.footer;
                int iHashCode2 = (((((((((((((((iHashCode + (uIComponent2 == null ? 0 : uIComponent2.hashCode())) * 31) + this.positionsLocation.hashCode()) * 31) + Boolean.hashCode(this.shouldHeaderShimmer)) * 31) + this.onAssetHomeOpened.hashCode()) * 31) + this.positionInstrumentType.hashCode()) * 31) + this.reorderableListState.hashCode()) * 31) + Boolean.hashCode(this.reorderPending)) * 31) + Boolean.hashCode(this.animateItemPlacement)) * 31;
                Function0<Unit> function0 = this.onSortOptionsFragmentShown;
                return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
            }

            public String toString() {
                return "Reorderable(header=" + this.header + ", footer=" + this.footer + ", positionsLocation=" + this.positionsLocation + ", shouldHeaderShimmer=" + this.shouldHeaderShimmer + ", onAssetHomeOpened=" + this.onAssetHomeOpened + ", positionInstrumentType=" + this.positionInstrumentType + ", reorderableListState=" + this.reorderableListState + ", reorderPending=" + this.reorderPending + ", animateItemPlacement=" + this.animateItemPlacement + ", onSortOptionsFragmentShown=" + this.onSortOptionsFragmentShown + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Reorderable(UIComponent<? extends AccountPositionAction> uIComponent, UIComponent<? extends AccountPositionAction> uIComponent2, PositionsLocation positionsLocation, boolean z, Function1<? super AssetHomeAssetType, Unit> onAssetHomeOpened, PositionInstrumentType positionInstrumentType, ReorderableListState<DisplayPositionListItem> reorderableListState, boolean z2, boolean z3, Function0<Unit> function0) {
                Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
                Intrinsics.checkNotNullParameter(onAssetHomeOpened, "onAssetHomeOpened");
                Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
                Intrinsics.checkNotNullParameter(reorderableListState, "reorderableListState");
                this.header = uIComponent;
                this.footer = uIComponent2;
                this.positionsLocation = positionsLocation;
                this.shouldHeaderShimmer = z;
                this.onAssetHomeOpened = onAssetHomeOpened;
                this.positionInstrumentType = positionInstrumentType;
                this.reorderableListState = reorderableListState;
                this.reorderPending = z2;
                this.animateItemPlacement = z3;
                this.onSortOptionsFragmentShown = function0;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public UIComponent<AccountPositionAction> getHeader() {
                return this.header;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public UIComponent<AccountPositionAction> getFooter() {
                return this.footer;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public PositionsLocation getPositionsLocation() {
                return this.positionsLocation;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public boolean getShouldHeaderShimmer() {
                return this.shouldHeaderShimmer;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public Function1<AssetHomeAssetType, Unit> getOnAssetHomeOpened() {
                return this.onAssetHomeOpened;
            }

            public final PositionInstrumentType getPositionInstrumentType() {
                return this.positionInstrumentType;
            }

            public final ReorderableListState<DisplayPositionListItem> getReorderableListState() {
                return this.reorderableListState;
            }

            public final boolean getReorderPending() {
                return this.reorderPending;
            }

            public final boolean getAnimateItemPlacement() {
                return this.animateItemPlacement;
            }

            public final Function0<Unit> getOnSortOptionsFragmentShown() {
                return this.onSortOptionsFragmentShown;
            }
        }

        /* compiled from: ReorderablePositionsList.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jg\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready$FixedOrder;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState$Ready;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", Footer.f10637type, "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "shouldHeaderShimmer", "", "onAssetHomeOpened", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;", "", "displayPositionListItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;ZLkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;)V", "getHeader", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getFooter", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "getShouldHeaderShimmer", "()Z", "getOnAssetHomeOpened", "()Lkotlin/jvm/functions/Function1;", "getDisplayPositionListItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListState$Ready$FixedOrder, reason: from toString */
        public static final /* data */ class FixedOrder implements Ready {
            public static final int $stable = 0;
            private final ImmutableList<DisplayPositionListItem> displayPositionListItems;
            private final UIComponent<AccountPositionAction> footer;
            private final UIComponent<AccountPositionAction> header;
            private final Function1<AssetHomeAssetType, Unit> onAssetHomeOpened;
            private final PositionsLocation positionsLocation;
            private final boolean shouldHeaderShimmer;

            public static /* synthetic */ FixedOrder copy$default(FixedOrder fixedOrder, UIComponent uIComponent, UIComponent uIComponent2, PositionsLocation positionsLocation, boolean z, Function1 function1, ImmutableList immutableList, int i, Object obj) {
                if ((i & 1) != 0) {
                    uIComponent = fixedOrder.header;
                }
                if ((i & 2) != 0) {
                    uIComponent2 = fixedOrder.footer;
                }
                if ((i & 4) != 0) {
                    positionsLocation = fixedOrder.positionsLocation;
                }
                if ((i & 8) != 0) {
                    z = fixedOrder.shouldHeaderShimmer;
                }
                if ((i & 16) != 0) {
                    function1 = fixedOrder.onAssetHomeOpened;
                }
                if ((i & 32) != 0) {
                    immutableList = fixedOrder.displayPositionListItems;
                }
                Function1 function12 = function1;
                ImmutableList immutableList2 = immutableList;
                return fixedOrder.copy(uIComponent, uIComponent2, positionsLocation, z, function12, immutableList2);
            }

            public final UIComponent<AccountPositionAction> component1() {
                return this.header;
            }

            public final UIComponent<AccountPositionAction> component2() {
                return this.footer;
            }

            /* renamed from: component3, reason: from getter */
            public final PositionsLocation getPositionsLocation() {
                return this.positionsLocation;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShouldHeaderShimmer() {
                return this.shouldHeaderShimmer;
            }

            public final Function1<AssetHomeAssetType, Unit> component5() {
                return this.onAssetHomeOpened;
            }

            public final ImmutableList<DisplayPositionListItem> component6() {
                return this.displayPositionListItems;
            }

            public final FixedOrder copy(UIComponent<? extends AccountPositionAction> header, UIComponent<? extends AccountPositionAction> footer, PositionsLocation positionsLocation, boolean shouldHeaderShimmer, Function1<? super AssetHomeAssetType, Unit> onAssetHomeOpened, ImmutableList<DisplayPositionListItem> displayPositionListItems) {
                Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
                Intrinsics.checkNotNullParameter(onAssetHomeOpened, "onAssetHomeOpened");
                Intrinsics.checkNotNullParameter(displayPositionListItems, "displayPositionListItems");
                return new FixedOrder(header, footer, positionsLocation, shouldHeaderShimmer, onAssetHomeOpened, displayPositionListItems);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FixedOrder)) {
                    return false;
                }
                FixedOrder fixedOrder = (FixedOrder) other;
                return Intrinsics.areEqual(this.header, fixedOrder.header) && Intrinsics.areEqual(this.footer, fixedOrder.footer) && this.positionsLocation == fixedOrder.positionsLocation && this.shouldHeaderShimmer == fixedOrder.shouldHeaderShimmer && Intrinsics.areEqual(this.onAssetHomeOpened, fixedOrder.onAssetHomeOpened) && Intrinsics.areEqual(this.displayPositionListItems, fixedOrder.displayPositionListItems);
            }

            public int hashCode() {
                UIComponent<AccountPositionAction> uIComponent = this.header;
                int iHashCode = (uIComponent == null ? 0 : uIComponent.hashCode()) * 31;
                UIComponent<AccountPositionAction> uIComponent2 = this.footer;
                return ((((((((iHashCode + (uIComponent2 != null ? uIComponent2.hashCode() : 0)) * 31) + this.positionsLocation.hashCode()) * 31) + Boolean.hashCode(this.shouldHeaderShimmer)) * 31) + this.onAssetHomeOpened.hashCode()) * 31) + this.displayPositionListItems.hashCode();
            }

            public String toString() {
                return "FixedOrder(header=" + this.header + ", footer=" + this.footer + ", positionsLocation=" + this.positionsLocation + ", shouldHeaderShimmer=" + this.shouldHeaderShimmer + ", onAssetHomeOpened=" + this.onAssetHomeOpened + ", displayPositionListItems=" + this.displayPositionListItems + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FixedOrder(UIComponent<? extends AccountPositionAction> uIComponent, UIComponent<? extends AccountPositionAction> uIComponent2, PositionsLocation positionsLocation, boolean z, Function1<? super AssetHomeAssetType, Unit> onAssetHomeOpened, ImmutableList<DisplayPositionListItem> displayPositionListItems) {
                Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
                Intrinsics.checkNotNullParameter(onAssetHomeOpened, "onAssetHomeOpened");
                Intrinsics.checkNotNullParameter(displayPositionListItems, "displayPositionListItems");
                this.header = uIComponent;
                this.footer = uIComponent2;
                this.positionsLocation = positionsLocation;
                this.shouldHeaderShimmer = z;
                this.onAssetHomeOpened = onAssetHomeOpened;
                this.displayPositionListItems = displayPositionListItems;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public UIComponent<AccountPositionAction> getHeader() {
                return this.header;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public UIComponent<AccountPositionAction> getFooter() {
                return this.footer;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public PositionsLocation getPositionsLocation() {
                return this.positionsLocation;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public boolean getShouldHeaderShimmer() {
                return this.shouldHeaderShimmer;
            }

            @Override // com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList.Ready
            public Function1<AssetHomeAssetType, Unit> getOnAssetHomeOpened() {
                return this.onAssetHomeOpened;
            }

            public final ImmutableList<DisplayPositionListItem> getDisplayPositionListItems() {
                return this.displayPositionListItems;
            }
        }
    }
}
