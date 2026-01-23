package com.robinhood.android.equityadvancedorder;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter;
import com.robinhood.models.api.ApiSalesTax;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EquityOrderFormRowState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "", "Empty", "HeaderTitle", "HeaderSubtitle", "EditableValue", "DropdownEdit", "Information", "ExpandableEstimatedCost", "FloatingSelection", "TaxLotsSelection", "Icon", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderSubtitle;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderTitle;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$TaxLotsSelection;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityOrderFormRowState {

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "height", "Landroidx/compose/ui/unit/Dp;", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-D9Ej5fM", "()F", "F", "component1", "component1-D9Ej5fM", "copy", "copy-0680j_4", "(F)Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements EquityOrderFormRowState {
        public static final int $stable = 0;
        private final float height;

        public /* synthetic */ Empty(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        /* renamed from: copy-0680j_4$default, reason: not valid java name */
        public static /* synthetic */ Empty m13747copy0680j_4$default(Empty empty, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = empty.height;
            }
            return empty.m13749copy0680j_4(f);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHeight() {
            return this.height;
        }

        /* renamed from: copy-0680j_4, reason: not valid java name */
        public final Empty m13749copy0680j_4(float height) {
            return new Empty(height, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && C2002Dp.m7997equalsimpl0(this.height, ((Empty) other).height);
        }

        public int hashCode() {
            return C2002Dp.m7998hashCodeimpl(this.height);
        }

        public String toString() {
            return "Empty(height=" + C2002Dp.m7999toStringimpl(this.height) + ")";
        }

        private Empty(float f) {
            this.height = f;
        }

        /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
        public final float m13750getHeightD9Ej5fM() {
            return this.height;
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderTitle;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeaderTitle implements EquityOrderFormRowState {
        public static final int $stable = StringResource.$stable;
        private final StringResource title;

        public static /* synthetic */ HeaderTitle copy$default(HeaderTitle headerTitle, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = headerTitle.title;
            }
            return headerTitle.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        public final HeaderTitle copy(StringResource title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new HeaderTitle(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderTitle) && Intrinsics.areEqual(this.title, ((HeaderTitle) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "HeaderTitle(title=" + this.title + ")";
        }

        public HeaderTitle(StringResource title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public final StringResource getTitle() {
            return this.title;
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderSubtitle;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeaderSubtitle implements EquityOrderFormRowState {
        public static final int $stable = StringResource.$stable;
        private final StringResource title;

        public static /* synthetic */ HeaderSubtitle copy$default(HeaderSubtitle headerSubtitle, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = headerSubtitle.title;
            }
            return headerSubtitle.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        public final HeaderSubtitle copy(StringResource title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new HeaderSubtitle(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderSubtitle) && Intrinsics.areEqual(this.title, ((HeaderSubtitle) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "HeaderSubtitle(title=" + this.title + ")";
        }

        public HeaderSubtitle(StringResource title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public final StringResource getTitle() {
            return this.title;
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0010\u00101\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u0010/J\u0012\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b4\u0010,J¶\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010 J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bE\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bF\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010,R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bI\u0010 R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\bL\u0010\"R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bN\u00102R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bO\u0010/R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\bP\u0010,¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "", "testTag", "Lcom/robinhood/utils/resource/StringResource;", "title", "", "showDivider", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "rowType", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "orderFormState", "value", "placeholderValue", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;", "titleIcon", "textFieldId", "Lkotlin/Function0;", "Landroidx/compose/ui/text/AnnotatedString;", "secondaryText", "metaTooltipText", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "numpadTextInputFormatter", "errorText", "errorIcon", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/advancedorderbottomsheet/EditingField;Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/utils/resource/StringResource;", "component3", "()Z", "component4", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "component5", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "component6", "component7", "component8", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;", "component9", "component10", "()Lkotlin/jvm/functions/Function2;", "component11", "component12", "()Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "component13", "component14", "copy", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/advancedorderbottomsheet/EditingField;Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;)Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "toString", "", "hashCode", "()I", "Ljava/lang/String;", "getTestTag", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "Z", "getShowDivider", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getRowType", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getOrderFormState", "getValue", "getPlaceholderValue", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;", "getTitleIcon", "getTextFieldId", "Lkotlin/jvm/functions/Function2;", "getSecondaryText", "getMetaTooltipText", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "getNumpadTextInputFormatter", "getErrorText", "getErrorIcon", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditableValue implements EquityOrderFormRowState {
        public static final int $stable = 8;
        private final Icon errorIcon;
        private final Function2<Composer, Integer, AnnotatedString> errorText;
        private final StringResource metaTooltipText;
        private final BentoNumpadTextInputFormatter numpadTextInputFormatter;
        private final OrderForm6 orderFormState;
        private final StringResource placeholderValue;
        private final EditingField rowType;
        private final Function2<Composer, Integer, AnnotatedString> secondaryText;
        private final boolean showDivider;
        private final String testTag;
        private final String textFieldId;
        private final StringResource title;
        private final Icon titleIcon;
        private final StringResource value;

        /* renamed from: component1, reason: from getter */
        public final String getTestTag() {
            return this.testTag;
        }

        public final Function2<Composer, Integer, AnnotatedString> component10() {
            return this.secondaryText;
        }

        /* renamed from: component11, reason: from getter */
        public final StringResource getMetaTooltipText() {
            return this.metaTooltipText;
        }

        /* renamed from: component12, reason: from getter */
        public final BentoNumpadTextInputFormatter getNumpadTextInputFormatter() {
            return this.numpadTextInputFormatter;
        }

        public final Function2<Composer, Integer, AnnotatedString> component13() {
            return this.errorText;
        }

        /* renamed from: component14, reason: from getter */
        public final Icon getErrorIcon() {
            return this.errorIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        /* renamed from: component4, reason: from getter */
        public final EditingField getRowType() {
            return this.rowType;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getValue() {
            return this.value;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getPlaceholderValue() {
            return this.placeholderValue;
        }

        /* renamed from: component8, reason: from getter */
        public final Icon getTitleIcon() {
            return this.titleIcon;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTextFieldId() {
            return this.textFieldId;
        }

        public final EditableValue copy(String testTag, StringResource title, boolean showDivider, EditingField rowType, OrderForm6 orderFormState, StringResource value, StringResource placeholderValue, Icon titleIcon, String textFieldId, Function2<? super Composer, ? super Integer, AnnotatedString> secondaryText, StringResource metaTooltipText, BentoNumpadTextInputFormatter numpadTextInputFormatter, Function2<? super Composer, ? super Integer, AnnotatedString> errorText, Icon errorIcon) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rowType, "rowType");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            Intrinsics.checkNotNullParameter(textFieldId, "textFieldId");
            Intrinsics.checkNotNullParameter(numpadTextInputFormatter, "numpadTextInputFormatter");
            return new EditableValue(testTag, title, showDivider, rowType, orderFormState, value, placeholderValue, titleIcon, textFieldId, secondaryText, metaTooltipText, numpadTextInputFormatter, errorText, errorIcon);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.testTag.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.showDivider)) * 31) + this.rowType.hashCode()) * 31) + this.orderFormState.hashCode()) * 31;
            StringResource stringResource = this.value;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            StringResource stringResource2 = this.placeholderValue;
            int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
            Icon icon = this.titleIcon;
            int iHashCode4 = (((iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31) + this.textFieldId.hashCode()) * 31;
            Function2<Composer, Integer, AnnotatedString> function2 = this.secondaryText;
            int iHashCode5 = (iHashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31;
            StringResource stringResource3 = this.metaTooltipText;
            int iHashCode6 = (((iHashCode5 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31) + this.numpadTextInputFormatter.hashCode()) * 31;
            Function2<Composer, Integer, AnnotatedString> function22 = this.errorText;
            int iHashCode7 = (iHashCode6 + (function22 == null ? 0 : function22.hashCode())) * 31;
            Icon icon2 = this.errorIcon;
            return iHashCode7 + (icon2 != null ? icon2.hashCode() : 0);
        }

        public String toString() {
            return "EditableValue(testTag=" + this.testTag + ", title=" + this.title + ", showDivider=" + this.showDivider + ", rowType=" + this.rowType + ", orderFormState=" + this.orderFormState + ", value=" + this.value + ", placeholderValue=" + this.placeholderValue + ", titleIcon=" + this.titleIcon + ", textFieldId=" + this.textFieldId + ", secondaryText=" + this.secondaryText + ", metaTooltipText=" + this.metaTooltipText + ", numpadTextInputFormatter=" + this.numpadTextInputFormatter + ", errorText=" + this.errorText + ", errorIcon=" + this.errorIcon + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EditableValue(String testTag, StringResource title, boolean z, EditingField rowType, OrderForm6 orderFormState, StringResource stringResource, StringResource stringResource2, Icon icon, String textFieldId, Function2<? super Composer, ? super Integer, AnnotatedString> function2, StringResource stringResource3, BentoNumpadTextInputFormatter numpadTextInputFormatter, Function2<? super Composer, ? super Integer, AnnotatedString> function22, Icon icon2) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rowType, "rowType");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            Intrinsics.checkNotNullParameter(textFieldId, "textFieldId");
            Intrinsics.checkNotNullParameter(numpadTextInputFormatter, "numpadTextInputFormatter");
            this.testTag = testTag;
            this.title = title;
            this.showDivider = z;
            this.rowType = rowType;
            this.orderFormState = orderFormState;
            this.value = stringResource;
            this.placeholderValue = stringResource2;
            this.titleIcon = icon;
            this.textFieldId = textFieldId;
            this.secondaryText = function2;
            this.metaTooltipText = stringResource3;
            this.numpadTextInputFormatter = numpadTextInputFormatter;
            this.errorText = function22;
            this.errorIcon = icon2;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ EditableValue(java.lang.String r18, com.robinhood.utils.resource.StringResource r19, boolean r20, com.robinhood.android.advancedorderbottomsheet.EditingField r21, com.robinhood.shared.trading.tradeflow.OrderForm6 r22, com.robinhood.utils.resource.StringResource r23, com.robinhood.utils.resource.StringResource r24, com.robinhood.android.equityadvancedorder.EquityOrderFormRowState.Icon r25, java.lang.String r26, kotlin.jvm.functions.Function2 r27, com.robinhood.utils.resource.StringResource r28, com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter r29, kotlin.jvm.functions.Function2 r30, com.robinhood.android.equityadvancedorder.EquityOrderFormRowState.Icon r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
            /*
                r17 = this;
                r0 = r32
                r1 = r0 & 4
                if (r1 == 0) goto L9
                r1 = 1
                r5 = r1
                goto Lb
            L9:
                r5 = r20
            Lb:
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L12
                r9 = r2
                goto L14
            L12:
                r9 = r24
            L14:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L1a
                r10 = r2
                goto L1c
            L1a:
                r10 = r25
            L1c:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L22
                r12 = r2
                goto L24
            L22:
                r12 = r27
            L24:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L2a
                r13 = r2
                goto L2c
            L2a:
                r13 = r28
            L2c:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L32
                r15 = r2
                goto L34
            L32:
                r15 = r30
            L34:
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L4b
                r16 = r2
                r3 = r18
                r4 = r19
                r6 = r21
                r7 = r22
                r8 = r23
                r11 = r26
                r14 = r29
                r2 = r17
                goto L5d
            L4b:
                r16 = r31
                r2 = r17
                r3 = r18
                r4 = r19
                r6 = r21
                r7 = r22
                r8 = r23
                r11 = r26
                r14 = r29
            L5d:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equityadvancedorder.EquityOrderFormRowState.EditableValue.<init>(java.lang.String, com.robinhood.utils.resource.StringResource, boolean, com.robinhood.android.advancedorderbottomsheet.EditingField, com.robinhood.shared.trading.tradeflow.OrderFormState, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, com.robinhood.android.equityadvancedorder.EquityOrderFormRowState$Icon, java.lang.String, kotlin.jvm.functions.Function2, com.robinhood.utils.resource.StringResource, com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter, kotlin.jvm.functions.Function2, com.robinhood.android.equityadvancedorder.EquityOrderFormRowState$Icon, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getTestTag() {
            return this.testTag;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final EditingField getRowType() {
            return this.rowType;
        }

        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        public final StringResource getValue() {
            return this.value;
        }

        public final StringResource getPlaceholderValue() {
            return this.placeholderValue;
        }

        public final Icon getTitleIcon() {
            return this.titleIcon;
        }

        public final String getTextFieldId() {
            return this.textFieldId;
        }

        public final Function2<Composer, Integer, AnnotatedString> getSecondaryText() {
            return this.secondaryText;
        }

        public final StringResource getMetaTooltipText() {
            return this.metaTooltipText;
        }

        public final BentoNumpadTextInputFormatter getNumpadTextInputFormatter() {
            return this.numpadTextInputFormatter;
        }

        public final Function2<Composer, Integer, AnnotatedString> getErrorText() {
            return this.errorText;
        }

        public final Icon getErrorIcon() {
            return this.errorIcon;
        }

        public boolean equals(Object other) {
            EditableValue editableValue = other instanceof EditableValue ? (EditableValue) other : null;
            return editableValue != null && Intrinsics.areEqual(this.testTag, editableValue.testTag) && Intrinsics.areEqual(this.title, editableValue.title) && this.showDivider == editableValue.showDivider && this.rowType == editableValue.rowType && Intrinsics.areEqual(this.value, editableValue.value) && Intrinsics.areEqual(this.placeholderValue, editableValue.placeholderValue) && Intrinsics.areEqual(this.titleIcon, editableValue.titleIcon) && Intrinsics.areEqual(this.metaTooltipText, editableValue.metaTooltipText) && Intrinsics.areEqual(this.numpadTextInputFormatter, editableValue.numpadTextInputFormatter) && Intrinsics.areEqual(this.textFieldId, editableValue.textFieldId);
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "testTag", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "secondaryTitle", "rowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "value", "placeholderValue", "secondaryValue", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTestTag", "()Ljava/lang/String;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryTitle", "getRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getOrderFormState", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getValue", "getPlaceholderValue", "getSecondaryValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DropdownEdit implements EquityOrderFormRowState {
        public static final int $stable = StringResource.$stable;
        private final OrderForm6 orderFormState;
        private final StringResource placeholderValue;
        private final EditingField rowType;
        private final StringResource secondaryTitle;
        private final StringResource secondaryValue;
        private final String testTag;
        private final StringResource title;
        private final StringResource value;

        public static /* synthetic */ DropdownEdit copy$default(DropdownEdit dropdownEdit, String str, StringResource stringResource, StringResource stringResource2, EditingField editingField, OrderForm6 orderForm6, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dropdownEdit.testTag;
            }
            if ((i & 2) != 0) {
                stringResource = dropdownEdit.title;
            }
            if ((i & 4) != 0) {
                stringResource2 = dropdownEdit.secondaryTitle;
            }
            if ((i & 8) != 0) {
                editingField = dropdownEdit.rowType;
            }
            if ((i & 16) != 0) {
                orderForm6 = dropdownEdit.orderFormState;
            }
            if ((i & 32) != 0) {
                stringResource3 = dropdownEdit.value;
            }
            if ((i & 64) != 0) {
                stringResource4 = dropdownEdit.placeholderValue;
            }
            if ((i & 128) != 0) {
                stringResource5 = dropdownEdit.secondaryValue;
            }
            StringResource stringResource6 = stringResource4;
            StringResource stringResource7 = stringResource5;
            OrderForm6 orderForm62 = orderForm6;
            StringResource stringResource8 = stringResource3;
            return dropdownEdit.copy(str, stringResource, stringResource2, editingField, orderForm62, stringResource8, stringResource6, stringResource7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTestTag() {
            return this.testTag;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSecondaryTitle() {
            return this.secondaryTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final EditingField getRowType() {
            return this.rowType;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getValue() {
            return this.value;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getPlaceholderValue() {
            return this.placeholderValue;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getSecondaryValue() {
            return this.secondaryValue;
        }

        public final DropdownEdit copy(String testTag, StringResource title, StringResource secondaryTitle, EditingField rowType, OrderForm6 orderFormState, StringResource value, StringResource placeholderValue, StringResource secondaryValue) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rowType, "rowType");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            return new DropdownEdit(testTag, title, secondaryTitle, rowType, orderFormState, value, placeholderValue, secondaryValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DropdownEdit)) {
                return false;
            }
            DropdownEdit dropdownEdit = (DropdownEdit) other;
            return Intrinsics.areEqual(this.testTag, dropdownEdit.testTag) && Intrinsics.areEqual(this.title, dropdownEdit.title) && Intrinsics.areEqual(this.secondaryTitle, dropdownEdit.secondaryTitle) && this.rowType == dropdownEdit.rowType && this.orderFormState == dropdownEdit.orderFormState && Intrinsics.areEqual(this.value, dropdownEdit.value) && Intrinsics.areEqual(this.placeholderValue, dropdownEdit.placeholderValue) && Intrinsics.areEqual(this.secondaryValue, dropdownEdit.secondaryValue);
        }

        public int hashCode() {
            int iHashCode = ((this.testTag.hashCode() * 31) + this.title.hashCode()) * 31;
            StringResource stringResource = this.secondaryTitle;
            int iHashCode2 = (((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.rowType.hashCode()) * 31) + this.orderFormState.hashCode()) * 31;
            StringResource stringResource2 = this.value;
            int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
            StringResource stringResource3 = this.placeholderValue;
            int iHashCode4 = (iHashCode3 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
            StringResource stringResource4 = this.secondaryValue;
            return iHashCode4 + (stringResource4 != null ? stringResource4.hashCode() : 0);
        }

        public String toString() {
            return "DropdownEdit(testTag=" + this.testTag + ", title=" + this.title + ", secondaryTitle=" + this.secondaryTitle + ", rowType=" + this.rowType + ", orderFormState=" + this.orderFormState + ", value=" + this.value + ", placeholderValue=" + this.placeholderValue + ", secondaryValue=" + this.secondaryValue + ")";
        }

        public DropdownEdit(String testTag, StringResource title, StringResource stringResource, EditingField rowType, OrderForm6 orderFormState, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rowType, "rowType");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            this.testTag = testTag;
            this.title = title;
            this.secondaryTitle = stringResource;
            this.rowType = rowType;
            this.orderFormState = orderFormState;
            this.value = stringResource2;
            this.placeholderValue = stringResource3;
            this.secondaryValue = stringResource4;
        }

        public /* synthetic */ DropdownEdit(String str, StringResource stringResource, StringResource stringResource2, EditingField editingField, OrderForm6 orderForm6, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, stringResource, (i & 4) != 0 ? null : stringResource2, editingField, orderForm6, stringResource3, (i & 64) != 0 ? null : stringResource4, (i & 128) != 0 ? null : stringResource5);
        }

        public final String getTestTag() {
            return this.testTag;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSecondaryTitle() {
            return this.secondaryTitle;
        }

        public final EditingField getRowType() {
            return this.rowType;
        }

        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        public final StringResource getValue() {
            return this.value;
        }

        public final StringResource getPlaceholderValue() {
            return this.placeholderValue;
        }

        public final StringResource getSecondaryValue() {
            return this.secondaryValue;
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "testTag", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "value", "titleIcon", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;", "boldValue", "", "secondaryText", "secondaryIcon", "showPlaceholder", "showDivider", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;ZZ)V", "getTestTag", "()Ljava/lang/String;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "getTitleIcon", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;", "getBoldValue", "()Z", "getSecondaryText", "getSecondaryIcon", "getShowPlaceholder", "getShowDivider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Information implements EquityOrderFormRowState {
        public static final int $stable = StringResource.$stable;
        private final boolean boldValue;
        private final Icon secondaryIcon;
        private final StringResource secondaryText;
        private final boolean showDivider;
        private final boolean showPlaceholder;
        private final String testTag;
        private final StringResource title;
        private final Icon titleIcon;
        private final StringResource value;

        public static /* synthetic */ Information copy$default(Information information, String str, StringResource stringResource, StringResource stringResource2, Icon icon, boolean z, StringResource stringResource3, Icon icon2, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = information.testTag;
            }
            if ((i & 2) != 0) {
                stringResource = information.title;
            }
            if ((i & 4) != 0) {
                stringResource2 = information.value;
            }
            if ((i & 8) != 0) {
                icon = information.titleIcon;
            }
            if ((i & 16) != 0) {
                z = information.boldValue;
            }
            if ((i & 32) != 0) {
                stringResource3 = information.secondaryText;
            }
            if ((i & 64) != 0) {
                icon2 = information.secondaryIcon;
            }
            if ((i & 128) != 0) {
                z2 = information.showPlaceholder;
            }
            if ((i & 256) != 0) {
                z3 = information.showDivider;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            StringResource stringResource4 = stringResource3;
            Icon icon3 = icon2;
            boolean z6 = z;
            StringResource stringResource5 = stringResource2;
            return information.copy(str, stringResource, stringResource5, icon, z6, stringResource4, icon3, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTestTag() {
            return this.testTag;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getValue() {
            return this.value;
        }

        /* renamed from: component4, reason: from getter */
        public final Icon getTitleIcon() {
            return this.titleIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getBoldValue() {
            return this.boldValue;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component7, reason: from getter */
        public final Icon getSecondaryIcon() {
            return this.secondaryIcon;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowPlaceholder() {
            return this.showPlaceholder;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final Information copy(String testTag, StringResource title, StringResource value, Icon titleIcon, boolean boldValue, StringResource secondaryText, Icon secondaryIcon, boolean showPlaceholder, boolean showDivider) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Information(testTag, title, value, titleIcon, boldValue, secondaryText, secondaryIcon, showPlaceholder, showDivider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Information)) {
                return false;
            }
            Information information = (Information) other;
            return Intrinsics.areEqual(this.testTag, information.testTag) && Intrinsics.areEqual(this.title, information.title) && Intrinsics.areEqual(this.value, information.value) && Intrinsics.areEqual(this.titleIcon, information.titleIcon) && this.boldValue == information.boldValue && Intrinsics.areEqual(this.secondaryText, information.secondaryText) && Intrinsics.areEqual(this.secondaryIcon, information.secondaryIcon) && this.showPlaceholder == information.showPlaceholder && this.showDivider == information.showDivider;
        }

        public int hashCode() {
            int iHashCode = ((((this.testTag.hashCode() * 31) + this.title.hashCode()) * 31) + this.value.hashCode()) * 31;
            Icon icon = this.titleIcon;
            int iHashCode2 = (((iHashCode + (icon == null ? 0 : icon.hashCode())) * 31) + Boolean.hashCode(this.boldValue)) * 31;
            StringResource stringResource = this.secondaryText;
            int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            Icon icon2 = this.secondaryIcon;
            return ((((iHashCode3 + (icon2 != null ? icon2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showPlaceholder)) * 31) + Boolean.hashCode(this.showDivider);
        }

        public String toString() {
            return "Information(testTag=" + this.testTag + ", title=" + this.title + ", value=" + this.value + ", titleIcon=" + this.titleIcon + ", boldValue=" + this.boldValue + ", secondaryText=" + this.secondaryText + ", secondaryIcon=" + this.secondaryIcon + ", showPlaceholder=" + this.showPlaceholder + ", showDivider=" + this.showDivider + ")";
        }

        public Information(String testTag, StringResource title, StringResource value, Icon icon, boolean z, StringResource stringResource, Icon icon2, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.testTag = testTag;
            this.title = title;
            this.value = value;
            this.titleIcon = icon;
            this.boldValue = z;
            this.secondaryText = stringResource;
            this.secondaryIcon = icon2;
            this.showPlaceholder = z2;
            this.showDivider = z3;
        }

        public /* synthetic */ Information(String str, StringResource stringResource, StringResource stringResource2, Icon icon, boolean z, StringResource stringResource3, Icon icon2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, stringResource, stringResource2, (i & 8) != 0 ? null : icon, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : stringResource3, (i & 64) != 0 ? null : icon2, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3);
        }

        public final String getTestTag() {
            return this.testTag;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getValue() {
            return this.value;
        }

        public final Icon getTitleIcon() {
            return this.titleIcon;
        }

        public final boolean getBoldValue() {
            return this.boldValue;
        }

        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        public final Icon getSecondaryIcon() {
            return this.secondaryIcon;
        }

        public final boolean getShowPlaceholder() {
            return this.showPlaceholder;
        }

        public final boolean getShowDivider() {
            return this.showDivider;
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0002\b'J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\u0016\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0002\b+J\t\u0010,\u001a\u00020\u0011HÆ\u0003J\u007f\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0011HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "estimatedCostTitle", "Lcom/robinhood/utils/resource/StringResource;", "estimatedCostValue", "quantity", "Ljava/math/BigDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "estimatedTotalFees", "Lkotlin/Result;", "salesTaxes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/ApiSalesTax;", "isBorrowFeesApplicable", "", "estimatedTotalDailyBorrowFee", "resetTooltipKey", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lkotlin/Result;Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/Result;I)V", "getEstimatedCostTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getEstimatedCostValue", "getQuantity", "()Ljava/math/BigDecimal;", "getPrice", "getEstimatedTotalFees-xLWZpok", "()Lkotlin/Result;", "getSalesTaxes", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getEstimatedTotalDailyBorrowFee-xLWZpok", "getResetTooltipKey", "()I", "component1", "component2", "component3", "component4", "component5", "component5-xLWZpok", "component6", "component7", "component8", "component8-xLWZpok", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExpandableEstimatedCost implements EquityOrderFormRowState {
        public static final int $stable = 8;
        private final StringResource estimatedCostTitle;
        private final StringResource estimatedCostValue;
        private final Result<BigDecimal> estimatedTotalDailyBorrowFee;
        private final Result<BigDecimal> estimatedTotalFees;
        private final boolean isBorrowFeesApplicable;
        private final BigDecimal price;
        private final BigDecimal quantity;
        private final int resetTooltipKey;
        private final ImmutableList<ApiSalesTax> salesTaxes;

        public static /* synthetic */ ExpandableEstimatedCost copy$default(ExpandableEstimatedCost expandableEstimatedCost, StringResource stringResource, StringResource stringResource2, BigDecimal bigDecimal, BigDecimal bigDecimal2, Result result, ImmutableList immutableList, boolean z, Result result2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stringResource = expandableEstimatedCost.estimatedCostTitle;
            }
            if ((i2 & 2) != 0) {
                stringResource2 = expandableEstimatedCost.estimatedCostValue;
            }
            if ((i2 & 4) != 0) {
                bigDecimal = expandableEstimatedCost.quantity;
            }
            if ((i2 & 8) != 0) {
                bigDecimal2 = expandableEstimatedCost.price;
            }
            if ((i2 & 16) != 0) {
                result = expandableEstimatedCost.estimatedTotalFees;
            }
            if ((i2 & 32) != 0) {
                immutableList = expandableEstimatedCost.salesTaxes;
            }
            if ((i2 & 64) != 0) {
                z = expandableEstimatedCost.isBorrowFeesApplicable;
            }
            if ((i2 & 128) != 0) {
                result2 = expandableEstimatedCost.estimatedTotalDailyBorrowFee;
            }
            if ((i2 & 256) != 0) {
                i = expandableEstimatedCost.resetTooltipKey;
            }
            Result result3 = result2;
            int i3 = i;
            ImmutableList immutableList2 = immutableList;
            boolean z2 = z;
            Result result4 = result;
            BigDecimal bigDecimal3 = bigDecimal;
            return expandableEstimatedCost.copy(stringResource, stringResource2, bigDecimal3, bigDecimal2, result4, immutableList2, z2, result3, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getEstimatedCostTitle() {
            return this.estimatedCostTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getEstimatedCostValue() {
            return this.estimatedCostValue;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        /* renamed from: component5-xLWZpok, reason: not valid java name */
        public final Result<BigDecimal> m13751component5xLWZpok() {
            return this.estimatedTotalFees;
        }

        public final ImmutableList<ApiSalesTax> component6() {
            return this.salesTaxes;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsBorrowFeesApplicable() {
            return this.isBorrowFeesApplicable;
        }

        /* renamed from: component8-xLWZpok, reason: not valid java name */
        public final Result<BigDecimal> m13752component8xLWZpok() {
            return this.estimatedTotalDailyBorrowFee;
        }

        /* renamed from: component9, reason: from getter */
        public final int getResetTooltipKey() {
            return this.resetTooltipKey;
        }

        public final ExpandableEstimatedCost copy(StringResource estimatedCostTitle, StringResource estimatedCostValue, BigDecimal quantity, BigDecimal price, Result<? extends BigDecimal> estimatedTotalFees, ImmutableList<ApiSalesTax> salesTaxes, boolean isBorrowFeesApplicable, Result<? extends BigDecimal> estimatedTotalDailyBorrowFee, int resetTooltipKey) {
            Intrinsics.checkNotNullParameter(estimatedCostTitle, "estimatedCostTitle");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new ExpandableEstimatedCost(estimatedCostTitle, estimatedCostValue, quantity, price, estimatedTotalFees, salesTaxes, isBorrowFeesApplicable, estimatedTotalDailyBorrowFee, resetTooltipKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandableEstimatedCost)) {
                return false;
            }
            ExpandableEstimatedCost expandableEstimatedCost = (ExpandableEstimatedCost) other;
            return Intrinsics.areEqual(this.estimatedCostTitle, expandableEstimatedCost.estimatedCostTitle) && Intrinsics.areEqual(this.estimatedCostValue, expandableEstimatedCost.estimatedCostValue) && Intrinsics.areEqual(this.quantity, expandableEstimatedCost.quantity) && Intrinsics.areEqual(this.price, expandableEstimatedCost.price) && Intrinsics.areEqual(this.estimatedTotalFees, expandableEstimatedCost.estimatedTotalFees) && Intrinsics.areEqual(this.salesTaxes, expandableEstimatedCost.salesTaxes) && this.isBorrowFeesApplicable == expandableEstimatedCost.isBorrowFeesApplicable && Intrinsics.areEqual(this.estimatedTotalDailyBorrowFee, expandableEstimatedCost.estimatedTotalDailyBorrowFee) && this.resetTooltipKey == expandableEstimatedCost.resetTooltipKey;
        }

        public int hashCode() {
            int iHashCode = this.estimatedCostTitle.hashCode() * 31;
            StringResource stringResource = this.estimatedCostValue;
            int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.quantity.hashCode()) * 31;
            BigDecimal bigDecimal = this.price;
            int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Result<BigDecimal> result = this.estimatedTotalFees;
            int iM28554hashCodeimpl = (iHashCode3 + (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue()))) * 31;
            ImmutableList<ApiSalesTax> immutableList = this.salesTaxes;
            int iHashCode4 = (((iM28554hashCodeimpl + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + Boolean.hashCode(this.isBorrowFeesApplicable)) * 31;
            Result<BigDecimal> result2 = this.estimatedTotalDailyBorrowFee;
            return ((iHashCode4 + (result2 != null ? Result.m28554hashCodeimpl(result2.getValue()) : 0)) * 31) + Integer.hashCode(this.resetTooltipKey);
        }

        public String toString() {
            return "ExpandableEstimatedCost(estimatedCostTitle=" + this.estimatedCostTitle + ", estimatedCostValue=" + this.estimatedCostValue + ", quantity=" + this.quantity + ", price=" + this.price + ", estimatedTotalFees=" + this.estimatedTotalFees + ", salesTaxes=" + this.salesTaxes + ", isBorrowFeesApplicable=" + this.isBorrowFeesApplicable + ", estimatedTotalDailyBorrowFee=" + this.estimatedTotalDailyBorrowFee + ", resetTooltipKey=" + this.resetTooltipKey + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ExpandableEstimatedCost(StringResource estimatedCostTitle, StringResource stringResource, BigDecimal quantity, BigDecimal bigDecimal, Result<? extends BigDecimal> result, ImmutableList<ApiSalesTax> immutableList, boolean z, Result<? extends BigDecimal> result2, int i) {
            Intrinsics.checkNotNullParameter(estimatedCostTitle, "estimatedCostTitle");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.estimatedCostTitle = estimatedCostTitle;
            this.estimatedCostValue = stringResource;
            this.quantity = quantity;
            this.price = bigDecimal;
            this.estimatedTotalFees = result;
            this.salesTaxes = immutableList;
            this.isBorrowFeesApplicable = z;
            this.estimatedTotalDailyBorrowFee = result2;
            this.resetTooltipKey = i;
        }

        public /* synthetic */ ExpandableEstimatedCost(StringResource stringResource, StringResource stringResource2, BigDecimal bigDecimal, BigDecimal bigDecimal2, Result result, ImmutableList immutableList, boolean z, Result result2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, stringResource2, bigDecimal, bigDecimal2, result, immutableList, z, result2, (i2 & 256) != 0 ? 0 : i);
        }

        public final StringResource getEstimatedCostTitle() {
            return this.estimatedCostTitle;
        }

        public final StringResource getEstimatedCostValue() {
            return this.estimatedCostValue;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final BigDecimal getPrice() {
            return this.price;
        }

        /* renamed from: getEstimatedTotalFees-xLWZpok, reason: not valid java name */
        public final Result<BigDecimal> m13754getEstimatedTotalFeesxLWZpok() {
            return this.estimatedTotalFees;
        }

        public final ImmutableList<ApiSalesTax> getSalesTaxes() {
            return this.salesTaxes;
        }

        public final boolean isBorrowFeesApplicable() {
            return this.isBorrowFeesApplicable;
        }

        /* renamed from: getEstimatedTotalDailyBorrowFee-xLWZpok, reason: not valid java name */
        public final Result<BigDecimal> m13753getEstimatedTotalDailyBorrowFeexLWZpok() {
            return this.estimatedTotalDailyBorrowFee;
        }

        public final int getResetTooltipKey() {
            return this.resetTooltipKey;
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003JW\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "testTag", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "showDivider", "", "rowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "value", "selectionItems", "", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/advancedorderbottomsheet/EditingField;Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;)V", "getTestTag", "()Ljava/lang/String;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getShowDivider", "()Z", "getRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getOrderFormState", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getValue", "getSelectionItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "SelectionItem", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FloatingSelection implements EquityOrderFormRowState {
        public static final int $stable = 8;
        private final OrderForm6 orderFormState;
        private final EditingField rowType;
        private final List<SelectionItem> selectionItems;
        private final boolean showDivider;
        private final String testTag;
        private final StringResource title;
        private final StringResource value;

        public static /* synthetic */ FloatingSelection copy$default(FloatingSelection floatingSelection, String str, StringResource stringResource, boolean z, EditingField editingField, OrderForm6 orderForm6, StringResource stringResource2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = floatingSelection.testTag;
            }
            if ((i & 2) != 0) {
                stringResource = floatingSelection.title;
            }
            if ((i & 4) != 0) {
                z = floatingSelection.showDivider;
            }
            if ((i & 8) != 0) {
                editingField = floatingSelection.rowType;
            }
            if ((i & 16) != 0) {
                orderForm6 = floatingSelection.orderFormState;
            }
            if ((i & 32) != 0) {
                stringResource2 = floatingSelection.value;
            }
            if ((i & 64) != 0) {
                list = floatingSelection.selectionItems;
            }
            StringResource stringResource3 = stringResource2;
            List list2 = list;
            OrderForm6 orderForm62 = orderForm6;
            boolean z2 = z;
            return floatingSelection.copy(str, stringResource, z2, editingField, orderForm62, stringResource3, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTestTag() {
            return this.testTag;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        /* renamed from: component4, reason: from getter */
        public final EditingField getRowType() {
            return this.rowType;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getValue() {
            return this.value;
        }

        public final List<SelectionItem> component7() {
            return this.selectionItems;
        }

        public final FloatingSelection copy(String testTag, StringResource title, boolean showDivider, EditingField rowType, OrderForm6 orderFormState, StringResource value, List<? extends SelectionItem> selectionItems) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(selectionItems, "selectionItems");
            return new FloatingSelection(testTag, title, showDivider, rowType, orderFormState, value, selectionItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloatingSelection)) {
                return false;
            }
            FloatingSelection floatingSelection = (FloatingSelection) other;
            return Intrinsics.areEqual(this.testTag, floatingSelection.testTag) && Intrinsics.areEqual(this.title, floatingSelection.title) && this.showDivider == floatingSelection.showDivider && this.rowType == floatingSelection.rowType && this.orderFormState == floatingSelection.orderFormState && Intrinsics.areEqual(this.value, floatingSelection.value) && Intrinsics.areEqual(this.selectionItems, floatingSelection.selectionItems);
        }

        public int hashCode() {
            int iHashCode = ((((this.testTag.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.showDivider)) * 31;
            EditingField editingField = this.rowType;
            return ((((((iHashCode + (editingField == null ? 0 : editingField.hashCode())) * 31) + this.orderFormState.hashCode()) * 31) + this.value.hashCode()) * 31) + this.selectionItems.hashCode();
        }

        public String toString() {
            return "FloatingSelection(testTag=" + this.testTag + ", title=" + this.title + ", showDivider=" + this.showDivider + ", rowType=" + this.rowType + ", orderFormState=" + this.orderFormState + ", value=" + this.value + ", selectionItems=" + this.selectionItems + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FloatingSelection(String testTag, StringResource title, boolean z, EditingField editingField, OrderForm6 orderFormState, StringResource value, List<? extends SelectionItem> selectionItems) {
            Intrinsics.checkNotNullParameter(testTag, "testTag");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(selectionItems, "selectionItems");
            this.testTag = testTag;
            this.title = title;
            this.showDivider = z;
            this.rowType = editingField;
            this.orderFormState = orderFormState;
            this.value = value;
            this.selectionItems = selectionItems;
        }

        public /* synthetic */ FloatingSelection(String str, StringResource stringResource, boolean z, EditingField editingField, OrderForm6 orderForm6, StringResource stringResource2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, stringResource, z, (i & 8) != 0 ? null : editingField, orderForm6, stringResource2, list);
        }

        public final String getTestTag() {
            return this.testTag;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final EditingField getRowType() {
            return this.rowType;
        }

        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        public final StringResource getValue() {
            return this.value;
        }

        public final List<SelectionItem> getSelectionItems() {
            return this.selectionItems;
        }

        /* compiled from: EquityOrderFormRowState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem;", "", "value", "Lcom/robinhood/utils/resource/StringResource;", "getValue", "()Lcom/robinhood/utils/resource/StringResource;", "onClick", "Lkotlin/Function0;", "", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "MoreOptions", "Checkable", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem$Checkable;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem$MoreOptions;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface SelectionItem {
            Function0<Unit> getOnClick();

            StringResource getValue();

            /* compiled from: EquityOrderFormRowState.kt */
            @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem$MoreOptions;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem;", "value", "Lcom/robinhood/utils/resource/StringResource;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;)V", "getValue", "()Lcom/robinhood/utils/resource/StringResource;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class MoreOptions implements SelectionItem {
                public static final int $stable = StringResource.$stable;
                private final Function0<Unit> onClick;
                private final StringResource value;

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ MoreOptions copy$default(MoreOptions moreOptions, StringResource stringResource, Function0 function0, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = moreOptions.value;
                    }
                    if ((i & 2) != 0) {
                        function0 = moreOptions.onClick;
                    }
                    return moreOptions.copy(stringResource, function0);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getValue() {
                    return this.value;
                }

                public final Function0<Unit> component2() {
                    return this.onClick;
                }

                public final MoreOptions copy(StringResource value, Function0<Unit> onClick) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(onClick, "onClick");
                    return new MoreOptions(value, onClick);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MoreOptions)) {
                        return false;
                    }
                    MoreOptions moreOptions = (MoreOptions) other;
                    return Intrinsics.areEqual(this.value, moreOptions.value) && Intrinsics.areEqual(this.onClick, moreOptions.onClick);
                }

                public int hashCode() {
                    return (this.value.hashCode() * 31) + this.onClick.hashCode();
                }

                public String toString() {
                    return "MoreOptions(value=" + this.value + ", onClick=" + this.onClick + ")";
                }

                public MoreOptions(StringResource value, Function0<Unit> onClick) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(onClick, "onClick");
                    this.value = value;
                    this.onClick = onClick;
                }

                @Override // com.robinhood.android.equityadvancedorder.EquityOrderFormRowState.FloatingSelection.SelectionItem
                public StringResource getValue() {
                    return this.value;
                }

                @Override // com.robinhood.android.equityadvancedorder.EquityOrderFormRowState.FloatingSelection.SelectionItem
                public Function0<Unit> getOnClick() {
                    return this.onClick;
                }
            }

            /* compiled from: EquityOrderFormRowState.kt */
            @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem$Checkable;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem;", "value", "Lcom/robinhood/utils/resource/StringResource;", "selected", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZLkotlin/jvm/functions/Function0;)V", "getValue", "()Lcom/robinhood/utils/resource/StringResource;", "getSelected", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Checkable implements SelectionItem {
                public static final int $stable = StringResource.$stable;
                private final Function0<Unit> onClick;
                private final boolean selected;
                private final StringResource value;

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Checkable copy$default(Checkable checkable, StringResource stringResource, boolean z, Function0 function0, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = checkable.value;
                    }
                    if ((i & 2) != 0) {
                        z = checkable.selected;
                    }
                    if ((i & 4) != 0) {
                        function0 = checkable.onClick;
                    }
                    return checkable.copy(stringResource, z, function0);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getValue() {
                    return this.value;
                }

                /* renamed from: component2, reason: from getter */
                public final boolean getSelected() {
                    return this.selected;
                }

                public final Function0<Unit> component3() {
                    return this.onClick;
                }

                public final Checkable copy(StringResource value, boolean selected, Function0<Unit> onClick) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(onClick, "onClick");
                    return new Checkable(value, selected, onClick);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Checkable)) {
                        return false;
                    }
                    Checkable checkable = (Checkable) other;
                    return Intrinsics.areEqual(this.value, checkable.value) && this.selected == checkable.selected && Intrinsics.areEqual(this.onClick, checkable.onClick);
                }

                public int hashCode() {
                    return (((this.value.hashCode() * 31) + Boolean.hashCode(this.selected)) * 31) + this.onClick.hashCode();
                }

                public String toString() {
                    return "Checkable(value=" + this.value + ", selected=" + this.selected + ", onClick=" + this.onClick + ")";
                }

                public Checkable(StringResource value, boolean z, Function0<Unit> onClick) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(onClick, "onClick");
                    this.value = value;
                    this.selected = z;
                    this.onClick = onClick;
                }

                @Override // com.robinhood.android.equityadvancedorder.EquityOrderFormRowState.FloatingSelection.SelectionItem
                public StringResource getValue() {
                    return this.value;
                }

                public final boolean getSelected() {
                    return this.selected;
                }

                @Override // com.robinhood.android.equityadvancedorder.EquityOrderFormRowState.FloatingSelection.SelectionItem
                public Function0<Unit> getOnClick() {
                    return this.onClick;
                }
            }
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$TaxLotsSelection;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "orderId", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/shared/trading/tradeflow/OrderFormState;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderId", "getOrderFormState", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "rowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TaxLotsSelection implements EquityOrderFormRowState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID instrumentId;
        private final OrderForm6 orderFormState;
        private final UUID orderId;

        public static /* synthetic */ TaxLotsSelection copy$default(TaxLotsSelection taxLotsSelection, String str, UUID uuid, UUID uuid2, OrderForm6 orderForm6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taxLotsSelection.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = taxLotsSelection.instrumentId;
            }
            if ((i & 4) != 0) {
                uuid2 = taxLotsSelection.orderId;
            }
            if ((i & 8) != 0) {
                orderForm6 = taxLotsSelection.orderFormState;
            }
            return taxLotsSelection.copy(str, uuid, uuid2, orderForm6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getOrderId() {
            return this.orderId;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        public final TaxLotsSelection copy(String accountNumber, UUID instrumentId, UUID orderId, OrderForm6 orderFormState) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            return new TaxLotsSelection(accountNumber, instrumentId, orderId, orderFormState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaxLotsSelection)) {
                return false;
            }
            TaxLotsSelection taxLotsSelection = (TaxLotsSelection) other;
            return Intrinsics.areEqual(this.accountNumber, taxLotsSelection.accountNumber) && Intrinsics.areEqual(this.instrumentId, taxLotsSelection.instrumentId) && Intrinsics.areEqual(this.orderId, taxLotsSelection.orderId) && this.orderFormState == taxLotsSelection.orderFormState;
        }

        public int hashCode() {
            return (((((this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.orderFormState.hashCode();
        }

        public String toString() {
            return "TaxLotsSelection(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", orderId=" + this.orderId + ", orderFormState=" + this.orderFormState + ")";
        }

        public TaxLotsSelection(String accountNumber, UUID instrumentId, UUID orderId, OrderForm6 orderFormState) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
            this.orderId = orderId;
            this.orderFormState = orderFormState;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final UUID getOrderId() {
            return this.orderId;
        }

        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        public final EditingField getRowType() {
            return EditingField.SELECT_LOTS;
        }
    }

    /* compiled from: EquityOrderFormRowState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon;", "", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "Lcom/robinhood/utils/resource/StringResource;", "iconId", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;)V", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Lcom/robinhood/utils/resource/StringResource;", "getIconId", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IconId", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Icon {
        public static final int $stable = StringResource.$stable;
        private final StringResource contentDescription;
        private final ServerToBentoAssetMapper2 iconAsset;
        private final IconId iconId;

        public static /* synthetic */ Icon copy$default(Icon icon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, IconId iconId, int i, Object obj) {
            if ((i & 1) != 0) {
                serverToBentoAssetMapper2 = icon.iconAsset;
            }
            if ((i & 2) != 0) {
                stringResource = icon.contentDescription;
            }
            if ((i & 4) != 0) {
                iconId = icon.iconId;
            }
            return icon.copy(serverToBentoAssetMapper2, stringResource, iconId);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerToBentoAssetMapper2 getIconAsset() {
            return this.iconAsset;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final IconId getIconId() {
            return this.iconId;
        }

        public final Icon copy(ServerToBentoAssetMapper2 iconAsset, StringResource contentDescription, IconId iconId) {
            Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
            Intrinsics.checkNotNullParameter(iconId, "iconId");
            return new Icon(iconAsset, contentDescription, iconId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return this.iconAsset == icon.iconAsset && Intrinsics.areEqual(this.contentDescription, icon.contentDescription) && this.iconId == icon.iconId;
        }

        public int hashCode() {
            int iHashCode = this.iconAsset.hashCode() * 31;
            StringResource stringResource = this.contentDescription;
            return ((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.iconId.hashCode();
        }

        public String toString() {
            return "Icon(iconAsset=" + this.iconAsset + ", contentDescription=" + this.contentDescription + ", iconId=" + this.iconId + ")";
        }

        public Icon(ServerToBentoAssetMapper2 iconAsset, StringResource stringResource, IconId iconId) {
            Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
            Intrinsics.checkNotNullParameter(iconId, "iconId");
            this.iconAsset = iconAsset;
            this.contentDescription = stringResource;
            this.iconId = iconId;
        }

        public final ServerToBentoAssetMapper2 getIconAsset() {
            return this.iconAsset;
        }

        public final StringResource getContentDescription() {
            return this.contentDescription;
        }

        public final IconId getIconId() {
            return this.iconId;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: EquityOrderFormRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BACKUP_WITHHOLDING", "MARKET_DATA", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class IconId {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IconId[] $VALUES;
            public static final IconId NONE = new IconId("NONE", 0);
            public static final IconId BACKUP_WITHHOLDING = new IconId("BACKUP_WITHHOLDING", 1);
            public static final IconId MARKET_DATA = new IconId("MARKET_DATA", 2);

            private static final /* synthetic */ IconId[] $values() {
                return new IconId[]{NONE, BACKUP_WITHHOLDING, MARKET_DATA};
            }

            public static EnumEntries<IconId> getEntries() {
                return $ENTRIES;
            }

            private IconId(String str, int i) {
            }

            static {
                IconId[] iconIdArr$values = $values();
                $VALUES = iconIdArr$values;
                $ENTRIES = EnumEntries2.enumEntries(iconIdArr$values);
            }

            public static IconId valueOf(String str) {
                return (IconId) Enum.valueOf(IconId.class, str);
            }

            public static IconId[] values() {
                return (IconId[]) $VALUES.clone();
            }
        }
    }
}
