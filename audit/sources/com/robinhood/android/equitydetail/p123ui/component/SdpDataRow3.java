package com.robinhood.android.equitydetail.p123ui.component;

import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdpDataRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "", "type", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "getType", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "Default", "PieChart", "StarRating", "Tooltip", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$Default;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$PieChart;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$StarRating;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowState, reason: use source file name */
/* loaded from: classes3.dex */
public interface SdpDataRow3 {
    String getTestTag();

    SdpDataRowType getType();

    /* compiled from: SdpDataRow.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$Default;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "type", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "testTag", "", "value", "Lcom/robinhood/utils/resource/StringResource;", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "infoIconTooltip", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$Tooltip;", "iconContentDescription", "<init>", "(Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/BentoIcons;Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$Tooltip;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "getTestTag", "()Ljava/lang/String;", "getValue", "()Lcom/robinhood/utils/resource/StringResource;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getInfoIconTooltip", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$Tooltip;", "getIconContentDescription", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowState$Default, reason: from toString */
    public static final /* data */ class Default implements SdpDataRow3 {
        public static final int $stable;
        private final BentoIcon4 icon;
        private final String iconContentDescription;
        private final Tooltip infoIconTooltip;
        private final String testTag;
        private final SdpDataRowType type;
        private final StringResource value;

        static {
            int i = StringResource.$stable;
            $stable = i | BentoIcon4.$stable | i;
        }

        public static /* synthetic */ Default copy$default(Default r0, SdpDataRowType sdpDataRowType, String str, StringResource stringResource, BentoIcon4 bentoIcon4, Tooltip tooltip, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                sdpDataRowType = r0.type;
            }
            if ((i & 2) != 0) {
                str = r0.testTag;
            }
            if ((i & 4) != 0) {
                stringResource = r0.value;
            }
            if ((i & 8) != 0) {
                bentoIcon4 = r0.icon;
            }
            if ((i & 16) != 0) {
                tooltip = r0.infoIconTooltip;
            }
            if ((i & 32) != 0) {
                str2 = r0.iconContentDescription;
            }
            Tooltip tooltip2 = tooltip;
            String str3 = str2;
            return r0.copy(sdpDataRowType, str, stringResource, bentoIcon4, tooltip2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final SdpDataRowType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTestTag() {
            return this.testTag;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getValue() {
            return this.value;
        }

        /* renamed from: component4, reason: from getter */
        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        /* renamed from: component5, reason: from getter */
        public final Tooltip getInfoIconTooltip() {
            return this.infoIconTooltip;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIconContentDescription() {
            return this.iconContentDescription;
        }

        public final Default copy(SdpDataRowType type2, String testTag, StringResource value, BentoIcon4 icon, Tooltip infoIconTooltip, String iconContentDescription) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Default(type2, testTag, value, icon, infoIconTooltip, iconContentDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r5 = (Default) other;
            return this.type == r5.type && Intrinsics.areEqual(this.testTag, r5.testTag) && Intrinsics.areEqual(this.value, r5.value) && Intrinsics.areEqual(this.icon, r5.icon) && Intrinsics.areEqual(this.infoIconTooltip, r5.infoIconTooltip) && Intrinsics.areEqual(this.iconContentDescription, r5.iconContentDescription);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.testTag;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.value.hashCode()) * 31;
            BentoIcon4 bentoIcon4 = this.icon;
            int iHashCode3 = (iHashCode2 + (bentoIcon4 == null ? 0 : bentoIcon4.hashCode())) * 31;
            Tooltip tooltip = this.infoIconTooltip;
            int iHashCode4 = (iHashCode3 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
            String str2 = this.iconContentDescription;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Default(type=" + this.type + ", testTag=" + this.testTag + ", value=" + this.value + ", icon=" + this.icon + ", infoIconTooltip=" + this.infoIconTooltip + ", iconContentDescription=" + this.iconContentDescription + ")";
        }

        public Default(SdpDataRowType type2, String str, StringResource value, BentoIcon4 bentoIcon4, Tooltip tooltip, String str2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.type = type2;
            this.testTag = str;
            this.value = value;
            this.icon = bentoIcon4;
            this.infoIconTooltip = tooltip;
            this.iconContentDescription = str2;
        }

        public /* synthetic */ Default(SdpDataRowType sdpDataRowType, String str, StringResource stringResource, BentoIcon4 bentoIcon4, Tooltip tooltip, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(sdpDataRowType, (i & 2) != 0 ? null : str, stringResource, (i & 8) != 0 ? null : bentoIcon4, (i & 16) != 0 ? null : tooltip, (i & 32) != 0 ? null : str2);
        }

        @Override // com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3
        public SdpDataRowType getType() {
            return this.type;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3
        public String getTestTag() {
            return this.testTag;
        }

        public final StringResource getValue() {
            return this.value;
        }

        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final Tooltip getInfoIconTooltip() {
            return this.infoIconTooltip;
        }

        public final String getIconContentDescription() {
            return this.iconContentDescription;
        }
    }

    /* compiled from: SdpDataRow.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$PieChart;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "type", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "testTag", "", "percent", "", "<init>", "(Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;Ljava/lang/String;F)V", "getType", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "getTestTag", "()Ljava/lang/String;", "getPercent", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowState$PieChart, reason: from toString */
    public static final /* data */ class PieChart implements SdpDataRow3 {
        public static final int $stable = 0;
        private final float percent;
        private final String testTag;
        private final SdpDataRowType type;

        public static /* synthetic */ PieChart copy$default(PieChart pieChart, SdpDataRowType sdpDataRowType, String str, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                sdpDataRowType = pieChart.type;
            }
            if ((i & 2) != 0) {
                str = pieChart.testTag;
            }
            if ((i & 4) != 0) {
                f = pieChart.percent;
            }
            return pieChart.copy(sdpDataRowType, str, f);
        }

        /* renamed from: component1, reason: from getter */
        public final SdpDataRowType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTestTag() {
            return this.testTag;
        }

        /* renamed from: component3, reason: from getter */
        public final float getPercent() {
            return this.percent;
        }

        public final PieChart copy(SdpDataRowType type2, String testTag, float percent) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new PieChart(type2, testTag, percent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PieChart)) {
                return false;
            }
            PieChart pieChart = (PieChart) other;
            return this.type == pieChart.type && Intrinsics.areEqual(this.testTag, pieChart.testTag) && Float.compare(this.percent, pieChart.percent) == 0;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.testTag;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.percent);
        }

        public String toString() {
            return "PieChart(type=" + this.type + ", testTag=" + this.testTag + ", percent=" + this.percent + ")";
        }

        public PieChart(SdpDataRowType type2, String str, float f) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
            this.testTag = str;
            this.percent = f;
        }

        public /* synthetic */ PieChart(SdpDataRowType sdpDataRowType, String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(sdpDataRowType, (i & 2) != 0 ? null : str, f);
        }

        @Override // com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3
        public SdpDataRowType getType() {
            return this.type;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3
        public String getTestTag() {
            return this.testTag;
        }

        public final float getPercent() {
            return this.percent;
        }
    }

    /* compiled from: SdpDataRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$StarRating;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "type", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "testTag", "", "filledStars", "", "<init>", "(Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;Ljava/lang/String;I)V", "getType", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "getTestTag", "()Ljava/lang/String;", "getFilledStars", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowState$StarRating, reason: from toString */
    public static final /* data */ class StarRating implements SdpDataRow3 {
        public static final int $stable = 0;
        private final int filledStars;
        private final String testTag;
        private final SdpDataRowType type;

        public static /* synthetic */ StarRating copy$default(StarRating starRating, SdpDataRowType sdpDataRowType, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sdpDataRowType = starRating.type;
            }
            if ((i2 & 2) != 0) {
                str = starRating.testTag;
            }
            if ((i2 & 4) != 0) {
                i = starRating.filledStars;
            }
            return starRating.copy(sdpDataRowType, str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final SdpDataRowType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTestTag() {
            return this.testTag;
        }

        /* renamed from: component3, reason: from getter */
        public final int getFilledStars() {
            return this.filledStars;
        }

        public final StarRating copy(SdpDataRowType type2, String testTag, int filledStars) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new StarRating(type2, testTag, filledStars);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StarRating)) {
                return false;
            }
            StarRating starRating = (StarRating) other;
            return this.type == starRating.type && Intrinsics.areEqual(this.testTag, starRating.testTag) && this.filledStars == starRating.filledStars;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.testTag;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.filledStars);
        }

        public String toString() {
            return "StarRating(type=" + this.type + ", testTag=" + this.testTag + ", filledStars=" + this.filledStars + ")";
        }

        public StarRating(SdpDataRowType type2, String str, int i) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
            this.testTag = str;
            this.filledStars = i;
        }

        public /* synthetic */ StarRating(SdpDataRowType sdpDataRowType, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sdpDataRowType, (i2 & 2) != 0 ? null : str, i);
        }

        @Override // com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3
        public SdpDataRowType getType() {
            return this.type;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3
        public String getTestTag() {
            return this.testTag;
        }

        public final int getFilledStars() {
            return this.filledStars;
        }
    }

    /* compiled from: SdpDataRow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState$Tooltip;", "", "id", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ILcom/robinhood/utils/resource/StringResource;)V", "getId", "()I", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowState$Tooltip, reason: from toString */
    public static final /* data */ class Tooltip {
        public static final int $stable = StringResource.$stable;
        private final int id;
        private final StringResource text;

        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, int i, StringResource stringResource, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tooltip.id;
            }
            if ((i2 & 2) != 0) {
                stringResource = tooltip.text;
            }
            return tooltip.copy(i, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        public final Tooltip copy(int id, StringResource text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Tooltip(id, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return this.id == tooltip.id && Intrinsics.areEqual(this.text, tooltip.text);
        }

        public int hashCode() {
            return (Integer.hashCode(this.id) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Tooltip(id=" + this.id + ", text=" + this.text + ")";
        }

        public Tooltip(int i, StringResource text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i;
            this.text = text;
        }

        public final int getId() {
            return this.id;
        }

        public final StringResource getText() {
            return this.text;
        }
    }
}
