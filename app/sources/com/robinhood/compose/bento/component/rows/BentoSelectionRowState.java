package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoSelectionRow.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002=>B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0087\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0019J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u008d\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;", "", "type", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$Type;", "primaryText", "Landroidx/compose/ui/text/AnnotatedString;", "selected", "", "secondaryText", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "enabled", "showBottomDivider", "iconPosition", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;", "removeHorizontalPadding", "removeVerticalPadding", "inlineContent", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$Type;Landroidx/compose/ui/text/AnnotatedString;ZLcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;ZZLcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;ZZLkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function0;)V", "(Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$Type;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;ZZLcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;ZZLkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function0;)V", "getType", "()Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$Type;", "getPrimaryText", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelected", "()Z", "getSecondaryText", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "getEnabled", "getShowBottomDivider", "getIconPosition", "()Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;", "getRemoveHorizontalPadding", "getRemoveVerticalPadding", "getInlineContent", "()Lkotlinx/collections/immutable/ImmutableMap;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "Type", "IconPosition", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoSelectionRowState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final IconPosition iconPosition;
    private final ImmutableMap<String, InlineTextContent> inlineContent;
    private final Function0<Unit> onClick;
    private final AnnotatedString primaryText;
    private final boolean removeHorizontalPadding;
    private final boolean removeVerticalPadding;
    private final BentoBaseRowState.Text secondaryText;
    private final boolean selected;
    private final boolean showBottomDivider;
    private final Type type;

    public static /* synthetic */ BentoSelectionRowState copy$default(BentoSelectionRowState bentoSelectionRowState, Type type2, AnnotatedString annotatedString, boolean z, BentoBaseRowState.Text text, boolean z2, boolean z3, IconPosition iconPosition, boolean z4, boolean z5, ImmutableMap immutableMap, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = bentoSelectionRowState.type;
        }
        if ((i & 2) != 0) {
            annotatedString = bentoSelectionRowState.primaryText;
        }
        if ((i & 4) != 0) {
            z = bentoSelectionRowState.selected;
        }
        if ((i & 8) != 0) {
            text = bentoSelectionRowState.secondaryText;
        }
        if ((i & 16) != 0) {
            z2 = bentoSelectionRowState.enabled;
        }
        if ((i & 32) != 0) {
            z3 = bentoSelectionRowState.showBottomDivider;
        }
        if ((i & 64) != 0) {
            iconPosition = bentoSelectionRowState.iconPosition;
        }
        if ((i & 128) != 0) {
            z4 = bentoSelectionRowState.removeHorizontalPadding;
        }
        if ((i & 256) != 0) {
            z5 = bentoSelectionRowState.removeVerticalPadding;
        }
        if ((i & 512) != 0) {
            immutableMap = bentoSelectionRowState.inlineContent;
        }
        if ((i & 1024) != 0) {
            function0 = bentoSelectionRowState.onClick;
        }
        ImmutableMap immutableMap2 = immutableMap;
        Function0 function02 = function0;
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z3;
        IconPosition iconPosition2 = iconPosition;
        boolean z9 = z2;
        boolean z10 = z;
        return bentoSelectionRowState.copy(type2, annotatedString, z10, text, z9, z8, iconPosition2, z6, z7, immutableMap2, function02);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final ImmutableMap<String, InlineTextContent> component10() {
        return this.inlineContent;
    }

    public final Function0<Unit> component11() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoBaseRowState.Text getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowBottomDivider() {
        return this.showBottomDivider;
    }

    /* renamed from: component7, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getRemoveHorizontalPadding() {
        return this.removeHorizontalPadding;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getRemoveVerticalPadding() {
        return this.removeVerticalPadding;
    }

    public final BentoSelectionRowState copy(Type type2, AnnotatedString primaryText, boolean selected, BentoBaseRowState.Text secondaryText, boolean enabled, boolean showBottomDivider, IconPosition iconPosition, boolean removeHorizontalPadding, boolean removeVerticalPadding, ImmutableMap<String, InlineTextContent> inlineContent, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
        return new BentoSelectionRowState(type2, primaryText, selected, secondaryText, enabled, showBottomDivider, iconPosition, removeHorizontalPadding, removeVerticalPadding, inlineContent, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoSelectionRowState)) {
            return false;
        }
        BentoSelectionRowState bentoSelectionRowState = (BentoSelectionRowState) other;
        return this.type == bentoSelectionRowState.type && Intrinsics.areEqual(this.primaryText, bentoSelectionRowState.primaryText) && this.selected == bentoSelectionRowState.selected && Intrinsics.areEqual(this.secondaryText, bentoSelectionRowState.secondaryText) && this.enabled == bentoSelectionRowState.enabled && this.showBottomDivider == bentoSelectionRowState.showBottomDivider && Intrinsics.areEqual(this.iconPosition, bentoSelectionRowState.iconPosition) && this.removeHorizontalPadding == bentoSelectionRowState.removeHorizontalPadding && this.removeVerticalPadding == bentoSelectionRowState.removeVerticalPadding && Intrinsics.areEqual(this.inlineContent, bentoSelectionRowState.inlineContent) && Intrinsics.areEqual(this.onClick, bentoSelectionRowState.onClick);
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.primaryText.hashCode()) * 31) + Boolean.hashCode(this.selected)) * 31;
        BentoBaseRowState.Text text = this.secondaryText;
        int iHashCode2 = (((((((((((((iHashCode + (text == null ? 0 : text.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.showBottomDivider)) * 31) + this.iconPosition.hashCode()) * 31) + Boolean.hashCode(this.removeHorizontalPadding)) * 31) + Boolean.hashCode(this.removeVerticalPadding)) * 31) + this.inlineContent.hashCode()) * 31;
        Function0<Unit> function0 = this.onClick;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public String toString() {
        Type type2 = this.type;
        AnnotatedString annotatedString = this.primaryText;
        return "BentoSelectionRowState(type=" + type2 + ", primaryText=" + ((Object) annotatedString) + ", selected=" + this.selected + ", secondaryText=" + this.secondaryText + ", enabled=" + this.enabled + ", showBottomDivider=" + this.showBottomDivider + ", iconPosition=" + this.iconPosition + ", removeHorizontalPadding=" + this.removeHorizontalPadding + ", removeVerticalPadding=" + this.removeVerticalPadding + ", inlineContent=" + this.inlineContent + ", onClick=" + this.onClick + ")";
    }

    public BentoSelectionRowState(Type type2, AnnotatedString primaryText, boolean z, BentoBaseRowState.Text text, boolean z2, boolean z3, IconPosition iconPosition, boolean z4, boolean z5, ImmutableMap<String, InlineTextContent> inlineContent, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
        this.type = type2;
        this.primaryText = primaryText;
        this.selected = z;
        this.secondaryText = text;
        this.enabled = z2;
        this.showBottomDivider = z3;
        this.iconPosition = iconPosition;
        this.removeHorizontalPadding = z4;
        this.removeVerticalPadding = z5;
        this.inlineContent = inlineContent;
        this.onClick = function0;
    }

    public final Type getType() {
        return this.type;
    }

    public final AnnotatedString getPrimaryText() {
        return this.primaryText;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final BentoBaseRowState.Text getSecondaryText() {
        return this.secondaryText;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getShowBottomDivider() {
        return this.showBottomDivider;
    }

    public /* synthetic */ BentoSelectionRowState(Type type2, AnnotatedString annotatedString, boolean z, BentoBaseRowState.Text text, boolean z2, boolean z3, IconPosition iconPosition, boolean z4, boolean z5, ImmutableMap immutableMap, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, annotatedString, z, (i & 8) != 0 ? null : text, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? new IconPosition.Trailing(null) : iconPosition, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (ImmutableMap<String, InlineTextContent>) ((i & 512) != 0 ? extensions2.persistentMapOf() : immutableMap), (Function0<Unit>) ((i & 1024) != 0 ? null : function0));
    }

    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    public final boolean getRemoveHorizontalPadding() {
        return this.removeHorizontalPadding;
    }

    public final boolean getRemoveVerticalPadding() {
        return this.removeVerticalPadding;
    }

    public final ImmutableMap<String, InlineTextContent> getInlineContent() {
        return this.inlineContent;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public /* synthetic */ BentoSelectionRowState(Type type2, String str, boolean z, BentoBaseRowState.Text text, boolean z2, boolean z3, IconPosition iconPosition, boolean z4, boolean z5, ImmutableMap immutableMap, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, str, z, (i & 8) != 0 ? null : text, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? new IconPosition.Trailing(null) : iconPosition, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (ImmutableMap<String, InlineTextContent>) ((i & 512) != 0 ? extensions2.persistentMapOf() : immutableMap), (Function0<Unit>) ((i & 1024) != 0 ? null : function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BentoSelectionRowState(Type type2, String primaryText, boolean z, BentoBaseRowState.Text text, boolean z2, boolean z3, IconPosition iconPosition, boolean z4, boolean z5, ImmutableMap<String, InlineTextContent> inlineContent, Function0<Unit> function0) {
        this(type2, new AnnotatedString(primaryText, null, 2, null), z, text, z2, z3, iconPosition, z4, z5, inlineContent, function0);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoSelectionRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$Type;", "", "<init>", "(Ljava/lang/String;I)V", "RadioButton", "Checkbox", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type RadioButton = new Type("RadioButton", 0);
        public static final Type Checkbox = new Type("Checkbox", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{RadioButton, Checkbox};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: BentoSelectionRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;", "", "Leading", "Trailing", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition$Leading;", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition$Trailing;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface IconPosition {

        /* compiled from: BentoSelectionRow.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition$Leading;", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;", "Lkotlin/Function0;", "", "endElement", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition$Leading;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function2;", "getEndElement", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Leading implements IconPosition {
            public static final int $stable = 0;
            private final Function2<Composer, Integer, Unit> endElement;

            /* JADX WARN: Multi-variable type inference failed */
            public Leading() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Leading copy$default(Leading leading, Function2 function2, int i, Object obj) {
                if ((i & 1) != 0) {
                    function2 = leading.endElement;
                }
                return leading.copy(function2);
            }

            public final Function2<Composer, Integer, Unit> component1() {
                return this.endElement;
            }

            public final Leading copy(Function2<? super Composer, ? super Integer, Unit> endElement) {
                return new Leading(endElement);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Leading) && Intrinsics.areEqual(this.endElement, ((Leading) other).endElement);
            }

            public int hashCode() {
                Function2<Composer, Integer, Unit> function2 = this.endElement;
                if (function2 == null) {
                    return 0;
                }
                return function2.hashCode();
            }

            public String toString() {
                return "Leading(endElement=" + this.endElement + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Leading(Function2<? super Composer, ? super Integer, Unit> function2) {
                this.endElement = function2;
            }

            public /* synthetic */ Leading(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : function2);
            }

            public final Function2<Composer, Integer, Unit> getEndElement() {
                return this.endElement;
            }
        }

        /* compiled from: BentoSelectionRow.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition$Trailing;", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;", "Lkotlin/Function0;", "", "startElement", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition$Trailing;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function2;", "getStartElement", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Trailing implements IconPosition {
            public static final int $stable = 0;
            private final Function2<Composer, Integer, Unit> startElement;

            /* JADX WARN: Multi-variable type inference failed */
            public Trailing() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Trailing copy$default(Trailing trailing, Function2 function2, int i, Object obj) {
                if ((i & 1) != 0) {
                    function2 = trailing.startElement;
                }
                return trailing.copy(function2);
            }

            public final Function2<Composer, Integer, Unit> component1() {
                return this.startElement;
            }

            public final Trailing copy(Function2<? super Composer, ? super Integer, Unit> startElement) {
                return new Trailing(startElement);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Trailing) && Intrinsics.areEqual(this.startElement, ((Trailing) other).startElement);
            }

            public int hashCode() {
                Function2<Composer, Integer, Unit> function2 = this.startElement;
                if (function2 == null) {
                    return 0;
                }
                return function2.hashCode();
            }

            public String toString() {
                return "Trailing(startElement=" + this.startElement + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Trailing(Function2<? super Composer, ? super Integer, Unit> function2) {
                this.startElement = function2;
            }

            public /* synthetic */ Trailing(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : function2);
            }

            public final Function2<Composer, Integer, Unit> getStartElement() {
                return this.startElement;
            }
        }
    }
}
