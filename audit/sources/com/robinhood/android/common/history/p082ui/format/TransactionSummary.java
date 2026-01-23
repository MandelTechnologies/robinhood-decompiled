package com.robinhood.android.common.history.p082ui.format;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.app.keys.data.DetailErrorType;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.models.history.shared.TransactionReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionSummary.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0007?@ABCDEB{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017B}\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0019J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J\u0085\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "", "hasCompletedExceptionally", "", "primaryText", "", "secondaryText", "metadataPrimaryComponent", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "metadataTextDisabled", "metadataSecondaryText", "metadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "badge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "secondarySummaryRows", "", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "layoutType", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "<init>", "(ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;ZLjava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;Lcom/robinhood/shared/models/history/shared/TransactionReference;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;Ljava/util/List;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;)V", "metadataPrimaryText", "(ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;Lcom/robinhood/shared/models/history/shared/TransactionReference;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;Ljava/util/List;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;)V", "getHasCompletedExceptionally", "()Z", "getPrimaryText", "()Ljava/lang/CharSequence;", "getSecondaryText", "getMetadataPrimaryComponent", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "getMetadataTextDisabled", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getBadge", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getSecondarySummaryRows", "()Ljava/util/List;", "getLayoutType", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "", "Badge", "Tint", "Icon", "SecondarySummary", "SecondarySummaryState", "MetadataPrimaryComponent", "LayoutType", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TransactionSummary {
    public static final int $stable = 8;
    private final Badge badge;
    private final boolean hasCompletedExceptionally;
    private final LayoutType layoutType;
    private final MetadataPrimaryComponent metadataPrimaryComponent;
    private final CharSequence metadataSecondaryText;
    private final Icon metadataSecondaryTextIcon;
    private final boolean metadataTextDisabled;
    private final CharSequence primaryText;
    private final List<SecondarySummary> secondarySummaryRows;
    private final CharSequence secondaryText;
    private final TransactionReference transactionReference;

    public static /* synthetic */ TransactionSummary copy$default(TransactionSummary transactionSummary, boolean z, CharSequence charSequence, CharSequence charSequence2, MetadataPrimaryComponent metadataPrimaryComponent, boolean z2, CharSequence charSequence3, Icon icon, TransactionReference transactionReference, Badge badge, List list, LayoutType layoutType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transactionSummary.hasCompletedExceptionally;
        }
        if ((i & 2) != 0) {
            charSequence = transactionSummary.primaryText;
        }
        if ((i & 4) != 0) {
            charSequence2 = transactionSummary.secondaryText;
        }
        if ((i & 8) != 0) {
            metadataPrimaryComponent = transactionSummary.metadataPrimaryComponent;
        }
        if ((i & 16) != 0) {
            z2 = transactionSummary.metadataTextDisabled;
        }
        if ((i & 32) != 0) {
            charSequence3 = transactionSummary.metadataSecondaryText;
        }
        if ((i & 64) != 0) {
            icon = transactionSummary.metadataSecondaryTextIcon;
        }
        if ((i & 128) != 0) {
            transactionReference = transactionSummary.transactionReference;
        }
        if ((i & 256) != 0) {
            badge = transactionSummary.badge;
        }
        if ((i & 512) != 0) {
            list = transactionSummary.secondarySummaryRows;
        }
        if ((i & 1024) != 0) {
            layoutType = transactionSummary.layoutType;
        }
        List list2 = list;
        LayoutType layoutType2 = layoutType;
        TransactionReference transactionReference2 = transactionReference;
        Badge badge2 = badge;
        CharSequence charSequence4 = charSequence3;
        Icon icon2 = icon;
        boolean z3 = z2;
        CharSequence charSequence5 = charSequence2;
        return transactionSummary.copy(z, charSequence, charSequence5, metadataPrimaryComponent, z3, charSequence4, icon2, transactionReference2, badge2, list2, layoutType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasCompletedExceptionally() {
        return this.hasCompletedExceptionally;
    }

    public final List<SecondarySummary> component10() {
        return this.secondarySummaryRows;
    }

    /* renamed from: component11, reason: from getter */
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final MetadataPrimaryComponent getMetadataPrimaryComponent() {
        return this.metadataPrimaryComponent;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getMetadataTextDisabled() {
        return this.metadataTextDisabled;
    }

    /* renamed from: component6, reason: from getter */
    public final CharSequence getMetadataSecondaryText() {
        return this.metadataSecondaryText;
    }

    /* renamed from: component7, reason: from getter */
    public final Icon getMetadataSecondaryTextIcon() {
        return this.metadataSecondaryTextIcon;
    }

    /* renamed from: component8, reason: from getter */
    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    /* renamed from: component9, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    public final TransactionSummary copy(boolean hasCompletedExceptionally, CharSequence primaryText, CharSequence secondaryText, MetadataPrimaryComponent metadataPrimaryComponent, boolean metadataTextDisabled, CharSequence metadataSecondaryText, Icon metadataSecondaryTextIcon, TransactionReference transactionReference, Badge badge, List<SecondarySummary> secondarySummaryRows, LayoutType layoutType) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(metadataPrimaryComponent, "metadataPrimaryComponent");
        Intrinsics.checkNotNullParameter(secondarySummaryRows, "secondarySummaryRows");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        return new TransactionSummary(hasCompletedExceptionally, primaryText, secondaryText, metadataPrimaryComponent, metadataTextDisabled, metadataSecondaryText, metadataSecondaryTextIcon, transactionReference, badge, secondarySummaryRows, layoutType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionSummary)) {
            return false;
        }
        TransactionSummary transactionSummary = (TransactionSummary) other;
        return this.hasCompletedExceptionally == transactionSummary.hasCompletedExceptionally && Intrinsics.areEqual(this.primaryText, transactionSummary.primaryText) && Intrinsics.areEqual(this.secondaryText, transactionSummary.secondaryText) && Intrinsics.areEqual(this.metadataPrimaryComponent, transactionSummary.metadataPrimaryComponent) && this.metadataTextDisabled == transactionSummary.metadataTextDisabled && Intrinsics.areEqual(this.metadataSecondaryText, transactionSummary.metadataSecondaryText) && Intrinsics.areEqual(this.metadataSecondaryTextIcon, transactionSummary.metadataSecondaryTextIcon) && Intrinsics.areEqual(this.transactionReference, transactionSummary.transactionReference) && Intrinsics.areEqual(this.badge, transactionSummary.badge) && Intrinsics.areEqual(this.secondarySummaryRows, transactionSummary.secondarySummaryRows) && this.layoutType == transactionSummary.layoutType;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.hasCompletedExceptionally) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.metadataPrimaryComponent.hashCode()) * 31) + Boolean.hashCode(this.metadataTextDisabled)) * 31;
        CharSequence charSequence = this.metadataSecondaryText;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Icon icon = this.metadataSecondaryTextIcon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        TransactionReference transactionReference = this.transactionReference;
        int iHashCode4 = (iHashCode3 + (transactionReference == null ? 0 : transactionReference.hashCode())) * 31;
        Badge badge = this.badge;
        return ((((iHashCode4 + (badge != null ? badge.hashCode() : 0)) * 31) + this.secondarySummaryRows.hashCode()) * 31) + this.layoutType.hashCode();
    }

    public String toString() {
        boolean z = this.hasCompletedExceptionally;
        CharSequence charSequence = this.primaryText;
        CharSequence charSequence2 = this.secondaryText;
        MetadataPrimaryComponent metadataPrimaryComponent = this.metadataPrimaryComponent;
        boolean z2 = this.metadataTextDisabled;
        CharSequence charSequence3 = this.metadataSecondaryText;
        return "TransactionSummary(hasCompletedExceptionally=" + z + ", primaryText=" + ((Object) charSequence) + ", secondaryText=" + ((Object) charSequence2) + ", metadataPrimaryComponent=" + metadataPrimaryComponent + ", metadataTextDisabled=" + z2 + ", metadataSecondaryText=" + ((Object) charSequence3) + ", metadataSecondaryTextIcon=" + this.metadataSecondaryTextIcon + ", transactionReference=" + this.transactionReference + ", badge=" + this.badge + ", secondarySummaryRows=" + this.secondarySummaryRows + ", layoutType=" + this.layoutType + ")";
    }

    public TransactionSummary(boolean z, CharSequence primaryText, CharSequence secondaryText, MetadataPrimaryComponent metadataPrimaryComponent, boolean z2, CharSequence charSequence, Icon icon, TransactionReference transactionReference, Badge badge, List<SecondarySummary> secondarySummaryRows, LayoutType layoutType) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(metadataPrimaryComponent, "metadataPrimaryComponent");
        Intrinsics.checkNotNullParameter(secondarySummaryRows, "secondarySummaryRows");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.hasCompletedExceptionally = z;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.metadataPrimaryComponent = metadataPrimaryComponent;
        this.metadataTextDisabled = z2;
        this.metadataSecondaryText = charSequence;
        this.metadataSecondaryTextIcon = icon;
        this.transactionReference = transactionReference;
        this.badge = badge;
        this.secondarySummaryRows = secondarySummaryRows;
        this.layoutType = layoutType;
    }

    public final boolean getHasCompletedExceptionally() {
        return this.hasCompletedExceptionally;
    }

    public final CharSequence getPrimaryText() {
        return this.primaryText;
    }

    public final CharSequence getSecondaryText() {
        return this.secondaryText;
    }

    public final MetadataPrimaryComponent getMetadataPrimaryComponent() {
        return this.metadataPrimaryComponent;
    }

    public final boolean getMetadataTextDisabled() {
        return this.metadataTextDisabled;
    }

    public final CharSequence getMetadataSecondaryText() {
        return this.metadataSecondaryText;
    }

    public final Icon getMetadataSecondaryTextIcon() {
        return this.metadataSecondaryTextIcon;
    }

    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public /* synthetic */ TransactionSummary(boolean z, CharSequence charSequence, CharSequence charSequence2, MetadataPrimaryComponent metadataPrimaryComponent, boolean z2, CharSequence charSequence3, Icon icon, TransactionReference transactionReference, Badge badge, List list, LayoutType layoutType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, charSequence, charSequence2, metadataPrimaryComponent, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : charSequence3, (i & 64) != 0 ? null : icon, (i & 128) != 0 ? null : transactionReference, (i & 256) != 0 ? null : badge, (List<SecondarySummary>) ((i & 512) != 0 ? CollectionsKt.emptyList() : list), (i & 1024) != 0 ? LayoutType.DEFAULT : layoutType);
    }

    public final List<SecondarySummary> getSecondarySummaryRows() {
        return this.secondarySummaryRows;
    }

    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    public /* synthetic */ TransactionSummary(boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z2, CharSequence charSequence4, Icon icon, TransactionReference transactionReference, Badge badge, List list, LayoutType layoutType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, charSequence, charSequence2, charSequence3, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : charSequence4, (i & 64) != 0 ? null : icon, (i & 128) != 0 ? null : transactionReference, (i & 256) != 0 ? null : badge, (List<SecondarySummary>) ((i & 512) != 0 ? CollectionsKt.emptyList() : list), (i & 1024) != 0 ? LayoutType.DEFAULT : layoutType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionSummary(boolean z, CharSequence primaryText, CharSequence secondaryText, CharSequence metadataPrimaryText, boolean z2, CharSequence charSequence, Icon icon, TransactionReference transactionReference, Badge badge, List<SecondarySummary> secondarySummaryRows, LayoutType layoutType) {
        this(z, primaryText, secondaryText, new MetadataPrimaryComponent.Text(metadataPrimaryText), z2, charSequence, icon, transactionReference, badge, secondarySummaryRows, layoutType);
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(metadataPrimaryText, "metadataPrimaryText");
        Intrinsics.checkNotNullParameter(secondarySummaryRows, "secondarySummaryRows");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
    }

    /* compiled from: TransactionSummary.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "", "text", "", "tint", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "highlight", "", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;Z)V", "getText", "()Ljava/lang/CharSequence;", "getTint", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "getHighlight", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Badge {
        public static final int $stable = 8;
        private final boolean highlight;
        private final CharSequence text;
        private final Tint tint;

        public static /* synthetic */ Badge copy$default(Badge badge, CharSequence charSequence, Tint tint, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = badge.text;
            }
            if ((i & 2) != 0) {
                tint = badge.tint;
            }
            if ((i & 4) != 0) {
                z = badge.highlight;
            }
            return badge.copy(charSequence, tint, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Tint getTint() {
            return this.tint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHighlight() {
            return this.highlight;
        }

        public final Badge copy(CharSequence text, Tint tint, boolean highlight) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(tint, "tint");
            return new Badge(text, tint, highlight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return Intrinsics.areEqual(this.text, badge.text) && this.tint == badge.tint && this.highlight == badge.highlight;
        }

        public int hashCode() {
            return (((this.text.hashCode() * 31) + this.tint.hashCode()) * 31) + Boolean.hashCode(this.highlight);
        }

        public String toString() {
            CharSequence charSequence = this.text;
            return "Badge(text=" + ((Object) charSequence) + ", tint=" + this.tint + ", highlight=" + this.highlight + ")";
        }

        public Badge(CharSequence text, Tint tint, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(tint, "tint");
            this.text = text;
            this.tint = tint;
            this.highlight = z;
        }

        public /* synthetic */ Badge(CharSequence charSequence, Tint tint, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, tint, (i & 4) != 0 ? false : z);
        }

        public final CharSequence getText() {
            return this.text;
        }

        public final Tint getTint() {
            return this.tint;
        }

        public final boolean getHighlight() {
            return this.highlight;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransactionSummary.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "", "res", "", "<init>", "(Ljava/lang/String;II)V", "getRes", "()I", "FOREGROUND_2", "POSITIVE", "NEGATIVE", "SOL_LIGHT", "composeColor", "Landroidx/compose/ui/graphics/Color;", "getComposeColor", "(Landroidx/compose/runtime/Composer;I)J", "colorReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getColorReference", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Tint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tint[] $VALUES;
        private final int res;
        public static final Tint FOREGROUND_2 = new Tint("FOREGROUND_2", 0, C20690R.color.mobius_foreground_2_day);
        public static final Tint POSITIVE = new Tint("POSITIVE", 1, C20690R.color.mobius_prime);
        public static final Tint NEGATIVE = new Tint("NEGATIVE", 2, C20690R.color.mobius_joule);
        public static final Tint SOL_LIGHT = new Tint("SOL_LIGHT", 3, C20690R.color.mobius_sol_light_day);

        /* compiled from: TransactionSummary.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Tint.values().length];
                try {
                    iArr[Tint.FOREGROUND_2.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tint.POSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Tint.NEGATIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Tint.SOL_LIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Tint[] $values() {
            return new Tint[]{FOREGROUND_2, POSITIVE, NEGATIVE, SOL_LIGHT};
        }

        public static EnumEntries<Tint> getEntries() {
            return $ENTRIES;
        }

        private Tint(String str, int i, int i2) {
            this.res = i2;
        }

        public final int getRes() {
            return this.res;
        }

        static {
            Tint[] tintArr$values = $values();
            $VALUES = tintArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tintArr$values);
        }

        @JvmName
        public final long getComposeColor(Composer composer, int i) {
            long jM21426getFg20d7_KjU;
            composer.startReplaceGroup(-411605845);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-411605845, i, -1, "com.robinhood.android.common.history.ui.format.TransactionSummary.Tint.<get-composeColor> (TransactionSummary.kt:73)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-416222738);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
                composer.endReplaceGroup();
            } else if (i2 == 2) {
                composer.startReplaceGroup(-416221133);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else if (i2 == 3) {
                composer.startReplaceGroup(-416219373);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            } else {
                if (i2 != 4) {
                    composer.startReplaceGroup(-416224542);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-416217581);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getSolLight();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21426getFg20d7_KjU;
        }

        public final ResourceReferences4<Integer> getColorReference() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2();
            }
            if (i == 2) {
                return ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE());
            }
            if (i == 3) {
                return ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE());
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C13997R.attr.paletteColorSolLight);
        }

        public static Tint valueOf(String str) {
            return (Tint) Enum.valueOf(Tint.class, str);
        }

        public static Tint[] values() {
            return (Tint[]) $VALUES.clone();
        }
    }

    /* compiled from: TransactionSummary.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "tint", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTint", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Icon extends MetadataPrimaryComponent {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper2 asset;
        private final Tint tint;

        public static /* synthetic */ Icon copy$default(Icon icon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Tint tint, int i, Object obj) {
            if ((i & 1) != 0) {
                serverToBentoAssetMapper2 = icon.asset;
            }
            if ((i & 2) != 0) {
                tint = icon.tint;
            }
            return icon.copy(serverToBentoAssetMapper2, tint);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerToBentoAssetMapper2 getAsset() {
            return this.asset;
        }

        /* renamed from: component2, reason: from getter */
        public final Tint getTint() {
            return this.tint;
        }

        public final Icon copy(ServerToBentoAssetMapper2 asset, Tint tint) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(tint, "tint");
            return new Icon(asset, tint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return this.asset == icon.asset && this.tint == icon.tint;
        }

        public int hashCode() {
            return (this.asset.hashCode() * 31) + this.tint.hashCode();
        }

        public String toString() {
            return "Icon(asset=" + this.asset + ", tint=" + this.tint + ")";
        }

        public final ServerToBentoAssetMapper2 getAsset() {
            return this.asset;
        }

        public final Tint getTint() {
            return this.tint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Icon(ServerToBentoAssetMapper2 asset, Tint tint) {
            super(null);
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(tint, "tint");
            this.asset = asset;
            this.tint = tint;
        }
    }

    /* compiled from: TransactionSummary.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012B[\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "", "state", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;", "primaryText", "", "metadataPrimaryComponent", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "metadataSecondaryText", "metadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "metadataTextDisabled", "", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "detailErrorType", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "<init>", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;Ljava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;Ljava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;ZLcom/robinhood/shared/models/history/shared/TransactionReference;Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;)V", "metadataPrimaryText", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;ZLcom/robinhood/shared/models/history/shared/TransactionReference;Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;)V", "getState", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;", "getPrimaryText", "()Ljava/lang/CharSequence;", "getMetadataPrimaryComponent", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getMetadataTextDisabled", "()Z", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getDetailErrorType", "()Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SecondarySummary {
        public static final int $stable = 8;
        private final DetailErrorType detailErrorType;
        private final MetadataPrimaryComponent metadataPrimaryComponent;
        private final CharSequence metadataSecondaryText;
        private final Icon metadataSecondaryTextIcon;
        private final boolean metadataTextDisabled;
        private final CharSequence primaryText;
        private final SecondarySummaryState state;
        private final TransactionReference transactionReference;

        public static /* synthetic */ SecondarySummary copy$default(SecondarySummary secondarySummary, SecondarySummaryState secondarySummaryState, CharSequence charSequence, MetadataPrimaryComponent metadataPrimaryComponent, CharSequence charSequence2, Icon icon, boolean z, TransactionReference transactionReference, DetailErrorType detailErrorType, int i, Object obj) {
            if ((i & 1) != 0) {
                secondarySummaryState = secondarySummary.state;
            }
            if ((i & 2) != 0) {
                charSequence = secondarySummary.primaryText;
            }
            if ((i & 4) != 0) {
                metadataPrimaryComponent = secondarySummary.metadataPrimaryComponent;
            }
            if ((i & 8) != 0) {
                charSequence2 = secondarySummary.metadataSecondaryText;
            }
            if ((i & 16) != 0) {
                icon = secondarySummary.metadataSecondaryTextIcon;
            }
            if ((i & 32) != 0) {
                z = secondarySummary.metadataTextDisabled;
            }
            if ((i & 64) != 0) {
                transactionReference = secondarySummary.transactionReference;
            }
            if ((i & 128) != 0) {
                detailErrorType = secondarySummary.detailErrorType;
            }
            TransactionReference transactionReference2 = transactionReference;
            DetailErrorType detailErrorType2 = detailErrorType;
            Icon icon2 = icon;
            boolean z2 = z;
            return secondarySummary.copy(secondarySummaryState, charSequence, metadataPrimaryComponent, charSequence2, icon2, z2, transactionReference2, detailErrorType2);
        }

        /* renamed from: component1, reason: from getter */
        public final SecondarySummaryState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final MetadataPrimaryComponent getMetadataPrimaryComponent() {
            return this.metadataPrimaryComponent;
        }

        /* renamed from: component4, reason: from getter */
        public final CharSequence getMetadataSecondaryText() {
            return this.metadataSecondaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final Icon getMetadataSecondaryTextIcon() {
            return this.metadataSecondaryTextIcon;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getMetadataTextDisabled() {
            return this.metadataTextDisabled;
        }

        /* renamed from: component7, reason: from getter */
        public final TransactionReference getTransactionReference() {
            return this.transactionReference;
        }

        /* renamed from: component8, reason: from getter */
        public final DetailErrorType getDetailErrorType() {
            return this.detailErrorType;
        }

        public final SecondarySummary copy(SecondarySummaryState state, CharSequence primaryText, MetadataPrimaryComponent metadataPrimaryComponent, CharSequence metadataSecondaryText, Icon metadataSecondaryTextIcon, boolean metadataTextDisabled, TransactionReference transactionReference, DetailErrorType detailErrorType) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(metadataPrimaryComponent, "metadataPrimaryComponent");
            return new SecondarySummary(state, primaryText, metadataPrimaryComponent, metadataSecondaryText, metadataSecondaryTextIcon, metadataTextDisabled, transactionReference, detailErrorType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecondarySummary)) {
                return false;
            }
            SecondarySummary secondarySummary = (SecondarySummary) other;
            return this.state == secondarySummary.state && Intrinsics.areEqual(this.primaryText, secondarySummary.primaryText) && Intrinsics.areEqual(this.metadataPrimaryComponent, secondarySummary.metadataPrimaryComponent) && Intrinsics.areEqual(this.metadataSecondaryText, secondarySummary.metadataSecondaryText) && Intrinsics.areEqual(this.metadataSecondaryTextIcon, secondarySummary.metadataSecondaryTextIcon) && this.metadataTextDisabled == secondarySummary.metadataTextDisabled && Intrinsics.areEqual(this.transactionReference, secondarySummary.transactionReference) && Intrinsics.areEqual(this.detailErrorType, secondarySummary.detailErrorType);
        }

        public int hashCode() {
            int iHashCode = ((((this.state.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.metadataPrimaryComponent.hashCode()) * 31;
            CharSequence charSequence = this.metadataSecondaryText;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            Icon icon = this.metadataSecondaryTextIcon;
            int iHashCode3 = (((iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31) + Boolean.hashCode(this.metadataTextDisabled)) * 31;
            TransactionReference transactionReference = this.transactionReference;
            int iHashCode4 = (iHashCode3 + (transactionReference == null ? 0 : transactionReference.hashCode())) * 31;
            DetailErrorType detailErrorType = this.detailErrorType;
            return iHashCode4 + (detailErrorType != null ? detailErrorType.hashCode() : 0);
        }

        public String toString() {
            SecondarySummaryState secondarySummaryState = this.state;
            CharSequence charSequence = this.primaryText;
            MetadataPrimaryComponent metadataPrimaryComponent = this.metadataPrimaryComponent;
            CharSequence charSequence2 = this.metadataSecondaryText;
            return "SecondarySummary(state=" + secondarySummaryState + ", primaryText=" + ((Object) charSequence) + ", metadataPrimaryComponent=" + metadataPrimaryComponent + ", metadataSecondaryText=" + ((Object) charSequence2) + ", metadataSecondaryTextIcon=" + this.metadataSecondaryTextIcon + ", metadataTextDisabled=" + this.metadataTextDisabled + ", transactionReference=" + this.transactionReference + ", detailErrorType=" + this.detailErrorType + ")";
        }

        public SecondarySummary(SecondarySummaryState state, CharSequence primaryText, MetadataPrimaryComponent metadataPrimaryComponent, CharSequence charSequence, Icon icon, boolean z, TransactionReference transactionReference, DetailErrorType detailErrorType) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(metadataPrimaryComponent, "metadataPrimaryComponent");
            this.state = state;
            this.primaryText = primaryText;
            this.metadataPrimaryComponent = metadataPrimaryComponent;
            this.metadataSecondaryText = charSequence;
            this.metadataSecondaryTextIcon = icon;
            this.metadataTextDisabled = z;
            this.transactionReference = transactionReference;
            this.detailErrorType = detailErrorType;
        }

        public /* synthetic */ SecondarySummary(SecondarySummaryState secondarySummaryState, CharSequence charSequence, MetadataPrimaryComponent metadataPrimaryComponent, CharSequence charSequence2, Icon icon, boolean z, TransactionReference transactionReference, DetailErrorType detailErrorType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(secondarySummaryState, charSequence, metadataPrimaryComponent, (i & 8) != 0 ? null : charSequence2, (i & 16) != 0 ? null : icon, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : transactionReference, (i & 128) != 0 ? null : detailErrorType);
        }

        public final SecondarySummaryState getState() {
            return this.state;
        }

        public final CharSequence getPrimaryText() {
            return this.primaryText;
        }

        public final MetadataPrimaryComponent getMetadataPrimaryComponent() {
            return this.metadataPrimaryComponent;
        }

        public final CharSequence getMetadataSecondaryText() {
            return this.metadataSecondaryText;
        }

        public final Icon getMetadataSecondaryTextIcon() {
            return this.metadataSecondaryTextIcon;
        }

        public final boolean getMetadataTextDisabled() {
            return this.metadataTextDisabled;
        }

        public final TransactionReference getTransactionReference() {
            return this.transactionReference;
        }

        public final DetailErrorType getDetailErrorType() {
            return this.detailErrorType;
        }

        public /* synthetic */ SecondarySummary(SecondarySummaryState secondarySummaryState, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Icon icon, boolean z, TransactionReference transactionReference, DetailErrorType detailErrorType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(secondarySummaryState, charSequence, charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? null : icon, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : transactionReference, (i & 128) != 0 ? null : detailErrorType);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SecondarySummary(SecondarySummaryState state, CharSequence primaryText, CharSequence metadataPrimaryText, CharSequence charSequence, Icon icon, boolean z, TransactionReference transactionReference, DetailErrorType detailErrorType) {
            this(state, primaryText, new MetadataPrimaryComponent.Text(metadataPrimaryText), charSequence, icon, z, transactionReference, detailErrorType);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(metadataPrimaryText, "metadataPrimaryText");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransactionSummary.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "COMPLETED", "ERROR", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SecondarySummaryState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SecondarySummaryState[] $VALUES;
        public static final SecondarySummaryState PENDING = new SecondarySummaryState("PENDING", 0);
        public static final SecondarySummaryState COMPLETED = new SecondarySummaryState("COMPLETED", 1);
        public static final SecondarySummaryState ERROR = new SecondarySummaryState("ERROR", 2);

        private static final /* synthetic */ SecondarySummaryState[] $values() {
            return new SecondarySummaryState[]{PENDING, COMPLETED, ERROR};
        }

        public static EnumEntries<SecondarySummaryState> getEntries() {
            return $ENTRIES;
        }

        private SecondarySummaryState(String str, int i) {
        }

        static {
            SecondarySummaryState[] secondarySummaryStateArr$values = $values();
            $VALUES = secondarySummaryStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(secondarySummaryStateArr$values);
        }

        public static SecondarySummaryState valueOf(String str) {
            return (SecondarySummaryState) Enum.valueOf(SecondarySummaryState.class, str);
        }

        public static SecondarySummaryState[] values() {
            return (SecondarySummaryState[]) $VALUES.clone();
        }
    }

    /* compiled from: TransactionSummary.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "", "<init>", "()V", "Text", "IconText", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent$IconText;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent$Text;", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class MetadataPrimaryComponent {
        public static final int $stable = 0;

        public /* synthetic */ MetadataPrimaryComponent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MetadataPrimaryComponent() {
        }

        /* compiled from: TransactionSummary.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent$Text;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "text", "", "<init>", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Text extends MetadataPrimaryComponent {
            public static final int $stable = 8;
            private final CharSequence text;

            public static /* synthetic */ Text copy$default(Text text, CharSequence charSequence, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = text.text;
                }
                return text.copy(charSequence);
            }

            /* renamed from: component1, reason: from getter */
            public final CharSequence getText() {
                return this.text;
            }

            public final Text copy(CharSequence text) {
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
                return "Text(text=" + ((Object) this.text) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(CharSequence text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final CharSequence getText() {
                return this.text;
            }
        }

        /* compiled from: TransactionSummary.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent$IconText;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "icon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "text", "", "<init>", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;Ljava/lang/CharSequence;)V", "getIcon", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IconText extends MetadataPrimaryComponent {
            public static final int $stable = 8;
            private final Icon icon;
            private final CharSequence text;

            public static /* synthetic */ IconText copy$default(IconText iconText, Icon icon, CharSequence charSequence, int i, Object obj) {
                if ((i & 1) != 0) {
                    icon = iconText.icon;
                }
                if ((i & 2) != 0) {
                    charSequence = iconText.text;
                }
                return iconText.copy(icon, charSequence);
            }

            /* renamed from: component1, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            /* renamed from: component2, reason: from getter */
            public final CharSequence getText() {
                return this.text;
            }

            public final IconText copy(Icon icon, CharSequence text) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                return new IconText(icon, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconText)) {
                    return false;
                }
                IconText iconText = (IconText) other;
                return Intrinsics.areEqual(this.icon, iconText.icon) && Intrinsics.areEqual(this.text, iconText.text);
            }

            public int hashCode() {
                return (this.icon.hashCode() * 31) + this.text.hashCode();
            }

            public String toString() {
                return "IconText(icon=" + this.icon + ", text=" + ((Object) this.text) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconText(Icon icon, CharSequence text) {
                super(null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.icon = icon;
                this.text = text;
            }

            public final Icon getIcon() {
                return this.icon;
            }

            public final CharSequence getText() {
                return this.text;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransactionSummary.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "PENDING_CRYPTO_ORDER", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LayoutType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;
        public static final LayoutType DEFAULT = new LayoutType("DEFAULT", 0);
        public static final LayoutType PENDING_CRYPTO_ORDER = new LayoutType("PENDING_CRYPTO_ORDER", 1);

        private static final /* synthetic */ LayoutType[] $values() {
            return new LayoutType[]{DEFAULT, PENDING_CRYPTO_ORDER};
        }

        public static EnumEntries<LayoutType> getEntries() {
            return $ENTRIES;
        }

        private LayoutType(String str, int i) {
        }

        static {
            LayoutType[] layoutTypeArr$values = $values();
            $VALUES = layoutTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(layoutTypeArr$values);
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }
}
