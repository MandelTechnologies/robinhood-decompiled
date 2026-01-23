package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoToggleRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003234Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003Ju\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001a¨\u00065"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState;", "", "start", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "primaryText", "", "secondaryText", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;", "enabled", "", "checked", "checkedIcon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "contentDescription", "loading", "shouldIncludeLoadingPlaceholder", "showBottomDivider", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;ZZLcom/robinhood/compose/bento/component/BentoIcons$Size16;Ljava/lang/String;ZZZ)V", "getStart", "()Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "()Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;", "getEnabled", "()Z", "getChecked", "getCheckedIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "getContentDescription", "getLoading", "getShouldIncludeLoadingPlaceholder", "getShowBottomDivider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "Text", "Start", "End", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoToggleRowState {
    public static final int $stable = 8;
    private final boolean checked;
    private final BentoIcon4.Size16 checkedIcon;
    private final String contentDescription;
    private final boolean enabled;
    private final boolean loading;
    private final String primaryText;
    private final Text secondaryText;
    private final boolean shouldIncludeLoadingPlaceholder;
    private final boolean showBottomDivider;
    private final Start start;

    public static /* synthetic */ BentoToggleRowState copy$default(BentoToggleRowState bentoToggleRowState, Start start, String str, Text text, boolean z, boolean z2, BentoIcon4.Size16 size16, String str2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            start = bentoToggleRowState.start;
        }
        if ((i & 2) != 0) {
            str = bentoToggleRowState.primaryText;
        }
        if ((i & 4) != 0) {
            text = bentoToggleRowState.secondaryText;
        }
        if ((i & 8) != 0) {
            z = bentoToggleRowState.enabled;
        }
        if ((i & 16) != 0) {
            z2 = bentoToggleRowState.checked;
        }
        if ((i & 32) != 0) {
            size16 = bentoToggleRowState.checkedIcon;
        }
        if ((i & 64) != 0) {
            str2 = bentoToggleRowState.contentDescription;
        }
        if ((i & 128) != 0) {
            z3 = bentoToggleRowState.loading;
        }
        if ((i & 256) != 0) {
            z4 = bentoToggleRowState.shouldIncludeLoadingPlaceholder;
        }
        if ((i & 512) != 0) {
            z5 = bentoToggleRowState.showBottomDivider;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        String str3 = str2;
        boolean z8 = z3;
        boolean z9 = z2;
        BentoIcon4.Size16 size162 = size16;
        return bentoToggleRowState.copy(start, str, text, z, z9, size162, str3, z8, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final Start getStart() {
        return this.start;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowBottomDivider() {
        return this.showBottomDivider;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* renamed from: component6, reason: from getter */
    public final BentoIcon4.Size16 getCheckedIcon() {
        return this.checkedIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldIncludeLoadingPlaceholder() {
        return this.shouldIncludeLoadingPlaceholder;
    }

    public final BentoToggleRowState copy(Start start, String primaryText, Text secondaryText, boolean enabled, boolean checked, BentoIcon4.Size16 checkedIcon, String contentDescription, boolean loading, boolean shouldIncludeLoadingPlaceholder, boolean showBottomDivider) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        return new BentoToggleRowState(start, primaryText, secondaryText, enabled, checked, checkedIcon, contentDescription, loading, shouldIncludeLoadingPlaceholder, showBottomDivider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoToggleRowState)) {
            return false;
        }
        BentoToggleRowState bentoToggleRowState = (BentoToggleRowState) other;
        return Intrinsics.areEqual(this.start, bentoToggleRowState.start) && Intrinsics.areEqual(this.primaryText, bentoToggleRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, bentoToggleRowState.secondaryText) && this.enabled == bentoToggleRowState.enabled && this.checked == bentoToggleRowState.checked && Intrinsics.areEqual(this.checkedIcon, bentoToggleRowState.checkedIcon) && Intrinsics.areEqual(this.contentDescription, bentoToggleRowState.contentDescription) && this.loading == bentoToggleRowState.loading && this.shouldIncludeLoadingPlaceholder == bentoToggleRowState.shouldIncludeLoadingPlaceholder && this.showBottomDivider == bentoToggleRowState.showBottomDivider;
    }

    public int hashCode() {
        Start start = this.start;
        int iHashCode = (((start == null ? 0 : start.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
        Text text = this.secondaryText;
        int iHashCode2 = (((((iHashCode + (text == null ? 0 : text.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.checked)) * 31;
        BentoIcon4.Size16 size16 = this.checkedIcon;
        int iHashCode3 = (iHashCode2 + (size16 == null ? 0 : size16.hashCode())) * 31;
        String str = this.contentDescription;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.shouldIncludeLoadingPlaceholder)) * 31) + Boolean.hashCode(this.showBottomDivider);
    }

    public String toString() {
        return "BentoToggleRowState(start=" + this.start + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", enabled=" + this.enabled + ", checked=" + this.checked + ", checkedIcon=" + this.checkedIcon + ", contentDescription=" + this.contentDescription + ", loading=" + this.loading + ", shouldIncludeLoadingPlaceholder=" + this.shouldIncludeLoadingPlaceholder + ", showBottomDivider=" + this.showBottomDivider + ")";
    }

    public BentoToggleRowState(Start start, String primaryText, Text text, boolean z, boolean z2, BentoIcon4.Size16 size16, String str, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        this.start = start;
        this.primaryText = primaryText;
        this.secondaryText = text;
        this.enabled = z;
        this.checked = z2;
        this.checkedIcon = size16;
        this.contentDescription = str;
        this.loading = z3;
        this.shouldIncludeLoadingPlaceholder = z4;
        this.showBottomDivider = z5;
    }

    public final Start getStart() {
        return this.start;
    }

    public /* synthetic */ BentoToggleRowState(Start start, String str, Text text, boolean z, boolean z2, BentoIcon4.Size16 size16, String str2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : start, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : text, (i & 8) != 0 ? true : z, z2, (i & 32) != 0 ? null : size16, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? true : z5);
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final BentoIcon4.Size16 getCheckedIcon() {
        return this.checkedIcon;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getShouldIncludeLoadingPlaceholder() {
        return this.shouldIncludeLoadingPlaceholder;
    }

    public final boolean getShowBottomDivider() {
        return this.showBottomDivider;
    }

    /* compiled from: BentoToggleRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;", "", "<init>", "()V", "Plain", "MarkdownText", "Annotated", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text$Annotated;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text$MarkdownText;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text$Plain;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Text {
        public static final int $stable = 0;

        public /* synthetic */ Text(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: BentoToggleRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text$Plain;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Plain extends Text {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ Plain copy$default(Plain plain, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plain.text;
                }
                return plain.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Plain copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Plain(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Plain) && Intrinsics.areEqual(this.text, ((Plain) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Plain(text=" + this.text + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Plain(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }

        private Text() {
        }

        /* compiled from: BentoToggleRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text$MarkdownText;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;", "markdownText", "", "<init>", "(Ljava/lang/String;)V", "getMarkdownText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarkdownText extends Text {
            public static final int $stable = 0;
            private final String markdownText;

            public static /* synthetic */ MarkdownText copy$default(MarkdownText markdownText, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = markdownText.markdownText;
                }
                return markdownText.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMarkdownText() {
                return this.markdownText;
            }

            public final MarkdownText copy(String markdownText) {
                Intrinsics.checkNotNullParameter(markdownText, "markdownText");
                return new MarkdownText(markdownText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarkdownText) && Intrinsics.areEqual(this.markdownText, ((MarkdownText) other).markdownText);
            }

            public int hashCode() {
                return this.markdownText.hashCode();
            }

            public String toString() {
                return "MarkdownText(markdownText=" + this.markdownText + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarkdownText(String markdownText) {
                super(null);
                Intrinsics.checkNotNullParameter(markdownText, "markdownText");
                this.markdownText = markdownText;
            }

            public final String getMarkdownText() {
                return this.markdownText;
            }
        }

        /* compiled from: BentoToggleRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text$Annotated;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Annotated extends Text {
            public static final int $stable = 0;
            private final AnnotatedString annotatedString;

            public static /* synthetic */ Annotated copy$default(Annotated annotated, AnnotatedString annotatedString, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = annotated.annotatedString;
                }
                return annotated.copy(annotatedString);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getAnnotatedString() {
                return this.annotatedString;
            }

            public final Annotated copy(AnnotatedString annotatedString) {
                Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
                return new Annotated(annotatedString);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Annotated) && Intrinsics.areEqual(this.annotatedString, ((Annotated) other).annotatedString);
            }

            public int hashCode() {
                return this.annotatedString.hashCode();
            }

            public String toString() {
                return "Annotated(annotatedString=" + ((Object) this.annotatedString) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Annotated(AnnotatedString annotatedString) {
                super(null);
                Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
                this.annotatedString = annotatedString;
            }

            public final AnnotatedString getAnnotatedString() {
                return this.annotatedString;
            }
        }
    }

    /* compiled from: BentoToggleRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "", "Icon", "NumberPog", "PictogramPog", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start$NumberPog;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start$PictogramPog;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Start {

        /* compiled from: BentoToggleRow.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "tint", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component2-QN2ZGVo", "copy", "copy-0Yiz4hI", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Icon implements Start {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset;
            private final Color tint;

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, color);
            }

            /* renamed from: copy-0Yiz4hI$default, reason: not valid java name */
            public static /* synthetic */ Icon m21016copy0Yiz4hI$default(Icon icon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = icon.asset;
                }
                if ((i & 2) != 0) {
                    color = icon.tint;
                }
                return icon.m21018copy0Yiz4hI(serverToBentoAssetMapper2, color);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getTint() {
                return this.tint;
            }

            /* renamed from: copy-0Yiz4hI, reason: not valid java name */
            public final Icon m21018copy0Yiz4hI(ServerToBentoAssetMapper2 asset, Color tint) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                return new Icon(asset, tint, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return this.asset == icon.asset && Intrinsics.areEqual(this.tint, icon.tint);
            }

            public int hashCode() {
                int iHashCode = this.asset.hashCode() * 31;
                Color color = this.tint;
                return iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()));
            }

            public String toString() {
                return "Icon(asset=" + this.asset + ", tint=" + this.tint + ")";
            }

            private Icon(ServerToBentoAssetMapper2 asset, Color color) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                this.asset = asset;
                this.tint = color;
            }

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : color, null);
            }

            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
            public final Color m21019getTintQN2ZGVo() {
                return this.tint;
            }
        }

        /* compiled from: BentoToggleRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start$NumberPog;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", InquiryField.FloatField.TYPE2, "", "<init>", "(I)V", "getNumber", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NumberPog implements Start {
            public static final int $stable = 0;
            private final int number;

            public static /* synthetic */ NumberPog copy$default(NumberPog numberPog, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = numberPog.number;
                }
                return numberPog.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getNumber() {
                return this.number;
            }

            public final NumberPog copy(int number) {
                return new NumberPog(number);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NumberPog) && this.number == ((NumberPog) other).number;
            }

            public int hashCode() {
                return Integer.hashCode(this.number);
            }

            public String toString() {
                return "NumberPog(number=" + this.number + ")";
            }

            public NumberPog(int i) {
                this.number = i;
            }

            public final int getNumber() {
                return this.number;
            }
        }

        /* compiled from: BentoToggleRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start$PictogramPog;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PictogramPog implements Start {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper3 asset;

            public static /* synthetic */ PictogramPog copy$default(PictogramPog pictogramPog, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper3 = pictogramPog.asset;
                }
                return pictogramPog.copy(serverToBentoAssetMapper3);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper3 getAsset() {
                return this.asset;
            }

            public final PictogramPog copy(ServerToBentoAssetMapper3 asset) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                return new PictogramPog(asset);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PictogramPog) && this.asset == ((PictogramPog) other).asset;
            }

            public int hashCode() {
                return this.asset.hashCode();
            }

            public String toString() {
                return "PictogramPog(asset=" + this.asset + ")";
            }

            public PictogramPog(ServerToBentoAssetMapper3 asset) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                this.asset = asset;
            }

            public final ServerToBentoAssetMapper3 getAsset() {
                return this.asset;
            }
        }
    }

    /* compiled from: BentoToggleRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End;", "", "Caret", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End$Caret;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface End {

        /* compiled from: BentoToggleRow.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End$Caret;", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End;", "direction", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End$Caret$Direction;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End$Caret$Direction;)V", "getDirection", "()Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End$Caret$Direction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Direction", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Caret implements End {
            public static final int $stable = 0;
            private final Direction direction;

            public static /* synthetic */ Caret copy$default(Caret caret, Direction direction, int i, Object obj) {
                if ((i & 1) != 0) {
                    direction = caret.direction;
                }
                return caret.copy(direction);
            }

            /* renamed from: component1, reason: from getter */
            public final Direction getDirection() {
                return this.direction;
            }

            public final Caret copy(Direction direction) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                return new Caret(direction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Caret) && this.direction == ((Caret) other).direction;
            }

            public int hashCode() {
                return this.direction.hashCode();
            }

            public String toString() {
                return "Caret(direction=" + this.direction + ")";
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: BentoToggleRow.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End$Caret$Direction;", "", "resId", "", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "UP", "DOWN", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Direction {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Direction[] $VALUES;
                private final int resId;

                /* renamed from: UP */
                public static final Direction f5159UP = new Direction("UP", 0, C20690R.drawable.ic_rds_caret_up_16dp);
                public static final Direction DOWN = new Direction("DOWN", 1, C20690R.drawable.ic_rds_caret_down_16dp);

                private static final /* synthetic */ Direction[] $values() {
                    return new Direction[]{f5159UP, DOWN};
                }

                public static EnumEntries<Direction> getEntries() {
                    return $ENTRIES;
                }

                private Direction(String str, int i, int i2) {
                    this.resId = i2;
                }

                public final int getResId() {
                    return this.resId;
                }

                static {
                    Direction[] directionArr$values = $values();
                    $VALUES = directionArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
                }

                public static Direction valueOf(String str) {
                    return (Direction) Enum.valueOf(Direction.class, str);
                }

                public static Direction[] values() {
                    return (Direction[]) $VALUES.clone();
                }
            }

            public Caret(Direction direction) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                this.direction = direction;
            }

            public final Direction getDirection() {
                return this.direction;
            }
        }
    }
}
